import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    public void positiveTest() {
        int[] arr = {97, 25, 42, 90, 71, 16, 82, 39, 36, 74};
        Sort.thanosSort(0, arr.length-1, arr);
        int[] sortedArr = {16, 25, 36, 39, 42, 71, 74, 82, 90, 97};
        Assertions.assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void sameNumbersTest() {
        int[] arr = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        Sort.thanosSort(0, arr.length-1, arr);
        int[] sortedArr = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        Assertions.assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void oneNumberTest() {
        int[] arr = {1};
        Sort.thanosSort(0, arr.length-1, arr);
        int[] sortedArr = {1};
        Assertions.assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void negativeNumbersTest() {
        int[] arr = {-97, -25, -42, -90, -71, -16, -82, -39, -36, -74};
        Sort.thanosSort(0, arr.length-1, arr);
        int[] sortedArr = {-97, -90, -82, -74, -71, -42, -39, -36, -25, -16};
        Assertions.assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void notNullTest() {
        int[] arr = {-97, -25, -42, -90, -71, -16, -82, -39, -36, -74};
        Sort.thanosSort(0, arr.length-1, arr);
        Assertions.assertNotEquals(null, arr);
    }
}