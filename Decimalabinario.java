import java.util.Stack;

public class Decimalabinario {
    public static void main(String[] args) {
        int decimal = 10; // Número decimal que deseas convertir
        Stack<Integer> stack = new Stack<>();
        
        // Conversion del decimal a binario utilizando una pila
        while (decimal != 0) {
            int bit = decimal % 2;
            stack.push(bit);
            decimal /= 2;
        }
        
        // Imprimir el resultado en binario
        System.out.print("El número binario es: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
