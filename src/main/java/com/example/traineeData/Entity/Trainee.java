package com.example.traineeData.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int traineeId;
	private String firstName;
	private String lastName;
	private String email;
	public Trainee() {
		super();
	}
	public Trainee(int traineeId, String firstName, String lastName, String email) {
		super();
		this.traineeId = traineeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
	
	
}
