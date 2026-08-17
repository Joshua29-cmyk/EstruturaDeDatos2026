package Main;
package nodo;

public class Main {

    public static void main(String[] args) {
        nodo nodo1 = new nodo(10);
        nodo nodo2 = new nodo(20);  
        nodo nodo3 = new nodo(30);

        nodo1.setEnlace(nodo2);
        nodo2.setEnlace(nodo3);
    }

    Nodo actual = nodo;

    while (actual != null) {
        
        System.out.println(actual.getDato());
        actual = actual.getEnlace();
    }

    
    ArrayStack arrayStack = new ArrayStack (10);
    arrayStack.push (10):
    System.out.println(arrayStack.toString);
    
}