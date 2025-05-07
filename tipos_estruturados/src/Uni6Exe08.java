import java.util.Scanner;

public class Uni6Exe08 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIgite o valor de n");
        int n = input.nextInt();
        if(n >= 0 && n <=20){
            double[] vetor = new double[n];
            double[] diferentes = new double[n];
            int[] contagem = new int[n];
            int qtdDiferentes = 0;
    

            for (int i = 0; i < n; i++) {
                System.out.print("Digite o valor para a posição " + i + ": ");
                vetor[i] = input.nextDouble();
            }
    
            input.close();
            for (int i = 0; i < n; i++) {
                boolean jaContado = false;
    
                for (int j = 0; j < qtdDiferentes; j++) {
                    if (vetor[i] == diferentes[j]) {
                        contagem[j]++;
                        jaContado = true;
                        break;
                    }
                }
    
                if (!jaContado) {
                    diferentes[qtdDiferentes] = vetor[i];
                    contagem[qtdDiferentes] = 1;
                    qtdDiferentes++;
                }
            }
    
            System.out.println("\nValor\tQuantidade");
            for (int i = 0; i < qtdDiferentes; i++) {
                System.out.println(diferentes[i] + "\t" + contagem[i]);
            }
          

        }else{
            System.out.println("Valor invalido");
        }
    } 
}
