package dataConversion;


public class Human {
	private String name; 
	private byte age;
	private Gender gender=Gender.FEMALE;
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	} 
	void eat(){
		System.out.println("Human eats");
	}
	
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		if(name == null | name.trim().equals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;
	}
	
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
}
