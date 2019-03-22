package co.edu.uan.customer.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CustomerController {
	@RequestMapping("/")
    public String index() {
        return "Bienvenido al microservicio de gestión de clientes!";
    }
}
