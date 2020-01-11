package programmingforcs;

public class Attendee {
	
	private String name,  email, state, company;
	
	public Attendee(String name, String email, String state, String company) {
		this.name=name;
		this.email=email;
		this.state=state;
		this.company=company;
		
		}
	public void displayInfo() {
		System.out.println("The name of the attendee is "+this.name);
		System.out.println("The email of "+this.name+" is "+ this.email);
		System.out.println("The state of "+this.name+" is "+this.state);
		System.out.println("The company of "+this.name+" is "+this.company);
		System.out.println();
		
	}
	
	public void displayEnS() {
		System.out.println("Here is the state and company of "+this.name);
		System.out.println("Email: "+this.email);
		System.out.println("State: "+this.state);
		System.out.println();
		
	}
	public void NamenEmail() {
		System.out.println("Here is the name and email of the attendee.");
		System.out.println("Name: "+this.name);
		System.out.println("Email: "+this.email);
		System.out.println();
		
	}
	
	
	
}
