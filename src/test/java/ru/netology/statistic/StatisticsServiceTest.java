package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
  StatisticsService service = new StatisticsService();
  long[] incomesInBillions = {1, 2, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

  @Test
  void findMax() {

    long expected = 12;
    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
  @Test
  void findSum() {
    long expected = 76;

    long actual = service.findSum(incomesInBillions);
    assertEquals(expected, actual);
  }

  @Test
  void findAverage() {
    long expected = 6;
    long actual = service.findAverage(incomesInBillions);

    assertEquals(expected, actual);
  }
}