package cpa.subos.user;

public class Users {
	
	public static User current(){
		return new UserImpl();
	}
	
}
