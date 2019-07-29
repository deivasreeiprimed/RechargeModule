package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor

public class recharge {
    @NotBlank
    @Digits(integer=10,message="Invalid no", fraction = 0)
    private String mobile_no;
    @NotBlank
    @Size(min = 2,message = "Atleast 2 characters")
    private String full_name;


}





