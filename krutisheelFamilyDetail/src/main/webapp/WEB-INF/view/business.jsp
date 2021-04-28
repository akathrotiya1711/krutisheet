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
    	<c:if test="${business.id==0}">  
   			Add Business Name  
		</c:if> 
		<c:if test="${business.id>0}">
			Update Business Name
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${business.id>0}">
    		<button type="button" class="btn btn-link"><a href="/business/"> New Business Name</a></button>
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="business" method="POST" modelAttribute="business" action="/business/" name="business" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "Business Name" />
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
<h3 align ="center">Business List</h3>
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
 
 
<c:forEach var="business" items="${businessList}">   
   <tr>  
  <th scope="row" class="align-middle">  <%= count++ %></th>
   <td class="align-middle">${business.name}</td>
   <td><button type="button" class="btn btn-link"><a href = "/business/${business.id}">Edit</a></button></td>
   <td><button type="button" class="btn btn-link"><a href = "/business/delete/${business.id}">Delete</a></button></td>  
   </tr>
   </c:forEach>
 </table>
 </div>
</div>
<br/>

<%@ include file = "footer.jsp" %>
