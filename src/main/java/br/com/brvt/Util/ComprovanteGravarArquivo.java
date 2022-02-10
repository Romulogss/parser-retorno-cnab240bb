package br.com.brvt.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ComprovanteGravarArquivo {

    private String caminho;
    private String arquivo;

    public ComprovanteGravarArquivo (String caminho, String arquivo) {
        this.caminho = "/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/arquivos/";
        this.arquivo = arquivo;
    }

    public void gravarArquivo(String conteudo) {
        String path = caminho + this.arquivo;
        System.out.println(path);
        try {
            Files.createFile(Paths.get(path));
            Files.writeString(Paths.get(path), conteudo, StandardOpenOption.WRITE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
