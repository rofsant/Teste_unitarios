package pedido;

public class Itens {

    private String cardapio;
    private String item;

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String Salgados(){
        if(this.cardapio == "Coxinha, Pastel, Batata frita"){
            return "Cardapio visto";
        }else{
            return "Aguardando o cardapio";
        }
    }

    public String escolherItemCardapio(){
        if (this.item == "Coxinha, Pastel, Empada") {
            return "Pedido anotado";
        }else{
            return "Não temos mais empada";
        }
    }

    public boolean fecharPedido(){
        if(this.Salgados() == "Cardapio visto" && this.escolherItemCardapio() == "Pedido anotado"){
            return true;
        }else{
            return false;
        }
    }
}
