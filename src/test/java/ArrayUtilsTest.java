import org.junit.Test;
import static org.junit.Assert.*;

import org.example.ArrayUtils;

public class ArrayUtilsTest {
  @Test
  public void testSum() {
    int[] arr = {1, 2, 3, 4, 5};
    assertEquals(15, ArrayUtils.sum(arr));
  }

  @Test
  public void testSumEmptyArray() {
    int[] arr = {};
    assertEquals(0, ArrayUtils.sum(arr));
  }

  @Test
  public void testCountOf() {
    int[] arr = {1, 2, 2, 3, 2, 4, 2};
    assertEquals(4, ArrayUtils.countOf(arr, 2));
  }

  @Test
  public void testCountOfNotFound() {
    int[] arr = {1, 3, 4, 5};
    assertEquals(0, ArrayUtils.countOf(arr, 2));
  }

  @Test
  public void testCountOfNegativeNumbers() {
    int[] arr = {-1, -2, -2, -3, -2, -4, -2};
    assertEquals(4, ArrayUtils.countOf(arr, -2));
  }
}