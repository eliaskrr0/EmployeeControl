package com.eliaskrr.employeecontrol.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@ToString
@Entity
public class Employee implements Serializable {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id", updatable = false)
	private Long employeeId;
	@Column(name = "first_name")
	private String firstName;	
}
