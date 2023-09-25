package edu.uc.cech.soit.myclassjournal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handle all endpoints
 */
@Controller
public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return homepage
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }


}
