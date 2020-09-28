package controller;

import entity.NhanVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {

    @GetMapping
    public String Detail(){
        return "chitiet";
    }
    @PostMapping
    public String ShowInfo(@ModelAttribute NhanVien nv, ModelMap modelMap){
        modelMap.addAttribute("nv",nv);
        return "chitiet";
    }
}
