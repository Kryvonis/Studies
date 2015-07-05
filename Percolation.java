package studypackage;

/**
 * Created by Àð on 05.07.2015.
 */
public class Percolation {
    private int table[][];
    public Percolation(int i,int j){
        table = new int [i][j];
    }
    public void open(int i,int j){

    }
    public boolean isOpen(int i,int j){
        return true;
    }
    public boolean isFull(int i,int j){
        return true;
    }
    public boolean recolates(){
        return true;
    }

    public static void main(String[] args) {
        //Stopwatch stopwatch = new Stopwatch();

        //double time = stopwatch.elapsedTime();
    }
}
