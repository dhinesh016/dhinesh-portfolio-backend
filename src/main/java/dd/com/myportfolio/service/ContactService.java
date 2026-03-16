package dd.com.myportfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dd.com.myportfolio.entity.ContactInfo;
import dd.com.myportfolio.helper.EmailTemplate;
import dd.com.myportfolio.repo.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository repo;
	
	@Autowired
	private EmailTemplate template;
	
	@Autowired
	private EmailService emailService;

	public String addContactInfo(ContactInfo contact) {
	     repo.save(contact);
	     String userMail =
	    		 template.userTemplate(
	    		 contact.getUsername(),
	    		 contact.getMessage()
	    		 );

	    		 String adminMail =
	    		 template.adminTemplate(
	    		 contact.getUsername(),
	    		 contact.getEmail(),
	    		 contact.getMessage(),
	    		 contact.getMobile()
	    		 );

	    		 emailService.sendHtmlEmail(
	    		 contact.getEmail(),
	    		 "Thank you for contacting me",
	    		 userMail
	    		 );

	    		 emailService.sendHtmlEmail(
	    		 "wwwskd007@gmail.com",
	    		 "New Portfolio Contact Message",
	    		 adminMail
	    		 );

	    		 return "Message Sent Successfully";

	    		 }

}
