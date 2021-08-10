import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main (String args[])
	{
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(11,"a");
		hashMap = Collections.unmodifiableMap(hashMap);
		hashMap.put(12,"b");
		System.out.println(hashMap);
	}

}
