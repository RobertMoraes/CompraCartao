package br.com.compra.cliente;

import br.com.compra.cartao.DadosCartao;

import java.util.Scanner;

public class DadosCliente {
    Scanner leitor = new Scanner(System.in);
    private String nmNome;
    private String nrCpfCnpj;
    private Integer isEmpresa;
    private EnderecoCliente objEndereco = new EnderecoCliente();
    private ContatoCliente objContato = new ContatoCliente();
    private DadosCartao objCartao = new DadosCartao();


    public void recebeDados() {
        System.out.println("1 - Pessoa Jurídica\n2 - Pessoa Física");
        System.out.println("Escolha uma opção: ");
        isEmpresa = leitor.nextInt();
        switch (isEmpresa) {
            case 1:
                recebeDadosEmpresarial();
                objCartao.recebeDadosCartao();
                break;
            case 2:
                recebeDadosPessoaFisica();
//                objCartao.recebeDadosCartao();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.println();

    }

    private void recebeDadosPessoaFisica() {
        System.out.println("Pessoa Física");
        System.out.println("Nome: ");
        nmNome = setNmNome(leitor.next());
        System.out.println("CPF: ");
        nrCpfCnpj = setNrCpfCnpj(leitor.next());
    }

    private void recebeDadosEmpresarial() {
        System.out.println("Pessoa Jurídica");
        System.out.print("Nome: \n");
        nmNome = setNmNome(leitor.next());
        System.out.print("CNPJ: \n");
        nrCpfCnpj = setNrCpfCnpj(leitor.next());
    }

    public String setNmNome(String nmNome) {
        this.nmNome = nmNome;
        return nmNome;
    }

    public String setNrCpfCnpj(String nrCpf) {
        this.nrCpfCnpj = nrCpf;
        return nrCpf;
    }

    public String getNmNome() {
        return nmNome;
    }

    public String getNrCpfCnpj() {
        return nrCpfCnpj;
    }

    @Override
    public String toString() {
        return "DadosCliente{" +
                "nmNome='" + nmNome + '\'' +
                ", nrCpfCnpj='" + nrCpfCnpj + '\'' +
                ", objCartao=" + objCartao +
                '}';
    }


}
