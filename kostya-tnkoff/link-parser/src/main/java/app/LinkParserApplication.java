package app;
import configuration.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfigRecord.class)
public class LinkParserApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(LinkParserApplication.class, args);
        ApplicationConfigRecord config = ctx.getBean(ApplicationConfigRecord.class);
        System.out.println(config);
    }
}
