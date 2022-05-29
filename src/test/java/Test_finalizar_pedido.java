import entrega.Local_entrega;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pedido.Finalizar_pedido;

import static org.junit.jupiter.api.Assertions.*;

public class Test_finalizar_pedido {
    Finalizar_pedido finalizar;
    @BeforeEach
    public void setUp(){
        finalizar = new Finalizar_pedido();
    }
    @Test
    public void testarAddItem(){
        finalizar.setCarrinho("Item Adicionado");
        assertEquals("Seu item foi adicionado ao carrinho", finalizar.addItem());
    }

    @Test
    public void testConferirItem(){
        finalizar.setItem("Açaí");
        assertEquals("Item conferido", finalizar.conferirItem());
    }

    @Test
    public void testeFinalizarPedido(){
        finalizar.setCarrinho("Item Adicionado");
        finalizar.setItem("Açaí");
        assertTrue(finalizar.finalizarPedido());
    }
    @AfterEach
    public void finalizado(){
        System.out.println("Método testdado");
    }
}
