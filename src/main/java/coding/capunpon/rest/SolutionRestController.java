package coding.capunpon.rest;

import coding.capunpon.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@RequestMapping( value = { "/coding" } )
public class SolutionRestController {

    private final SolutionService solutionService;

    @Autowired
    public SolutionRestController(SolutionService solutionService) {
        this.solutionService = solutionService;
    }

    @RequestMapping( value = { "/request" }, headers={"Accept=*/*", "Content-Type=application/json"}, method = RequestMethod.POST, consumes = "application/json", produces = "application/json" )
    @ResponseBody
    public ResponseEntity<SolutionResponse> sendRequest(@RequestBody ProblemRequest request )
    {
        SolutionResponse solutionResponse = solutionService.solve(request);
        return new ResponseEntity<SolutionResponse>(solutionResponse, HttpStatus.OK);
    }
}