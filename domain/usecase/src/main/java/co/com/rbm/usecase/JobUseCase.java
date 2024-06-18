package co.com.rbm.usecase;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JobUseCase{

    public String getJobNameAccordingToSalary(long salary) {
        if (salary < 1500000){
            return "Pasante";
        } else if (salary <4000000){
            return "Junior Developer";
        }else if (salary <6000000){
            return "Advance Developer";
        }else if (salary <8000000){
            return "Senior Developer";
        }
        return "Master Developer";
    }
}


