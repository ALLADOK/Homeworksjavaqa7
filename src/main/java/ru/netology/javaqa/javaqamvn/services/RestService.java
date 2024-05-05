package ru.netology.javaqa.javaqamvn.services;

public class RestService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - threshold;
            } else {
                money = money - expenses + income;
            }
        }
        return count;
    }
}