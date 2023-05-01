package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    private SituacaoConta situacaoConta;

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this(); // chamada ao construtor padrão
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;      
    }

    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public void pagar() {
        if (situacaoConta.equals(SituacaoConta.CANCELADA) || situacaoConta.equals(SituacaoConta.PAGA)) {
            System.err.println("Não posso pagar uma conta que já foi paga ou cancelada.");
        } else {
            this.situacaoConta = SituacaoConta.PAGA;
            System.out.println(
                                "Pagando conta "        +   this.getDescricao() + 
                                " no valor de "         +   this.getValor()     + 
                                " com vencimento em "   + this.getDataVencimento()          + 
                                " do fornecedor "       +   this.getFornecedor().getNome()  + 
                                "..."
                                );
        }
    }

    public void cancelar() {        
        if (situacaoConta.equals(SituacaoConta.PAGA)) {
            System.err.println("Não posso cancelar uma conta que já foi paga.");

        } else if (situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.err.println("Não posso cancelar uma conta que já foi cancelada.");

        } else {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println(
                "Cancelando conta "     +   this.getDescricao() +
                " no valor de "         +   this.getValor()     +
                " com vencimento em "   +   this.getDataVencimento() +
                " do fornecedor "       +   this.getFornecedor().getNome() +
                "..."
            );
        }
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
