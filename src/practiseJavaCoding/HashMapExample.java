package practiseJavaCoding;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "karthik");
		
		System.out.println(hm.entrySet().toArray());
		System.out.println(hm.values().toArray());

	}

}
