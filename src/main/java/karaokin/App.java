package karaokin;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;

//TODO: database location
// ds047591.mongolab.com:47591/jukebox -u chantal -p hackathon

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App {
	//public static DB songDB;

    /**
     * This is the running main method for the web application.
     * Please note that Spring requires that there is one and
     * ONLY one main method in your whole program. You can create
     * other main methods for testing or debugging purposes, but
     * you cannot put extra main method when building your project.
     */
    public static void main(String[] args) throws Exception {
        // Run Spring Boot
        SpringApplication.run(App.class, args);
    }
    
    
}
