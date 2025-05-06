import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] vetorHomi = new String[5];
        String [] vetorMuie = new String[5];
        System.out.println("Perguntas:\r\n"+ //
                        "Gosta de música sertaneja?\r\n" + //
                        "Gosta de futebol?\r\n" + //
                        "Gosta de seriados?\r\n" + //
                        "Gosta de redes sociais?\r\n" + //
                        "Gosta da Oktoberfest?");

        for(int i = 0; i < vetorHomi.length; i++){
            System.out.println("Digite a resposta da questão "+i);
            vetorHomi[i] = input.next();
        }

        for(int i = 0; i < vetorMuie.length; i++){
            System.out.println("Digite a resposta da questão "+i);
            vetorMuie[i] = input.next();
        }
        input.close();
        int indice = 0;
        for(int i = 0; i < 5;i++){
            if(vetorHomi[i].equals(vetorMuie[i])){
                indice+=3;
            } else if( vetorHomi[i].equals("IND") && (vetorMuie[i].equals("SIM") || vetorMuie[i].equals("NÃO"))){
                indice++;
            }
            else if( vetorMuie[i].equals("IND") && (vetorHomi[i].equals("SIM") || vetorHomi[i].equals("NÃO"))){
                indice++;
            } else{
                indice-=2;
            }
        }
        if(indice == 15){
            System.out.println("Casem!");
        } else if( indice >=10 && indice <=14){
            System.out.println("Vocês têm muita coisa em comum!");
        } else if( indice >=5 && indice <=9){
            System.out.println("Talvez não dê certo :(");
        } else if( indice >=0 && indice <=4){
            System.out.println("Vale um encontro");
        } else if( indice >=-1 && indice <=-9){
            System.out.println("Melhor não perder tempo");
        } else{
            System.out.println("Vocês se odeiam!");
        }
    }
}
