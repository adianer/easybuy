<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2020/7/18
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2020/7/16
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
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
      <span class="fl">你好，<c:if test="${sessionScope.user.userName==null}"><a href="Login.jsp"></a>请<a href="Login.jsp">登录</a></c:if>
        <c:if test="${sessionScope.user.userName!=null}"><a href="Login.jsp">${sessionScope.user.userName}</a></c:if>&nbsp; <a href="Regist.jsp" style="color:#ff4e00;">免费注册</a>&nbsp;|&nbsp;<a href="/myOrder">我的订单</a>&nbsp;|</span>
            <span class="fl">|&nbsp;<a href="http://www.asuk.top/EasyBuy_war/admin/product?action=index&amp;userId=2">后台管理</a>&nbsp;</span>
             <span class="fl">|&nbsp;<a href="http://www.asuk.top/EasyBuy_war/Login?action=loginOut">注销</a></span>
        </span>
    </div>
</div>
<div id="fade1" class="black_overlay"></div>
<div id="MyDiv1" class="white_content">
    <div class="white_d">
        <div class="notice_t">
            <span class="fr" style="margin-top:10px; cursor:pointer;" onclick=""><img src="images/close.gif"></span>
        </div>
        <div class="notice_c">
            <table border="0" align="center" cellspacing="0" cellpadding="0">
                <tbody><tr valign="top">
                    <td width="40"><img src="images/suc.png"></td>
                    <td>
                        <span style="color:#3e3e3e; font-size:18px; font-weight:bold;" id="showMessage">操作成功</span><br>
                    </td>
                </tr>
                </tbody></table>
        </div>
    </div>
</div> <link type="text/css" rel="stylesheet" href="css/style.css" />
<!--[if IE 6]>
<script src="js/iepng.js" type="text/javascript"></script>
<script type="text/javascript">
    EvPNG.fix('div, ul, img, li, input, a');
