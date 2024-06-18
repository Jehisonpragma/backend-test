package co.com.rbm.usecase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JobUseCaseTest {

    @Test
    void getJobNameAccordingToSalaryPassant() {
        JobUseCase jobUseCase = new JobUseCase();
        String trabajo = jobUseCase.getJobNameAccordingToSalary(500000L);
        Assertions.assertEquals("Pasante",trabajo);
    }

    @Test
    void getJobNameAccordingToSalaryJunior() {
        JobUseCase jobUseCase = new JobUseCase();
        String trabajo = jobUseCase.getJobNameAccordingToSalary(3900000L);
        Assertions.assertEquals("Junior Developer",trabajo);
    }

    @Test
    void getJobNameAccordingToSalaryAdvance() {
        JobUseCase jobUseCase = new JobUseCase();
        String trabajo = jobUseCase.getJobNameAccordingToSalary(4100000L);
        Assertions.assertEquals("Advance Developer",trabajo);
    }

    @Test
    void getJobNameAccordingToSalarySenior() {
        JobUseCase jobUseCase = new JobUseCase();
        String trabajo = jobUseCase.getJobNameAccordingToSalary(6100000L);
        Assertions.assertEquals("Senior Developer",trabajo);
    }

    @Test
    void getJobNameAccordingToSalaryMaster() {
        JobUseCase jobUseCase = new JobUseCase();
        String trabajo = jobUseCase.getJobNameAccordingToSalary(10100000L);
        Assertions.assertEquals("Master Developer",trabajo);
    }
}