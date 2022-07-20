package restAPIProject;
import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test is passed !");
		Test test = new Test();
		test.CreateFile();

	}
	
	void CreateFile(){
		
		try {
			File myObj = new File("filename1.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				System.out.println("Get the path of created file: " + myObj.getAbsolutePath());
			}else {
				System.out.println("File already exists.");
			}
		} catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
	}

}
