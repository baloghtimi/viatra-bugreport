package windturbine.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistanceCalculator {
	
	//TODO iterátorokkal okosabban
	public static <K> Map<Map<K,Integer>,Map<Map<K,Integer>,Double>> getAlldistances(List<Map<K,Integer>> models,OnlineDistanceMetric<K> metric) {
		Map<Map<K,Integer>,Map<Map<K,Integer>,Double>> result= new HashMap<>();
		for (int id1=0;id1<models.size();id1++) {
			Map<K,Integer> m1=models.get(id1);
			Map<Map<K,Integer>,Double> m1map=new HashMap<>();
			for (int id2=id1+1;id2<models.size();id2++) {
				Map<K,Integer> m2=models.get(id2);
				m1map.put(m2,calculate(m1,m2,metric));
			}
			result.put(m1, m1map);
		}
		return result;
	}
	
	public static <K> double calculate(Map<K,Integer> shape1, Map<K,Integer> shape2,OnlineDistanceMetric<K> metric) {
		
		for (K key:shape1.keySet()) {
			int value1=shape1.get(key);
			if (shape2.containsKey(key)) {
				metric.newCoordinate(key,value1,shape2.get(key));
			} else {
				metric.newCoordinate(key,value1,0);
			}
		}
		
		for (K key:shape2.keySet()) {
			if (!shape1.containsKey(key)) {
				metric.newCoordinate(key,0,shape2.get(key));
			}
		}
		
		return metric.getDistance();
	}
	
	public static <K> Map<K,Integer> getDistanceVector(Map<K,Integer> shape1, Map<K,Integer> shape2) {
		Map<K,Integer> distanceMap=new HashMap<K,Integer>(shape1);
		for (K key:shape2.keySet()) {
			if (distanceMap.containsKey(key)) {
				distanceMap.put(key, Math.abs(shape1.get(key)-shape2.get(key)));
			} else {
				distanceMap.put(key,shape2.get(key));
			}
		}
		return distanceMap;
	}
	
	public interface OnlineDistanceMetric<Shape> {
		public void newCoordinate(Shape key,Integer value1,Integer value2);
		public double getDistance();
	}
	
	public class VectorDistance<Shape> implements OnlineDistanceMetric<Shape> {
		int sum=0;
		public void newCoordinate(Shape key,Integer value1,Integer value2) {
			 int dist=value1-value2;
			 sum+=dist*dist;
		}
		public double getDistance() {
			return Math.sqrt(sum);
		}
	}
	
	public class AngularDistance<Shape> implements OnlineDistanceMetric<Shape> {
		int number=0;
		int prod=0;//dotproduct
		int sum1=0;//for length1
		int sum2=0;//for length2
		public void newCoordinate(Shape key,Integer value1,Integer value2) {
			number++;
			prod+=value1*value2;
			sum1+=value1*value1;
			sum2+=value2*value2;
		}
		public double getDistance() {
			double length1=Math.sqrt(sum1);
			double length2=Math.sqrt(sum2);
			double cosine=prod/(length1*length2);
			double arccos=Math.acos(cosine);			
			return arccos/Math.PI;
		}
	}
}
