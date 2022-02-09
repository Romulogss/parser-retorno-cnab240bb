package br.com.brvt;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;

import br.com.brvt.Modelo.ComprovanteTransfContasBB;
import br.com.brvt.Modelo.ErrosConciliacao;
import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;
import br.com.brvt.Util.Facilitadores;
import br.com.brvt.Util.GerarCompTransferencia;
import br.com.brvt.Util.ParserHeaderArquivo;
import br.com.brvt.Util.ParserHeaderLoteAB;
import br.com.brvt.Util.ParserSegmentoA;
import br.com.brvt.Util.ParserSegmentoB;
import br.com.brvt.Util.ParserSegmentoZ;

public class App {
    public static void main(String[] args) {

        // testes comparando o valor da string com o validador em https://gmedi.bb.com.br/validaleiaute/#/

        //Teste Transferencias entre contas BB
        String strHeaderArquivo = "00100000         2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMERBANCO DO BRASIL S.A.                    22601202212460900004105000022917030464INTRADIA                                        20         ";        
        //HeaderArquivo headerArquivo = new ParserHeaderArquivo(strHeaderArquivo).getHeaderArquivo();

        String strHeaderLoteAB = "00100011C2001030 2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMER                         050030012000022                              00000                                                               ";
        // HeaderLoteAB headerLoteAB = new ParserHeaderLoteAB(strHeaderLoteAB).getHeaderLote();
        String strSegmentoA = "0010001300001A0000000010341340000004058798 JAWA COMERCIO E SERVICOS EIREL                    26012022BRL0000000000000000000000003054500000000000448355675926012022000000000305450                                        000000000    00        ";
        // SegmentoA segmentoA = new ParserSegmentoA(strSegmentoA).getSegmentoA();
        String strSegmentoB = "0010001300002B   200049460000104                                                                                                                                                                                                                ";
        // SegmentoB segmentoB = new ParserSegmentoB(strSegmentoB).getSegmentoB();
        String strSegmentoZ = "0010001300003Z                                                                65A1C71901BC9499                                                                                                                                        00        ";
        // SegmentoZ segmentoZ = new ParserSegmentoZ(strSegmentoZ).getSegmentoZ();
        // System.out.println(segmentoZ);

        LinkedList<String> linhas  = new LinkedList<>();
        linhas.add(strHeaderArquivo); //1ª linha
        linhas.add(strHeaderLoteAB);  //2ª linha
        linhas.add(strSegmentoA);
        linhas.add(strSegmentoB);
        linhas.add(strSegmentoZ);

        HeaderArquivo headerArquivo = new HeaderArquivo();
        HeaderLoteAB headerLoteAB = new HeaderLoteAB();
        SegmentoA segmentoA = new SegmentoA();
        SegmentoB segmentoB = new SegmentoB();
        SegmentoZ segmentoZ = new SegmentoZ();

        GerarCompTransferencia gerarCompTransferencia;

        int tamanho = linhas.size(); 
        System.out.println("tamanho: " + tamanho); 
        int penultimaLinha = tamanho -2;
        int ultimaLinha = tamanho -1;


        for (String s : linhas) {
            Boolean sucesso = false;
            switch (linhas.indexOf(s)) {
                case 0:
                    System.out.println("linha 0 " + linhas.indexOf(s));
                    headerArquivo = new ParserHeaderArquivo(s).getHeaderArquivo();
                    break;
                case 1:
                    System.out.println("linha 1");
                     headerLoteAB = new ParserHeaderLoteAB(s).getHeaderLote();
                    break;
                //case (tamanho -1):
                default:
                    switch (s.substring(13,14)) {
                        case "A":
                            segmentoA = new ParserSegmentoA(s).getSegmentoA();                            
                            // Verifica se houve ocorrencia;
                            if (segmentoA.getSaOcorrencias().trim() == "00") { // processado com sucesso
                                sucesso = true;
                            } else {
                                sucesso = false;
                            }
                            break;
                        case "B":
                            segmentoB = new ParserSegmentoB(s).getSegmentoB();
                            if (!sucesso) {
                                // chamada para gerar arquivo de erro
                                //new GerarCompTransferencia(headerArquivo, headerLoteAB, segmentoA, segmentoB).GerarComprovante();
                            }
                            break;
                        case "Z":
                            segmentoZ = new ParserSegmentoZ(s).getSegmentoZ();
                            new GerarCompTransferencia(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GerarComprovante();
                        default:

                            break;

                    }
                    break;
            }
        }
        
        /*
        // Verifica se não houve ocorrencias
        if (segmentoZ.getSzOcorrencias().trim().equals("00")) {
            // Verificando Tipo Transferencia
            if (segmentoA.getSaCodFinDoc().equals("00") && segmentoA.getSaCodFinTed().equals("00000")) {
                        System.out.println(new ComprovanteTransfContasBB(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GeraComprovante());
                        System.out.println(new ComprovanteTransfContasBB(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GeraNomeComprovante());
            } else {
                if (segmentoA.getSaCodFinDoc().equals("00") && !segmentoA.getSaCodFinTed().equals("00000")) {
                    // ted
                } else {
                    // doc
                }
            }
        } else {
            // Verificando Tipo Transferencia
            if (segmentoA.getSaCodFinDoc().equals("00") && segmentoA.getSaCodFinTed().equals("00000")) {
                System.out.println(new ComprovanteTransfContasBB(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GeraComprovanteErro());
                
            } else {
                if (segmentoA.getSaCodFinDoc().equals("00") && !segmentoA.getSaCodFinTed().equals("00000")) {
                // ted
                } else {
                // doc
                }
            }
        }
        // fim verificacao
        */
    }
}

