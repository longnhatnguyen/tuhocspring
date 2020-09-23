<%@ page import="entity.NhanVien" %>
<%@ page import="java.util.List" %>
<%@ page contentType = "text/html; charset = UTF-8" %>
<html>
<head>
    <title>Hello World</title>
</head>

<body>
<h2>Ten dang nhap : ${tendangnhap}</h2>
<h2>Mat Khau : ${matkhau}</h2>
<h2>diachi : ${diachi}</h2>
<%
    String ten = (String)request.getAttribute("tendangnhap");
    String b = (String)request.getAttribute("matkhau");
    String tong = ten + b;
%>
<%= tong%>
<%
%>
</body>
</html>