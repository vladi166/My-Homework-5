package ru.netology.javaqa.MyHomework5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeExpensesServiceTest {

@Test
    void NumberOfMonthsOfRestFirstTest () {
    IncomeExpensesService service = new IncomeExpensesService();

    int income = 10000;
    int expenses = 3000;
    int treshhold = 20000;
    int expected = 3;

    int actual = service.calculate(income, expenses, treshhold);

    Assertions.assertEquals(expected, actual);
}

@Test
    void NumberOfMonthsOfRestSecondTest () {
    IncomeExpensesService service = new IncomeExpensesService();

    int income = 100000;
    int expenses = 60000;
    int treshhold = 150000;
    int expected = 2;

    int actual = service.calculate(income, expenses, treshhold);

    Assertions.assertEquals(expected, actual);
}






}

