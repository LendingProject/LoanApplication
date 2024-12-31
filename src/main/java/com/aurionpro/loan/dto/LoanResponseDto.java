package com.aurionpro.loan.dto;

import com.aurionpro.loan.entity.Loanstatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class LoanResponseDto {
	 private int loanid;
	    private int user_id; 
	    private int loanscheme_id; 
		private int loanOfficeId;
	    private double totalRepayAmount;
	    private double loanamount;
	    private int time;
	    private Loanstatus loanstatus; 
	    private boolean closed;
	    
	   
	    private double simpleInterest; 
	    private double monthlyRepayment; 
	
	
	

}
