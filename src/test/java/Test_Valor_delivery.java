import entrega.Local_entrega;
import entrega.Valor_delivery;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Valor_delivery {
    Valor_delivery delivery;
    @BeforeEach
    public void setUp(){
        delivery = new Valor_delivery();
    }
    @Test
    public void testValores(){
        delivery.setLocal("Endereço de entrega");
        assertEquals(10.00, delivery.valores());
    }

    @Test
    public void testDeliveryPago(){
        delivery.setLocal("Endereço de entrega");
        assertEquals("5 km", delivery.distancia());
    }

    @Test
    public void testFreteGratis(){
        delivery.setLocal("Endereço de entrega 2");
        assertEquals("Frete Grátis", delivery.distancia());
    }
    @AfterEach
    public void finalizado(){
        System.out.println("Método testdado");
    }
}
