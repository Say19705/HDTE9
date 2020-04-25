import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Factory {
	public Map getType(int op){
		if(op == 1) {
			return new hashMap();
		}
		if(op == 2) {
			return new SplayTree();
		}
		else
			return new hashMap();
	}

}
