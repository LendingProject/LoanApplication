package com.aurionpro.loan.service;

<<<<<<< HEAD
import java.util.List;

import com.aurionpro.loan.dto.AdminViewLoanRequestDto;
import com.aurionpro.loan.dto.LoanOfficerReportDto;
import com.aurionpro.loan.dto.LoanRequestDetailsDTO;
=======
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
import com.aurionpro.loan.dto.LoanResponseDto;
import com.aurionpro.loan.dto.PageResponse;
import com.aurionpro.loan.entity.Loanstatus;

public interface LoanRequestService {
	PageResponse<LoanResponseDto> getAllLoanRequest(int pageNumber ,int pageSize);
	LoanResponseDto getLoanRequestByLoanId(int LoanId);
	PageResponse<LoanResponseDto> getLoanRequestBySchemeName(int pageNumber ,int pageSize, String schemeName);
	PageResponse<LoanResponseDto> getLoanRequestStatus(int pageNumber ,int pageSize,Loanstatus status);
	LoanResponseDto getLoanRequestByUserEmail(String email);
<<<<<<< HEAD
	PageResponse<AdminViewLoanRequestDto>  viewLoanReequestByadmin(int pageSize,int pageNumber );
	
	 public PageResponse<LoanOfficerReportDto> getLoanStatusReport(int pageNumber , int pageSize) ;
	 
//	   public PageResponse<LoanRequestDetailsDTO> getLoanRequestDetails(int pageNumber , int pageSize);
	
=======
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
}
