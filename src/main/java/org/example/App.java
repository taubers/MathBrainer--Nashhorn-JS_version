package org.example;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class App 
{
    public static void main( String[] args ) throws ScriptException {
        //ExerciseGenerator exerciseGenerator = new ExerciseGenerator();
        Operators operators = new Operators();
        Numbers numbers = new Numbers();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        String generatedExercise = (numbers.getGeneratedNumber()+" "+operators.getRandomOperator()+" "+numbers.getGeneratedNumber());
        System.out.println(generatedExercise + " = " + engine.eval(generatedExercise));


            //System.out.println(numbers.getGeneratedNumber() + " " + operators.getRandomOperator() + " " + numbers.getGeneratedNumber() + " = ");
    }
    }

