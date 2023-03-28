import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.tinkoff.edu.java.scrapper.configuration.PublicApplicationRecord;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(PublicApplicationRecord.class)
public class ScrapperApplication
{
    public static void main( String[] args )
    {
        var ctx = SpringApplication.run(ScrapperApplication.class, args);
        PublicApplicationRecord config = ctx.getBean(PublicApplicationRecord.class);
        System.out.println(config);
    }
}
