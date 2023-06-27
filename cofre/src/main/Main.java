package main;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criação do objeto da classe Scanner
        boolean seEncerrado = true; // variavel para verificar se o loop principal vai continuar ou ser encerrado
        Cofrinho cofrinho = new Cofrinho(); // instancia da classe cofrinho
        cofrinho.inicializarLista();
        int resp;
        String tipoMoeda;
        float valorMoeda;
        System.out.println("Bem vindo a sua casa da moeda!");
        // loop contendo o fluxo central do codigo.
        while (seEncerrado){
            System.out.println("EScolha uma das opções");
            System.out.println("1 - Adicionar valores;\n2 - Remover valores;\n3 - Listar moedas;\n4 - Converter Valor para moeda desejada;\n0 - Sair do Programa");
            // função utilizada para solicitar ao usuario a ação.
            resp = verificarSeEntradaCorretaInt(0, 4, scanner);
            switch (resp) {
                case 1 -> {
                    System.out.println("Entre com a moeda");
                    System.out.println("1 - Dolar;\n2 - Euro;\n3 - Pesos\n4 - Real;\n5 - Rublos;\n0 - Sair;");
                    tipoMoeda = verificarSeEntradaCorretaMoeda(0, 5, scanner);
                    if (!tipoMoeda.equals("")){
                        System.out.println("Entre com o valor da moeda");
                        valorMoeda = verificarSeEntradaCorretaFloat();
                        cofrinho.adicionarMoeda(tipoMoeda, valorMoeda); // metodo utilizado para adicionar valores a alguma das moedas
                    }
                }
                case 2 -> {
                    System.out.println("Entre com a moeda que deseja remover");
                    System.out.println("1 - Dolar;\n2 - Euro;\n3 - Pesos\n4 - Real;\n5 - Rublos;\n0 - Sair;");
                    tipoMoeda = verificarSeEntradaCorretaMoeda(0, 5, scanner);
                    if (!tipoMoeda.equals("")){
                        System.out.println("Entre com o valor que deseja descontar da moeda");
                        valorMoeda = verificarSeEntradaCorretaFloat();
                        cofrinho.removerMoeda(tipoMoeda, valorMoeda);
                    }

                }
                case 3 -> cofrinho.listagemMoedas();
                case 4 -> {
                    System.out.println("Entre com a moeda para a qual deseja converter os valores do seu cofre");
                    System.out.println("1 - Dolar;\n2 - Euro;\n3 - Pesos\n4 - Real;\n5 - Rublos;\n0 - Sair;");
                    tipoMoeda = verificarSeEntradaCorretaMoeda(0, 5, scanner);
                    cofrinho.totalConvertido(tipoMoeda);
                }
                case 0 -> seEncerrado = false;
            }
        }
        System.out.println("Volte Sempre!");
    }

       private static int verificarSeEntradaCorretaInt(int menorValor, int maiorValor, Scanner scanner){
            int resp;
            while (true){
                try {
                    String primeiraResposta = scanner.next();
                    resp = Integer.parseInt(primeiraResposta);
                    if (resp >= menorValor && resp <= maiorValor){
                        break;
                    }
                    else {
                        System.out.println("Entre com um número valido.");
                    }
                } catch (Exception e) {
                    System.out.println("Entre com um número valido.");
                }
            }
            return resp;
        }
    private static float verificarSeEntradaCorretaFloat(){
        Scanner scanner = new Scanner(System.in);
        float resp;
        while (true){
            try {
                String primeiraResposta = scanner.next();
                resp = Float.parseFloat(primeiraResposta);
                break;
            } catch (Exception e) {
                System.out.println("Entre com um número valido.");
            }
        }
        return resp;
    }
    private static String verificarSeEntradaCorretaMoeda(int menorValor, int maiorValor, Scanner scanner){
        int resp;
        while (true){
            try {
                String primeiraResposta = scanner.next();
                resp = Integer.parseInt(primeiraResposta);
                if (resp >= menorValor && resp <= maiorValor){
                    break;
                }
                else {
                    System.out.println("Entre com um número valido.");
                }
            } catch (Exception e) {
                System.out.println("Entre com um número valido.");
            }
        }
        return switch (resp) {
            case 1 -> "Dolar";
            case 2 -> "Euro";
            case 3 -> "Pesos";
            case 4 -> "Real";
            case 5 -> "Rublos";
            default -> "";
        };
    }
}
