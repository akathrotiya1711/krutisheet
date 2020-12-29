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
    	<c:if test="${ageGroup.id==0}">  
   			Add Age Group  
		</c:if> 
		<c:if test="${ageGroup.id>0}">
			Update Age Group  
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${ageGroup.id>0}">
    		<button type="button" class="btn btn-link"><a href="/ageGroup/"> New Age Group</a></button>
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="ageGroup" method="POST" modelAttribute="ageGroup" action="/ageGroup/" name="ageGroup" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "Age Group Name" />
           </div>
           </div>
           
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
<h3 align ="center">Age Group List</h3>
<div class="row col-md-6"><!-- you can use column classes md-3,md-5 as per your table width -->

<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">#</th>
 		<th scope = "col">Name</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="ageGroup" items="${ageGroupList}">   
   <tr>  
  <th scope="row" class="align-middle">  <%= count++ %></th>
   <td class="align-middle">${ageGroup.name}</td>
   <td><button type="button" class="btn btn-link"><a href = "/ageGroup/${ageGroup.id}">Edit</a></button></td>
   <td><button type="button" class="btn btn-link"><a href = "/ageGroup/delete/${ageGroup.id}">Delete</a></button></td>  
   </tr>
   </c:forEach>
 </table>
 </div>
</div>
<br/>

<%@ include file = "footer.jsp" %>
