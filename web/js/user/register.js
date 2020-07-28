function addUser() {
    $("#userAdd").submit();
}
function checkUser() {

    //各种判断
    $loginName=$("#loginName");
    $username = $("#userName");
    $password=$("#password");
    $repPassword=$("#repPassword");
    $identityCode=$("#identityCode");
    $email=$("#email");
    $mobile=$("#mobile");
    $type=$("#type");
    if ($loginName.val() == "") {
       alert("用户姓名不能为空！！！");
        return false;
    }
    if ($username.val()==""){
       alert("真实姓名不能为空！！！");
        return false;
    }
    if ($password.val()==""){
       alert("密码不能为空！！！");
        return false;
    }
    if ($repPassword.val()==""){
        alert("确认密码不能为空！！！");
        return false;
    }
    if (!$repPassword.val()==$password.val()){
       alert("密码不一样！！！");
       return false;
    }
    if ($identityCode.val()==""){
        alert("身份证号不能为空！！！");
        return false;
    }
    if ($email.val()==""){
       alert("邮箱不能为空！！！");
       return false;
    }
    if ($mobile.val()==""){
      alert("手机号不能为空！！！");
      return false;
    }
    return true;


}