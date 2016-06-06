package ex6.main;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;



public class Sjavac {
    public static void main(String[] argv) {
        List<String> lineList;
        Path filepath = Paths.get(argv[0]);
        try {
            lineList = Files.readAllLines(filepath);
            for (String line : lineList){
                String caseOfAction = check(line);
                switch(caseOfAction){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                }
            }
        }catch(SyntaxException x){
        }catch(IOException x){

        }
    }
    private static String check(String line){

    }
}
