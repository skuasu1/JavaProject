package practiseJavaCoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "java");
		hm.put(1, "Apple");
		hm.put(2, "mango");
		hm.put(3, "bananaba");
		hm.put(4, "Orahge");

		Iterator itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("Key is :" +me.getKey() + " Value is :" +me.getValue());
		}
	}
}
