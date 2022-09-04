package com;

public class App {

	public static void main(String[] args) {
		Student stud=new Student("Arvind","ECE");
		College college=new College("SIT","MDU",stud);
		Student student=college.getStudent();
		System.out.println(student);
		String name=student.getName();
		student.setName("Bala");
		System.out.print(college);
		
		
	}

}
