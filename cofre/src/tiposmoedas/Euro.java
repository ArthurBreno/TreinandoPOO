package tiposmoedas;

import main.Moeda;

public class Euro extends Moeda {

    public Euro(float valor, String nome){
        super(valor, nome);
        setFatorConversaoParaReal();
    }
    @Override
    public void setFatorConversaoParaReal(){
        fatorConversaoParaReal = 5.27F;
    }
}
