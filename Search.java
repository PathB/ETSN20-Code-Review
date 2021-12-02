import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
            Search s = new Search();
            s.searchMethod(args[0], args[1]);
    }

    public void searchMethod(String pattern, String file){
        try{
            Scanner scan = new Scanner(new File(file));
            while(scan.hasNextLine()){
                String line= scan.nextLine();
                if(line.contains(pattern)){
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("Invalid file name");
        }
    }
}
