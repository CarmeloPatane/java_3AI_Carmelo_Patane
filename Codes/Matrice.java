import java.util.Random;

public class Matrice{
    public static Random random = new Random();
    public static void main(String[] args){

    }
    //metodi
    //crea matrice
    //metodo per riempire matrice con caratteri casuali
    public char[][] riempiMatriceConCaratteri(char[][] matrix){
        //Per ogni elemento della matrice bisogna inserire un carattere casuale
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                //Dopo si esegue il casting
                matrix[i][j] = (char) random.nextInt(65, 123);
            }
        }
        return matrix;
    }
    //ContaVocali
    public int contaVocali(char[][] matrix){
        int vocali = 0;
        
        return vocali;
    }
    //estraiDiagonale
    //contaDoppie
}