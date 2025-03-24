package variables;

public class InstanceVariables {
	
	int x = 10;
	public static void main(String[] args) {
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.x);
		System.out.println(obj.x);

	}
}



//1. Definition
//
//variables which are declared inside a class outside of method 
//
//2. when memory is allocated 
//
//when object / instance is created for that class 
//
//ClassName objectName=new ClassName();
//
//3. where memory is allocated
//
//Heap Area along with Object 
//
//4. what is the calling style 
//
//objectName.variableName
//
//5. what is the scope or life time 
//
//till the last usage of object 	