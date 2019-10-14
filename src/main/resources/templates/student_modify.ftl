<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>主页</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  <div class="container">
    <div class="row">
      <div class="col-md-4">
        <ul class="nav nav-pills nav-stacked">
          <li role="presentation"><a href="/student/list">列表</a></li>
          <li role="presentation"><a href="/student/add">新增</a></li>
          <li role="presentation" class="active"><a href="#">修改</a></li>
          <li role="presentation"><a href="/student/search">搜索</a></li>
        </ul>
      </div>
      <div class="col-md-8">      
        <form action="/student/do_modify">
            <input type="text"id="id" name="id" value="${student.id}">
            <div class="form-group">
                <label for="number">学号</label>
                <input type="text" class="form-control" id="number" name="number" value="${student.number}" placeholder="请输入学号">
            </div>
            <div class="form-group">
                <label for="name">姓名</label>
                <input type="name" class="form-control" id="name" name="name" value="${student.name}" placeholder="请输入姓名">
            </div>
              <div class="form-group">
                <label for="sex">性别</label>
                <input type="text" class="form-control" id="sex" name="sex" value="${student.sex}" placeholder="请输入性别">
            </div>
            <div class="form-group">
                <label for="classnum">班级</label>
                <input type="text" class="form-control" id="classnum" name="classnum" value="${student.classnum}" placeholder="请输入班级">
            </div>
            <button type="submit" class="btn btn-default">确认</button>
        </form>
      </div>
    </div>
  </div>

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
  </body>
</html> 