package com.umeyudai;

import java.time.LocalDate;

public class Parking {
	private int pnumber; 
	private LocalDate date;
	private String number;
	
	public Parking(int partition, LocalDate date, String number) {
		this.pnumber = partition;
		this.date = date;
		this.number = number;
	}

	public int getPnumber() {
		return pnumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getNumber() {
		return number;
	}

	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pnumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		if(pnumber != other.pnumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Parking [pnumber=" + pnumber+", date="+ date+", number="+ number+"]";
	}
	
}