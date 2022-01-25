<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName}
	
	<br/>
	
	Country: ${student.country}
	
	<br/>
	
	Favorite Language: ${student.favoriteLanguage}
	
	<br/>
	
	Operating Systems: 
	
	<ul>
		<c:forEach var="i" items="${student.operatingSystems}">
		<li>
			${i}
		</li>
		</c:forEach>
	</ul>
	
	<br/>
</body>

</html>