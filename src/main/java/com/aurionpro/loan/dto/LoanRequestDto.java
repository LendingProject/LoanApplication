package com.aurionpro.loan.dto;



import com.aurionpro.loan.entity.LoanScheme;
import com.aurionpro.loan.entity.Loanstatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class LoanRequestDto {
	  @NotNull @NotBlank
	    private int user_id;
	    @NotNull @NotBlank
	    private int loanscheme_id; 
	    @NotNull @NotBlank
	    private double loanamount; 
	    @NotNull @NotBlank
	    private int time; 
	    private double totalRepayAmount; 
	    private Loanstatus loanstatus;
	    private boolean closed; 

	 
	    private LoanScheme loanscheme;

}
