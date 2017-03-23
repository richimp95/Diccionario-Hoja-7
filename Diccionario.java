import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Diccionario<E> {
	
	public Diccionario (String txt) throws IOException {
		
		BufferedReader traduccion = null;
		try {
			traduccion = new BufferedReader(new FileReader(txt));
			String cadena= traduccion.readLine();
			String palabra="";
			String word="";
			char c=' ';
			int a= 0;
			
			BinaryTree arbol=new BinaryTree();
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
				
				Association<String, String> ass=new Association<>(word, palabra);
				Node<E> newnode= new Node<>();
                newnode.data = ass;
                newnode.left=null;
                newnode.right=null;
                arbol.createNode(arbol.head,newnode);
				cadena= traduccion.readLine();
			}while(cadena!=null);
			arbol.print();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//cargar archivo		
		traduccion.close();
	}
	
	
}