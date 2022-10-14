package Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType {

	public static void main(String[] args) {
//      List<E>
		List<String> names = new ArrayList<String>();
		List<String> names2 = new ArrayList<>();
		
		names.add("1");
		names2.add("2");
		
		List<Number> numbers = new ArrayList<Number>();
		List<Number> numbers2 = new ArrayList<>();
		
		numbers.add(1);
		numbers2.add(1);
		
//      Map<K, V>
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map1 = new HashMap<>();
		
		Map<Point, Double> mapPD = new HashMap<Point, Double>();
		Map<Point, Double> mapPD2 = new HashMap<>();
		
	}

}
