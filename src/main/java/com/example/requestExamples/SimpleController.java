package com.example.requestExamples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SimpleController {

    Integer[][] table = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};

    @GetMapping("/")
    @ResponseBody
    String getInfo(){
        return "Info...";
    }
    @RequestMapping("f0")
    @ResponseBody
    String getValue(@RequestParam("x") Double x,
                    @RequestParam(value = "a",required=false) Double a,
                    @RequestParam(value = "b",required=false) Double b){
        //f(x)=a*x+b
        if(a==null)
            return "A nie zostało określone";
        if(b==null)
            return "B nie zostało określone";

        Double f0 = a*x+b;

        return f0.toString();
    }
    @RequestMapping("tablica/{i}/{j}")
    @ResponseBody
    String getTableElement(@PathVariable Integer i,@PathVariable Integer j){
        return "tablica["+i+", "+j+"]="+table[i][j];
    }

    @RequestMapping("tablica")
    @ResponseBody
    Integer[][] getTable(){
        return table;
    }

}
