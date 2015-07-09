package studypackage;

import java.util.ArrayList;

/**
 * Created by Àð on 10.07.2015.
 */
public class Hippodrome {
    static ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;
    public static void main(String[] args) {
        Hippodrome begin = new Hippodrome();
        game = begin;
        Horse Jess,Bill,Coll;
        Jess = new Horse("Jess",3,0);
        Bill = new Horse("Bill",3,0);
        Coll = new Horse("Coll",3,0);

        horses.add(Bill);
        horses.add(Coll);
        horses.add(Jess);

        game.run();
    }
    public ArrayList<Horse> getHorse(){
        return horses;
    }
    public void run()  {
        for(int i=1;i<40;i++){
            move();
            print();
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printWinner();
    }
    public void move(){
        for(int i=0;i<3;i++){
            horses.get(i).move();
        }
    }
    public void print(){
        for(int i=0;i<3;i++){
            horses.get(i).print();

        }
        System.out.println("=========================================================================================");
        System.out.println();
        System.out.println();

    }
    public Horse getWinner(){
        Horse win = horses.get(0);
        for(int i=1;i<3;i++){
            if(win.getDistance()<horses.get(i).getDistance()) {
                win = horses.get(i);
            }
        }
        return win;
    }
    public void printWinner(){
        System.out.println("THE WINER IS "+getWinner().getName());
    }
}

