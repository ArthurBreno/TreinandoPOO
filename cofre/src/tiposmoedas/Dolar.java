package tiposmoedas;

import main.Moeda;

public class Dolar extends Moeda {

    public Dolar(float valor, String nome){
        super(valor, nome);
        setFatorConversaoParaReal();
    }
    @Override
    public void setFatorConversaoParaReal(){
        fatorConversaoParaReal = 4.81F;
    }
}



