<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
	<h1>First version using EL:</h1>
	<hr>
	${person.name}'s dog ${person.dog.name}'s toys are:
	${person.dog.toys[0].name}, ${person.dog.toys[1].name}, and a
	${person.dog.toys[2].name}
	<h1>Second version using EL:</h1>
	<hr>
	<!-- we use [] operator instead of dot operator-->
	${person["name"]}'s dog ${person["dog"]["name"]}'s toys are:
	<!-- we can mix as well-->
	${person.dog["toys"][0]["name"]},
	<!-- using [] remeber use String if you use without String it will search 
	  bound attribute with this name-->
	${person["dog"].toys["1"]["name"]}, and a
	${person.dog["toys"]["2"]["name"]}
</body>
</html>