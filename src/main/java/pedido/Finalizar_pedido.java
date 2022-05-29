package pedido;

public class Finalizar_pedido {

    private String carrinho;
    private String item;

    public String getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(String carrinho) {
        this.carrinho = carrinho;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String addItem() {
        if (this.carrinho == "Item Adicionado") {
            return "Seu item foi adicionado ao carrinho";
        }else{
            return "Item não adicionado";
        }
    }

    public String conferirItem(){
        if(this.item == "Açaí"){
            return "Item conferido";
        }else{
            return "Addicionar mais itens";
        }
    }

    public boolean finalizarPedido(){
        if(this.addItem() == "Seu item foi adicionado ao carrinho" && this.conferirItem() == "Item conferido"){
            return true;
        }else{
            return false;
        }
    }

}
