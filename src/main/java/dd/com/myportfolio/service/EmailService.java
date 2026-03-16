package dd.com.myportfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

@Autowired
JavaMailSender mailSender;

public void sendHtmlEmail(String to,String subject,String body){

try{

MimeMessage message = mailSender.createMimeMessage();

MimeMessageHelper helper =
new MimeMessageHelper(message,true);

helper.setTo(to);
helper.setSubject(subject);
helper.setText(body,true);

mailSender.send(message);

}
catch(Exception e){
e.printStackTrace();
}

}

}
