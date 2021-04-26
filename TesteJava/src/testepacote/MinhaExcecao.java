
package testepacote;

public class MinhaExcecao {

    MinhaExcecao(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  class MinhaExcecao{
          private final int n;
          //construtor
          MinhaExcecao(int n){
              this.n = n;
          }
          @Override
          public String toString(){
              return "Minha exceção: " + n;
          }
  }
}
