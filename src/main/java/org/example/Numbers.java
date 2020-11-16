package org.example;

import java.security.SecureRandom;

public class Numbers extends ExerciseGenerator {
    SecureRandom rand = new SecureRandom();


    public int getGeneratedNumber() {
        int generatedNumber = rand.nextInt(100 + 1 - 2) + 2;
        return generatedNumber;
    }

}


