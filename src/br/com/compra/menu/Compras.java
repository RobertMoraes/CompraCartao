package br.com.compra.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compras {
    Scanner leitor = new Scanner(System.in);
    private String nmProduto;
    private double vlUnitario;
    private Integer nrQuantidade;
    private double vlTotal;
    private List<Compras> lstCompras = new ArrayList<>();

    public Compras(String nmProduto, double vlUnitario, Integer nrQuantidade) {
        this.nmProduto = nmProduto;
        this.vlUnitario = vlUnitario;
        this.nrQuantidade = nrQuantidade;
    }

    public Compras() {

    }

    public Compras itemCompra() {
        int sair = 1;
        while (sair != 0) {
            System.out.println("Nome do item: ");
            nmProduto = setNmProduto(leitor.next());
            System.out.println("Valor unitario: ");
            vlUnitario = setVlUnitario(leitor.nextDouble());
            System.out.println("Quantidade: ");
            nrQuantidade = setNrQuantidade(leitor.nextInt());
            lstCompras.add(new Compras(nmProduto, vlUnitario, nrQuantidade));
            System.out.println("0 - Sair \n1 - Continuar");
            sair = leitor.nextInt();
        }
        for(Compras item : lstCompras) {
            item.vlTotal += (item.vlUnitario * item.nrQuantidade);
            System.out.println(item.nmProduto + " - " + item.vlUnitario + " - " + item.nrQuantidade + " - " + item.vlTotal);
        }
        return new Compras(nmProduto, vlUnitario, nrQuantidade);
    }


    public String getNmProduto() {
        return nmProduto;
    }

    public String setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
        return nmProduto;
    }

    public double getVlUnitario() {
        return vlUnitario;
    }

    public double setVlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
        return vlUnitario;
    }

    public Integer getNrQuantidade() {
        return nrQuantidade;
    }

    public Integer setNrQuantidade(Integer nrQuantidade) {
        this.nrQuantidade = nrQuantidade;
        return nrQuantidade;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }
}
