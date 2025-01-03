package com.aurionpro.loan.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class UpdateLoanSchemeDto {
<<<<<<< HEAD
=======
	    @NotNull
	    @NotBlank
		private int loanSchemeId;
		@NotNull
		@NotBlank(message = "Field to cahmge cannot be blank")
		private String field;
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
		@NotNull(message = "Scheme name cannot be null")
	    @Size(min = 3, max = 100, message = "Scheme name must be between 3 and 100 characters")
	    private String schemename;

	    @DecimalMin(value = "0.0", inclusive = false, message = "Maximum amount must be greater than 0")
	    private double maxamount;

	    @DecimalMin(value = "0.0", inclusive = false, message = "Minimum amount must be greater than 0")
	    private double minamount;

	    @DecimalMin(value = "0.0", inclusive = false, message = "Interest must be greater than 0")
	    @DecimalMax(value = "100.0", inclusive = true, message = "Interest must not exceed 100%")
	    private double interest;
	
}
