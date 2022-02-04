package br.com.brvt;

import java.util.stream.Stream;

import br.com.brvt.Util.AbrirArquivo;

public class App {
    public static void main(String[] args) {

        // ATENÇÃO: usar path completo
        Stream stream = new AbrirArquivo("/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/modelos/CNAB240BB.ret").getStream();
        stream.forEach(s -> System.out.println(s));
        String linha1 = stream.


        

    }
}
