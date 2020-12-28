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
    	<c:if test="${empty exam.id}">  
   			Add Exam   
		</c:if> 
		<c:if test="${not empty exam.id}">
			Update Exam 
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${not empty exam.id}">
    		<button type="button" class="btn btn-link"><a href="/exam"> New Exam</a></button>
    			
    	
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="exam" method="POST" modelAttribute="exam" action="/exams" name="exam" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "Exam Name" />
           </div>
           </div>
     <br/>
     <div class = "row">
      <div class="col">
     <form:input path="exam_number" id="exam_number"  placeholder = "Exam Number"  />
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
<h3 align ="center">Exam List</h3>
<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">Number</th>
 		<th scope = "col">Name</th>
 		<th scope = "col">Exam_no.</th>
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="exm" items="${examList}">   
   <tr>  
  <th scope="row" class ="text-center">  ${exm.exam_number}
   <td class="text-center">${exm.name}</td>
   <td><button type="button" class="btn btn-link"><a href = "/exams/${exm.id}">Edit</a></button></td>
   <td><button type="button" class="btn btn-link"><a href = "/examds/${exm.id}">Delete</a></button></td>  
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
<script type="text/javascript">
$(document).ready(function(){
  $("#exam_number").keydown(function(e){
   var key = e.which || e.keyCode;

             if (!e.shiftKey && !e.altKey && !e.ctrlKey &&
             // numbers   
                 key >= 48 && key <= 57 ||
             // Numeric keypad
                 key >= 96 && key <= 105 ||
             // comma, period and minus, . on keypad
                key == 190 || key == 188 || key == 109 || key == 110 ||
             // Backspace and Tab and Enter
                key == 8 || key == 9 || key == 13 ||
             // Home and End
                key == 35 || key == 36 ||
             // left and right arrows
                key == 37 || key == 39 ||
             // Del and Ins
                key == 46 || key == 45)
                 return true;

             return false;
  });
});
</script> -->
<%@ include file = "footer.jsp" %>
