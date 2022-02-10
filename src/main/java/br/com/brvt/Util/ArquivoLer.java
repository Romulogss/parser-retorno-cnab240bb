package br.com.brvt.Util;

import java.util.ArrayList;

import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;

public class ArquivoLer {

    public void leArquivo(String arquivo, String pastaDestino) {
        // excluir estas linhas em produçao
        pastaDestino = " ";
        //arquivo = "C:\\Users\\F1694506\\Downloads\\parser-retorno-cnab240bb\\restrito\\IEDPAG37240120220.ret";
        //arquivo = "C:\\Users\\F1694506\\Downloads\\parser-retorno-cnab240bb\\restrito\\IEDPAG41260120220.ret";
        arquivo = "/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/restrito/IEDPAG41260120220.ret";
        
        // ATENÇÃO!!!
        // A variável arquivo deve conter o caminho completo ao arquivo
        ArrayList<String> linhas = new ArquivoAbrir(arquivo).getArrayList();

        // Variaveis do Arquivo de Retorno
        HeaderArquivo headerArquivo = new HeaderArquivo();
        HeaderLoteAB headerLoteAB = new HeaderLoteAB();
        SegmentoA segmentoA = new SegmentoA();
        SegmentoB segmentoB = new SegmentoB();
        SegmentoZ segmentoZ = new SegmentoZ();
        
        // verificar necessidade de exclusão
        int tamanho = linhas.size() + 1;
        int penultimaLinha = tamanho -2;
        int ultimaLinha = tamanho -1;

        Boolean sucesso = false;

        for (String linha : linhas) {
            switch (linhas.indexOf(linha)) {
                case 0:
                    // Lendo headerArquivo
                    System.out.println("Linha: " + linhas.indexOf(linha) + " headerArquivo");
                    headerArquivo = new ParserHeaderArquivo(linha).getHeaderArquivo();
                    break;
                default:
                    // Lendo demais linhas
                    // Verificando se a linha é um headerLoteAB
                    switch (linha.substring(8, 9)) {
                        case "C":
                            // Lendo headerArquivo
                            System.out.println("Linha: " + linhas.indexOf(linha) + " headerLoteAB");
                            headerLoteAB = new ParserHeaderLoteAB(linha).getHeaderLote();
                            break;
                        default:
                            // Lendo demais linhas
                            switch (linha.substring(13, 14)) {
                                case "A":
                                    // Lendo segmentoA
                                    System.out.println("Linha: " + linhas.indexOf(linha) + " segmentoA");
                                    segmentoA = new ParserSegmentoA(linha).getSegmentoA();
                                    //Verificando Ocorrencias:
                                    switch (segmentoA.getSaOcorrencias().trim()) {
                                        case "00":
                                            //Processado com sucesso
                                            sucesso = true;
                                            break;
                                        default:
                                        sucesso = false;
                                            break;
                                    }
                                    System.out.println(segmentoA.getSaOcorrencias() + "\tProcessado:" + sucesso);
                                    break;
                                case "B":
                                    // Lendo segmentoB
                                    System.out.println("Linha: " + linhas.indexOf(linha) + " segmentoB");
                                    segmentoB = new ParserSegmentoB(linha).getSegmentoB();
                                    // Verificando se a Erros
                                    if(!sucesso) {
                                        // Gera Comprovante de Erro
                                        System.out.println("\t\t\tGerando Comprovante Erro");
                                        // new GerarCompTransferencia(headerArquivo, headerLoteAB, segmentoA, segmentoB).GerarComprovanteErro();
                                        new CompTransferenciasGerar(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ, pastaDestino)
                                            .GeraComprovante();
                                    }
                                    break;
                                case "Z":
                                    // Lendo segmentoZ
                                    System.out.println("Linha: " + linhas.indexOf(linha) + " segmentoZ");
                                    System.out.println("\tChamando Gravação Arquivo");
                                    segmentoZ = new ParserSegmentoZ(linha).getSegmentoZ();
                                    new CompTransferenciasGerar(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ, pastaDestino).GeraComprovante();
                                    break;
                                default:
                                    System.out.println("Linha: " + linhas.indexOf(linha) + "  trailer");
                                    break;
                            }
                            break;
                    }
                    break;
            }

        }
    }
    
}
