package org.example;

import java.security.SecureRandom;

public class Operators extends ExerciseGenerator{

    String operator;

    String [] randomOperator = {"+","-","*","/"};
    SecureRandom rand = new SecureRandom();

    public String getRandomOperator(){
        int randomOperatorIndex  = rand.nextInt(randomOperator.length);
        operator = randomOperator[randomOperatorIndex];
        return operator;
    }
}
