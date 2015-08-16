
package p1.calculadorapostfija;

public class Nodo {

    protected int dato;
    protected Nodo next;
    protected Nodo previous;
    
    public Nodo(){
        
    }
    
    public Nodo(int dato, Nodo previous){
        this.dato = dato;
        this.next = null;
        this.previous = previous;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }

}
