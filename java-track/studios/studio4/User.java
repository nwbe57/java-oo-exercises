package studio4;


import java.util.ArrayList;



public class User {
	
	private String userName;
	private String password;
	private static ArrayList<User> userList = new ArrayList<User>();
	
	
	public User(String userName, String password){
		this.userName = userName;
		this.password = hashPassword(password);
		
//		if(isValidUsername(this.userName) == false){
//			System.out.println("Username is not valid.");
//		}
//		if(isValidPassword(this.password) == false){
//			System.out.println("Password is not valid.");
//		}
//		
		userList.add(this);
	}
	
	private static String hashPassword(String password){
		return password;
	}
	
	private boolean isValidPassword(String password){
		if(password == hashPassword(password)){
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		User x = new User("phil collins", "susudio");
		System.out.println(userList);
	}

}
