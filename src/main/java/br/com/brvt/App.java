package br.com.brvt;

import br.com.brvt.Util.Util;

public class App {
    public static void main(String[] args) {

        // LinkedList<String> linhas  = new LinkedList<>();
        //ArrayList<String> linhas = new AbrirArquivo("/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/modelos/IEDPAG41260120220.ret").getLinkedList();
        

        System.out.println(new Util().FormataCPF("00034769620837"));
        System.out.println(new Util().FormataCNPJ("00000000000191"));
        
        
    }
}

