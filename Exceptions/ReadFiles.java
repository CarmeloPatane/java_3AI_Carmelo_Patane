package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadFiles {
    public static void main(String[] args){
        try {
            File file = new File("carmelo.txt");
            Scanner scanner = new Scanner(file);
            int n = 0;
            while (scanner.hasNextLine()) {
                n++;
                String row = scanner.nextLine();
                System.out.println(row);
            }
            scanner.close();
            System.out.println("Il file contiene " + n + "righe");
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato");
        } catch (NoSuchElementException e){
            System.out.println("Nel file non sono presenti elementi");
        }
        
    } 
}