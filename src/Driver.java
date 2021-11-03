import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args){
	ArrayList<String> list = new ArrayList<String>();
	Scanner in = null;
	
	try {
		in = new Scanner(new File("Poem.txt"));
		while(in.hasNextLine()){
			String reader = in.nextLine();
			String[] Token = reader.split(" ");
			for(int i = 0; i < list.size(); i++){
				list.add(Token[i]);
			}
		}
	}
	catch (FileNotFoundException e){
		System.out.println("You done goofed, son. The file can't be read.");
	}
	finally{
		in.close();
	}
	Scanner scan = new Scanner(System.in);
	boolean test = true;
	do{
		try{
			System.out.println("Please enter a number, son.");
			int numb = scan.nextInt();
			for(int i = 0; i < list.size(); i++){
				System.out.println(list);
			}
			test = false;
		}
		catch(InputMismatchException f){
			System.out.println("You done goofed, son. Try again but this time use an Integer.");
			
		}
	}while(test);
	System.out.println("The program is over. Goodbye.");
	}
}
