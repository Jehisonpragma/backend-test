package co.com.rbm.api.dto;

import lombok.*;


@Builder
@Getter
@ToString
public class JobDto {
    private String name;
    private Integer salary;
}
