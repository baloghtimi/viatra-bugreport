package org.mondo.collaboration.security.application;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint.BackendRequirement;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryHintOption;
import org.eclipse.viatra.query.runtime.rete.util.ReteHintOptions;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_attribute;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_object;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_reference;
import org.mondo.collaboration.security.application.query.Helper_patterns;
import org.mondo.collaboration.security.application.query.Patterns;

import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

public class IncrementApplication {
	private final static Logger logger = Logger.getLogger(IncrementApplication.class);

	private static final String MODEL_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/model/instance_model.wtspec4m";

	public static void main(String[] args) throws ViatraQueryException, IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wtspec4m", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		WTSpec4MFactory.eINSTANCE.eClass();
		WTSpec4MPackage.eINSTANCE.eClass();

		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource instanceModel = resourceSet.getResource(URI.createFileURI(new File(MODEL_PATH).getCanonicalPath()),
				true);

		AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(instanceModel));
		IQueryGroup queries = GenericQueryGroup.of(Helper_patterns.instance(), Patterns.instance());

		Map<QueryHintOption<?>, Object> hints = new HashMap<>();
		ReteHintOptions.deleteRederiveEvaluation.insertOverridingValue(hints, true);
		QueryEvaluationHint evaluationHint = new QueryEvaluationHint(hints, BackendRequirement.DEFAULT_CACHING);
		
		engine.prepareGroup(queries, evaluationHint);

		listEffectiveJudgementsOnObjects(engine);
		listEffectiveJudgementsOnAttributes(engine);
		listEffectiveJudgementsOnReferences(engine);
	}

	private static void listEffectiveJudgementsOnObjects(AdvancedViatraQueryEngine engine) throws ViatraQueryException {
		EffectiveJudgement_object.Matcher matcher = EffectiveJudgement_object.Matcher.on(engine);
		Collection<EffectiveJudgement_object.Match> matches = matcher.getAllMatches();
		matches.stream().forEach(m -> m.prettyPrint());
	}

	private static void listEffectiveJudgementsOnAttributes(ViatraQueryEngine engine) throws ViatraQueryException {
		EffectiveJudgement_attribute.Matcher matcher = EffectiveJudgement_attribute.Matcher.on(engine);
		Collection<EffectiveJudgement_attribute.Match> matches = matcher.getAllMatches();
		matches.stream().forEach(m -> m.prettyPrint());
	}

	private static void listEffectiveJudgementsOnReferences(ViatraQueryEngine engine) throws ViatraQueryException {
		EffectiveJudgement_reference.Matcher matcher = EffectiveJudgement_reference.Matcher.on(engine);
		Collection<EffectiveJudgement_reference.Match> matches = matcher.getAllMatches();
		matches.stream().forEach(m -> m.prettyPrint());
		}
}
