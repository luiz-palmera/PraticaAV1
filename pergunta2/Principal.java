package av1.pergunta2;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        Pix pagamentoPix = new Pix("25/06 as 15h", 34, 345.60, true);
        System.out.println("\n" + pagamentoPix.imprimirCupomFiscal());

        CartaoCredito pagamentoCredito = new CartaoCredito("05/06 as 06h", 24, 55, "4444 5555 6666 7777", "MasterVisa", "Leila");
        System.out.println("\n" + pagamentoCredito.imprimirCupomFiscal());

        CartaoDebito pagamentoDebito = new CartaoDebito("05/06 as 06h", 24, 55, "4444 5555 6666 7777", "Leila");
        System.out.println("\n" + pagamentoCredito.imprimirCupomFiscal());
    }
}
