import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * @author Andres Say Agosto 19705
 * @author Diego Alvarez (no me se tu carne jaja)
 * Extraido de: Duane A Bailey (2007) java structures in java for principled programmer edición raiz 7
 */
public class hashMap implements Map{
	Map<String, String> diccionario = new Hashtable<String, String>();
	
	public List<String> keys(ArrayList<String> Strings){
		int n = Strings.size();
		List<String> lista = new ArrayList<String>();
		for(int i = 0; i < n; i = i+2) {
			lista.add(Strings.get(i));
		}
		
		return lista;
		
	}

	/**
	 * @param Strings el string que contiene todos los valores 
	 * @return una lista de valores del diccionario
	 */
	public List<String> value(ArrayList<String> Strings){
		int n = Strings.size();
		List<String> lista = new ArrayList<String>();
		for(int i = 1; i<n; i = i +2) {
			lista.add(Strings.get(i));
		}
		return lista;
	}

	/**
	 * @param lista3 lista de llaves
	 * @param lista4 lista de valores 
	 * @param ref cantidad de valores en el diccionario
	 * @return el diccionario a utilizar
	 */
	public Map<String, String> dicc(List<String> lista3, List<String> lista4, int ref){
		Map<String, String> theMap = new Hashtable<String, String>();
		for(int i = 0; i < ref; i++) {
			theMap.put(lista3.get(i), lista4.get(i));
		}
		return theMap;
	}
	/**
	 * @param values el string con el texto
	 * @param theMap el diccionario
	 * @return la palabra traducida
	 */
	public String answer(String[] values, Map<String, String> theMap ) {
		String answer = "";
		String v = "";
		int cont = values.length;
		for(int i = 0; i < cont; i++) {
			boolean h = theMap.containsKey(values[i]);
			if(h == true) {
				v = theMap.get(values[i]);
			}
			else {
				v = ("*")+values[i]+("*");
			}
			answer = answer + (" ") + v;
		}
		
		return answer;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

}

