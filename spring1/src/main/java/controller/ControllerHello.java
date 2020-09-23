package controller;


import entity.NhanVien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ControllerHello {

    @RequestMapping(path = "/",method = RequestMethod.GET)
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

    @RequestMapping("/chitiet")
    public String chitiet(){
        return "chitiet";
    }


    @RequestMapping("/chitiet1")
    public String chitiet1(){
        return "chitiet";
    }

}