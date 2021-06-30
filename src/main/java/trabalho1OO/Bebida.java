package trabalho1OO;

public class Bebida {

    private String nome;
    private int qntdCarrinho;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntdCarrinho() {
        return qntdCarrinho;
    }

    public void setQntdCarrinho(int qntdCarrinho) {
        this.qntdCarrinho = qntdCarrinho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float calcularValorCompra() {
            return (this.preco * this.qntdCarrinho);
    }

}
