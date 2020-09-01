
<%@ include file = "header.jsp" %>
<%@ include file = "nevigation.jsp" %>
<h3 align = "center">Add Family</h3>

<form:form action= "/save-family" modelAttribute = "family" method = "post">
 <form:hidden path="id"/>
<table>
 <tr>
  <td>Name
  <td><form:input path="name"/>
  <tr>
  <td>Date of Birth
  <td><form:input type= "date" path="dateOfBirth"/>
  <tr>
  <td>Last Exam
  <td>
   <form:select path = "exam">
                     <form:option value = "" label = "Select"/>
                     <c:forEach var = "exam" items="${examList}">
                     <option value = "${exam.id}" >${exam.name}</option>
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select> 
  <tr>
   <td>
     <input type = "submit">
</table>

</form:form>
<h3>Family List</h3>
<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">Name</th>
 		<!-- <th scope = "col">Name</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th> -->
 	</thead>
 
 
<c:forEach var="family" items="${familyList}">   
   <tr>  
  <th scope="row" class ="text-center">  ${family.name}
    <td class="text-center">${family.exam.name}</td>
     <td class="text-center">${family.dateOfBirth}</td>
      <td class="text-center">${family.}</td>
  <%-- <td><button type="button" class="btn btn-link"><a href = "/exams/${exm.id}">Edit</a></button></td>
   <td><button type="button" class="btn btn-link"><a href = "/examds/${exm.id}">Delete</a></button></td>  
   </tr>
   --%>
   </c:forEach>
 </table>
 </div>
<br/>

<%@ include file = "footer.jsp" %>