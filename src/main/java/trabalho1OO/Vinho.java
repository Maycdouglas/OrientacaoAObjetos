package trabalho1OO;

public class Vinho extends Bebida {

    private float calcularDesconto() {
        float desconto = 0.0f;
        if(getQntdCarrinho() > 10){
            desconto = (getPreco() * getQntdCarrinho()) * 0.15f;
        }
        return desconto;
    }

    public float calcularValorCompra() {
        return (getPreco() * getQntdCarrinho()) - calcularDesconto();
    }

}
