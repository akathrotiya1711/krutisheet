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
    	<c:if test="${ family.id<=0}">  
   			Add Family Head 
		</c:if> 
		<c:if test="${family.id>0}">
			Update Family Head    
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${family.id > 0}">
    		<a href="/family/"><button type="button" class="btn btn-link"> New Family Head</button></a>
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="family" method="POST" modelAttribute="family" action="/family/" name="family" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">First Name
     <form:input path="fname" id="fname"  placeholder = "First Name" />
           </div>
           </div>
     <br/>
    
    
     <div class = "row">
      <div class="col">Middle Name
     <form:input path="mname" id="mname"  placeholder = "Middle Name" />
           </div>
           </div>
     <br/>
          
          
     <div class = "row">
      <div class="col">Last Name
     <form:input path="lname" id="lname"  placeholder = "Last Name" />
           </div>
           </div>
     <br/>
     
     <div class = "row">
      <div class="col">Society Name
     <form:select path = "society">
                     <c:forEach var = "society" items="${societyList}">
                     <form:option value = "${society.id}" label=" ${society.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
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
<h3>Family  List</h3>
<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">Number</th>
 		<th scope = "col">First Name</th>
 		<th scope = "col">Middle Name</th>
 		<th scope = "col">Last Name</th>
 		<th scope = "col">Society Name</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="family" items="${familyList}">   
   <tr>  
  <th scope="row" class ="text-center">  ${family.id}
   <td class="text-center">${family.fname}</td>
   <td class="text-center">${family.mname}</td>
   <td class="text-center">${family.lname}</td>
   <td class="text-center">${family.society.name}</td>
   <td><button type="button" class="btn btn-link"><a href = "/family/${family.id}">Edit</a></button></td>
   <td><button type="button" class="btn btn-link"><a href = "/family/delete/${family.id}">Delete</a></button></td>  
   </tr>
  
   </c:forEach>
 </table>
 </div>
<br/>
<!-- 
<script type="text/javascript">
$(document).ready(function(){
  $("#submit1").click(function(e){
    e.prfamilyentDefault();
    var name = $("#name").val();
    alert(name);
    
    $.ajax({
    type:"POST",
    url:"/exams",
     data : $("#exam").serialize(),
    success:function(data){
    alert(data);
       $("table1").html(data);
    },
    error: function(e){
    alert(e);
    }
    });
   
  });
});
</script> -->


<%@ include file = "footer.jsp" %>
