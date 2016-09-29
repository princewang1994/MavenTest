package club.prince.model;

import javax.annotation.Resource;

public class Teacher {
	
	@Resource
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
