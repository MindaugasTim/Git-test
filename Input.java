import java.util.Scanner;

public class Input{
	
	    public void Enter() {
	    	Scanner in = new Scanner(System.in);	    	
	    	System.out.println("Ivesk savo varda: ");
	    	String name = in.nextLine();
	    	
	    System.out.println("Hello "+name);
	    }
	}