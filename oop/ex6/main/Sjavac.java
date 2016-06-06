package ex6.main;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;


public class Sjavac {
    private static Scope globalScope;
    public static void main(String[] argv) {
        List<String> linesList;
        Path filepath = Paths.get(argv[0]);
        try {
            globalScope = new Scope();
            linesList = Files.readAllLines(filepath);
            searchGlobalPara(linesList);
            checkFile(linesList);

        }catch(SyntaxException x){

        }catch(IOException x){

        }
    }
}
