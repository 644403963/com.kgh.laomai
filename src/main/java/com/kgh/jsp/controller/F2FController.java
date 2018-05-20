/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.kgh.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class F2FController {  
  
    @RequestMapping(value="/test")  
    public String testF2F() {  
        return "index";  
          
    }  
}