import java.util.Scanner;

public class Adega {
    public static void main(String[] args) {

        int tinto = 0;
        int branco = 0;
        int  rose = 0;
        boolean stop = false;

        Scanner input = new Scanner(System.in);

        while (!stop) {
            System.out.println("Insira o tipo do vinho: T, B ou R ou Pressione F para finalizar.");
            String tipo = input.next();
            if (tipo.equalsIgnoreCase("t")) {
                tinto++;
            } else if (tipo.equalsIgnoreCase("b")) {
                branco++;

            } else if (tipo.equalsIgnoreCase("r")) {
                rose++;

            }else if (input.next().equalsIgnoreCase("f")) {
                    stop = true;
            }else {
                System.out.println("Entrada inválida");
            }
        }
        System.out.println("CONTAGEM FINALIZADA");


        int total = rose + tinto + branco;
        double porcentagemRose = (double)rose*100/total;
        double porcentagemTinto = (double) tinto*100/total;
        double porcentagemBranco = (double) branco*100/total ;

        System.out.printf("Total de vinhos da adega: %d.\nPorcentagem de vinho Tinto %.1f%%\n" +
                "Porcentagem de vinho Branco %.1f%%\n" +
                "Porcentagem de vinho Rosé %.1f%%", total, porcentagemTinto,porcentagemBranco,porcentagemRose);

    }
}