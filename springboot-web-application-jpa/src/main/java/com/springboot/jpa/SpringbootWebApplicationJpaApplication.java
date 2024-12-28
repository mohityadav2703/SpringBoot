package com.springboot.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entities.User;

@SpringBootApplication
public class SpringbootWebApplicationJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootWebApplicationJpaApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
//		User user=new User();
//		user.setName("Mohit Kumar");
//		user.setCity("Hyderabad");
//		user.setStatus("I am java programmer");
//		
//		User user1=userRepository.save(user);
//		System.out.println(user1);
//		
//		User user =new User();
//		user.setName("Satrudhan");
//		user.setCity("Hyd");
//		user.setStatus("java programmer");
//		
//		User user1 =new User();
//		user1.setName("Rajeev Ranjan");
//		user1.setCity("Hyd");
//		user1.setStatus("java programmer");
		
//		User userObj=userRepository.save(user1);
//		List<User> users=List.of(user,user1);
		
//		//save multiple users
//		
//		Iterable<User> result=userRepository.saveAll(users);
//		result.forEach(user3->{
//			System.out.println(user3);
//		});
//		System.out.println("Saved User "+userObj);
//		System.out.println("done");
	
		// GET AND UPDATE BY ID
		
//		Optional<User> optional=userRepository.findById(103);
//		User user=optional.get();
//		System.out.println(user);
//		
//		user.setCity("patna");
//		User result=userRepository.save(user);
//		System.out.println(result);
		
		//OLD WAY TO GET ALL DATA FROM TABLE 
		
//		Iterable<User> itr=userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user=iterator.next();
//			System.out.println(user);
//		}
		
		//GETTING ALL DATA BY USING CONSUMER
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
		//GETTING ALL DATA BY USING LAMBDA EXPRESSION
//		itr.forEach(user ->System.out.println(user));
		
		
		
		//DELETING THE DATA
//				userRepository.deleteById(102);
//				System.out.println("Deleted");
		
//		Iterable<User>allUsers=userRepository.findAll();
//		allUsers.forEach(k->System.out.println(k));
//		userRepository.deleteAll(allUsers);
	
//		List<User> users=userRepository.findByName("Mohit Kumar");
//		users.forEach(k->{System.out.println(k);});
		
//		List<User> user1=userRepository.findByNameAndCity("Mohit Kumar", "Hyderabad");
//		user1.forEach(k->{System.out.println(k);});
		
//		List<User> userData=userRepository.getAllUsers();
//		userData.forEach(k->{System.out.println(k);});
		
		List<User> name=userRepository.getUserByName("Mohit Kumar");
		name.forEach(k->{System.out.println(k);});
	}	
	

}
