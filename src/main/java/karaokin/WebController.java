package karaokin;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.*;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;

/**
 * This is the controller used by Spring framework.
 * <p>
 * The basic function of this controller is to map
 * each HTTP API Path to the correspondent method.
 *
 */

@RestController
public class WebController {
	
	@SuppressWarnings("deprecation")
	@Bean
    public static DB getDb() throws UnknownHostException, MongoException {
        String uri="mongodb://chantal:hackathon@ds047591.mongolab.com:47591/jukebox";
        MongoClientURI mongoClientURI=new MongoClientURI(uri);
        MongoClient mongoClient=new MongoClient(mongoClientURI);
        DB db=mongoClient.getDB(mongoClientURI.getDatabase());
        db.authenticate(mongoClientURI.getUsername(),mongoClientURI.getPassword());
        return db;
    }

    /**
     * This is a simple example of how the HTTP API works.
     * It returns a String "OK" in the HTTP response.
     * To try it, run the web application locally,
     * in your web browser, type the link:
     * 	http://localhost:8080/cs480/ping
     */
    @RequestMapping(value = "/cs480/ping", method = RequestMethod.GET)
    String healthCheck() {
    	// You can replace this with other string,
    	// and run the application locally to check your changes
    	// with the URL: http://localhost:8080/
        return "OK";
    }
    
    
/*    @RequestMapping(value = "/data/{song_num}/", method = RequestMethod.GET)
    String getSongData(
    		@PathVariable("song_num") int song_num){
    	JsonObject song_ID = new JsonObject();
    	song_ID.addProperty("songID", song_num);
    	DB songdb = getDb();
    	String songInfo = songdb.songid.find({id: 1});
    	Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
    	return gson.toJson(song_ID);
    }		
*/
}