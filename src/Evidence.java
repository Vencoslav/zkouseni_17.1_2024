import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evidence {
    List<String> seznam = new ArrayList<>();

    public void nactiSeznam (){
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader("vstup")))){
           while(sc.hasNextLine()){
               String radek = sc.nextLine();

               seznam.add(radek);
           }

        } catch (FileNotFoundException e) {// tohle se nauč neumíš to !!!
            throw new RuntimeException(e);
        }
    }

}


