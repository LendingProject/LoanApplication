package com.aurionpro.loan.controller;

import com.aurionpro.loan.dto.*;
import com.aurionpro.loan.service.LoanOfficerService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loanapp")
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:4200")
=======
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
public class LoanOfficerController {

    @Autowired
    private LoanOfficerService loanOfficerService;

    // View loan requests assigned to loan officer
    @GetMapping("/{officerId}/loanrequests")
    public ResponseEntity<PageResponse<LoanResponseDto>> viewLoanRequests(
            @PathVariable("officerId") int officerId,
            @RequestParam(name = "pageNumber") int pageNumber,
            @RequestParam(name = "pageSize") int pageSize) {

        PageResponse<LoanResponseDto> loanRequests = loanOfficerService.viewLoanRequests(officerId, pageNumber, pageSize);
        return ResponseEntity.ok(loanRequests);
    }

    // Approve a loan
    @PostMapping("/approveloan")
    public ResponseEntity<ApproveLoanResponseDto> approveLoan(@RequestBody ApproveLoanRequestDto approveLoanRequestDto) {
        ApproveLoanResponseDto response = loanOfficerService.approveLoan(approveLoanRequestDto);
        return ResponseEntity.ok(response);
    }

    // Reject a loan
    @PostMapping("/rejectloan")
    public ResponseEntity<RejectionRemarkResponseDto> rejectLoan(@RequestBody RejectionRemarkRequestDto rejectionRemarkRequestDto) {
        RejectionRemarkResponseDto response = loanOfficerService.rejectLoan(rejectionRemarkRequestDto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/replyenquiry")
    public ResponseEntity<ReplyEnquiryResponseDto> replyToEnquiry(@RequestBody ReplyEnquiryRequestDto replyEnquiryRequestDto) {
        ReplyEnquiryResponseDto enquiryResponse = loanOfficerService.replyToEnquiry(replyEnquiryRequestDto);
        return ResponseEntity.ok(enquiryResponse);
    }
<<<<<<< HEAD
//    //updation
//    @PutMapping("/{officerId}/profile")
//    public ResponseEntity<LoanOfficerProfileUpdateResponseDto> updateProfile(@PathVariable int officerId,@RequestBody @Valid LoanOfficerProfileUpdateRequestDto dto){
//    	return ResponseEntity.ok(loanOfficerService.updateLoanOfficerProfile(officerId, dto));
//    	
//    }
=======
    //updation
    @PutMapping("/{officerId}/profile")
    public ResponseEntity<LoanOfficerProfileUpdateResponseDto> updateProfile(
            @PathVariable(name = "officerId") int officerId,
            @RequestBody @Valid LoanOfficerProfileUpdateRequestDto dto) {
        return ResponseEntity.ok(loanOfficerService.updateLoanOfficerProfile(officerId, dto));
    }

>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
    
    @PostMapping("/loanofficer")
	public ResponseEntity<LoanOfficerResponseDto> AddLoanOfficer(@RequestBody RegistrationDto registrationDto) {
	    return ResponseEntity.ok(loanOfficerService.addLoanOfficer(registrationDto));
	}
	
	@PutMapping("/deletelaonofficer")
	public ResponseEntity<LoanOfficerResponseDto> deleteLoanOfficer(@RequestParam int id){
		return  ResponseEntity.ok(loanOfficerService.deleteLoanOfficer(id));
	}
<<<<<<< HEAD
	
	  
=======
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
}
