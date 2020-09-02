package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double x, y;
        double numsInRound = 0;
        double simulationCount = 100000000;
        Random rand = new Random();

        for(int i = 0; i < simulationCount; i++){
            //shaping x and y so that they are between -1 and 1
            x = -1 + rand.nextFloat()*2;
            y = -1 + rand.nextFloat()*2;

            //according to the equation of circle (if random point is inside the circle)
            if(x*x + y*y <= 1 && x*x + y*y >=0){
                numsInRound++;
            }
        }
        System.out.println("Estimated pi number is " + (4*numsInRound)/(simulationCount));
    }
}

