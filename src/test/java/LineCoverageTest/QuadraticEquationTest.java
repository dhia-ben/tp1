package LineCoverageTest;

import Exo.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {
    @Test
    public void NoQuadratic() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> QuadraticEquation.solve(0,50,50)
        );
        assertEquals("a must not be zero", exception.getMessage());
    }

    @Test
    public void NoSolution() {
        assertNull(QuadraticEquation.solve(50,50,50));
    }

    @Test
    public void OneSolution() {
        double[] solution = QuadraticEquation.solve(-1,10,-25);
        assertArrayEquals(new double[]{5}, solution);
    }

    @Test
    public void TwoSolutions() {
        double[] solution = QuadraticEquation.solve(1,12,32);
        assertArrayEquals(new double[]{-4,-8}, solution);
    }

}


