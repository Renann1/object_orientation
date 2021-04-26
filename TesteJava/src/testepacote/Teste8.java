
package testepacote;

public class Teste8 {
            public static void main(String args[]) {
            int x;
            try {
            x = 12;
            if (x > 10)
            throw new MinhaExcecao(x);
            }
            catch (MinhaExcecao e) {
            System.out.println("Capturada: " + e);
            }
            }
            }
