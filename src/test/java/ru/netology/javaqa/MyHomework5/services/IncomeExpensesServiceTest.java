package ru.netology.javaqa.MyHomework5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class IncomeExpensesServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/IncomeExpenses.csv")
    void NumberOfMonthsOfRestFirstTest(int expected, int income, int expenses, int treshold) {
        IncomeExpensesService service = new IncomeExpensesService();

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(expected, actual);
    }
}

