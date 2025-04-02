package org.example;

public class ArrayUtils {
  public static int sum(int[] x) {
    int total = 0;
    for (int a : x) {
      total += a;
    }
    return total;
  }

  public static int countOf(int[] x, int target) {
    int count = 0;
    for (int a : x) {
      count = a == target ? count + 1 : count;
    }
    return count;
  }
}