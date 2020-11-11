<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<%@ include file="hd.jsp"%>
		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col">
				<div class="card">
					<div class="card-header">Featured</div>
					<div class="card-body">
						<h5 class="card-title">登陆成功！</h5>
						<p class="card-text">
						<form action="RegeAction03" method="post"
							enctype="multipart/form-data">
							<div class="form-group row">
								<label for="inputEmail3" class="col-sm-3 col-form-label">用户名</label>
								<div class="col-sm-7">
									<input type="text" class="form-control" id="username"
										placeholder="用户名" required>
								</div>
							</div>
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-3 col-form-label">性别</label>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="sex"
										id="sex" value="1"> <label class="form-check-label"
										for="inlineRadio1">男</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="sex"
										id="sex" value="2"> <label class="form-check-label"
										for="inlineRadio2">女</label>
								</div>
							</div>
							<fieldset class="form-group">
								<div class="row">
									<legend class="col-form-label col-sm-2 pt-0">特长</legend>
									<div class="col-sm-10">
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="gridRadios" id="spec1" value="c++" checked> <label
												class="form-check-label" for="spec1"> c++ </label>
										</div>
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="gridRadios" id="spec2" value="java"> <label
												class="form-check-label" for="spec2"> java </label>
										</div>
										<div class="form-check disabled">
											<input class="form-check-input" type="checkbox"
												name="gridRadios" id="spec3" value="javascript"> <label
												class="form-check-label" for="spec3"> javascript</label>
										</div>
									</div>
								</div>
							</fieldset>
							<div class="form-group row">
								<label for="inputEmail3" class="col-sm-3 col-form-label">所属专业</label>
								<div class="col-sm-7">
									<select multiple class="form-control" id="major" name="major">
										<option>软件工程</option>
										<option>电子商务</option>
										<option>计算机</option>
										<option>信息管理</option>
									</select>
								</div>
							</div>
							<div class="form-group row">
								<label for="inputEmail3" class="col-sm-3 col-form-label">本人照片</label>
								<div class="col-sm-9">
									<input type="file" class="form-control-file" id="photo"
										name="photo">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputEmail3" class="col-sm-3 col-form-label"></label>
								<div class="col-sm-9">
									<button type="submit" class="btn btn-primary">Sign in</button>
								</div>
							</div>
						</form>
						</p>

					</div>
				</div>
			</div>
			<div class="col-3">
				<%@ include file="right.jsp"%>
			</div>
		</div>
	</div>

	<%@ include file="bt4.jsp"%>
</body>
</html>
