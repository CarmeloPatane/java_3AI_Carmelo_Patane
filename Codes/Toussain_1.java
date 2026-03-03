import java.util.Scanner;
import java.util.Random;
/*
    Creare 2 array randomici
    poi sommarli in un unica variabile sum 
    stampare array in ordine e il risultato
 */
public class Toussain_1{
    public static void main(String[] args) {
         int [] vettore = riempiVettore();
         stampaVettore(vettore,vettore);
         int sum = sommaVettori(vettore, vettore);
        System.out.println("la somma dei vettori è " +sum);
        System.out.println();
     }
    
    public static int[] riempiVettore(){
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int n;
        System.out.println("inserisci la dimensione dei vettori");
        n = scanner.nextInt();
        int[] vettore = new int [n];
        for(int i=0; i<vettore.length;i++){
            vettore[i] = random.nextInt(10)+1;
        }
        scanner.close();
        return vettore;
    }
    public static int sommaVettori(int[]v1,int[]v2){
        int somma = 0;
        for(int i = 0; i<v1.length;i++){
            somma += v1[i] +v2[i];
        }
        return somma;
    }
    public static void stampaVettore(int[]array, int [] array2){
        System.out.print("vettore 1: [" );
        for(int i =0; i<array.length; i++){
            System.out.print(array[i]+ ",");
        }
        System.out.println("]");

        System.out.print("vettore 2:" );
        System.out.print("[");
        for(int i =0; i<array2.length; i++){
            System.out.print(array2[i]+ ",");
        }
        System.out.println("]");
    }
}
            
      