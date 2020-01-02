package Mappings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("Jhon Doe", 3412.4);
		hm.put("Tom Smith", 123.43);
		hm.put("Jane Baker", 324.00);
		hm.put("Todd hall", 99.22);
		hm.put("Ralph Smih", -12.22);

		Set set = hm.entrySet();

		Iterator i = set.iterator();

		while (i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			System.out.println(me.getKey() + ":");
			System.out.println(me.getValue());

		}

		System.out.println();

//		double balance = ((Double) hm.get("Jhon Doe")).doubleValue();
		double balance = hm.get("Jhon Doe");
		hm.put("Jhon Doe", balance + 1000);

		System.out.println(hm);

	}
}
