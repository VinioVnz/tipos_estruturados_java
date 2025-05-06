import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] vetor = new int [10];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Escreva o numero para a posição "+i);
            vetor[i] = input.nextInt();
        }
        input.close();
        for(int i = vetor.length -1; i >=0 ; i--){
            System.out.println("Vetor["+i+"] = "+vetor[i]);
        }
    }
}
