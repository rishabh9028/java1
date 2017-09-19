
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapEg {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
	hm.put(200,"Aac");
	hm.put(500,"Bbc");
	hm.put(100,"Ccc");
	hm.put(400,"Ddc");
	hm.put(300,"Eec");
	System.out.println(hm);
	Iterator<Integer> itr=hm.keySet().iterator();
	while(itr.hasNext()){
		Integer key=itr.next();
		String value=hm.get(key);
	
	
	System.out.println(key);
	System.out.println(value);
	
	}
	
}
}
