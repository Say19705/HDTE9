import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Lectura {
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
	
}
