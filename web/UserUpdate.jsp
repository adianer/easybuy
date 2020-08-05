<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%
    String path=request.getContextPath();
%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <div class="soubg">
        <div class="sou">
            <!--Begin 所在收货地区 Begin-->
            <span class="s_city_b">
        	<span class="fl">送货至：</span>
            <span class="s_city">
            	<span>四川</span>
                <div class="s_city_bg">
                  <div class="s_city_t"></div>
                  <div class="s_city_c">
                    <h2>请选择所在的收货地区</h2>
                    <table border="0" class="c_tab" style="width:235px; margin-top:10px;" cellspacing="0" cellpadding="0">
                      <tr>
                        <th>A</th>
                        <td class="c_h"><span>安徽</span><span>澳门</span></td>
                      </tr>
                      <tr>
                        <th>B</th>
                        <td class="c_h"><span>北京</span></td>
                      </tr>
                      <tr>
                        <th>C</th>
                        <td class="c_h"><span>重庆</span></td>
                      </tr>
                      <tr>
                        <th>F</th>
                        <td class="c_h"><span>福建</span></td>
                      </tr>
                      <tr>
                        <th>G</th>
                        <td class="c_h"><span>广东</span><span>广西</span><span>贵州</span><span>甘肃</span></td>
                      </tr>
                      <tr>
                        <th>H</th>
                        <td class="c_h"><span>河北</span><span>河南</span><span>黑龙江</span><span>海南</span><span>湖北</span><span>湖南</span></td>
                      </tr>
                      <tr>
                        <th>J</th>
                        <td class="c_h"><span>江苏</span><span>吉林</span><span>江西</span></td>
                      </tr>
                      <tr>
                        <th>L</th>
                        <td class="c_h"><span>辽宁</span></td>
                      </tr>
                      <tr>
                        <th>N</th>
                        <td class="c_h"><span>内蒙古</span><span>宁夏</span></td>
                      </tr>
                      <tr>
                        <th>Q</th>
                        <td class="c_h"><span>青海</span></td>
                      </tr>
                      <tr>
                        <th>S</th>
                        <td class="c_h"><span>上海</span><span>山东</span><span>山西</span><span class="c_check">四川</span><span>陕西</span></td>
                      </tr>
                      <tr>
                        <th>T</th>
                        <td class="c_h"><span>台湾</span><span>天津</span></td>
                      </tr>
                      <tr>
                        <th>X</th>
                        <td class="c_h"><span>西藏</span><span>香港</span><span>新疆</span></td>
                      </tr>
                      <tr>
                        <th>Y</th>
                        <td class="c_h"><span>云南</span></td>
                      </tr>
                      <tr>
                        <th>Z</th>
                        <td class="c_h"><span>浙江</span></td>
                      </tr>
                    </table>
                  </div>
                </div>
            </span>
        </span>
            <!--End 所在收货地区 End-->
            <span class="fr">


            <span class="fl"><a href="/EasyBuy_war/admin/user?action=index">系统管理员</a>&nbsp;|&nbsp;<a href="/EasyBuy_war/admin/order?action=index&userId=2">我的订单</a>&nbsp;</span>


            <span class="fl">|&nbsp;<a href="/EasyBuy_war/admin/product?action=index&userId=2">后台管理</a>&nbsp;</span>


             <span class="fl">|&nbsp;<a href="/EasyBuy_war/Login?action=loginOut" >注销</a></span>

        </span>
        </div>
    </div>
    <div id="fade1" class="black_overlay"></div>
    <div id="MyDiv1" class="white_content">
        <div class="white_d">
            <div class="notice_t">
                <span class="fr" style="margin-top:10px; cursor:pointer;" onclick="CloseDiv_1('MyDiv1','fade1')"><img src="<%=path%>/images/close.gif" /></span>
            </div>
            <div class="notice_c">
                <table border="0" align="center" cellspacing="0" cellpadding="0">
                    <tr valign="top">
                        <td width="40"><img src="<%=path%>/images/suc.png"></td>
                        <td>
                            <span style="color:#3e3e3e; font-size:18px; font-weight:bold;" id="showMessage">操作成功</span><br />
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <link type="text/css" rel="stylesheet" href="<%=path%>/css/style.css"/>
    <script type="text/javascript" src="<%=path%>/js/jquery-1.11.1.min_044d0927.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery.bxslider_e88acd1b.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/menu.js"></script>
    <script type="text/javascript" src="<%=path%>/js/select.js"></script>
    <script type="text/javascript" src="<%=path%>/js/lrscroll.js"></script>
    <script type="text/javascript" src="<%=path%>/js/iban.js"></script>
    <script type="text/javascript" src="<%=path%>/js/fban.js"></script>
    <script type="text/javascript" src="<%=path%>/js/f_ban.js"></script>
    <script type="text/javascript" src="<%=path%>/js/mban.js"></script>
    <script type="text/javascript" src="<%=path%>/js/bban.js"></script>
    <script type="text/javascript" src="<%=path%>/js/hban.js"></script>
    <script type="text/javascript" src="<%=path%>/js/tban.js"></script>
    <script type="text/javascript" src="<%=path%>/js/lrscroll_1.js"></script>

    <script type="text/javascript" src="<%=path%>/js/shade.js"></script>
    <script type="text/javascript" src="<%=path%>/js/user/register.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/ShopShow.css" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/MagicZoom.css" />
    <script type="text/javascript" src="<%=path%>/js/MagicZoom.js"></script>
    <script type="text/javascript" src="<%=path%>/js/num.js"></script>
    <script type="text/javascript" src="<%=path%>/js/p_tab.js"></script>


    <script src="<%=path%>/js/backend/backend.js"></script>
