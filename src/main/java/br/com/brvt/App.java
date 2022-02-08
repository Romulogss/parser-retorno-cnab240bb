package br.com.brvt;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.brvt.Modelo.ComprovanteTransferencia;
import br.com.brvt.Modelo.ErrosConciliacao;
import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;
import br.com.brvt.Util.ParserHeaderArquivo;
import br.com.brvt.Util.ParserHeaderLoteAB;
import br.com.brvt.Util.ParserSegmentoA;
import br.com.brvt.Util.ParserSegmentoB;
import br.com.brvt.Util.ParserSegmentoZ;

public class App {
    public static void main(String[] args) {

        // testes comparando o valor da string com o validador em https://gmedi.bb.com.br/validaleiaute/#/

        // testes ParserHeaderArquivo
        // headerArquivo é sempre a primeira linha do arquivo de retorno
        // linha 1
        String strHeaderArquivo = "00100000         2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMERBANCO DO BRASIL S.A.                    22601202212460900004105000022917030464INTRADIA                                        20         ";        
        HeaderArquivo headerArquivo = new ParserHeaderArquivo(strHeaderArquivo).getHeaderArquivo();
        //System.out.println(headerArquivo.toString());

        // testes ParserLote
        // headerLoteAB é sempre a segunda linha do arquivo de retorno
        // linha 2
        String strHeaderLoteAB = "00100011C2001030 2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMER                         050030012000022                              00000                                                               ";
        HeaderLoteAB headerLoteAB = new ParserHeaderLoteAB(strHeaderLoteAB).getHeaderLote();
        //System.out.println(headerLote.toString());

        // testes ParserSegmento A
        // definido pelo 14 caractere
        // linha 3
        String strSegmentoA = "0010001300001A0000000010341340000004058798 JAWA COMERCIO E SERVICOS EIREL                    26012022BRL0000000000000000000000003054500000000000448355675926012022000000000305450                                        000000000    00        ";
        SegmentoA segmentoA = new ParserSegmentoA(strSegmentoA).getSegmentoA();
        System.out.println(segmentoA.toString() + "\n");
        
        // testes ParserSegmento B
        // definido pelo 14 caractere
        // linha 4
        String strSegmentoB = "0010001300002B   200049460000104                                                                                                                                                                                                                ";
        SegmentoB segmentoB = new ParserSegmentoB(strSegmentoB).getSegmentoB();
        // System.out.println(segmentoB);

        // testes segmento Z
        // definido pelo 14 caractere
        // linha 5
        String strSegmentoZ = "0010001300001A0000000010341340000004058798 JAWA COMERCIO E SERVICOS EIREL                    26012022BRL0000000000000000000000003054500000000000448355675926012022000000000305450                                        000000000    00        ";
        SegmentoZ segmentoZ = new ParserSegmentoZ(strSegmentoZ).getSegmentoZ();

        // ComprovanteTransferencia comprovanteTransferencia = new ComprovanteTransferencia(segmentoA, segmentoB, segmentoZ);

        String ocorrencia = segmentoA.getSaOcorrencias().replace(" ", "");
        // System.out.println(ocorrencia);
        // System.out.println(new ErrosConciliacao().getMensagemRetorno(ocorrencia));

        // Verifica se não houve ocorrencias
        if (segmentoZ.getSzOcorrencias().replace(" ", "").equals("00")) {
            
            // Verificando Tipo Transferencia
            if (segmentoA.getSaCodFinDoc().equals("00") && segmentoA.getSaCodFinTed().equals("00000")) {

                // transf conta bb
                System.out.println();
                System.out.println(headerArquivo.getHArqData().substring(0, 2) + "/" + headerArquivo.getHArqData().substring(2, 4) + "/" + headerArquivo.getHArqData().substring(4, 8) + "                 BANCO DO BRASIL                  " + headerArquivo.getHArqHora().substring(0, 2) + ":" + headerArquivo.getHArqHora().substring(2, 4) + ":" + headerArquivo.getHArqHora().substring(4, 6));
                System.out.println();
                System.out.println("                    COMPROVANTE DE TRANSFERÊNCIA");
                System.out.println("               DE CONTA CORRENTE PARA CONTA CORRENTE");
                System.out.println();
                String espacos = "";
                System.out.println("CLIENTE: " + headerLoteAB.getHlEmpNome());
                // calculo dinamico espacos conta
                BigDecimal conta = new BigDecimal(headerLoteAB.getHlEmpContConta());
                int qtdEspaco = 68 - 9 - 6 - 7 - conta.toString().length() - 2;
                for (int i = 0; i < qtdEspaco; i++) {
                    espacos += " ";
                }
                System.out.println("AGENCIA: " + headerLoteAB.getHlEmpContAgencia().substring(1) + "-" + headerLoteAB.getHlEmpContAgenciaDv() + espacos + "CONTA: " + conta.toString() + "-" + headerLoteAB.getHlEmpContContaDv() );
                System.out.println("====================================================================");
                System.out.println("DATA DA TRANSFERÊNCIA:                                    " + segmentoA.getSaCdtDataReal().substring(0, 2) + "/" + segmentoA.getSaCdtDataReal().substring(2, 4) + "/" + segmentoA.getSaCdtDataReal().substring(4, 8));
                
                BigDecimal centavos = new BigDecimal(0.01);
                BigDecimal valor = new BigDecimal(segmentoA.getSaCdtValorReal()).multiply(centavos).setScale(2, RoundingMode.HALF_DOWN);
                // calculo dinamico espacos valor
                qtdEspaco = 68 - 12 - 3 - valor.toString().length(); 
                espacos = "";
                for (int i = 0; i < qtdEspaco; i++) {
                    espacos += " ";
                }
                System.out.println("VALOR TOTAL:" + espacos + "R$ " + valor.toString());
            } else {
                if (segmentoA.getSaCodFinDoc().equals("00") && !segmentoA.getSaCodFinTed().equals("00000")) {
                    // ted
                } else {
                    // doc
                }
            }
            











        } else {
            BigDecimal bd = new BigDecimal(segmentoA.getSaCdtValorReal());
            BigDecimal centavos = new BigDecimal("0.01");
            bd = bd.multiply(centavos);
            System.out.println("ERRO - " + segmentoA.getSaFavNome() + " - R$ " + bd);
            System.out.println(new ErrosConciliacao().getMensagemRetorno(ocorrencia));
        }
        

    }
}
