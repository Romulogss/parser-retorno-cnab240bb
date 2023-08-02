package br.com.brvt.Util;

import java.util.ArrayList;

import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;

public class ArquivoLer {

    public void leArquivo(String arquivo, String pastaDestino) {
        
        // ATENÇÃO!!!
        // A variável arquivo deve conter o caminho completo ao arquivo
        

        System.out.println("Arquivo: " + arquivo);
        ArrayList<String> linhas = new ArquivoAbrir(arquivo).getArrayList();

        // Variaveis do Arquivo de Retorno
        HeaderArquivo headerArquivo = new HeaderArquivo();
        HeaderLoteAB headerLoteAB = new HeaderLoteAB();
        SegmentoA segmentoA = new SegmentoA();
        SegmentoB segmentoB = new SegmentoB();
        SegmentoZ segmentoZ = new SegmentoZ();

        boolean sucesso = false;

        for (String linha : linhas) {
            if (linhas.indexOf(linha) == 0) {
                headerArquivo = new ParserHeaderArquivo(linha).getHeaderArquivo();
            } else {
                if (linha.charAt(8) == 'C') {
                    headerLoteAB = new ParserHeaderLoteAB(linha).getHeaderLote();
                } else {// Lendo demais linhas
                    switch (linha.substring(13, 14)) {
                        case "A":
                            segmentoA = new ParserSegmentoA(linha).getSegmentoA();
                            sucesso = segmentoA.getSaOcorrencias().trim().equals("00");
                            break;
                        case "B":
                            segmentoB = new ParserSegmentoB(linha).getSegmentoB();
                            if (!sucesso) {
                                new CompTransferenciasGerar(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ, pastaDestino)
                                        .GeraComprovante();
                            }
                            break;
                        case "Z":
                            segmentoZ = new ParserSegmentoZ(linha).getSegmentoZ();
                            new CompTransferenciasGerar(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ, pastaDestino).GeraComprovante();
                            break;
                        default:
                            break;
                    }
                }
            }

        }
    }
    
}
