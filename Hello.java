
public class Hello {
	
	public void login() {
		System.out.println("Login Required.");
	}
	public void display() {
		System.out.println("Welcome to my Program");
		Hello e = new Hello();
		e.login();
	}

	public static void main(String[] args) {
		System.out.println("Hello Everyone!");
		Hello hello = new Hello();
		hello.display();
	}

}
