package ferralucho.springframework.sfgpetclinic;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    //when a request comes in to the root context or /index they are going to match to this request mapping
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        //will get an html called index
        return "index";
    }
}
