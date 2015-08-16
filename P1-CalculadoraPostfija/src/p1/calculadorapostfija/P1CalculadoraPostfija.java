
package p1.calculadorapostfija;

public class P1CalculadoraPostfija {

    public static void main(String[] args) {
        Pila prueba = new Pila();
        System.out.println("Pila: " + prueba.toString());
        prueba.push(10);
        prueba.push(5);
        prueba.push(4);
        prueba.push(98);
        System.out.println("Pila: " + prueba.toString());
        System.out.println("Pop: " + prueba.pop());
        System.out.println("Peek: " + prueba.peek());
        System.out.println("Pila: " + prueba.toString());
        int hola = calcularPostfijo("4 + 25 * 31 - 6 / 8");
    }
    
    public static int calcularPostfijo(String operacion){
        String[] separacion = operacion.split(" ");
        for (int i = 0; i < separacion.length; i++) {
            System.out.println(separacion[i]);
        }
        return 0;
    }
    

}
