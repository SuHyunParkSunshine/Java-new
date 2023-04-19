package chapter10;

import java.util.HashSet;
import java.util.Iterator;

class User {
	String ssn;
	String name;

	public User(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ssn + " : " + name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.ssn.equals(obj.ssn))
			return true;
		else
			return false;
	}

}

public class Test11 {

	public static void main(String[] args) {
		User u1 = new User("123", "김푸름");
		User u2 = new User("123", "임정인");
		
		HashSet<User> users = new HashSet<User>(); //객체를 비교하고 하려면 오버라이딩 해가지고 사용해야한다.
		if (u1.equals(u2)) 
			users.add(u2);
		else
			users.add(u1);
		
		users.add(u2);
		users.add(u1);
		
		Iterator<User> iter = users.iterator();
		while (iter.hasNext()) {
			User u = iter.next();
			System.out.println(u);
			
			if(u.equals(u)) //next를 가져와서 다른거랑 비교 가능
			
		}
		
	}

}
