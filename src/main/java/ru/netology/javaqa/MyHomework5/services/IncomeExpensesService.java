package ru.netology.javaqa.MyHomework5.services;

public class IncomeExpensesService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money > threshold) {  //если денег больше, чем порог
                count++; //отдыхаем
                money = (money - expenses) / 3; // обязательные траты и траты на отдых
            } else {
                money = money + income - expenses; // если денег меньше порога, работаем
            }
        }
        return count;
    }
}