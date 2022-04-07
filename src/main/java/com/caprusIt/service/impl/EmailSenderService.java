package com.caprusIt.service.impl;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//
//import org.springframework.stereotype.Service;
//
//
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.io.File;
//
//
//@Service
//public class EmailSenderService {
//private static Logger logger=LoggerFactory.getLogger(EmailSenderService.class);
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public  void sendSimpleEmail(String toEmail[],
//                                String body,
//                                String subject) {
//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setFrom("lokeshallam1999@gmail.com");
//        message.setTo(toEmail);
//        message.setText(body);
//        message.setSubject(subject);
//
//        mailSender.send(message);
//        logger.info("Mail Send...");
//    }
//
//    public void sendEmailWithAttachment(String toEmail[],
//                                        String body,
//                                        String subject,
//                                        String attachment) throws MessagingException {
//
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//
//        MimeMessageHelper mimeMessageHelper
//                = new MimeMessageHelper(mimeMessage, true);
//
//        mimeMessageHelper.setFrom("lokeshallam1999@gmail.com");
//        mimeMessageHelper.setTo(toEmail);
//        mimeMessageHelper.setText(body);
//        mimeMessageHelper.setSubject(subject);
//
//        FileSystemResource fileSystem
//                = new FileSystemResource(new File(attachment));
//
//        mimeMessageHelper.addAttachment(fileSystem.getFilename(),
//                fileSystem);
//
//        mailSender.send(mimeMessage);
//        logger.info("Mail Send...");
//
//    }
//}
import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
@Autowired
private  JavaMailSender mailSender;

public void sendEmail(String toEmail[],
		String subject,
		String body) {
	SimpleMailMessage message=new SimpleMailMessage();
	message.setFrom("lokeshallam1999@gmail.com");
	message.setTo(toEmail);
	message.setText(body);
	message.setSubject(subject);
	mailSender.send(message);
	System.out.println("Mail send Sucessfully....");
}

public void sendMailWithAttachment(String toEmail[],
		
        String body,
        String subject,
        String attachment) throws MessagingException {
	
      MimeMessage mimeMessage=mailSender.createMimeMessage();
      
      MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage,true);
      
      mimeMessageHelper.setFrom("lokeshallam1999@gmail.com");
      mimeMessageHelper.setTo(toEmail);
      mimeMessageHelper.setText(body);
      mimeMessageHelper.setSubject(subject);
      
      
     FileSystemResource fileSystemResource=new FileSystemResource(new File(attachment));
    mimeMessageHelper.addAttachment(fileSystemResource.getFilename(),fileSystemResource);
    
    mailSender.send(mimeMessage);
     System.out.println("Mail with attachment sent successfully..");


}
}


