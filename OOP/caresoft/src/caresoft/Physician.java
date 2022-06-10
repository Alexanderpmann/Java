package caresoft;

import java.util.ArrayList;
import java.util.Date; //ctrl + shift + o to open imports -> always select the util option (java.util.Date)

public class Physician extends User implements HIPPACompliantUser
{
	private ArrayList<String> patientNotes;
	
	// Constructor that takes an ID:
	public Physician(int id)
	{
		this.id=id;
	}
	
	// User 4 digit pin
	@Override
	public boolean assignPin(int pin) 
	{
		if(pin<1000||pin>999) return false;
		this.pin=pin;
		return true;
	}

	@Override //annotations -> overwrites a function
	public boolean accessAuthorized(Integer confirmedAuthID) 
	{
		return confirmedAuthID==pin;
	} 
	
	
	
	public void newPatientNotes(String notes, String patientName, Date date) 
	{
		String report = String.format(
				"Datetime Submitted: %s \n",  date);
		report += String.format("Reported By ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}
	
	// TO DO: Setters & Getters 
};
