package com.solid.liskovsubstitution.school;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor {

	@Override
	public void teach() {
		System.out.println("taught science");
	}
	
}
