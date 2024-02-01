package br.com.compra.cartao;

import br.com.compra.cliente.DadosCliente;

import java.util.Scanner;

public class DadosCartao {
    Scanner leitorCartao = new Scanner(System.in);
    private String nmBandeira;
    private String nrNumeroCartao;
    private String nrValidade;
    private String nrCvv;
    private double vlLimite;
    private double vlSaldo;

    public void recebeDadosCartao() {
        System.out.println("Recebendo dados do cartão");
        System.out.println("Informe o numero do cartão: ");
        nrNumeroCartao = setNrNumeroCartao(leitorCartao.next());
        System.out.println("Informe a bandeira do cartão: ");
        nmBandeira = setNmBandeira(leitorCartao.next());
        System.out.println("Informe data de validade: ");
        nrValidade = setNrValidade(leitorCartao.next());
        System.out.println("Informe o CVV do cartão: ");
        nrCvv = setNrCvv(leitorCartao.next());

    }

    public DadosCartao() {

    }

    public DadosCartao(double vlLimite) {
        this.vlLimite = vlLimite;
        this.vlSaldo = vlLimite;
    }

    public String getNmBandeira() {
        return nmBandeira;
    }

    public String setNmBandeira(String nmBandeira) {
        this.nmBandeira = nmBandeira;
        return nmBandeira;
    }

    public String getNrNumeroCartao() {
        return nrNumeroCartao;
    }

    public String setNrNumeroCartao(String nrNumeroCartao) {
        this.nrNumeroCartao = nrNumeroCartao;
        return nrNumeroCartao;
    }

    public String getNrValidade() {
        return nrValidade;
    }

    public String setNrValidade(String nrValidade) {
        this.nrValidade = nrValidade;
        return nrValidade;
    }

    public String getNrCvv() {
        return nrCvv;
    }

    public String setNrCvv(String nrCvv) {
        this.nrCvv = nrCvv;
        return nrCvv;
    }

    public double getVlLimite() {
        return vlLimite;
    }

    public void setVlLimite(double vlLimite) {
        this.vlLimite = vlLimite;
    }

    public double getVlSaldo() {
        return vlSaldo;
    }

    public void setVlSaldo(double vlSaldo) {
        this.vlSaldo = vlSaldo;
    }

    @Override
    public String toString() {
        return "DadosCartao{" +
                "nmBandeira='" + nmBandeira + '\'' +
                ", nrNumeroCartao='" + nrNumeroCartao + '\'' +
                ", nrValidade='" + nrValidade + '\'' +
                ", nrCvv='" + nrCvv + '\'' +
                '}';
    }
}
