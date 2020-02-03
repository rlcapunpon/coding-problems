package coding.capunpon.solver;

import coding.capunpon.rest.SolutionResponse;
import coding.capunpon.services.array.FindDuplicateNumberService;
import org.springframework.beans.factory.annotation.Autowired;

public class ArraySolver implements Solver<int[]>{

    @Override
    public SolutionResponse solve(int[] input, String problemType) {

        Object result;

        switch (problemType) {
            case "find_duplicate":
                FindDuplicateNumberService.printRepeating(input);
        }

        return null;
    }
}
