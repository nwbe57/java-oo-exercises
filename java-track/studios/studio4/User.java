package studio4;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User extends Entity{
	
	private String userName;
	private String password;
	private static ArrayList<User> userList = new ArrayList<User>();
	
	
	public User(String userName, String password){
		super();
		this.userName = userName;
		this.password = hashPassword(password);
		
		if(isValidUsername(this.userName) == false){
			System.out.println("Username is not valid. " + this.userName);
		}
		if(isValidPassword(this.password) == false){
			System.out.println("Password is not valid. " + this.password);
		}
		
		userList.add(this);
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public static String getUserlist(){
		String list = "";
		for(int i = 0; i < userList.size(); i++){
			list += "User " + (i+1) + ": " + userList.get(i) + "\n";
		}
		return list;
	}
	
	public String toString(){
		return this.userName;
	}
	
	
	private static String hashPassword(String password){
		return password;
	}
	
	public boolean isValidPassword(String password){
		if(password == hashPassword(password)){
			return true;
		}
		return false;
	}
	
	public boolean isValidUsername(String username){
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(username);
		boolean b = m.matches(); 
		
			return b;
		
	}
	
	

	public static void main(String[] args) {
		
		User x = new User("phil_collins", "susudio");
		User y = new User("aaaaa", "12");
		
		System.out.println();
		
		System.out.println(getUserlist());
	}

}
