package com;

public final class College {
	
	

	private final String clgname;
	
	private final String location;
	
	private final Student student;
	
	public College(String clgname, String location, Student student) {
		this.clgname = clgname;
		this.location = location;
		this.student = student;
	}



  public String getClgname() {
	return clgname;
}



public String getLocation() {
	return location;
}



public Student getStudent() {
	return new Student(student.getName(),student.getDept());
}





@Override
public String toString() {
	return "College [clgname=" + clgname + ", location=" + location + ", student=" + student + "]";
}
  
  
  
  
  
	
}
