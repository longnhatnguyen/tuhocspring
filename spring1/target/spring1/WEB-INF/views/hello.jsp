<%@ page import="entity.NhanVien" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>

<body>
<h2>Ten dang nhap : ${ten}</h2>
<h2>Mat Khau : ${matkhau}</h2>
<h2>diachi : ${diachi}</h2>
<%
    String ten = (String)request.getAttribute("tendangnhap");
    String b = (String)request.getAttribute("matkhau");
    String tong = ten + b;
%>
<%= tong%>
<a href="chitiet1?id=22&tensp=daylahangnhai">Qua trang chi tiet</a>
<form action="/chitiet" method="post">
    <input type="text" name="hoten">
    <input type="text" name="diachi">
    <input type="text" name="cmnd">
    <input type="submit" value="post du lieu">
</form>




</body>
</html>