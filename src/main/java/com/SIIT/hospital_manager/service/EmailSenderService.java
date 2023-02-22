package com.siit.hospital_manager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    private static final String DATE_FORMAT = "dd-MM-yyyy HH:mm";

    public void sendAppointmentConfirmationEmail(LocalDateTime dateTime, String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        String date = dateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        message.setTo(email);
        message.setSubject("Appointment Confirmation");
        message.setText("Your appointment has been confirmed. We are waiting for you on: " + date);
        javaMailSender.send(message);
    }

}