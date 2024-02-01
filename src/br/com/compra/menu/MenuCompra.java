package br.com.compra.menu;

import br.com.compra.cliente.DadosCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCompra {
    Scanner leitor = new Scanner(System.in);
    private static final DadosCliente objCliente = new DadosCliente();
    private static final List<Compras> listaCompras = new ArrayList<Compras>();

    private static final Compras objCompras = new Compras();

    private int opcao;

    public void compraComCartao(DadosCliente dados) {

        if (dados.getNmNome() != null) {
            System.out.println("Bem vindo " + dados.getNmNome());
            System.out.println("Deseja comprar algo?");
            System.out.println("1 - Sim \n2 - Nao");
            System.out.print("Escolha uma opção: \n");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.println("Comprando!!!!");
                comprarProdutos();
            } else {
                System.out.println("Obrigado");
            }
        } else {
            System.out.println("Seja bem vindo");
            System.out.println("Cadastrando dados do cliente");
            objCliente.recebeDados();
            System.out.println("Deseja comprar algo?");
            System.out.println("1 - Sim \n2 - Nao");
            System.out.print("Escolha uma opção: \n");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.println("Bem vindo " + objCliente.getNmNome());
                System.out.println("Comprando!!!!");
                comprarProdutos();
            } else {
                System.out.println("Obrigado");
            }
        }


        System.out.println(objCliente);
    }

    private void comprarProdutos() {
        listaCompras.add(objCompras.itemCompra());
    }


}
