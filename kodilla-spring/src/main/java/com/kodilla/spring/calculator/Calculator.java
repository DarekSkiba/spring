package com.kodilla.spring.calculator;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;

        System.out.print("Enter the first number \n");
        a = in.nextDouble();
        System.out.print("And enter second  \n");
        b = in.nextDouble();
        System.out.print("Choose the operation  " +
                "\n1.Addition" +
                "\n2.Subtraction" +
                "\n3.Multiplication" +
                "\n4.Division" +
                "\n#Please enter the number of operation \n");
        double somethin = in.nextDouble();
        double addition = 1;
        double subtraction = 2;
        double multiplication = 3;
        double division = 4;

        @Bean
        public Val choseCalculation () {
            Val C;
            if (somethin == addition) {
                c = a + b;
            } else if (somethin == subtraction) {
                c = a - b;
            } else if (somethin == multiplication) {
                c = a * b;
            } else if (somethin == division) {
                c = a / b;
            }
            return c;

        }
    }

//W tym samym pakiecie utwórz klasę Calculator, która będzie komponentem Springa i będzie posiadała pole Display display.
// Użyj wstrzykiwania przez właściwość klasy do powiązania obiektów klas Calculator oraz Display ze sobą.
//Zaimplementuj cztery podstawowe działania matematyczne (zrób metody
// add(double a, double b),
// sub(double a, double b),
// mul(double a, double b)
// oraz div(double a, double b))
// - obsługujące odpowiednio dodawanie, odejmowanie, mnożenie i dzielenie.
// Każda metoda powinna przed zwróceniem wyniku wywołać metodę displayValue(double val) obiektu display.
