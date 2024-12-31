package com.aurionpro.loan.dto;

import com.aurionpro.loan.entity.Loanstatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class LoanResponseDto {
<<<<<<< HEAD
	 private int loanid; // ID of the loan
	    private int user_id; // User ID
	    private int loanscheme_id; // Loan scheme ID
		private int loanOfficeId;
	    private double totalRepayAmount; // The total amount to be repaid
	    private double loanamount; // The loan amount
	    private int time; // The loan duration
	    private Loanstatus loanstatus; // Loan status (approved, pending, etc.)
	    private boolean closed; // Whether the loan is closed or still open
=======
	 private int loanid;
	    private int user_id; 
	    private int loanscheme_id; 
		private int loanOfficeId;
	    private double totalRepayAmount;
	    private double loanamount;
	    private int time;
	    private Loanstatus loanstatus; 
	    private boolean closed;
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
	    
	   
	    private double simpleInterest; 
	    private double monthlyRepayment; 
	
	
	

}
