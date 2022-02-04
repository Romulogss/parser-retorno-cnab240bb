package br.com.brvt;

import br.com.brvt.Modelo.HeaderCNAB240BB;
import br.com.brvt.Util.ParserCabecalho;

public class App {
    public static void main(String[] args) {

        // ATENÇÃO: usar path completo
        // Stream stream = new AbrirArquivo("/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/modelos/CNAB240BB.ret").getStream();
        //System.out.println(stream.count());

        // List<String> linhas = new LinkedList<String>();

        // stream.forEachOrdered(s -> linhas.add(s.toString()));
        // System.out.println(linhas.size());

        // testando parser cabeçalho
        String stringCabecalho = "00100000         2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMERBANCO DO BRASIL S.A.                    22601202212460900004105000022917030464INTRADIA                                        20         ";
                
        HeaderCNAB240BB cabecalho = new ParserCabecalho(stringCabecalho).getCabecalho();
        System.out.println(cabecalho.toString());

        

    }
}
