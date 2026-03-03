import java.util.Scanner;
import java.util.Random;
/*
    Creare 2 array randomici
    poi sommarli in un unica variabile sum 
    stampare array in ordine e il risultato
 */
public class Toussain_1{
        public static void main (String[]args){
            //creazione dei due array
            Scanner scanner = new Scanner (System.in);
            Random random = new Random();
            int n;
        // riempimento dei vettori
            System.out.println("inserisci la dimensione del primo vettore");
            n = scanner.nextInt();
            int [] vettore = new int [n];
            for(int i =0; i<vettore.length;i++){
                vettore[i] = random.nextInt(10)+1;
            }
            int n1;
            System.out.println("inserisci la dimensione del secondo vettore");
            n1= scanner.nextInt();
            int[] vettore1 = new int [n1];
            for(int i=0; i<vettore1.length;i++){
                vettore1[i] = random.nextInt(10)+1;
            }
        // somma dei due vettori
        int sum = 0;
        for(int i = 0; i<vettore.length && i<vettore1.length; i++){
            sum += vettore[i] + vettore1[i];
        }
        
        //stampa del primo vettore
        System.out.print("[");
        for(int i =0; i<vettore.length;i++){
            System.out.print(vettore[i]+ ",");
        }
        System.out.print("]");
        //stampa del secondo vettore
        System.out.print("[");
        for(int i=0; i<vettore1.length;i++){
            System.out.print(vettore1[i]+ ",");  
        }
        System.out.print("]");
        //stampa della somma
        System.out.println("la somma dei due vettori è " + sum);
    }
}