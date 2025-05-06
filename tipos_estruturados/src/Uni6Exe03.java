import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetor = new double[12];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor da posição "+i);
            vetor[i] = input.nextDouble();
        }
        input.close();
        for(int i = 0; i < vetor.length; i++){
            if(i % 2 == 0){
                vetor[i] = vetor[i] + (vetor[i] * 0.02);
            } else {
                vetor[i] = vetor[i] + (vetor[i] * 0.05);
            }
        }
    
        System.out.println("Resultado: ");
        for(int i = 0; i < vetor.length; i++){
           System.out.println(vetor[i]);
        }
    }
}
