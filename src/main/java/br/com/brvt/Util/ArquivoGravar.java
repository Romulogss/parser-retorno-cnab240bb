package br.com.brvt.Util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ArquivoGravar {

    private String pastaDestino;
    private String arquivo;

    public ArquivoGravar (String pastaDestino, String arquivo) {
        // this.caminho = "/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/arquivos/";
        // this.caminho = "C:\\Users\\F1694506\\Downloads\\parser-retorno-cnab240bb\\arquivos\\";
        this.pastaDestino = pastaDestino;
        this.arquivo = arquivo;
        System.out.println("pd: " + pastaDestino);
    }

    public void gravaArquivo(String conteudo) {
        String destino = pastaDestino + File.separatorChar + this.arquivo;
        System.out.println("Path: " + destino);

        System.out.println(Paths.get(destino).getRoot());

        try {
            Files.createFile(Paths.get(destino));
            Files.writeString(Paths.get(destino), conteudo, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
