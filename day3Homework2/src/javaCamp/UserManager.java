package javaCamp;

public class UserManager {
	public static void checkAccount(User user) {
		if(user.isRegistered()) {
			System.out.println("You must be a registered member. Redirecting to the login interface");
		}
		else {
			System.out.println("Successfully logged in! Loading homepage...");
		}
		
	}
	
	public static void register(User user) {
		System.out.println(user.getFirstName() + " registered to the system");
	}
	
	public static void changePassword(User user) {
		System.out.println("Password successfully changed.");
	}
	

}
