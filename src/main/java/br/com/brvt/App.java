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
import br.com.brvt.Util.AbrirArquivo;
import br.com.brvt.Util.Facilitadores;
import br.com.brvt.Util.GerarCompTransferencia;
import br.com.brvt.Util.ParserHeaderArquivo;
import br.com.brvt.Util.ParserHeaderLoteAB;
import br.com.brvt.Util.ParserSegmentoA;
import br.com.brvt.Util.ParserSegmentoB;
import br.com.brvt.Util.ParserSegmentoZ;

public class App {
    public static void main(String[] args) {

        // LinkedList<String> linhas  = new LinkedList<>();
        ArrayList<String> linhas = new AbrirArquivo("/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/modelos/IEDPAG41260120220.ret").getLinkedList();
        
        HeaderArquivo headerArquivo = new HeaderArquivo();
        HeaderLoteAB headerLoteAB = new HeaderLoteAB();
        SegmentoA segmentoA = new SegmentoA();
        SegmentoB segmentoB = new SegmentoB();
        SegmentoZ segmentoZ = new SegmentoZ();

        int tamanho = linhas.size() + 1; 
        System.out.println("Total de linhas: " + tamanho);
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
                                    segmentoA = new ParserSegmentoA(linha).getSegmentoA();
                                    // Verificando se a Erros
                                    if(!sucesso) {
                                        // Gera Comprovante de Erro
                                        System.out.println("\t\t\tGerando Comprovante Erro");
                                        new GerarCompTransferencia(headerArquivo, headerLoteAB, segmentoA, segmentoB).GerarComprovanteErro();
                                    }
                                    break;
                                case "Z":
                                    // Lendo segmentoZ
                                    System.out.println("Linha: " + linhas.indexOf(linha) + " segmentoZ");
                                    segmentoZ = new ParserSegmentoZ(linha).getSegmentoZ();
                                    System.out.println("\t\t\tGerando Comprovante");
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                    break;
            }

        }
        
    }
}

