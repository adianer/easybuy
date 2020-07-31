<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2020/7/15
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input, a');
    </script>
    <![endif]-->
    <script type="text/javascript" src="js/jquery-1.11.1.min_044d0927.js"></script>
    <script type="text/javascript" src="js/jquery.bxslider_e88acd1b.js"></script>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>
    <script type="text/javascript" src="js/select.js"></script>
    <script type="text/javascript" src="js/lrscroll.js"></script>
    <script type="text/javascript" src="js/iban.js"></script>
    <script type="text/javascript" src="js/fban.js"></script>
    <script type="text/javascript" src="js/f_ban.js"></script>
    <script type="text/javascript" src="js/mban.js"></script>
    <script type="text/javascript" src="js/bban.js"></script>
    <script type="text/javascript" src="js/hban.js"></script>
    <script type="text/javascript" src="js/tban.js"></script>
    <script type="text/javascript" src="js/lrscroll_1.js"></script>
    <title>易买网</title>
</head>
<body>
<!--Begin Header Begin-->
<div class="soubg">
    <div class="sou">
        <span class="fr">
        	<span class="fl">你好，请<c:if test="${sessionScope.user.userName==null}"><a href="/Easybuy/Login">登录</a></c:if>
        <c:if test="${sessionScope.user.userName!=null}"><a href="/Easybuy/user">${sessionScope.user.userName}</a></c:if>
                <a href="/Easybuy/Regist" style="color:#ff4e00;">免费注册</a>&nbsp; </span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
            <span class="fr">|&nbsp;<a href="#">手机版&nbsp;<img src="images/s_tel.png" align="absmiddle" /></a></span>
        </span>
    </div>
</div>
<!--End Header End-->
<!--Begin Loginservlet Begin-->
<div class="log_bg">
    <div class="top">
        <div class="logo"><a href="Index.html"><img src="images/logo.png" /></a></div>
    </div>
    <div class="regist">
        <div class="log_img"><img src="images/l_img.png" width="611" height="425" /></div>
        <div class="reg_c">
            <form>
                <table border="0" style="width:420px; font-size:14px; margin-top:20px;" cellspacing="0" cellpadding="0">
                    <tr height="50" valign="top">
                        <td width="95">&nbsp;</td>
                        <td>
                            <span class="fl" style="font-size:24px;"><a href="Regist.jsp" style="color:#ff4e00;">注册</a>&nbsp;</span>
                            <span class="fr">已有商城账号，<a href="/Login" style="color:#ff4e00;">我要登录</a></span>
                        </td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;账号 &nbsp;</td>
                        <td><input type="text" value="" name="loginName"  id="loginName"class="l_user" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;昵称 &nbsp;</td>
                        <td><input type="text" value="" name="userName"id="userName" class="l_user" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;密码 &nbsp;</td>
                        <td><input type="password" value= "" name="password"id="password" class="l_pwd" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;确认密码 &nbsp;</td>
                        <td><input type="password" value="" name="psw" id="psw" class="l_pwd" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;性别 &nbsp;</td>
                        <td id="sex"><input type="radio" value="1" name="sex"/>男
                            <input type="radio" value="0" name="sex"  />女</td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;邮箱 &nbsp;</td>
                        <td><input type="text" value="" name="email" id="email" class="l_email" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;手机 &nbsp;</td>
                        <td><input type="text" value="" name="mobile"id="mobile" class="l_tel" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td style="font-size:12px; padding-top:20px;">
                	<span style="font-family:'宋体';" class="fl">
                    	<label class="r_rad"><input type="checkbox" /></label><label class="r_txt">我已阅读并接受《用户协议》</label>
                    </span>
                        </td>
                    </tr>
                    <tr height="60">
                        <td>&nbsp;</td>
                        <td><input type="button" value="立即注册" class="log_btn" id="regist" onclick="test1()"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
<!--End Loginservlet End-->
<!--Begin Footer Begin-->
<div class="btmbg">
    <div class="btm">
        备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 易买网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br />
        <img src="images/b_1.gif" width="98" height="33" /><img src="images/b_2.gif" width="98" height="33" /><img src="images/b_3.gif" width="98" height="33" /><img src="images/b_4.gif" width="98" height="33" /><img src="images/b_5.gif" width="98" height="33" /><img src="images/b_6.gif" width="98" height="33" />
    </div>
</div>
<!--End Footer End -->
</body>
<script type="text/javascript">
    function test1() {
        if(($("#psw")[0].value != $("#password")[0].value )
             ){
            alert("确认密码错误,请重新输入");
        }

        $.ajax({type:"post",
            data:{
                loginName:$("#loginName")[0].value,
                userName:$("#userName")[0].value,
                password:$("#password")[0].value,
                sex:$("#sex input:first")[0].value,
                email:$("#email")[0].value,
                mobile:$("#mobile")[0].value,
            },
            url:"/Registservlet",
            async:true,
            success:function(result){
                if(result==1){
                    alert("注册成功，即将跳转至登录界面")
                    window.location.href="Login.jsp";
                }else {
                    alert("网络繁忙，注册失败")
                }
            }});

    }

</script>
<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
