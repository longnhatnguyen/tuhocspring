package controller;


import entity.NhanVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ControllerHello {

    @GetMapping
    public ModelAndView trangChu(){
        ModelAndView viewTrangChu = new ModelAndView();
        viewTrangChu.setViewName("hello");
        String username = "nguyen long nhat";
        String password = "12345";
        NhanVien nhanVien = new NhanVien();
        nhanVien.setDiachi("abc");
        System.out.println(nhanVien.getDiachi());
        viewTrangChu.addObject("tendangnhap", username);
        viewTrangChu.addObject("matkhau", password);
        viewTrangChu.addObject("diachi", nhanVien.getDiachi());

        nhanVien.setEmail("email1");
        nhanVien.setCmnd("1212121");
        nhanVien.setHoten("hoten1");
        List<NhanVien> nhanVienList = new ArrayList<>();
        nhanVienList.add(nhanVien);
        viewTrangChu.addObject("list",nhanVienList);
        return  viewTrangChu;
    }
//
//    @RequestMapping("/chitiet1")
//    public String chitiet(@RequestParam("id") int id, @RequestParam("tensp") String tensp, ModelMap modelMap){
//
//        modelMap.addAttribute("id",id);
//        modelMap.addAttribute("tensp",tensp);
//        return "chitiet";
//    }
//    //@RequestMapping( path = "/chitiet",method = RequestMethod.POST)
//    @PostMapping("/chitiet")
//    public String PostInfo(@RequestParam String hoten, ModelMap modelMap){
//        modelMap.addAttribute("hoten",hoten);
//        return "chitiet";
//    }

}