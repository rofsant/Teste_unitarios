package entrega;

public class Localizacao {

    private String localizacaoTempoReal;

    public String getLocalizacaoTempoReal() {
        return localizacaoTempoReal;
    }

    public void setLocalizacaoTempoReal(String localizacaoTempoReal) {
        this.localizacaoTempoReal = localizacaoTempoReal;
    }

    public String saiuEntrega(){
        if(this.getLocalizacaoTempoReal() == "Saiu"){
            return "Saiu para entrega";
        }else{
            return "Logo seu pedido sairá para entrega";
        }
    }

    public String pedidoChegou(){
        if(this.getLocalizacaoTempoReal() == "Chegou"){
            return "Seu pedido chegou";
        }else{
            return "Seu pedido está a caminho";
        }
    }
}
