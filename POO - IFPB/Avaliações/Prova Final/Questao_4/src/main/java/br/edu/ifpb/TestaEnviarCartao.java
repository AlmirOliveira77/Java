package br.edu.ifpb;

public class TestaEnviarCartao {

    public static void main( String[] args ) {
        EnviarCartao s = new EnviarCartao();
        s.enviarCartao(new CartaoAniversario());
        s.enviarCartao(new CartaoNatalino());
        s.enviarCartao(new CartaoPascoa());
    }
}
