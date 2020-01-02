package Mappings;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {

//		Map<Integer, String> allData = new TreeMap<Integer, String>();
		Map<Integer, String> allData = new LinkedHashMap<Integer, String>();

		allData.put(1098, "Kalpana");
		allData.put(12, "Neha");
		allData.put(3, "Traun");
		allData.put(338, "Jay");

		System.out.println(allData);

	}
}
