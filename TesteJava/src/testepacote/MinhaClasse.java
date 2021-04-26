package testepacote;
public class MinhaClasse {
    public static void main(String[] args){
        String nomes[] = new String[3];
        //atribuir valor a cada posição do arrey, de 0 a 2
        nomes[0] = "Fulano";
        nomes[1] = "Beltrano";
        nomes[2] = "Sicrano";
        //para acessar cada posição, podemos colocar um laço, de 0 a 2
        for (int i = 0; i <= 2; i++){
            System.out.println("Na posição " + i + "do array, temos" + nomes[i]);
        }
    }
}
