$(document).ready(function () {
  $("#log").validate({
    rules: {
      tel: {
        required: true,
        minlength: 11,
        maxlength: 11,
      },
      password: {
        required: true,
      },
    },
    messages: {
      tel: {
        required: "<font color='red'>电话不能为空</font>",
        minlength: "<font color='red'>电话必须为11位</font>",
        maxlength: "<font color='red'>电话必须为11位</font>",
      },
      password: {
        required: "<font color='red'>密码不能为空</font>",
      },
    },
  });
});
