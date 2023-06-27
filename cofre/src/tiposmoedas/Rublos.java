package tiposmoedas;

import main.Moeda;

public class Rublos extends Moeda {
    public Rublos(float valor, String nome){
        super(valor, nome);
        setFatorConversaoParaReal();
    }
    @Override
    public void setFatorConversaoParaReal(){
        fatorConversaoParaReal = 0.057F;
    }
}

