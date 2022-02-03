package br.com.brvt.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AbrirArquivo {

    private Stream<String> stream;

    AbrirArquivo(String arquivo) {
        try {
        this.stream = Files.lines(Paths.get(arquivo));
        } catch (NoSuchFileException e) {
            System.out.println("Arquivo Não Encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Stream<String> getStream() {
        return this.stream;
    }
}
