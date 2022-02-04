package br.com.brvt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.brvt.Util.AbrirArquivo;

public class App {
    public static void main(String[] args) {

        // ATENÇÃO: usar path completo
        Stream stream = new AbrirArquivo("/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/modelos/CNAB240BB.ret").getStream();
        //System.out.println(stream.count());

        List<String> linhas = new LinkedList<String>();

        stream.forEachOrdered(s -> linhas.add(s.toString()));
        System.out.println(linhas.size());
        


        

    }
}
