package variables;

public class StaticVariables {

	static String name = "pradeep";
	
	public static void main(String[] args) {
		
		System.out.println(StaticVariables.name);
	}
}





//if something is common and can be shared then go for static 
//
//1. Definition
//
//variables which are declared inside a class outside of method having keyword static 
//
//2. when memory is allocated 
//
//during .class file loading 
//
//3. where memory is allocated
//
//Class Area / Method Area 
//
//4. what is the calling style 
//
//ClassName.variableName;
//
//5. what is the scope or life time 		
//
//till the end of program 