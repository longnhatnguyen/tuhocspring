package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dangnhap")
public class DangNhapController {
    @GetMapping
    public String dangNhap(){

        return "dangnhap";
    }

    @PostMapping
    public String Login(@RequestParam String ten,@RequestParam String matkhau){
        if(ten.equals("nhat") &&  matkhau.equals("123"))
        {
            return  "redirect:/";
        }
        else {
            return "dangnhap";
        }

    }
}
