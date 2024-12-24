package com.aurionpro.loan.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="enquiries")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Enquiry {
	@Id
	@Column(name="enquiry_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="question")
	private String question;
	
	@Column(name="response")
	private String response;
	
	@Column(name="status")//such as pending or resolved by loan officer
    private String status;
	
	
	@Column(name="querytype")
	private String querytype;//like it is dropdown  Submit Queries(enquiry) about loan schemes such as  Emi issues,Loan status,Payment problems,others
	
	@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private User user;

}
