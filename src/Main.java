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
		 * Inicializar 
		 * y las listas para podes formar el diccionario y luego recorrerlo
		 */

		List<String> lista3 = new ArrayList<String>();
		List<String> lista4 = new ArrayList<String>();
		Map<String,String> Mp = new hashMap(); 
		Lectura l = new Lectura();
		Factory factory = new Factory();
		
		
		//Comenzar programa
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");
		Scanner teclado1 = new Scanner (System.in);
		
		System.out.println(System.getProperty("user.dir") + "\\nombre");

		boolean seguir = true;
		int op = 0;
		while(seguir) {
			System.out.println("¿Que implementacion desea usar? \n1. HashMap \n2. SplayTree");
			try {
				op = teclado1.nextInt();
				if(op == 1) {
					Mp = factory.getType(op);
				}
				else if(op == 2) {
					Mp = factory.getType(op);
				}else {
					throw new Exception();
				}
				seguir = false;
			}catch(Exception E) {
				
			}
			
		}
		
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
					String[] lineas = linea.split("	");
					String lineaa = lineas[0];
					String pa = lineaa.substring(0,1);
					if(pa.equals("#")) {
					}
					else {
						String lineaaa = lineas[0];
						Strings.add(lineaaa);
						lineaa = lineas[1];
						int n = lineaa.length();
						int a = n-6;
						int b = n-11;
						if(n>6) {
							String noun = lineaa.substring(a,n);
							if(noun.equals("[Noun]") || noun.equals("[Verb]")){
								lineaa = lineaa.substring(0,a);
							}
						}
						if(n>11) {
							int z = lineaa.length();
							String adjective = lineaa.substring(b,z);
							if(adjective.equals("[Adjective]")) {
								lineaa = lineaa.substring(0,b);
							}
						}
						int f = lineaa.length();
						if(f>8) {
							int c = f-8;
							String adverb = lineaa.substring(c,f);
							if(adverb.equals("[Adverb]")) {
								lineaa = lineaa.substring(0,c);
							}
						}
						Strings.add(lineaa);
					}
					ref++;
				}
				
				ref = 7476;
				

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
				
				
				if(op == 1) {
					lista3 = l.keys(Strings);
					
					lista4 = l.value(Strings);

					
					Mp = l.dicc(lista3, lista4, ref);
					System.out.println("El diccionario: " + Mp);
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("Su traduccion es la siguiente: ");

					
					String answer = "";
					String v = "";
					int contador = values.length;
					for(int i = 0; i<contador;i++) {
						boolean h = Mp.containsKey(values[i]);
						if(h == true) {
							v = Mp.get(values[i]);
						}
						else {
							v = ("*")+values[i]+("*");
						}
						answer = answer + (" ") + v;
					}
					System.out.println(answer);
				}
				else if(op == 2) {
					
					lista3 = l.keys(Strings);
					lista4 = l.value(Strings);					
					Mp = l.dicc(lista3, lista4, ref);
					System.out.println("El diccionario: " + Mp);
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("Su traduccion es la siguiente: ");
					System.out.println("Esto no se ha hecho");
					
					String answer = "";
					String v = "";
					int contador = values.length;
					for(int i = 0; i<contador;i++) {
						boolean h = Mp.containsKey(values[i]);
						if(h == true) {
							v = Mp.get(values[i]);
						}
						else {
							v = ("*")+values[i]+("*");
						}
						answer = answer + (" ") + v;
					}
					System.out.println(answer);
					
				}
			
		}
		//Terminar programa	
		
	}

}