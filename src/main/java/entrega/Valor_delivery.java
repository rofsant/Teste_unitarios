package entrega;

public class Valor_delivery {

    private double preco;
    private String local;


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double valores(){
        if(this.local == "Endereço de entrega" ){
            return this.preco = 10.00;
        }else if(this.local == "Endereço de entrega 2"){
            return this.preco = 20.00;
        }
        return 0;
    }
    public String distancia(){
        if(valores() == 10.00){
            return "5 km";
        }else if (valores() == 20.00){
            return "Frete Grátis";
        }
        return "Vázio";
    }
}
