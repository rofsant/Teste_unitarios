import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pedido.Finalizar_pedido;
import pedido.Itens;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_itens {
    Itens itens;
    @BeforeEach
    public void setUp(){
        itens = new Itens();
    }
    @Test
    public void testarSalgados(){
        itens.setCardapio("Coxinha, Pastel, Batata frita");
        assertEquals("Cardapio visto", itens.Salgados());
    }

    @Test
    public void testEscolherItemCardapio(){
        itens.setItem("Coxinha, Pastel, Empada");
        assertEquals("Pedido anotado", itens.escolherItemCardapio());
    }

    @Test
    public void testFecharPedido(){
        itens.setCardapio("Coxinha, Pastel, Batata frita");
        itens.setItem("Coxinha, Pastel, Empada");
        assertTrue(itens.fecharPedido());
    }
    @AfterEach
    public void finalizado(){
        System.out.println("Método testdado");
    }
}
