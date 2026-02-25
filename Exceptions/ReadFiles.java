package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadFiles {
    public final static int MAX_LINES = 100;
    public static void main(String[] args){
        int[] buffer = new int[MAX_LINES];
        int sum = 0;
        try {
            File file = new File("carmelo.txt");
            Scanner scanner = new Scanner(file);
            int n = 0;
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                buffer[n] = Integer.parseInt(row);
                n++;
                sum += buffer[n];
                System.out.println(row);
            }
            scanner.close();
            System.out.println("Il file contiene " + n + " righe");
            System.out.println("La somma è " + sum );
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato");
        } catch (NoSuchElementException e){
            System.out.println("Nel file non sono presenti elementi");
        }
        
    } 
}