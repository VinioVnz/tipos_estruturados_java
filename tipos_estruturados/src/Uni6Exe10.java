import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[50];
        int tamanho = 0; 

        int opcao = 0;
        while (opcao != 8) {
            System.out.println("\nMenu:");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (tamanho < 50) {
                        System.out.print("Digite o valor a incluir: ");
                        int valor = input.nextInt();
                        vetor[tamanho] = valor;
                        tamanho++;
                        System.out.println("Valor incluído.");
                    } else {
                        System.out.println("Vetor cheio. Não é possível incluir mais valores.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor a pesquisar: ");
                    int valor = input.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < tamanho; i++) {
                        if (vetor[i] == valor) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Valor encontrado no vetor.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor que deseja alterar: ");
                    int antigo = input.nextInt();
                    System.out.print("Digite o novo valor: ");
                    int novo = input.nextInt();
                    boolean alterado = false;
                    for (int i = 0; i < tamanho; i++) {
                        if (vetor[i] == antigo) {
                            vetor[i] = novo;
                            alterado = true;
                            break;
                        }
                    }
                    if (alterado) {
                        System.out.println("Valor alterado com sucesso.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o valor a excluir: ");
                    int excluir = input.nextInt();
                    boolean excluido = false;
                    for (int i = 0; i < tamanho; i++) {
                        if (vetor[i] == excluir) {
   
                            for (int j = i; j < tamanho - 1; j++) {
                                vetor[j] = vetor[j + 1];
                            }
                            tamanho--;
                            excluido = true;
                            break;
                        }
                    }
                    if (excluido) {
                        System.out.println("Valor excluído com sucesso.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Valores no vetor:");
                    for (int i = 0; i < tamanho; i++) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    for (int i = 0; i < tamanho - 1; i++) {
                        for (int j = 0; j < tamanho - 1 - i; j++) {
                            if (vetor[j] > vetor[j + 1]) {
                                int temp = vetor[j];
                                vetor[j] = vetor[j + 1];
                                vetor[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Valores ordenados em ordem crescente.");
                    break;

                case 7:
           
                    for (int i = 0; i < tamanho / 2; i++) {
                        int temp = vetor[i];
                        vetor[i] = vetor[tamanho - 1 - i];
                        vetor[tamanho - 1 - i] = temp;
                    }
                    System.out.println("Valores invertidos.");
                    break;

                case 8:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        input.close();
    }
}
