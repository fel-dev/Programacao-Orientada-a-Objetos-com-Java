package capitulo5;

public class ContaPagar {
    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public ContaPagar() {
    }

    public void pagar() {
        System.out.println("Pagando conta " + this.descricao + " no valor de " + this.valor + " com vencimento em " + this.dataVencimento + " do fornecedor " + this.fornecedor.getNome());
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
