
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public Director() {
		this.name=null;
		this.email=null;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		String gd;
		switch(gender) {
		case ('m') : gd= "Male";break;
		case ('M') : gd= "Male";break;
		case ('f') : gd= "Female";break;
		case ('F') : gd= "Female";break;
		default : gd=null;
		}
		return gd;
	}
	public String toString() {
		return name+ "("+email+";"+getGenderName()+")";
	}

}
