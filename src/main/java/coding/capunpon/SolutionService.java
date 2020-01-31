package coding.capunpon;

import coding.capunpon.rest.ProblemRequest;
import coding.capunpon.rest.SolutionResponse;
import coding.capunpon.solver.ArraySolver;
import coding.capunpon.solver.NumberSolver;
import coding.capunpon.solver.Solver;
import coding.capunpon.solver.StringSolver;

import java.util.HashMap;
import java.util.Map;

public class SolutionService {

    private Map<String, Solver> solvers;

    public SolutionService(StringSolver stringSolver, NumberSolver numberSolver, ArraySolver arraySolver) {
        solvers = new HashMap<>();
        solvers.put("string", stringSolver);
        solvers.put("array", arraySolver);
        solvers.put("number", numberSolver);
    }

    public SolutionResponse solve(ProblemRequest request) {
        return solvers.get(request.getCategory()).solve(request.getData());
    }
}
