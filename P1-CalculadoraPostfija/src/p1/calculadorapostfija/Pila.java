
package p1.calculadorapostfija;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Integer> pilita;
    
    public Pila(){
        this.pilita = new ArrayList();
    }
    
    public int pop(){
        int ult = pilita.get(pilita.size()-1);
        pilita.remove(pilita.size()-1);
        return ult;
    }
    
    public void push(int dato){
        pilita.add(dato);
    }
    
    public int peek(){
        return pilita.get(pilita.size()-1);
    }
    
    @Override
    public String toString(){
        String impresion = "";
        for (int i = 0; i > pilita.size(); i++) {
            System.out.println("entro a for");
            impresion = impresion + "\n" + pilita.get(i);
        }
        return impresion;
    }
    
}
