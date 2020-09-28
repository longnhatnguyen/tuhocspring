<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <jsp:include page="header.jsp"/>
</head>
<body id="body-login">
<div>
    <form id="ajax" action=${pageContext.request.contextPath}></form>
</div>

<div id="body-flex-login">
    <div id="container-login">
        <div id="container-login-left">
            <div id="header-top-left" class="header-login">
                <span id="text-logo">Welcome</span><br/>
                <span id="hint-text-logo">Hãy tạo nên phong cách của bạn cùng Minishop ! </span>
            </div>
        </div>

        <div id="container-login-right">
            <div id="header-top-right" class="header-login">
                <span class="actived" id="dangnhap">Đăng nhập</span> / <span id="dangky">Đăng ký</span>
            </div>

            <div id="container-center-login-right">
                <form action="" method="post">
                <div class="container-login-form" id="container-center-login-right">
                    <input  name="ten" class="material-textinput input-icon-email" placeholder="Email"
                           type="text"/><br/>
                    <input  name="matkhau" class="material-textinput input-icon-password"
                           placeholder="Mật khẩu " type="password"/><br/>
                    <input id="btnDangNhap" class="material-primary-button" type="submit" value="ĐĂNG NHẬP" / ><br/>

                </div>
                </form>

                <div class="container-signup-form" id="container-center-login-right">
                    <form action="" method="post">
                        <input id="email" name="email" class="material-textinput input-icon-email" placeholder="Email"
                               type="text"/><br/>
                        <p></p>
                        <input id="matkhau" name="matkhau" class="material-textinput input-icon-password"
                               placeholder="Mật khẩu " type="password"/><br/>
                        <p></p>
                        <input id="nhaplaimatkhau" name="nhaplaimatkhau" class="material-textinput input-icon-password"
                               placeholder="Nhập lại mật khẩu " type="password"/><br/>
                        <input id="btnDangNhap" class="material-primary-button" type="submit" value="ĐĂNG KÝ"/><br/>
                    </form>

                </div>
                <span id="ketqua"></span>
                <span>${kiemtradangnhap}</span>
            </div>
        </div>

    </div>
</div>


</body>

<jsp:include page="footer.jsp"/>
</html>