
package p1.calculadorapostfija;

public class P1CalculadoraPostfija {

    public static void main(String[] args) {
        Pila prueba = new Pila(10);
        System.out.println("Pila: " + prueba.toString());
        prueba.push(5);
        prueba.push(4);
        prueba.push(98);
        System.out.println("Pila: " + prueba.toString());
        System.out.println("Pop: " + prueba.pop().getDato());
        System.out.println("Peek: " + prueba.peek().getDato());
        System.out.println("Pila: " + prueba.toString());
        int hola = calcularPostfijo("4 + 25 * 31 - 6 / 8");
        Cola prueba2 = new Cola(10);
	System.out.println("Cola: " + prueba2.toString());
	prueba2.queue(8);
	prueba2.queue(3);
	prueba2.queue(5);
	System.out.println("Cola: " + prueba2.toString());
	System.out.println("Tail: " + prueba2.getTail().getDato());
	System.out.println("Unqueue: " + prueba2.unqueue().getDato());
	System.out.println("Cola: " + prueba2.toString());
	prueba2.Delete(2);
	System.out.println("Cola: " + prueba2.toString());
	System.out.println("Peek: " + prueba2.peek().getDato());
	System.out.println("Cola: " + prueba2.toString());
	System.out.println("Size: " + prueba2.getSize());
    }
    
    public static int calcularPostfijo(String operacion){
        String[] separacion = operacion.split(" ");
        for (int i = 0; i < separacion.length; i++) {
            System.out.println(separacion[i]);
        }
        return 0;
    }
    

}
