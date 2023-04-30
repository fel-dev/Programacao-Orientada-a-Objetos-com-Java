package capitulo5;

public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public ContaPagar() {
    }

    public void pagar() {
        System.out.println("Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " com vencimento em " + this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + "...");
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
