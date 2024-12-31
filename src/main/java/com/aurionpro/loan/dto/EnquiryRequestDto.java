package com.aurionpro.loan.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class EnquiryRequestDto {
<<<<<<< HEAD
	@NotNull
	@NotBlank
     private int  userId;
	@NotNull
	@NotBlank
=======
	
     private int userId;
	
>>>>>>> d100f990cbc8cb8eaa07d0f5c16bb47716c5eb63
	private String question;
	
	private String querytype;
	
}
