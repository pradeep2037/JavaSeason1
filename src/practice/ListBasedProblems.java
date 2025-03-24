package practice;

import java.util.ArrayList;

import java.util.Scanner;

public class ListBasedProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		
		names.add("pradeep");
		names.add("virat");
		names.add("rohit");
		names.add("vishnu");
		names.add("dhanush");
		
		
		age.add(25);
		age.add(35);
		age.add(40);
		age.add(27);
		age.add(43);
		
		
		System.out.println(names);
				
		System.out.println(age);
		

		
		//Give Name
		System.out.println("enter name : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		

		
		for(int i=0;i<names.size();i++) {
			if(names.get(i).equals(name)) {
				System.out.println("customer name : "+names.get(i));
				System.out.println("customer age : "+age.get(i));
			}	
		}
	}
}
