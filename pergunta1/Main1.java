package av1.pergunta1;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        DistribuicaoAlimento distA = new DistribuicaoAlimento("Distribuindo Alimentos", "Projeto beneficente","Realengo 235", "22/06", "24/07", "Arroz", 5);
        TrabalhoVoluntario trabVol = new TrabalhoVoluntario("Trabalho Voluntario", "Projeto beneficente","Realengo 235", "22/06", "24/07", "Ajudar Creche", 8);
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n<1> Cadastrar Projeto Distribuir Alimento\n<2>Cadastrar Projeto Trabalho Voluntario\n<3>Sair");

            switch (opcao)
            {
                case 1:
                    System.out.println(distA.validaProjeto());
                    System.out.println("\n" + distA.imprimeProjeto());
                    break;
                case 2:
                    System.out.println(trabVol.validaProjeto());
                    System.out.println("\n" + trabVol.imprimeProjeto());
                    break;
                case 3:
                    opcao = 4;

                default:
                    System.out.println("Escolha uma opção válida");

            }

        }while(opcao !=4);
    }
}
