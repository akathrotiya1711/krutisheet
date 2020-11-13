<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file = "header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file = "nevigation.jsp" %>

<c:if test="${not empty message}"> 
<div class="alert alert-success alert-sm text-center alert-dismissible">
<button type="button" class="close" data-dismiss="alert">&times;</button>
  <strong>${message}</strong> I
</div>
</c:if>
<div class="container">
  <div class="row">
    <div class="col"></div>
    <div class="col">
    	<p class= "h3 text-center">
    	<c:if test="${ kendra.id<=0}">  
   			Add Kendra 
		</c:if> 
		<c:if test="${kendra.id>0}">
			Update Kendra ${kendra.id}
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${kendra.id > 0}">
    		<a href="/kendra/"><button type="button" class="btn btn-link"> New Kendra</button></a>
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="kendra" method="POST" modelAttribute="kendra" action="/kendra/" name="kendra" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "New Kendra" />
           </div>
           </div>
     <br/>
    
           
           <form:hidden path="id"/>
       <br/>
     <div class = "row">
      <div class="col">
            <button type="submit" id = "submit1" class="btn btn-outline-primary">Submit</button>
            <button type="reset" class="btn btn-outline-secondary">Reset</button>
           </div>
           </div>
</form:form>

<form:form id ="kendraSerch" method="GET" action="/kendra/serch" name="kendraSerch" class="text-center border border-light p-5 form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search"  id = "serch" name = "serch" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> 
    </form:form >

<%! int count = 1; %>
<h3>Kendra  List</h3>
<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">Number</th>
 		<th scope = "col">Name</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="kendra" items="${kendraList}">   
   <tr>  
  <th scope="row" class ="text-center">  ${kendra.id}
   <td class="text-center">${kendra.name}</td>
   <td><a href = "/kendra/${kendra.id}"><button type="button" class="btn btn-link">Edit</button></a></td>
   <td><a href = "/kendra/delete/${kendra.id}"><button type="button" class="btn btn-link">Delete</button></a></td>  
   </tr>
  
   </c:forEach>
 </table>
 </div>
<br/>


<%@ include file = "footer.jsp" %>
