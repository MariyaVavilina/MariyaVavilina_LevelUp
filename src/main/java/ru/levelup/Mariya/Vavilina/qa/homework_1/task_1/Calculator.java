package ru.levelup.Mariya.Vavilina.qa.homework_1.task_1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.startApplication();
    }

    public void startApplication() {
        //далее выполняется приложение
        System.out.println("Введите операцию: +, -, *, для возведения в степень ввести (^), для выч-ия факториала (!), для выч-ия числа Фиабонначи (F)");
        Scanner scn = new Scanner(System.in);
        String calculation = scn.nextLine();

        switch (calculation) {
            case "+":
                System.out.println("Введите первое число");
                int num1 = scn.nextInt();
                System.out.println("Введите второе число");
                int num2 = scn.nextInt();
                Addition addition = new Addition();
                double AdditionResult = addition.TwoNumber(num1,num2);
                System.out.println("Сумма равна = " + AdditionResult);
                break;
            case "-":
                System.out.println("Введите первое число");
                int num3 = scn.nextInt();
                System.out.println("Введите второе число");
                int num4 = scn.nextInt();
                Subtraction subtraction = new Subtraction();
                double SubtractionResult = subtraction.TwoNumber(num3,num4);
                System.out.println("Разность равна = " + SubtractionResult);
                break;
            case "*":
                System.out.println("Введите первое число");
                int num5 = scn.nextInt();
                System.out.println("Введите второе число");
                int num6 = scn.nextInt();
                Multiplication multi = new Multiplication();
                double MultiResult = multi.multi(num5,num6);
                System.out.println("Результат умножения = " + MultiResult);
                break;
            case "^":
                System.out.println("Введите первое число");
                int num7 = scn.nextInt();
                System.out.println("Введите второе число");
                int num8 = scn.nextInt();
                Exponentiaton exponen = new Exponentiaton();
                double ExponenResult = exponen.exponen(num7,num8);
                System.out.println("Результат возведения в степень = " + ExponenResult);
                break;
            case "!":
                System.out.println("Введите первое число");
                int num9 = scn.nextInt();
                Factorial fact = new Factorial();
                double FactResult = fact.fact(num9);
                System.out.println("Результат выч-ия факториала = " + FactResult);
                break;
            case "F":
                System.out.println("Введите первое число");
                int num10 = scn.nextInt();
                Fiabonachi fiab = new Fiabonachi();
                double FiabResult = fiab.fiab(num10);
                System.out.println("Результат выч-ия числа Фиабонначи = " + FiabResult);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод (+,-,*,^,!,F)");


        }
    }
}
