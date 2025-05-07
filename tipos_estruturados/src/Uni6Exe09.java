import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] nota = new int[30]; 
        int[] sexo = new int[30]; 
        int[] idade = new int[30];
        for(int i = 0; i < 30; i++){
            System.out.println("Digite seu seu sexo | 1= feminino | 2 = masculino");
            sexo[i] = input.nextInt();
            
            System.out.println("Digite a nota de 0 a 10:");
            nota[i] = input.nextInt();
            
            System.out.println("Qual sua idade");
            idade[i] = input.nextInt();

        }
        input.close();
        int soma = 0;
        for(int i = 0; i < 30; i++){
            soma+= nota[i];
        }
        int media = soma/nota.length;
        int somaMasc = 0;
        int divisorMasc = 0;
        for(int i = 0; i < 30; i++){
            if(sexo[i] == 2){
                somaMasc+=nota[i];
                divisorMasc++;
            } 
        }
       int mediaMasc = somaMasc/divisorMasc;
       int menorIdade = Integer.MAX_VALUE;
       int notaMulherMaisJovem = -1;

       for (int i = 0; i < 30; i++) {
           if (sexo[i] == 1 && idade[i] < menorIdade) {
               menorIdade = idade[i];
               notaMulherMaisJovem = nota[i];
           }
       }

       int contadorMulheres50Mais = 0;
       for (int i = 0; i < 30; i++) {
           if (sexo[i] == 1 && idade[i] > 50 && nota[i] > media) {
               contadorMulheres50Mais++;
           }
       }
        
    System.out.println("Nota média geral: " + media);
    System.out.println("Nota média dos homens: " + mediaMasc);
    System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
    System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota acima da média: " + contadorMulheres50Mais);
    }
}
