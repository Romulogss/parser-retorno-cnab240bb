package br.com.brvt;

import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.SegmentoZ;
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
        HeaderArquivo cabecalho = new ParserCabecalho(stringCabecalho).getCabecalho();
        System.out.println(cabecalho.toString());

        String stringSegmentoZ = "0010001300001A0000000010341340000004058798 JAWA COMERCIO E SERVICOS EIREL                    26012022BRL0000000000000000000000003054500000000000448355675926012022000000000305450                                        000000000    00        ";
        SegmentoZ segmentoZ = new SegmentoZ();


    }
}
