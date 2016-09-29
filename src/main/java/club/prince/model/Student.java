package club.prince.model;

public class Student {
	
	private String name;
	
	private Integer age;

	public void init()
	{
		System.out.println("init");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
