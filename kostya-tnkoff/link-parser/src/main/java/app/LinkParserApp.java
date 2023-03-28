package app;
import configuration.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfigRecord.class)
public class LinkParserApp {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(LinkParserApp.class, args);
        AppConfigRecord config = ctx.getBean(AppConfigRecord.class);
        System.out.println(config);
    }
}
