package com.aurionpro.loan.service;

import com.aurionpro.loan.dto.LoanSchemeRequestDto;
import com.aurionpro.loan.dto.LoanSchemeResponseDto;
import com.aurionpro.loan.dto.PageResponse;
import com.aurionpro.loan.dto.UpdateLoanSchemeDto;

public interface LoanSchemeService {
	LoanSchemeResponseDto addLoanScheme(LoanSchemeRequestDto loanSchemeRequestDto);
	LoanSchemeResponseDto deleteLoanScheme(int loanSchemeId);
<<<<<<< HEAD
	LoanSchemeResponseDto updateLoanScheme(UpdateLoanSchemeDto updateLoanSchemeDto , int id);
	PageResponse<LoanSchemeResponseDto> getAllLoanScheme(int pageSize ,int pageNumber);
	PageResponse<LoanSchemeResponseDto> getLoanSchemeByName(int pageSize ,int pageNumber, String schemeName);
	LoanSchemeResponseDto getloanScehmeById(int id );
=======
	LoanSchemeResponseDto updateLoanScheme(UpdateLoanSchemeDto updateLoanSchemeDto);
	PageResponse<LoanSchemeResponseDto> getAllLoanScheme(int pageSize ,int pageNumber);
	PageResponse<LoanSchemeResponseDto> getLoanSchemeByName(int pageSize ,int pageNumber, String schemeName);
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
}
