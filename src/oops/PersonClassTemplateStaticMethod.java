package oops;

//2nd type of object creation

public class PersonClassTemplateStaticMethod {
	public static void main(String[] args) {
		PersonClassTemplate p1 = PersonClassTemplate.getPerson();
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		
		p1.name = "pradeep";
		p1.greet();
	}
}






