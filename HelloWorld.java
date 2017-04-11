import java.util.Date;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HELLO UGLY WORLD!\nThe World is greet place!");

		Date date = new Date();
		System.out.println(date.toString());

		Input in = new Input();
		in.Enter();
	}
}
