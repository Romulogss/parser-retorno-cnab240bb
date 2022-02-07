package br.com.brvt;

import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLote;
import br.com.brvt.Modelo.SegmentoZ;
import br.com.brvt.Util.ParserHeaderArquivo;
import br.com.brvt.Util.ParserHeaderLote;

public class App {
    public static void main(String[] args) {

        // testes ParserHeaderArquivo
        // headerArquivo é sempre a primeira linha do arquivo de retorno
        //String strHeaderArquivo = "00100000         2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMERBANCO DO BRASIL S.A.                    22601202212460900004105000022917030464INTRADIA                                        20         ";        
        //HeaderArquivo headerArquivo = new ParserHeaderArquivo(strHeaderArquivo).getHeaderArquivo();
        //System.out.println(headerArquivo.toString());

        // testes ParserLote
        // headerLote é sempre a segunda linha do arquivo de retorno
        //String strHeaderLote = "00100011C2001030 2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMER                         050030012000022                              00000                                                               ";
        //HeaderLote headerLote = new ParserHeaderLote(strHeaderLote).getHeaderLote();
        //System.out.println(headerLote.toString());



        // String stringSegmentoZ = "0010001300001A0000000010341340000004058798 JAWA COMERCIO E SERVICOS EIREL                    26012022BRL0000000000000000000000003054500000000000448355675926012022000000000305450                                        000000000    00        ";
        // SegmentoZ segmentoZ = new SegmentoZ();


    }
}
