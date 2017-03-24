import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
    String expresion;
    String texto = " ";
    String traducciones = " ";
		String direccion ="texto.txt";
		String direccion2 ="diccionario.txt";
		try {
			Diccionario dic = new Diccionario (direccion2);
		}
    catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			BufferedReader archivo=new BufferedReader(new FileReader(direccion));//cargar archivo
			try {
				String exprecion= archivo.readLine();//leer linea del archivo
				String palabra="";
        while (expresion != null){
          texto = texto + expresion + "\n";
          expresion = exprecion.replace(",", "").replace(".", "").toLowerCase();
          String[] words = exprecion.split("\\s+");
				for(int i=0; i<exprecion.length();i++){
				//se recorre la expresion y al encontrar un espacio se guarda y se traduce
          Association<String, String> uno = new Association<>(word, palabra);
          for(Iterator iterator = arbol.iterator(); it.hasNext();){
            Association<String, String> dos = new Association<>(word, palabra);
            if(dos.compareTo(uno)==0){
              traducciones = traducciones + dos.value + " ";
            }
            if(dos.contains() == false){
              traducciones = traducciones + "*" + words[i] + "*";
            }
          }

					}
				}
				archivo.close();
			}
      catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("archivo vacio");//linea vacia
			}
		}
    catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("archivo no encontrado");//no hay archivo
		}
  }
