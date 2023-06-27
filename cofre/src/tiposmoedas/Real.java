package tiposmoedas;

import main.Moeda;

public class Real extends Moeda {
    public Real(float valor, String nome){
        super(valor, nome);
        setFatorConversaoParaReal();
    }
    @Override
    public void setFatorConversaoParaReal(){
        fatorConversaoParaReal = 1F;
    }
}
