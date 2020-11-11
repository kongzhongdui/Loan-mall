<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<style rel="text/css">
#d1 {
	background-image: url("Explosion_1080.jpg");
}
</style>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">${username}</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Dropdown </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Action</a> <a
								class="dropdown-item" href="#">Another action</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Something else here</a>
						</div></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
					</li>
				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</nav>
		<div class="row" id="d1">
			<div class="col-8"></div>
			<div class="col-4">
				<div class="card" style="margin-top: 80px;">
					<div class="card-header">登陆页面</div>
					<div class="card-body">
						<form method="get" action="LoginActionSession">
							<div class="form-group row">
								<label for="inputEmail3" class="col-sm-3 col-form-label"
									name="username">用户名</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" placeholder="用户名">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-3 col-form-label"
									name="password">密码</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" placeholder="密码">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputVerfImg" class="col-sm-3 col-form-label"
									name="VerfImg">校验码</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" placeholder="校验码">
								</div>
								<div class="col-sm-5">
									<img src="VerfImg">
								</div>

							</div>
							<fieldset class="form-group"></fieldset>
							<div class="form-group row">
								<div class="col-sm-3"></div>
								<div class="col-sm-9">
									<div class="form-check">
										<input class="form-check-input" type="checkbox"
											id="gridCheck1"> <label class="form-check-label"
											for="gridCheck1"> 记住密码 </label>
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-9">
									<button type="submit" class="btn btn-primary">登录</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>

		</div>
	</div>

</body>
</html>
