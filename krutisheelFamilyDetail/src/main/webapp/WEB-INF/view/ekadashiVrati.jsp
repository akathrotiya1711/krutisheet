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
    	<c:if test="${ ev.id<=0}">  
   			Add Vrati / Ekadashi Village Name
		</c:if> 
		<c:if test="${ev.id>0}">
			Update Vrati / Ekadashi  Village Name ${ev.id}
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${ev.id > 0}">
    		<button type="button" class="btn btn-link"><a href="/ekadashiVrati/"> New Village</a></button>
    			
    	
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="ev" method="POST" modelAttribute="ev" action="/ekadashiVrati/" name="ev" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "New Village" />
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
<h3>Vrati / Ekadashi  Village Name List</h3>
<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">Number</th>
 		<th scope = "col">Name</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="ev" items="${evlist}">   
   <tr>  
  <th scope="row" class ="text-center">  ${ev.id}
   <td class="text-center">${ev.name}</td>
   <td><button type="button" class="btn btn-link"><a href = "/ekadashiVrati/${ev.id}">Edit</a></button></td>
   <td><button type="button" class="btn btn-link"><a href = "/ekadashiVrati/delete/${ev.id}">Delete</a></button></td>  
   </tr>
  
   </c:forEach>
 </table>
 </div>
<br/>
<!-- 
<script type="text/javascript">
$(document).ready(function(){
  $("#submit1").click(function(e){
    e.preventDefault();
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
