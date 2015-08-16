
package p1.calculadorapostfija;

public class Pila {
    private int size;
    private Nodo tos;
    
    public Pila(int dato){
        this.size = 1;
        this.tos = new Nodo(dato,null);
    }
    
    public Nodo pop(){
        Nodo ult = tos;
        tos = tos.getPrevious();
        size--;
        return ult;
    }
    
    public void push(int dato){
        Nodo nuevo = new Nodo(dato,tos);
        tos.setNext(nuevo);
        tos = nuevo;
        size++;
    }
    
    public Nodo peek(){
        return tos;
    }
    
    @Override
    public String toString(){
        Nodo temp = tos;
        String output = " (ToS)";
        for (int i = 0; i < size; i++){
            if(i != size-1)
                output = " - " + temp.getDato() + output;
            else
		output = temp.getDato() + output;
            temp = temp.getPrevious();
	}
        return output;
    }
    
}
