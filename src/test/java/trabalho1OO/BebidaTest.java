package trabalho1OO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void deveRetornar6() {
        Bebida bebida = new Bebida();
        bebida.setNome("Água");
        bebida.setPreco(3.0f);
        bebida.setQntdCarrinho(2);

        assertEquals(6.0f, bebida.calcularValorCompra());
    }
}