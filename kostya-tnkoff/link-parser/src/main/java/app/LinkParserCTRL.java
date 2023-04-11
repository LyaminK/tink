package app;

import backend.BackLinkParser;
import org.springframework.web.bind.annotation.*;
@RestController
public class LinkParserCTRL {
    @GetMapping("/")
    @ResponseBody
    String hello() {
        return "<html>Go to http://localhost:8080/url:?url=URL with correct URL so it starts working</html>";
    }

    @GetMapping("/url:")
    @ResponseBody
    public String getUrl(@RequestParam(required = false) String url) {
        BackLinkParser linkParser = new BackLinkParser(url);
        return "<html><p>URL: " + url + "</p><p>Data:"+linkParser.getData()+"</p></html>";
    }

}
