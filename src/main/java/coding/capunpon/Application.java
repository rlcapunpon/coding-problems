package coding.capunpon;

import coding.capunpon.solver.ArraySolver;
import coding.capunpon.solver.NumberSolver;
import coding.capunpon.solver.StringSolver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public SolutionService solutionService() {
        return new SolutionService(new StringSolver(), new NumberSolver(), new ArraySolver());
    }
}
