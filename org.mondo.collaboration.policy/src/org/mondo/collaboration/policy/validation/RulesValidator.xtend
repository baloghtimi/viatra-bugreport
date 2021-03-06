/*
 * generated by Xtext 2.10.0
 */
package org.mondo.collaboration.policy.validation

import org.eclipse.xtext.validation.Check
import org.mondo.collaboration.policy.rules.AccessibilityLevel
import org.mondo.collaboration.policy.rules.OperationType
import org.mondo.collaboration.policy.rules.Rule
import org.mondo.collaboration.policy.rules.ReferenceFact
import org.mondo.collaboration.policy.rules.Policy

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RulesValidator extends AbstractRulesValidator {
	
	public static val INVALID_NAME = 'invalidName'
	
	@Check
	def checkOperationTypeAfterObfuscate(Rule rule) {
		val operation = rule.eClass.EAllStructuralFeatures.findFirst[x | x.name.equals("operation")]
		if(rule.access == AccessibilityLevel::OBFUSCATE && rule.operation != OperationType::UNSET){
			error("Operation type cannot be defined for obfuscation", rule, operation)
		}
	}
	
	@Check
	def checkMissingOperationTypeAfterAllowDeny(Rule rule) {
		val access = rule.eClass.EAllStructuralFeatures.findFirst[x | x.name.equals("access")]
		if((rule.access == AccessibilityLevel::ALLOW  || rule.access == AccessibilityLevel::DENY) && rule.operation == OperationType::UNSET){
			error("Missing operation type for accessibility level", rule, access)
		}
	}
	
	@Check
	def checkObfuscateReference(Rule rule) {
		val asset = rule.eClass.EAllStructuralFeatures.findFirst[x | x.name.equals("asset")]
		if(rule.access == AccessibilityLevel::OBFUSCATE && rule.asset instanceof ReferenceFact){
			error("Reference asset cannot be obfuscated", rule, asset)
		}
	}
	
}
