package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iCommute.util.TestDao;

@SpringBootApplication
//@ImportResource("classpath:/applicationContext.xml")
public class Application {

    public static void main(String[] args) throws ClassNotFoundException {
    	SpringApplication app = new SpringApplication(Application.class);
//        ApplicationContext context = 
//                new FileSystemXmlApplicationContext("/Users/parag/hackathon/workspace/iCommute/src/main/resources/applicationContext.xml");
        app.run(args);
        new TestDao().testConnection();
    }
}
