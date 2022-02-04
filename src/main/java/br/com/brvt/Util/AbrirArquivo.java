package br.com.brvt.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.stream.Stream;

public class AbrirArquivo {

    private Stream<String> stream;
    private LinkedList<String> linkedList;

    // ATENÇÃO: usar path completo
    public AbrirArquivo(String arquivo) {
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

    public LinkedList<String> getLinkedList(Stream stream) {
        this.stream.forEachOrdered(s -> linkedList.add(s.toString()));
        return this.linkedList;
    }
    
}
