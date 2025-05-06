import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] vetor = new double[12];
        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor da posição "+i);
            vetor[i] = input.nextDouble();
        }
        input.close();
        for(int i = 0;i < vetor.length; i++){
            soma += vetor[i];
        }
        double media = soma/vetor.length;
        System.out.println("Valores maiores que a média: ");
        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] > media){
                System.out.println(vetor[i]);
            }
        }
    }
}
