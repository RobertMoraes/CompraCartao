import br.com.compra.cliente.DadosCliente;
import br.com.compra.menu.MenuCompra;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComprasOnline {
    static Scanner leitor = new Scanner(System.in);
    private static int opcao;
    private static DadosCliente objCliente = new DadosCliente();
    private static MenuCompra objMenu = new MenuCompra();
    private static DadosCliente dados = new DadosCliente();

    public static void main(String[] args) {
        System.out.println("1 - Cadastrar dados cliente\n2 - Comprar");
        System.out.println("Escolha uma opção: ");
        opcao = leitor.nextInt();
        System.out.println("Escolheu: " + opcao);
        switch (opcao) {
            case 1:
                System.out.println("Cadastrando dados do cliente");
                objCliente.recebeDados();
                dados = objCliente;
                objMenu.compraComCartao(dados);
                break;
            case 2:
                System.out.println("Comprando");
                objMenu.compraComCartao(dados);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        leitor.close();
        System.out.println("Fim do programa");

    }
}