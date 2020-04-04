package pl.com.bohdziewicz.trainingWebServices;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlainTextReturner {

    @GetMapping(value = "/plainText", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String returnPlainText() {

        return "<html>\n"
                + "<header><title>TextTest</title></header>\n"
                + "<body>\n"
                + "Hello World as text"
                + "</body>\n"
                + "</html>";
    }
}
