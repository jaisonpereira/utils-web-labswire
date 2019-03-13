package com.wirelabs.service;

import org.springframework.mail.SimpleMailMessage;

import javax.mail.internet.MimeMessage;

public interface EmailService {

    void sendEmail(SimpleMailMessage msg);

    void sendHtmlEmail(MimeMessage msg);

    void sendNewPasswordEmail(String email, String newPass);

}
