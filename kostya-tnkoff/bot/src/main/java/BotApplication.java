import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.tinkoff.edu.java.bot.configuration.PublicApplicationRecord;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(PublicApplicationRecord.class)
public class BotApplication
{
    public static void main( String[] args )
    {
        var ctx = SpringApplication.run(BotApplication.class, args);
        PublicApplicationRecord config = ctx.getBean(PublicApplicationRecord.class);
        System.out.println(config);
    }
}
