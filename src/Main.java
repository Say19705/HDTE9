/**
 * @author andres Say Agosto 19705
 * traductor ingles-español
 */

//Importar
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;


public class Main{
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception{
		/**
		 * Inicializar la clase binaryTree
		 * y las listas para podes formar el diccionario y luego recorrerlo
		 */
		Map<String, String> theMap = new Hashtable<String, String>();
		List<String> lista3 = new ArrayList<String>();
		List<String> lista4 = new ArrayList<String>();
		SplayTree sp = new SplayTree();

		
		
		//Comenzar programa
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");

		
		System.out.println(System.getProperty("user.dir") + "\\nombre");


		File archivo_Dicc = new File(System.getProperty("user.dir") + "\\Spanish.txt");
		File archivo_pal = new File(System.getProperty("user.dir") + "\\texto.txt");
		if(archivo_Dicc.exists() && archivo_pal.exists()) {
				FileReader fr = new FileReader(archivo_Dicc);
				BufferedReader br = new BufferedReader(fr);
				
				String linea = " ";
				ArrayList<String> Strings = new ArrayList<String>();
				System.out.println("1: " + linea);
				System.out.println("aqui");
				int ref = 0;
				while((linea = br.readLine()) != null) {
					int h = linea.length();
					//System.out.println(h);
					//System.out.println("no con to: " + linea);
					//System.out.println("prueba: " + p);
					String[] lineas = linea.split("	");
					String lineaa = lineas[0];
					//System.out.println("p");
					//System.out.println(lineaa);
					String pa = lineaa.substring(0,1);
					//System.out.println("Pa");
					//System.out.println(pa);
					if(pa.equals("#")) {
						System.out.println("Esta linea no cuenta");
					}
					else {
						Strings.add(lineaa);
						lineaa = lineas[0];
						//System.out.println(lineaa);
						Strings.add(lineaa);
						lineaa = lineas[1];
						//System.out.println(lineaa);
						Strings.add(lineaa);
						
					}
					ref++;
				}
				// AQUI PROBE LO INGRESADO EN EL ARRAYLIST Y SI ESTA SIENDO AGREGADO
				//for(int i=0; i<Strings.size();i++){
				//	System.out.println("Palabras: " + Strings.get(i));
				//} 
				//for(int i=0; i<Strings.size();i++){
					//System.out.println("Palabras: " + Strings.get(i));
				//} 
				br.close();
				fr.close();
				
				Scanner data = new Scanner(archivo_pal);
				String datos = data.nextLine().toLowerCase();
				System.out.println("------------------------");
				System.out.println("|        Inicio         |");
				System.out.println("------------------------");
				System.out.println("lo que desea traducir es lo siguiente: ");
				System.out.println(datos);
				String[] values = datos.split(" ");
				int cont = values.length;
				int var = Strings.size();
				
				lista3 = sp.keys(Strings);
				System.out.println("-----------------------------------------");
				System.out.println("esta es la lista de llaves: " + lista3);
				
				lista4 = sp.value(Strings);
				System.out.println("esta es la lista de valores: " + lista4);
				System.out.println("--------------------------------------------------");
				
				
				theMap = sp.dicc(lista3, lista4, ref);
		
				System.out.println("El diccionario: " + theMap);
				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Su traduccion es la siguiente: ");
				System.out.println(sp.answer(values, theMap));
			
			
		}
		//Terminar programa	
		
	}

}