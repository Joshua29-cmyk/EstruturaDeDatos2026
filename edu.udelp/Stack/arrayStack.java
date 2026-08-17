import java.util.Arrays;
i
public class arrayStack{

    private int[] stack;
    private int pos = -1;

    public arrayStack(int size){
        stack = new int[size];

    }

    public void push(int dato){
        this.dato[++pos] = dato;
    }
    public int pop(){
        return this.dato[pos--];
    }
    public int peek(){
        return this.dato[pos];
    }
    public boolean isEmpty(){
        return pos == -1;
    }
    public boolean isFull(){
        return pos == dato.length - 1;
    }
    public int size(){
        return pos + 1;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < pos; i++){
            builder.append(dato[i]).append(" ");
        }
        builder.append ("]");

        return builder.toString();
    }
}
