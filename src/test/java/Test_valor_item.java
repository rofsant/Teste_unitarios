import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pedido.Finalizar_pedido;
import pedido.Valor_item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_valor_item {
    Valor_item valor;
    @BeforeEach
    public void setUp(){
        valor = new Valor_item();
    }
    @Test
    public void testValorItem(){
        valor.setItem("Pizza");
        assertEquals(18.00, valor.valorItem());
    }

    @Test
    public void testQuantidadeAcai(){
        valor.setItem("Açai");
        assertEquals(50.00, valor.quantidade());
    }

    @Test
    public void testQuantidadeSuco(){
        valor.setItem("Suco");
        assertEquals(25.00, valor.quantidade());
    }
    @AfterEach
    public void finalizado(){
        System.out.println("Método testdado");
    }
}


