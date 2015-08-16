
package p1.calculadorapostfija;

public class Cola {

    private int size;
    private Nodo head;
    private Nodo tail;
    
    public Cola(int dato){
        size = 1;
        head = new Nodo(dato,null);
        tail = head;
    }
    
    public void queue(int dato){
        tail = new Nodo(dato,tail);
        Nodo temp = head;
        for (int i = 1; i < size; i++) {
            temp = temp.getNext();
        }
        temp.setNext(tail);
        size++;
    }
    
    public Nodo getTail(){
        return tail;
    }
    
    public Nodo unqueue(){
        Nodo temp = head;
        head = temp.getNext();
        size--;
        return temp;
    }
    
    public void Delete(int posicion){
        Nodo temp = head;
	for (int i = 1; i < posicion-1; i++){
		temp = temp.getNext();
	}
	Nodo del = temp.getNext();
	temp.setNext(del.getNext());
	size--;
    }
    
    public Nodo peek(){
        return head;
    }
    
    public int getSize(){
        return size;
    }
    
    @Override
    public String toString(){
	Nodo temp = head;
        String output = "";
	for (int i = 0; i < size; i++){
		if(i == 0)
			output += "(H) ";
		if(i != size-1)
			output += temp.getDato() + " - ";
		else
			output += temp.getDato() + " (T)";
		temp = temp.getNext();
	}
	return output;
    }   
}
