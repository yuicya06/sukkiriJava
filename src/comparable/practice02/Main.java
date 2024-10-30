package comparable.practice02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<User> list = new ArrayList<>();	
		list.add(new User("Alice", LocalDateTime.of(2023, 3, 15, 10, 30)));
		list.add(new User("Bob", LocalDateTime.of(2023, 3, 14, 15, 45)));
		list.add(new User("Charlie", LocalDateTime.of(2023, 3, 16, 8, 0)));
		
		Collections.sort(list);
		
		for(User user:list) {
			System.out.println(user.getUsername()+ user.getRegistrationDate());
		}
		
		
		Collections.reverse(list);
		
		for(User user:list) {
			System.out.println(user.getUsername()+ user.getRegistrationDate());
		}
		
		
	}

}
