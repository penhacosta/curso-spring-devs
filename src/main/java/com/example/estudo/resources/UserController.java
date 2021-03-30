package com.example.estudo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estudo.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@GetMapping()
	public ResponseEntity<User> findAll(){
		User user = new User(1,"Adevaldo Penha Costa","penhacostapenha@gmail.com","98 98481-60-04","apcPenha35");
		return ResponseEntity.ok().body(user);
	}

}
