import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		String direccion ="texto.txt";
		String direccion2 ="diccionario.txt";
		try {
			Diccionario dic = new Diccionario (direccion2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			BufferedReader archivo=new BufferedReader(new FileReader(direccion));//cargar archivo
			
			
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
				

				archivo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("archivo vacio");//linea vacia
			}		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("archivo no encontrado");//no hay archivo
		}
		
	}
}

