package com.zech.serverCalc.controller;

import com.zech.serverCalc.data.MathRepository;
import com.zech.serverCalc.models.MathEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @Autowired
    private MathRepository mathRepository;

    @RequestMapping("/")
    public String baseRoute(){
        return "index";
    }

@RequestMapping("/math/{num1}/{op}/{num2}")
public String doMath(
        @PathVariable String num1,
        @PathVariable String op,
        @PathVariable String num2,
        ModelMap modelMap
){
    MathEntry newEntry = new MathEntry(num1, op, num2);
    mathRepository.addEntry(newEntry);
    modelMap.put("entry", newEntry);
    return "last";
    }

    @RequestMapping("/log")
    public String getMath(ModelMap modelMap){
        modelMap.put("mathrepo", mathRepository.getAllEntries());
        return "log";
    }
}
