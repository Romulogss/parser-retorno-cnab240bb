package br.com.brvt;

import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;
import br.com.brvt.Util.ParserHeaderArquivo;
import br.com.brvt.Util.ParserHeaderLoteAB;
import br.com.brvt.Util.ParserSegmentoA;
import br.com.brvt.Util.ParserSegmentoB;

public class App {
    public static void main(String[] args) {

        // testes comparando o valor da string com o validador em https://gmedi.bb.com.br/validaleiaute/#/

        // testes ParserHeaderArquivo
        // headerArquivo é sempre a primeira linha do arquivo de retorno
        // linha 1
        //String strHeaderArquivo = "00100000         2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMERBANCO DO BRASIL S.A.                    22601202212460900004105000022917030464INTRADIA                                        20         ";        
        //HeaderArquivo headerArquivo = new ParserHeaderArquivo(strHeaderArquivo).getHeaderArquivo();
        //System.out.println(headerArquivo.toString());

        // testes ParserLote
        // headerLoteAB é sempre a segunda linha do arquivo de retorno
        // linha 2
        //String strHeaderLoteAB = "00100011C2001030 2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMER                         050030012000022                              00000                                                               ";
        //HeaderLoteAB headerLoteAB = new ParserHeaderLoteAB(strHeaderLoteAB).getHeaderLote();
        //System.out.println(headerLote.toString());

        // testes ParserSegmento A
        // definido pelo 14 caractere
        // linha 3
        // String strSegmentoA = "0010001300001A0000000010341340000004058798 JAWA COMERCIO E SERVICOS EIREL                    26012022BRL0000000000000000000000003054500000000000448355675926012022000000000305450                                        000000000    00        ";
        // SegmentoA segmentoA = new ParserSegmentoA(strSegmentoA).getSegmentoA();
        // System.out.println(segmentoA.toString());
        
        // testes ParserSegmento B
        // definido pelo 14 caractere
        // linha 4
        // String strSegmentoB = "0010001300002B   200049460000104                                                                                                                                                                                                                ";
        // SegmentoB segmentoB = new ParserSegmentoB(strSegmentoB).getSegmentoB();
        // System.out.println(segmentoB);

        // testes segmento Z
        // definido pelo 14 caractere
        // linha 5
        // String stringSegmentoZ = "0010001300001A0000000010341340000004058798 JAWA COMERCIO E SERVICOS EIREL                    26012022BRL0000000000000000000000003054500000000000448355675926012022000000000305450                                        000000000    00        ";
        // SegmentoZ segmentoZ = new SegmentoZ(stringSegmentoZ).get;


    }
}
