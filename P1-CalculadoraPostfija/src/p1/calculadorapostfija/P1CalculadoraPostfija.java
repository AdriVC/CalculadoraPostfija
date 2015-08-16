
package p1.calculadorapostfija;

public class P1CalculadoraPostfija {

    public static void main(String[] args) {
        int hola = calcularPostfijo("31 + 20 * 10 + 32 / 2");
    }
    
    public static int calcularPostfijo(String operacion){
        String[] separacion = operacion.split(" ");
        Pila pila_operaciones = new Pila();
        Cola trencito = new Cola();
        for (int i = 0; i < separacion.length; i++) {
            System.out.println(i + ": ");
            if(separacion[i].matches("\\d+")){
                trencito.queue(separacion[i]);
            }else{
                if((separacion[i].equals("+") || separacion[i].equals("-")) && !pila_operaciones.isEmpty()){
                    while(!pila_operaciones.isEmpty()) {
                        trencito.queue(pila_operaciones.pop());
                    }
                }
                pila_operaciones.push(separacion[i]);
            }
            System.out.println("Cola: " + trencito.toString());
            System.out.println("Pila: " + pila_operaciones.toString());
        }
        while(!pila_operaciones.isEmpty()) {
            trencito.queue(pila_operaciones.pop());
        }
        System.out.println("Cola: " + trencito.toString());
        System.out.println("Pila: " + pila_operaciones.toString());
        
        return 0;
    }
    

}
