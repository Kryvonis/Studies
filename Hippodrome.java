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
        Horse h1,h2,h3,h4,h5,h6,h7;
        h1 = new Horse("Jess",3,0);
        h2 = new Horse("Bill",3,0);
        h3 = new Horse("Coll",3,0);
        h4 = new Horse("Lucky",3,0);
        h5 = new Horse("Sud",3,0);
        h6 = new Horse("Cool",3,0);
        h7 = new Horse("Black",3,0);

        horses.add(h1);
        horses.add(h2);
        horses.add(h3);
        horses.add(h4);
        horses.add(h5);
        horses.add(h6);
        horses.add(h7);

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
        for(int i=0;i<horses.size();i++){
            horses.get(i).move();
        }
    }
    public void print(){
        for(int i=0;i<horses.size();i++){
            horses.get(i).print();

        }
        System.out.println("========================================================================================================================");
        //System.out.println();
        //System.out.println();

    }
    public Horse getWinner(){
        Horse win = horses.get(0);
        for(int i=1;i<horses.size();i++){
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

