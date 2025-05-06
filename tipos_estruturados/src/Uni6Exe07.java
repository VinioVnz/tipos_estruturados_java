import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor(limite de 20 posições)");
        int n = input.nextInt();

        if(n >= 0 && n <=20){
            int[] vetor = new int[n];
            int quantidade = 0;

            while (quantidade < n) {
                System.out.print("Digite um numero: ");
                int numero = input.nextInt();

                boolean jaExiste = false;
                for (int i = 0; i < quantidade; i++) {
                    if (vetor[i] == numero) {
                        jaExiste = true;
                        break;
                    }
                }
                if (!jaExiste) {
                    vetor[quantidade] = numero;
                    quantidade++;
                } 
            }
            input.close();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        int temp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = temp;
                    }
                }
            }
            System.out.print("Vetor ordenado: ");
            for (int i = 0; i < n; i++) {
                System.out.print("[" + vetor[i] + "]");
            }

        }else{
            System.out.println("Valor invalido.");
        }
    }
}
