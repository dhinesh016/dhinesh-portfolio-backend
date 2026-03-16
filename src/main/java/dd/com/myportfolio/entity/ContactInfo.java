package dd.com.myportfolio.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ContactInfo {
	
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
     private String username;
     private String email;
     private Long mobile;
     private String message;
}
