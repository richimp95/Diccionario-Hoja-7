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
			BufferedReader traduccion=new BufferedReader(new FileReader(direccion));//cargar archivo
			
			try {
				String exprecion= archivo.readLine();//leer linea del archivo
				
				
				
				
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

