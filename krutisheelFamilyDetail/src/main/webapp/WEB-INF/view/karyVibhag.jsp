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
    	<c:if test="${ karyVibhag.id<=0}">  
   			Add KaryaVibhag 
		</c:if> 
		<c:if test="${karyVibhag.id>0}">
			Update KaryaVibhag 
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${karyVibhag.id > 0}">
    		<a href="/karyVibhag/"><button type="button" class="btn btn-link"> New KaryaVibhag</button></a>
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="karyVibhag" method="POST" modelAttribute="karyVibhag" action="/karyVibhag/" name="karyVibhag" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "New KaryaVibhag" />
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

<form:form id ="karyVibhagSerch" method="GET" action="/karyVibhag/serch" name="karyVibhagSerch" class="text-center border border-light p-5 form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search"  id = "serch" name = "serch" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> 
    </form:form >

<%! int count = 1; %>
<h3>KaryaVibhag  List</h3>
<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">Id</th>
 		<th scope = "col">Name</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="karyVibhag" items="${karyVibhagList}">   
   <tr>  
  <th scope="row" class ="text-center">  ${karyVibhag.id}
   <td class="text-center">${karyVibhag.name}</td>
   <td><a href = "/karyVibhag/${karyVibhag.id}"><button type="button" class="btn btn-link">Edit</button></a></td>
   <td><a href = "/karyVibhag/delete/${karyVibhag.id}"><button type="button" class="btn btn-link">Delete</button></a></td>  
   </tr>
  
   </c:forEach>
 </table>
 </div>
<br/>
<!-- 
<script type="text/javascript">
$(document).ready(function(){
  $("#submit1").click(function(e){
    e.prkaryVibhagentDefault();
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
