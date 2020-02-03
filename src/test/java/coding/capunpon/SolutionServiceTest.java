package coding.capunpon;

import coding.capunpon.rest.ProblemRequest;
import coding.capunpon.rest.SolutionResponse;
import coding.capunpon.solver.ArraySolver;
import coding.capunpon.solver.NumberSolver;
import coding.capunpon.solver.StringSolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class SolutionServiceTest {

    @Mock
    private ArraySolver arraySolver;

    @Mock
    private NumberSolver numberSolver;

    @Mock
    private StringSolver stringSolver;

    @InjectMocks
    private SolutionService solutionService;

    private ProblemRequest problemRequest;
    private static final String TEST_PROBLEM = "test";

    @BeforeEach
    public void setUp() {
        initMocks( this );
        problemRequest = mock(ProblemRequest.class);
        when(problemRequest.getProblemType()).thenReturn(TEST_PROBLEM);
    }

    @Test
    public void shouldAcceptArrayProblemRequest() {
        //given
        int[] arrayInput = new int[] {1, 2, 3};
        SolutionResponse solutionResponse = mock(SolutionResponse.class);

        //when
        when(problemRequest.getCategory()).thenReturn("array");
        when(problemRequest.getData()).thenReturn(arrayInput);
        when(arraySolver.solve(arrayInput, problemRequest.getProblemType())).thenReturn(solutionResponse);

        //then
        assertThat(solutionService.solve(problemRequest)).isEqualTo(solutionResponse);
    }

    @Test
    public void shouldAcceptStringProblemRequest() {
        //given
        String[] stringInput = new String[] {"input" ,"delimiter"};
        SolutionResponse solutionResponse = mock(SolutionResponse.class);

        //when
        when(problemRequest.getCategory()).thenReturn("string");
        when(problemRequest.getData()).thenReturn(stringInput);
        when(stringSolver.solve(stringInput, problemRequest.getProblemType())).thenReturn(solutionResponse);

        //then
        assertThat(solutionService.solve(problemRequest)).isEqualTo(solutionResponse);
    }

    @Test
    public void shouldAcceptNumberProblemRequest() {
        //given
        int intInput = 2;
        SolutionResponse solutionResponse = mock(SolutionResponse.class);

        //when
        when(problemRequest.getCategory()).thenReturn("number");
        when(problemRequest.getData()).thenReturn(intInput);
        when(numberSolver.solve(intInput, problemRequest.getProblemType())).thenReturn(solutionResponse);

        //then
        assertThat(solutionService.solve(problemRequest)).isEqualTo(solutionResponse);
    }



}