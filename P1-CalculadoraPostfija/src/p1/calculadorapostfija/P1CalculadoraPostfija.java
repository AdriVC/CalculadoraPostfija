
package p1.calculadorapostfija;

public class P1CalculadoraPostfija {

    public static void main(String[] args) {
        String op = "27 / 3 + 100 / 10 - 50 * 2";
        System.out.println("operacion: " + op);
        int hola = calcularPostfijo(op);
    }
    
    public static int calcularPostfijo(String operacion){
        // calcular de operacion a postfijo
        String[] separacion = operacion.split(" ");
        Pila pilita = new Pila();
        Cola trencito = new Cola();
        for (int i = 0; i < separacion.length; i++) {
            if(separacion[i].matches("\\d+")){
                trencito.queue(separacion[i]);
            }else{
                if((separacion[i].equals("+") || separacion[i].equals("-")) && !pilita.isEmpty()){
                    while(!pilita.isEmpty()) {
                        trencito.queue(pilita.pop());
                    }
                }
                pilita.push(separacion[i]);
            }
        }
        while(!pilita.isEmpty()) {
            trencito.queue(pilita.pop());
        }
        //System.out.println("Notacion Postfija: " + trencito.toString());
        
        // calculo de postfijo a evaluacion
        while(!trencito.isEmpty()) {
            if(trencito.peek().getDato().matches("\\d+")){
                pilita.push(trencito.unqueue());
            }else{
                int b = Integer.parseInt(pilita.pop().getDato());
                int a = Integer.parseInt(pilita.pop().getDato());
                int c = 0;
                switch(trencito.unqueue().getDato()){
                    case "*":
                        c = a * b;
                        break;
                    case "/":
                        c = a / b;
                        break;
                    case "+":
                        c = a + b;
                        break;
                    case "-":
                        c = a - b;
                        break;
                }
                pilita.push(Integer.toString(c));
            }
        }
        System.out.println("Respuesta: " + pilita.toString());
        
        return 0;
    }
    

}
