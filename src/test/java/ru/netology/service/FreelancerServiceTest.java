package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })

    public void testCalculateVacancy(int expected, int income, int expenses, int threshold) {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(income, expenses, threshold);
        //    int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    //    @Test

    //  public void testCalculateVacancy1() {
    //      FreelancerService service = new FreelancerService();

    //      int actual = service.calculate(100000, 60000, 150000);
    //      int expected = 2;

    //       Assertions.assertEquals(expected, actual);

}

