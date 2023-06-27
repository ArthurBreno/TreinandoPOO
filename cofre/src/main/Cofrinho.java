package main;

import tiposmoedas.*;

import java.util.ArrayList;
public class Cofrinho {
    protected ArrayList<Moeda> cofre = new ArrayList<>();

    public void inicializarLista() {
        cofre.add(new Dolar(0, "Dolar"));
        cofre.add(new Euro(0, "Euro"));
        cofre.add(new Pesos(0, "Pesos"));
        cofre.add(new Real(0, "Real"));
        cofre.add(new Rublos(0, "Rublos"));
    }
    public void adicionarMoeda(String moeda, float quantidade) {
        for (int i = 0; i < cofre.size(); i++) {
            if (cofre.get(i).getNomeDaMoeda().equals(moeda)) {
                cofre.get(i).adicionarValorDaMoeda(quantidade);
                break;
            }
        }
    }
    public void removerMoeda(String moeda, float quantidade) {
        for (int i = 0; i < cofre.size(); i++) {
            if (cofre.get(i).getNomeDaMoeda().equals(moeda)){
                if (cofre.get(i).getValor() >= quantidade){
                    cofre.get(i).removerValorDaMoeda(quantidade);
                    break;
                }
                else {
                    System.out.println("Saldo insuficiente.\nOperação abortada");
                }
            }
        }
    }
    public void listagemMoedas() {
        boolean seCofreVasio = true;
        System.out.println("Cofre: ");
        for (int i = 0; i < cofre.size(); i++) {
            if (cofre.get(i).getValor() > 0) {
                seCofreVasio = false;
                System.out.print("Moeda: " + (cofre.get(i).getNomeDaMoeda()) + " - ");
                System.out.println("valor: " + cofre.get(i).getValor());
            }
        }
        if (seCofreVasio){
            System.out.println("O cofre está Vazio!");
        }
    }

    public void totalConvertido(String moedaAConverter) {
        float somatoriaParaConverter = 0;
        float fatorDeConversao = 0;
        boolean seVasio = true;
        for (int i = 0; i < cofre.size(); i++) {
            if (!(cofre.get(i).getNomeDaMoeda().equals(moedaAConverter)) && cofre.get(i).getValor() > 0) {
                seVasio = false;
                somatoriaParaConverter = somatoriaParaConverter + (cofre.get(i).getValor() * cofre.get(i).fatorConversaoParaReal);
                cofre.get(i).removerValorDaMoeda(cofre.get(i).getValor()); // calcular a conversão
            }
            if (cofre.get(i).getNomeDaMoeda().equals(moedaAConverter)){
                fatorDeConversao = cofre.get(i).getFatorConversaoParaReal();
            }
        }
        if (seVasio){
            System.out.println("O cofre está Vazil!");
        }
        else {
            somatoriaParaConverter = somatoriaParaConverter / fatorDeConversao;
            adicionarMoeda(moedaAConverter, somatoriaParaConverter);
        }
    }
}




