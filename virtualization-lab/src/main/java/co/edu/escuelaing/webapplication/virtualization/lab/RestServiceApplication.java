/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.webapplication.virtualization.lab;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author ander
 */
@SpringBootApplication
public class RestServiceApplication {
    
    
    public static void main(String[] args){
        System.out.println("Viva España");
        SpringApplication application = new SpringApplication(RestServiceApplication.class);

        application.setDefaultProperties(
            Map.of("server.port",
                    System.getenv().getOrDefault("PORT","8081")));

        application.run(args);
    }
}
