package br.com.brvt.Util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ArquivoGravar {

    private final String pastaDestino;
    private String arquivo;

    public ArquivoGravar(String pastaDestino, String arquivo) {
        this.pastaDestino = pastaDestino;
        this.arquivo = arquivo;
        System.out.println("pd: " + pastaDestino);
    }

    public void gravaArquivo(String conteudo, int tentativa) {
        String destino = pastaDestino + File.separatorChar + this.arquivo;
        System.out.println("Path: " + destino);

        Path path = Paths.get(destino);
        System.out.println(path.getRoot());

        try {
            Files.createFile(path);
            Files.writeString(path, conteudo, StandardOpenOption.WRITE);
        } catch (IOException e) {
            //criar o arquivo, com um adicional no nome
            System.out.println("Arquivo já existe, criando um novo com um adicional no nome");
            tentativa++;
            String[] nomeArquivo = this.arquivo.split("\\.");
            String complemento = "_" + tentativa + ".";
            String novoNome = nomeArquivo[0] + complemento + nomeArquivo[1];
            System.out.println("Novo nome: " + novoNome);
            this.arquivo = novoNome;
            gravaArquivo(conteudo, tentativa);
        }
    }

}
