package co.edu.uan.customer.microservice.dto;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
	@Column
	private String firstName;
    
	@Column
	private String lastName;
    
	@Column
    private String email;
	
	@Column
    private String phone;
	
	@Column
    private String address;
	
	@Column
    private String gender;
	
	@Column
    private Date birthdate;
    
}
