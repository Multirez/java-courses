package ru.lesson.lessons;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Separate class for calculator.
 * Created by Mult on 27.04.2017.
 */
public class Calculator {
    /**
     * Calc result.
     */
    private float result;

    /**
     * Constructor.
     */
    public Calculator(){

    }

    /**
     * Sum args.
     * @param args Adding arguments.
     */
    public void Sum(float ... args){
        for(float param : args){
            this.result += param;
        }
    }

    /**
     * Divide first argument to next step by step.
     */
    public void Div(float ... args) throws NotImplementedException{
        // TODO: div logic here
        throw new NotImplementedException();
    }

    /**
     * Gets calculation result.
     * @return Result value.
     */
    public float GetResult(){
        return this.result;
    }

    /**
     * Sets result to zero.
     */
    public void Reset(){
        this.result = 0;
    }
}
