package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
        // write your code here
        ArrayList<String> counters = new ArrayList<>();
        int randNum = 0;
        String colour = "";
        for (int i = 0; i < 10; i++) {
            randNum = randNum(1, 3);
            if (randNum == 1) {
                colour = "red";
            }
            if (randNum == 2) {
                colour = "blue";
            }
            if (randNum == 3) {
                colour = "yellow";
                counters.add(colour);

            }
            game(counters);

        }
    }







    private static void game(ArrayList<String> counters) {
        int score = 0;
        for (int i = 0; i < counters.size(); i++) {
            System.out.println("guess the colour: red ,blue,yellow");
            String guess = StringInput();
            if (guess.equals(counters.get(i))){
                System.out.println("correct guess gain 1 point");
                score =+ 1;
            }
            else{
                System.out.println("incorrect loss 1 point ");
                score =- 1;
            }
            System.out.println("goes left:"+(9-i));
        }
        System.out.println("final Score "+ score );
    }


    public static String StringInput(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public static int randNum(int min,int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }

}
