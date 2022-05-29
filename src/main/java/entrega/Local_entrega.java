package entrega;

public class Local_entrega {

    private String dados;

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public String endereco(){
        if(this.dados =="preenchidos"){
            return "Dados preenchidos";

        }else{
            return "Dados não preeenchidos";
        }
    }
    public boolean recebido (){
        if(endereco() == "Dados preenchidos"){
            return true;

        }else{
            return false;
        }
    }
}
