package oops;

public class PersonClassTemplateExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1st type of object creation
		
		PersonClassTemplate obj = new PersonClassTemplate();
		System.out.println(obj.name);            //non - primitive data type default value null
		System.out.println(obj.age);             //non - primitive data type default value 0
		System.out.println(obj.phone);           //non - primitive data type default value 0
		System.out.println("===================");
		obj.name = "pradeep";
		obj.age = 25;
		obj.phone = 9603058483L;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.phone);
		obj.greet();	
	}
}
