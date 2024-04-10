package com.Model.service;

import javax.mail.MessagingException;

import com.Model.entity.MailInformation;

public interface MailService {
    void send(MailInformation mailInfor) throws MessagingException;
    void send(String to, String subject, String body) throws MessagingException;
    void queue(MailInformation mailInfor);
    void queue(String to, String subject, String body);
}
