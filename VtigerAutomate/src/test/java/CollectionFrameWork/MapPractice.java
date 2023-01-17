package CollectionFrameWork;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		Map m = new TreeMap();
		m.put("user", "admin");
		m.put("pass", "1234");
		m.put("click", null);
		System.out.println(m.get("user"));
		System.out.println(m.get("click"));
	}

}
