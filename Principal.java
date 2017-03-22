import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la direccion del archivo(.txt)");//ingresar direccion del archivo
		String direccion =teclado.nextLine();
		System.out.println("Ingrese la direccion del diccionario(.txt)");//ingresar direccion del archivo
		String direccion2 =teclado.nextLine();
		
		try {
			BufferedReader archivo=new BufferedReader(new FileReader(direccion));//cargar archivo
			BufferedReader traduccion=new BufferedReader(new FileReader(direccion2));//cargar archivo
			
			try {
				String exprecion= archivo.readLine();//leer linea del archivo
				String palabra="";
				for(int i=0; i<exprecion.length();i++){
				//se recorre la expresion y al encontrar un espacio se guarda y se traduce
					char a=' ';
					if(a==' '){
						//palabra se traduce en diccionario
						palabra="";
					}
				}
				
				
				traduccion.close();
				archivo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("archivo vacio");//linea vacia
			}		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("archivo no encontrado");//no hay archivo
		}
		teclado.close();
		
	}
}

