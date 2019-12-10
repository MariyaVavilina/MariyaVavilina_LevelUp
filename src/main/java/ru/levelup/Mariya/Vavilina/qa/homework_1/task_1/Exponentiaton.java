package ru.levelup.Mariya.Vavilina.qa.homework_1.task_1;

public class Exponentiaton {
    public double exponen (int num1,double num2){
        double result = 1;
        for (int i = 0; i < num1; i++) {
            result *= num2;
        }
        return result;
    }
}
