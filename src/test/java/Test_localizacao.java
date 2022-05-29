import entrega.Local_entrega;
import entrega.Localizacao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_localizacao {
    Localizacao localizacao;
    @BeforeEach
    public void setUp() {
        localizacao = new Localizacao();
    }
    @Test
    public void saiuEntrega(){
        localizacao.setLocalizacaoTempoReal("Saiu");
        assertEquals("Saiu para entrega", localizacao.saiuEntrega());
    }

    @Test
    public void pedidoChegou(){
        localizacao.setLocalizacaoTempoReal("Chegou");
        assertEquals("Seu pedido chegou",localizacao.pedidoChegou());
    }

    @Test
    public void pedidoCaminho(){
        localizacao.setLocalizacaoTempoReal("A caminho");
        assertEquals("Seu pedido está a caminho",localizacao.pedidoChegou());
    }
    @AfterEach
    public void finalizado(){
        System.out.println("Método testado");
    }
}
