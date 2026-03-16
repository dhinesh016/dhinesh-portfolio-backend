package dd.com.myportfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dd.com.myportfolio.entity.ContactInfo;
import dd.com.myportfolio.service.ContactService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ContactController {
	@Autowired
	private ContactService service;
    @PostMapping("/contact")
	public String addContactInfo(@RequestBody ContactInfo user) {
    	return service.addContactInfo(user);
    }
}
