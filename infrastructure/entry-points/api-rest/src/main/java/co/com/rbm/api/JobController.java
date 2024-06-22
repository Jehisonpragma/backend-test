package co.com.rbm.api;

import co.com.rbm.api.dto.JobDto;
import co.com.rbm.usecase.JobUseCase;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
public class JobController {

    private final JobUseCase jobUseCase;

    @GetMapping("/job")
    @ResponseStatus(HttpStatus.OK)
    public Flux<JobDto> getJobNameAccordingToSalary(@RequestParam Integer salary) {

        log.info("Se ha ejecutado GET /job para salary = {}", salary);
        return Flux.just(JobDto.builder()
                .name(jobUseCase.getJobNameAccordingToSalary(salary))
                .salary(salary)
                .build()
        );
    }
}


