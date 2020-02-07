package coding.capunpon.solver;

import coding.capunpon.rest.SolutionResponse;
import coding.capunpon.services.array.FindDuplicateNumberService;
import coding.capunpon.services.array.FindMissingNumberService;
import coding.capunpon.services.array.FindUniqueNumberService;
import org.springframework.beans.factory.annotation.Autowired;

public class ArraySolver implements Solver<int[]>{

    @Override
    public SolutionResponse solve(int[] input, String problemType) {
        SolutionResponse solutionResponse = new SolutionResponse();

        switch (problemType) {
            case "find_duplicate":
                solutionResponse.setResult(FindDuplicateNumberService.printRepeating(input));
                break;
            case "find_missing":
                solutionResponse.setResult(FindMissingNumberService.findMissing(input));
                break;
            case "find_unique":
                solutionResponse.setResult(FindUniqueNumberService.getUnique(input));
                break;
            default:
                solutionResponse.setResult("Solution not found.");
                break;
        }

        return solutionResponse;
    }
}
