package Ejercicio53.CommandLineRunner;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Init {

    @PostConstruct
    public void Message1() {
        System.out.println("Hola desde clase Inicial");
    }
}

