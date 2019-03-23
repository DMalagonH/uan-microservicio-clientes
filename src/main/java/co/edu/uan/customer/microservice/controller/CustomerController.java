package co.edu.uan.customer.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping({ "/" })
@CrossOrigin(origins = "*")
public class CustomerController {
	
	@RequestMapping("/")
    public String index() {
        return "Bienvenido al microservicio de gestión de clientes!";
    }
	
	@GetMapping(value = "/health")
	public ResponseEntity<String> health() {
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}
