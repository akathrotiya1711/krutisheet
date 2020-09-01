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
    	<c:if test="${ society.id<=0}">  
   			Add Society
		</c:if> 
		<c:if test="${society.id>0}">
			Update Society
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${society.id > 0}">
    		<button type="button" class="btn btn-link"><a href="/society"> New Society</a></button>
    			
    	
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="society" method="POST" modelAttribute="society" action="/society" name="society" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "New Society" />
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

<%! int count = 1; %>
<h3> Society List</h3>
<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">Id</th>
 		<th scope = "col">Name</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="society" items="${societyList}">   
   <tr>  
  <th scope="row" class ="text-center">  ${society.id}
   <td class="text-center">${society.name}</td>
   <td><a href = "/society/${society.id}"><button type="button" class="btn btn-link">Edit</button></a></td>
   <td><a href = "/society/delete/${society.id}"><button type="button" class="btn btn-link">Delete</button></a></td>  
   </tr>
  
   </c:forEach>
 </table>
 </div>
<br/>

<%@ include file = "footer.jsp" %>
