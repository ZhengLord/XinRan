$(document).ready(function () {
  $("#reg").validate({
    rules: {
      name: {
        required: true,
      },
      password: {
        required: true,
      },
      rpassword: {
        required: true,
        equalTo: "#exampleInputPassword1",
      },
      tel: {
        required: true,
        minlength: 11,
        maxlength: 11,
      },
      email: {
        required: true,
        // email: true,
      },
    },
    messages: {
      name: {
        required: "<font color='red'>昵称不能为空</font>",
      },
      password: {
        required: "<font color='red'>密码不能为空</font>",
      },
      rpassword: {
        required: "<font color='red'>确认密码不能为空</font>",
        equalTo: "<font color='red'>两次密码不一致</font>",
      },
      tel: {
        required: "<font color='red'>电话不能为空</font>",
        minlength: "<font color='red'>电话必须为11位</font>",
        maxlength: "<font color='red'>电话必须为11位</font>",
      },
      email: {
        required: "<font color='red'>邮箱不能为空</font>",
        email: "<font color='red'>请输入正确的邮箱</font>",
      },
    },
  });
});
