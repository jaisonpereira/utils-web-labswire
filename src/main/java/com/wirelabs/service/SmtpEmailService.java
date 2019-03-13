package com.wirelabs.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

@Slf4j
public abstract class SmtpEmailService implements EmailService {

    @Autowired
    private MailSender mailSender;

    @Override
    public void sendEmail(SimpleMailMessage msg) {
        log.debug("send email to" + msg.getTo());
        mailSender.send(msg);
        log.debug("finish send email ");
    }

}
