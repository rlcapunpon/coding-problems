package coding.capunpon.solver;

import coding.capunpon.rest.SolutionResponse;
import coding.capunpon.services.array.FindDuplicateNumberService;
import coding.capunpon.services.array.FindUniqueNumberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class ArraySolverTest {

    private ArraySolver arraySolver;

    @BeforeEach
    public void setUp() {
        arraySolver = new ArraySolver();
    }

    @Test
    public void shouldFindMissingNumber() {
        int a[] = {1, 2, 4, 5, 6};
        Set<Integer> result = new HashSet<>();
        result.add(3);
        assertThat(arraySolver.solve(a, "find_missing").getResult()).isEqualTo(result);
    }

    @Test
    public void shouldFindDuplicateNumbers() {
        int arr[] = {1, 1, 3, 6, 4, 7, 3, 2, 6, 9, 9, -1, -1, 16, 16};
        Set<Integer> result = new HashSet<>();
        result.add(1);
        result.add(3);
        result.add(6);
        result.add(9);
        result.add(16);
        result.add(-1);
        assertThat(arraySolver.solve(arr, "find_duplicate").getResult()).isEqualTo(result);
    }

    @Test
    public void shouldFindUniqueNumbers() {
        int ar[] = {10, 5, 3, 4, 4, 3, 5, 6, 10};
        Set<Integer> result = new HashSet<>();
        result.add(10);
        result.add(5);
        result.add(3);
        result.add(4);
        result.add(6);
        assertThat(arraySolver.solve(ar, "find_unique").getResult()).isEqualTo(result);
    }
}