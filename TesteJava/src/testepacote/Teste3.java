package testepacote;
public class Teste3 {
    public static void main(String [] args){
        String nomesCompletos[][] = new String [3][3];
        //Pessoa 1
        nomesCompletos[0][0] = "Carlos"; //Primeira linha, primeira coluna
        nomesCompletos[0][1] = "Drummond";
        //Pessoa 2
        nomesCompletos[1][0] = "Clarice";
        nomesCompletos[1][1] = "Linspector";
        //Pessoa 3
        nomesCompletos[2][0] = "Jorge";
        nomesCompletos[2][1] = "Amado";
        
        for(int i = 0; i <= 2; i++){
            System.out.print("Nome armazenado na linha " +i + ": ");
            //pega a posição i (linha), a coluna do nome (0) e concatena a coluna sobrenome (1)
            System.out.println(nomesCompletos[i][0] + nomesCompletos [i][1]);
            
        }
                
       
                
    }
}
