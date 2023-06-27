package tiposmoedas;

import main.Moeda;

public class Pesos extends Moeda {
    public Pesos(float valor, String nome){
        super(valor, nome);
        setFatorConversaoParaReal();
    }
    @Override
    public void setFatorConversaoParaReal(){
        fatorConversaoParaReal = 0.019F;
    }

}
