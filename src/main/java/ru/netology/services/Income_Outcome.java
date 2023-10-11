package ru.netology.services;

public class Income_Outcome {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int counter = 0; // счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                //Работник отдыхает
                money -= expenses;
                money /= 3;
                counter += 1;
            } else {
                //Работник работает
                money += income;
                money -= expenses;
            }
        }
        return counter;
    }
}