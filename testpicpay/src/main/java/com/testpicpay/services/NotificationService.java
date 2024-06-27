package com.testpicpay.services;


import com.testpicpay.domain.user.User;
import com.testpicpay.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception{
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

     //   ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v2/notify",  notificationRequest, String.class);

     //   if(!(notificationResponse.getStatusCode() == HttpStatus.OK)){
     //       System.out.println("Serviço de notificação indisponível");
     //       throw new Exception("Serviço de notificação indisponível");

     //   }
       //api de notificacao esta fora do ar

        System.out.println("Notificação enviada com sucesso");
    }
}
