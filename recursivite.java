//********************** fibonnaci 
public class Fibonacci {
    public static int fibonacci(int n) {
        // Cas de base : si n est 0 ou 1, on retourne n
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Appel récursif : F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));  // Sortie attendue : 8
    }
}
 */