
package varargs;

import java.util.ArrayList;
import java.util.List;

public class varArg {
	
	public void add1(int ...a) {
		int res = 0;
		for(int i = 0; i < a.length; i++) {
			res = res+a[i];
		}
		System.out.println(res);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varArg obj = new varArg();
		obj.add1(10,20,30,40,50);	
	}

}
