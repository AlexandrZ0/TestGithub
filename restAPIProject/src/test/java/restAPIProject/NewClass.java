package restAPIProject;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

public class NewClass {
	
	

	public static void main(String[] args) {
		NewClass newClass = new NewClass();
		newClass.going();
		newClass.changeVal(8);
        
	}
	
	
	public void going() {
		System.out.println("I am going");
	}
	
	int changeVal(int val) {
		return val-2;
	}
	
	

}
