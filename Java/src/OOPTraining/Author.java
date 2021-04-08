package OOPTraining;

public class Author {
//Three private instance variables: name (String), email (String), and gender (char of either 'm' or 'f');
private String name;
private String email;
private char gender;
//One constructor to initialize the name, email and gender with the given values;
public Author(String name, String email, char gender) {
	this.name = name;
	this.email=email;
	this.gender = gender;
}
//public getters/setters: getName(), getEmail(), setEmail(), and getGender();
public String getName() {
	return name;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public char getGender() {
	return gender;
}

public String toString() {
	String s="Author[name="+getName()+",email="+getEmail()+",gender="+getGender()+"]";
	return s;
}
//test
public static void main(String[] args) {
	Author a1 = new Author("Alice","a123@456.com",'f');
	System.out.println(a1.toString());
	a1.setEmail("newEmail@email.com");
	System.out.println(a1.toString());
}
}