</script>
<![endif]-->
<div class="top">
    <div class="logo">
        <a href="http://www.asuk.top/EasyBuy_war/Home?action=index"><img src="images/logo.png"></a>
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
            <div class="price_a"><a href="http://www.asuk.top/EasyBuy_war/Cart?action=toSettlement">去结算</a></div>
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
                    <li><a href="http://www.asuk.top/EasyBuy_war/admin/order?action=index&amp;userId=2">我的订单</a></li>
                    <li><a href="http://www.asuk.top/EasyBuy_war/admin/order?action=queryAllOrder">全部订单</a></li>
                </ul>
            </div>
            <div class="left_m">
                <div class="left_m_t t_bg2">会员中心</div>
                <ul>
                    <li><a href="http://www.asuk.top/EasyBuy_war/admin/user?action=index" class="now">用户信息</a></li>
                    <li><a href="http://www.asuk.top/EasyBuy_war/admin/user?action=queryUserList">用户列表</a></li>
                </ul>
            </div>
            <div class="left_m">
                <div class="left_m_t t_bg2">商品管理</div>
                <ul>
                    <li><a href="/ClassManage?currentPage=1">分类管理</a></li>
                    <li><a href="/ProductManage?currentPage=1">商品管理</a></li>
                    <li><a href="http://www.asuk.top/EasyBuy_war/admin/product?action=toAddProduct">商品上架</a></li>
                </ul>
            </div>
            <div class="left_m">
                <div class="left_m_t t_bg2">资讯中心</div>
                <ul>
                    <li><a href="http://www.asuk.top/EasyBuy_war/admin/news?action=queryNewsList">资讯列表</a></li>
                </ul>
            </div>
        </div>
        <div class="m_right" id="content">
                <div class="mem_tit">商品列表</div>
                <br>
                <table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0">
                    <tbody>
                    <tr>
                        <td width="10%">商品名称</td>
                        <td width="10%">商品图片</td>
                        <td width="5%">库存</td>
                        <td width="10%">价格</td>
                        <td width="10%" colspan="2">操作</td>
                    </tr>

                    <tr>
                        <td>香奈儿</td>
                        <td>
                            <a href="/EasyBuy_war/Product?action=queryProductDeatil&amp;id=733" target="_blank">
                                <img src="/EasyBuy_war/files/B8D9C9463A524F26AEF05FE0A203128D.jpg" width="50" height="50">
                            </a>
                        </td>
                        <td>1</td>
                        <td>152.0</td>
                        <td><a href="/EasyBuy_war/admin/product?action=toUpdateProduct&amp;id=733">修改</a></td>
                        <td><a href="javascript:void(0);" onclick="deleteById('733');">删除</a></td>
                    </tr>    <form >
                        <c:forEach items="${requestScope.list}" var="Product" >
                            <tr>
                                <td> <span>${Product.name }</span>
                                </td>
                                <td>
                                    <a href="/Product?id=${Product.id}" target="_blank">
                                        <img src="images/${Product.fileName}" width="50" height="50">
                                    </a>
                                </td>
                                <td>
                                        ${Product.stock}
                                </td>
                                <td>
                                        ${Product.price}
                                </td>
                                <td><a href="/UpdataProduct?id=${Product.id}">修改</a></td>
                                <td><a href="#" onclick="deleteById(${Product.id})">删除</a></td>
                            </tr>
                        </c:forEach>
                    </form>
                    </tbody>
                </table>
            <div class="pages">
                <c:choose>
                    <c:when test="${page.pageCount <= 5}">
                        <c:set var="begin" value="1"/>
                        <c:set var="end" value="${page.pageCount}"/>
                    </c:when>
                    <%--页数超过了6页--%>
                    <c:otherwise>
                        <c:set var="begin" value="${page.pageNo-1}"/>
                        <c:set var="end" value="${page.pageNo+2}"/>
                        <%--如果begin减1后为0,设置起始页为1,最大页为6--%>
                        <c:if test="${begin -1 <= 0}">
                            <c:set var="begin" value="1"/>
                            <c:set var="end" value="5"/>
                        </c:if>
                        <%--如果end超过最大页,设置起始页=最大页-5--%>
                        <c:if test="${end > page.pageCount}">
                            <c:set var="begin" value="${page.pageCount - 3}"/>
                            <c:set var="end" value="${page.pageCount}"/>
                        </c:if>
                    </c:otherwise>
                </c:choose>
                <a href="/ProductManage?currentPage=1" class="p_pre">首页</a>
                <c:if test="${page.pageNo>0}">
                    <a href="/ProductManage?currentPage=${page.pageNo-1}" class="p_pre">上一页</a>
                </c:if>
                <c:forEach var="i" begin="${begin}" end="${end}">
                    <%--当前页,选中--%>
                    <a href="/ProductManage?currentPage=${i}" <c:if test="${(page.pageNo)==i}">style="background-color:#ff4e00"</c:if>>${i}</a>
                </c:forEach>
                <c:if test="${page.pageNo<page.pageCount}">
                    <a href="/ProductManage?currentPage=${page.pageNo+1}" class="p_pre">下一页</a>
                </c:if>
                <a href="/ProductManage?currentPage=${page.pageCount}" class="p_pre">尾页</a>
            </div >
            </div>

                </tbody>
            </table>


        </div>
    </div>
     <div class="b_btm_bg" id="footer">
            <div class="b_btm">
                <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                    <tbody><tr>
                        <td width="72"><img src="images/b1.png" width="62" height="62"></td>
                        <td><h2>正品保障</h2>正品行货  放心购买</td>
                    </tr>
                    </tbody></table>
                <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                    <tbody><tr>
                        <td width="72"><img src="images/b2.png" width="62" height="62"></td>
                        <td><h2>满38包邮</h2>满38包邮 免运费</td>
                    </tr>
                    </tbody></table>
                <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                    <tbody><tr>
                        <td width="72"><img src="images/b3.png" width="62" height="62"></td>
                        <td><h2>天天低价</h2>天天低价 畅选无忧</td>
                    </tr>
                    </tbody></table>
                <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
                    <tbody><tr>
                        <td width="72"><img src="images/b4.png" width="62" height="62"></td>
                        <td><h2>准时送达</h2>收货时间由你做主</td>
                    </tr>
                    </tbody></table>
            </div>
        </div>
    </div>

    <div class="b_nav">
        <dl>
            <dt><a href="javascript:void(0)">新手上路</a></dt>
            <dd><a href="javascript:void(0)">售后流程</a></dd>
            <dd><a href="javascript:void(0)">购物流程</a></dd>
            <dd><a href="javascript:void(0)">订购方式</a></dd>
            <dd><a href="javascript:void(0)">隐私声明</a></dd>
            <dd><a href="javascript:void(0)">推荐分享说明</a></dd>
        </dl>
        <dl>
            <dt><a href="javascript:void(0)">配送与支付</a></dt>
            <dd><a href="javascript:void(0)">货到付款区域</a></dd>
            <dd><a href="javascript:void(0)">配送支付查询</a></dd>
            <dd><a href="javascript:void(0)">支付方式说明</a></dd>
        </dl>
        <dl>
            <dt><a href="javascript:void(0)">会员中心</a></dt>
            <dd><a href="javascript:void(0)">资金管理</a></dd>
            <dd><a href="javascript:void(0)">我的收藏</a></dd>
            <dd><a href="javascript:void(0)">我的订单</a></dd>
        </dl>
        <dl>
            <dt><a href="javascript:void(0)">服务保证</a></dt>
            <dd><a href="javascript:void(0)">退换货原则</a></dd>
            <dd><a href="javascript:void(0)">售后服务保证</a></dd>
            <dd><a href="javascript:void(0)">产品质量保证</a></dd>
        </dl>
        <dl>
            <dt><a href="javascript:void(0)">联系我们</a></dt>
            <dd><a href="javascript:void(0)">网站故障报告</a></dd>
            <dd><a href="javascript:void(0)">购物咨询</a></dd>
            <dd><a href="javascript:void(0)">投诉与建议</a></dd>
        </dl>
        <div class="b_tel_bg">
            <a href="javascript:void(0)" class="b_sh1">新浪微博</a>
            <a href="javascript:void(0)" class="b_sh2">腾讯微博</a>
            <p>
                服务热线：<br>
                <span>400-123-4567</span>
            </p>
        </div>
        <div class="b_er">
            <div class="b_er_c"><img src="images/er.gif" width="118" height="118"></div>
            <img src="images/ss.png">
        </div>
    </div>
    <div class="btmbg">
        <div class="btm">
            备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 易买网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br>
            <img src="images/b_1.gif" width="98" height="33"><img src="images/b_2.gif" width="98" height="33"><img src="images/b_3.gif" width="98" height="33"><img src="images/b_4.gif" width="98" height="33"><img src="images/b_5.gif" width="98" height="33"><img src="images/b_6.gif" width="98" height="33">
        </div>
    </div>
</div>
<script type="text/javascript">
    function deleteById(id) {
        $.ajax({type:"post",
            data:{
                delid:id
            },
            url:"/delproduct",
            async:true,
            success:function(result){
                if(result==1){
                    alert("删除成功")
                    window.location.reload();
                }else {
                    alert("网络繁忙")
                }
            }});

    }
</script>
</body>

</html>

