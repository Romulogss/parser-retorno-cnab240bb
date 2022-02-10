package br.com.brvt.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ArquivoGravar {

    private String caminho;
    private String arquivo;

    public ArquivoGravar (String caminho, String arquivo) {
        this.caminho = "/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/arquivos/";
        // this.caminho = "C:\\Users\\F1694506\\Downloads\\parser-retorno-cnab240bb\\arquivos\\";
        this.arquivo = arquivo;
    }

    public void gravaArquivo(String conteudo) {
        String path = caminho + this.arquivo;
        System.out.println(path);
        try {
            Files.createFile(Paths.get(path));
            Files.writeString(Paths.get(path), conteudo, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
