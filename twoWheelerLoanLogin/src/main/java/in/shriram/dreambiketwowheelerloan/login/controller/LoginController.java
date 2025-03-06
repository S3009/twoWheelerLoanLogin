package in.shriram.dreambiketwowheelerloan.login.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.shriram.dreambiketwowheelerloan.login.model.Customer;
import in.shriram.dreambiketwowheelerloan.login.servicei.LoginServicei;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginServicei lsi;
	
	@Autowired
	RestTemplate rt;

	@GetMapping("/loginAUser/{customerEmail}/{password}")
	public ResponseEntity<Customer> loginAUser(@PathVariable("customerEmail") String customerEmail,
			@PathVariable("password") String password){
		
		Customer cust=rt.getForObject("http://localhost:7777/apploan/verifyALogin/"+customerEmail+"/"+password, Customer.class);
		
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}

}
