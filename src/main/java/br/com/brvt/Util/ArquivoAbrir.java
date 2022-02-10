package br.com.brvt.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ArquivoAbrir {

    private Stream<String> stream;
    private ArrayList<String> linkedList;

    // ATENÇÃO: usar path completo
    public ArquivoAbrir(String arquivo) {
        this.linkedList = new ArrayList<String>();
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

    public ArrayList<String> getArrayList() {
        this.stream.forEachOrdered(s -> linkedList.add(s.toString()));
        return this.linkedList;
    }
    
}
