<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員管理表</title>
</head>
<body>
	<h2>ログイン</h2>
	<form method="post" action="<%=request.getContextPath()%>/LoginServlet">
		<table>
			<tr>
				<th>メールアドレス：</th>
				<td><input type="email" name="mail" required></td>
			</tr>
			<tr>
				<th>パスワード：</th>
				<td><input type="password" name="password" required></td>
			</tr>
		</table><br>
		<input type="submit" value="ログイン">
	</form>
	<p><font color="red">${requestScope.errorMsg }</font></p>
</body>
</html>