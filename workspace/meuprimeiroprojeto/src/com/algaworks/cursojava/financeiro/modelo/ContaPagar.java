package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta{

    private Fornecedor fornecedor;

    public ContaPagar() {
        // constructor
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {

        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);

    }

    public void pagar() {

        switch (this.getSituacaoConta()) {

            case PAGA:
                System.err.println("Não posso pagar uma conta que já foi paga.");
            break;

            case CANCELADA:
                System.err.println("Não posso pagar uma conta que já foi cancelada.");
            break;

            case PENDENTE:
                this.situacaoConta = SituacaoConta.PAGA;
                System.out.println(
                    "Pagando conta " + this.getDescricao() +
                    " no valor de " + this.getValor() +
                    " com vencimento em " + this.getDataVencimento() + "...");
             break;
        }
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void exibirDetalhes() {
        // Esse método deve exibir todos os detalhes do objeto em um formato legal para aparecer em um relatório.
        System.out.println();
        System.out.println("--- Conta a Pagar ---");
        System.out.println("Fornecedor: " + this.getFornecedor().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Vencimento: " + this.getDataVencimento());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("----------------------");

    }
}
