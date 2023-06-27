package main;

import java.util.ArrayList;

public abstract class Moeda {

    private float valor;
    private String nomeDaMoeda;
    protected float fatorConversaoParaReal;

    protected Moeda(float valor, String nome){
        this.valor = valor;
        this.nomeDaMoeda = nome;
    }

    public float getValor() {
        return valor;
    }

    public String getNomeDaMoeda() {
        return nomeDaMoeda;
    }

    public float getFatorConversaoParaReal() {
        return fatorConversaoParaReal;
    }

    public void setFatorConversaoParaReal() {}

    public void adicionarValorDaMoeda(float valorAdicionado){
        this.valor = this.valor + valorAdicionado;
    }

    public void removerValorDaMoeda(float valorRemovido){
        this.valor = this.valor - valorRemovido;
    }



}