</head>
<body>



<script type="text/javascript">
    var contextPath = "/EasyBuy_war";
</script>
<div class="top">
    <div class="logo">
        <a href="/EasyBuy_war/Home?action=index"><img src="<%=path%>/images/logo.png"></a>
    </div>
    <div class="i_car">
        <div class="car_t">
            购物车 [
            <span>


                    空

            </span>]
        </div>
        <div class="car_bg">
            <!--Begin 购物车未登录 Begin-->


            <div class="un_login">我的购物车</div>

            <!--End 购物车未登录 End-->
            <!--Begin 购物车已登录 Begin-->
            <ul class="cars">

            </ul>
            <div class="price_sum">共计&nbsp;<font color="#ff4e00">￥</font><span></span></div>


            <div class="price_a"><a href="/EasyBuy_war/Cart?action=toSettlement">去结算</a></div>

            <!--End 购物车已登录 End-->
        </div>
    </div>
</div>

<!--End Header End-->
<div class="i_bg bg_color">
    <!--Begin 用户中心 Begin -->
    <div class="m_content">



        <div class="m_left">
            <div class="left_n">管理中心</div>
            <div class="left_m">
                <div class="left_m_t t_bg1">订单中心</div>
                <ul>
                    <li><a href="/EasyBuy_war/admin/order?action=index&userId=2" >我的订单</a></li>

                    <li><a href="/EasyBuy_war/admin/order?action=queryAllOrder" >全部订单</a></li>
                </ul>
            </div>
            <div class="left_m">
                <div class="left_m_t t_bg2">会员中心</div>
                <ul>
                    <li><a href="/UserInfo"  >用户信息</a></li>

                    <li><a href="/UserList?pageNo=1"   class="now" >用户列表</a></li>
                </ul>
            </div>
            <div class="left_m">
                <div class="left_m_t t_bg2">商品管理</div>
                <ul>
                    <li><a href="/EasyBuy_war/admin/productCategory?action=index" >分类管理</a></li>
                    <li><a href="/EasyBuy_war/admin/product?action=index"  >商品管理</a></li>
                    <li><a href="/EasyBuy_war/admin/product?action=toAddProduct" >商品上架</a></li>
                </ul>
            </div>
            <div class="left_m">
                <div class="left_m_t t_bg2">资讯中心</div>
                <ul>
                    <li><a href="/Newslist?currentPage=1" >资讯列表</a></li>
                </ul>
            </div>
        </div>
        <div class="m_right" id="content">
            <div class="mem_tit">



                修改用户


            </div>
            <br>
            <form action="/UserUpdate" method="post" id="userAdd" onsubmit="return checkUser();">
                <table border="0" class="add_tab" style="width:930px;" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="135" align="right">用户姓名</td>
                        <td colspan="3" style="font-family:'宋体';">
                            <input type="text" value="${user.loginName}" class="add_ipt" name="loginName"/>
                            <input type="hidden" value="${user.id}" name="id">
                        </td>
                    </tr>
                    <tr>
                        <td width="135" align="right">真实姓名</td>
                        <td>
                            <input type="text" value="${user.userName}" class="add_ipt" name="userName"/>
                        </td>
                    </tr>

                    <tr>
                        <td width="135" align="right">身份证号</td>
                        <td>
                            <input type="text" value="${user.identityCode}" class="add_ipt" name="identityCode"
                                   id="identityCode"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="135" align="right">电子邮箱</td>
                        <td>
                            <input type="text" value="${user.email}" class="add_ipt" name="email" id="email"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="135" align="right">手机</td>
                        <td>
                            <input type="text" value="${user.mobile}" class="add_ipt" name="mobile" id="mobile"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="135" align="right">用户类型</td>
                        <td>
                            <select name="type">
                                <option value="1"   <c:if test="${user.type==1}">selected="selected"</c:if>>管理员</option>
                                <option value="0"  <c:if test="${user.type==0}">selected="selected"</c:if>>普通用户</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>

                            <input type="button" value="修改信息" class="s_btn"  onclick="addUser();">


                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

    <div class="b_btm_bg b_btm_c" id="footer">
        <div class="b_btm">
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="72"><img src="<%=path%>/images/b1.png" width="62" height="62" /></td>
                    <td><h2>正品保障</h2>正品行货  放心购买</td>
                </tr>
            </table>
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="72"><img src="<%=path%>/images/b2.png" width="62" height="62" /></td>
                    <td><h2>满38包邮</h2>满38包邮 免运费</td>
                </tr>
            </table>
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="72"><img src="<%=path%>/images/b3.png" width="62" height="62" /></td>
                    <td><h2>天天低价</h2>天天低价 畅选无忧</td>
                </tr>
            </table>
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="72"><img src="<%=path%>/images/b4.png" width="62" height="62" /></td>
                    <td><h2>准时送达</h2>收货时间由你做主</td>
                </tr>
            </table>
        </div>
    </div>
    <div class="b_nav">
        <dl>
            <dt><a href="#">新手上路</a></dt>
            <dd><a href="#">售后流程</a></dd>
            <dd><a href="#">购物流程</a></dd>
            <dd><a href="#">订购方式</a></dd>
            <dd><a href="#">隐私声明</a></dd>
            <dd><a href="#">推荐分享说明</a></dd>
        </dl>
        <dl>
            <dt><a href="#">配送与支付</a></dt>
            <dd><a href="#">货到付款区域</a></dd>
            <dd><a href="#">配送支付查询</a></dd>
            <dd><a href="#">支付方式说明</a></dd>
        </dl>
        <dl>
            <dt><a href="#">会员中心</a></dt>
            <dd><a href="#">资金管理</a></dd>
            <dd><a href="#">我的收藏</a></dd>
            <dd><a href="#">我的订单</a></dd>
        </dl>
        <dl>
            <dt><a href="#">服务保证</a></dt>
            <dd><a href="#">退换货原则</a></dd>
            <dd><a href="#">售后服务保证</a></dd>
            <dd><a href="#">产品质量保证</a></dd>
        </dl>
        <dl>
            <dt><a href="#">联系我们</a></dt>
            <dd><a href="#">网站故障报告</a></dd>
            <dd><a href="#">购物咨询</a></dd>
            <dd><a href="#">投诉与建议</a></dd>
        </dl>
        <div class="b_tel_bg">
            <a href="#" class="b_sh1">新浪微博</a>
            <a href="#" class="b_sh2">腾讯微博</a>
            <p>
                服务热线：<br />
                <span>400-123-4567</span>
            </p>
        </div>
        <div class="b_er">
            <div class="b_er_c"><img src="<%=path%>/images/er.gif" width="118" height="118" /></div>
            <img src="<%=path%>/images/ss.png" />
        </div>
    </div>
    <div class="btmbg">
        <div class="btm">
            备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 尤洪商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br />
            <img src="<%=path%>/images/b_1.gif" width="98" height="33" /><img src="<%=path%>/images/b_2.gif" width="98" height="33" /><img src="<%=path%>/images/b_3.gif" width="98" height="33" /><img src="<%=path%>/images/b_4.gif" width="98" height="33" /><img src="<%=path%>/images/b_5.gif" width="98" height="33" /><img src="<%=path%>/images/b_6.gif" width="98" height="33" />
        </div>
    </div>

</div>
</body>
</html>
