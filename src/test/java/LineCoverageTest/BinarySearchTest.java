package LineCoverageTest;

import  Exo.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void ElementPresent() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int element = 1;
        int expectedIndex = 0;
        int actualIndex = BinarySearch.binarySearch(inputArray, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void ElementNotPresent() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int element = 6;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearch(inputArray, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void NullArray() {
        int[] inputArray = null;
        int element = 3;
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> BinarySearch.binarySearch(inputArray, element)
        );
        assertEquals("Array must not be null", exception.getMessage());
    }

}