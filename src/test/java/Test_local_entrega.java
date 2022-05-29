import entrega.Local_entrega;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_local_entrega {
   Local_entrega local;
    @BeforeEach
    public void setUp(){
        local = new Local_entrega();
    }
    @Test
    public void testarDadosPreenchidos(){
        local.setDados("preenchidos");
        assertEquals("Dados preenchidos", local.endereco());
    }

    @Test
    public void verificarPedidoSaiuEntrega(){
        local.setDados("preenchidos");
        assertTrue(local.recebido());
    }

    @Test
    public void verificarPedidoNaoSaiuEntrega(){
        local.setDados("Não preenchidos");
        assertFalse(local.recebido());
    }
    @AfterEach
    public void finalizado(){
        System.out.println("Método testdado");
    }
}


