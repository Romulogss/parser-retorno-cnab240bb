package br.com.brvt;

import java.util.ArrayList;

import br.com.brvt.Modelo.CompTransfEntreContasBB;
import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;
import br.com.brvt.Util.ArquivoAbrir;
import br.com.brvt.Util.ArquivoGravar;
import br.com.brvt.Util.GerarCompTransferencia;
import br.com.brvt.Util.ParserHeaderArquivo;
import br.com.brvt.Util.ParserHeaderLoteAB;
import br.com.brvt.Util.ParserSegmentoA;
import br.com.brvt.Util.ParserSegmentoB;
import br.com.brvt.Util.ParserSegmentoZ;
import br.com.brvt.Util.Util;

public class App {
    public static void main(String[] args) {

        // LinkedList<String> linhas  = new LinkedList<>();
        //ArrayList<String> linhas = new AbrirArquivo("/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/modelos/IEDPAG41260120220.ret").getLinkedList();
        

        System.out.println(new Util().FormataCPF("00034769620837"));
        System.out.println(new Util().FormataCNPJ("00000000000191"));
        
        
    }
}

