package univ.rouen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import univ.rouen.model.STB;
import univ.rouen.model.STBList;


@Controller
public class STBController {

    private STBList stbList = new STBList();
    @RequestMapping(value = "resume/id/{name:.+}", method = RequestMethod.GET )
    @ResponseBody
    public STB getSTBAction(@PathVariable("name") String name) {
        STB stb = new STB();
        stb.setTitle(name);

        String format = "dd/MM/yy H:mm:ss";

        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
        java.util.Date date = new java.util.Date();

        stb.setDate(formater.format( date ) );

        return stb;
    }

    @RequestMapping(value = "resume", method = RequestMethod.GET )
    @ResponseBody
    public STBList getAllSTBAction() {
        STB stb = new STB();
        stb.setTitle("test");

        String format = "dd/MM/yy H:mm:ss";

        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
        java.util.Date date = new java.util.Date();

        stb.setDate(formater.format( date ) );

        this.stbList.addElement(stb);

        stb = new STB();
        stb.setTitle("test2");

        date = new java.util.Date();

        stb.setDate(formater.format( date ) );

        this.stbList.addElement(stb);

        stb = new STB();
        stb.setTitle("test3");

        date = new java.util.Date();

        stb.setDate(formater.format( date ) );

        this.stbList.addElement(stb);

        return stbList;
    }


    @RequestMapping(value = "insert", method = RequestMethod.POST )
    @ResponseBody
    public STBList newSTBAction(@RequestBody STB stb) {
        this.stbList.addElement(stb);

        return stbList;
    }
}
