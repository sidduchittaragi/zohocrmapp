package com.zohocrmapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender; 

	@Override
	public void sendEmail(String to, String sub, String emailBody) {
		try {
			SimpleMailMessage mailer=new SimpleMailMessage();
			mailer.setTo(to);
			mailer.setSubject(sub);
			mailer.setText(emailBody);
			javaMailSender.send(mailer);
		} catch (Exception e) {
		}
		
	}

}
