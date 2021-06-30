package trabalho1OO;

public class Cerveja extends Bebida {

    private float calcularDesconto() {
        float desconto = 0.0f;
        if(getQntdCarrinho() > 15){
            desconto = (getPreco() * getQntdCarrinho()) * 0.10f;
        }
        return desconto;
    }

    public float calcularValorCompra() {
        return (getPreco() * getQntdCarrinho()) - calcularDesconto();
    }
}
