import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Diccionario {
	
	public Diccionario (String txt) throws IOException {

		BufferedReader traduccion = null;
		try {
			traduccion = new BufferedReader(new FileReader(txt));
			String cadena= traduccion.readLine();
			String palabra="";
			String word="";
			char c=' ';
			int a= 0;
			do{
				palabra="";
				word="";
				c=' ';
				a= 0;
				for (int i=0;i<cadena.length();i++){
					c=cadena.charAt(i);
					if(c==','){
						a=1;
					}
					if(a==0)
						if(c!='(')
							word=word+c;
					if(a==1){
						if(c!=',')
							if(c!=')'){
								palabra=palabra+c;
						}
					}
				}
				asociar(palabra, word);
				cadena= traduccion.readLine();
			}while(cadena!=null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//cargar archivo		
		traduccion.close();
	}
	
	public void asociar (String ingles, String español){
		Association a=new Association(ingles, español);
		
	}
	
}