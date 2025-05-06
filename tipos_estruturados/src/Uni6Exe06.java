import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int n = input.nextInt();

        double[] vetor = new double[n];

        for(int i = 0;i < vetor.length; i++){
            System.out.println("Digite um valor real para preencher o vetor da posição "+i);
            vetor[i] = input.nextDouble();
        }
        System.out.println("DIgite outro valor:");
        double numero = input.nextDouble();
        input.close();
        boolean contem = false;
        for(int i = 0; i < vetor.length; i++){
            if(numero == vetor[i]){
                contem = true;
            }
        }
        if(contem){
            System.out.println("Esse numero esta contido no vetor");
        } else{
            System.out.println("Valor nao esta contido no vetor");
        }
    }
}
