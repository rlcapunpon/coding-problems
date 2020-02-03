package coding.capunpon.solver;

import coding.capunpon.rest.SolutionResponse;

public interface Solver<T> {
    public SolutionResponse solve(T input, String problemType);
}
