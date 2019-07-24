$(function () {
    var pathName = window.document.location.pathname;
    alert(pathName);
})
function but() {
    alert("进来了");
    var mobile=$("#mobile").val();
    var password=$("#password").val();
    $.ajax({
        url:"http://localhost:8080/user",
        type:"POST",
        data:{"mobile":mobile,"password":password},
        success:function () {
            alert("成功");
        }

    })
}