import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;


public class JUnit{
  @Test
  public void insert(){
    BinaryTree arbol = new BinaryTree();
    Association<String, String> ass=new Association<>(word, palabra);
    Node<E> newnode= new Node<>();
            newnode.data = ass;
            newnode.left=null;
            newnode.right=null;
            arbol.createNode(arbol.head,newnode);
    String palabrai = "house";
    String palabrae = "casa";
    arbol.add(new Association(palabrai, palabrae));
    assert.equals("Se inserto " , arbol.contains(palabrae, palabrai), true);
  }
  @Test
  public void search(){
    String palabrai = "house";
    String palabrae = "casa";
    BinaryTree arbolito = new BinaryTree();
    assert.equals("Existe " , arbolito.contains(palabrae, palabrai), true);
  }
}
