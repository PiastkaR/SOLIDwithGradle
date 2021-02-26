package com.solid.liskovsubstitution.school;

public class MathTeacher extends SchoolStaff implements CourseInstructor{

	@Override
	public void teach() {
		System.out.println("Taught Math");
	}

}
