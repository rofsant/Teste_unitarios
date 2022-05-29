package pedido;

public class Valor_item {

    private String item;
    private double preco;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double valorItem(){
        if(this.item == "Pizza"){
            return this.preco = 18.00;
        }else if(this.item == "Açai"){
            return this.preco = 10.00;
        }else if(this.item == "Suco"){
            return this.preco = 5.00;
        }
        return 0;
    }

    public double quantidade(){
        if(this.valorItem() == 18.00 && this.item == "Pizza"){
            return 18.00 * 10;
        }else if(this.valorItem() == 10.00 && this.item == "Açai"){
            return 10.00 * 5;
        }else if(this.valorItem() == 5.00 && this.item == "Suco"){
            return 5.00 * 5;
        }
        return 0.0;
    }

}
