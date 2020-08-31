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
    	<c:if test="${javabadari.id==0}">  
   			Add Javabadari
		</c:if> 
		<c:if test="${javabadari.id>0}">
			Update Javabadari  
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${javabadari.id>0}">
    		<button type="button" class="btn btn-link"><a href="/javabadari/"> New Javabadari </a></button>
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="javabadari" method="POST" modelAttribute="javabadari" action="/javabadari/" name="javabadari" class="text-center border border-light p-5">
     
     <div class = "row">
      <div class="col">
     <form:input path="name" id="name"  placeholder = "javabadari Name" />
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
<form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search"  id = "serch" placeholder="Search" aria-label="Search">
     <!--  <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> -->
    </form>

<%! int count = 1; %>
<h3>javabadari List</h3>
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
 
 
<c:forEach var="javabadari" items="${javabadariList}">   
   <tr>  
  <th scope="row" class="align-middle">  <%= count++ %></th>
   <td class="align-middle">${javabadari.name}</td>
   <td><button type="button" class="btn btn-link"><a href = "/javabadari/${javabadari.id}">Edit</a></button></td>
   <td><button type="button" class="btn btn-link"><a href = "/javabadari/delete/${javabadari.id}">Delete</a></button></td>  
   </tr>
  
   </c:forEach>
 </table>
 </div>
</div>
<br/>

<script type="text/javascript">
$(document).ready(function(){
	$('#table1').DataTable({
	fixedColumns: true
	});
  $("#serch").keyup(function(e){
  var d= {} 
  d["name"]= $("#serch").val();
     //alert(JSON.stringify(d));
    $.ajax({
    type:"POST",
    contentType: "application/json",
    url:"/javabadari/serch/",
    //data: d,
    dataType: 'json',
    data : JSON.stringify(d),
    //data : $("#exam").serialize(),
    success:function(res){
    alert(res);
    
  //  for(x in res){
   // alert(res[x].name);
    //}
    //$('#table1').dataTable().destroy();
//$('#table1').find('tbody').append("<tr><td><value1></td><td><value1></td></tr>");
//$('#table1').DataTable().draw()
    
    
      // $("table1").html(data);
      //var text = JSON.stringify(data, null, 7);
      //alert(data.tableData.header.length);
      //alert(text);
      //alert(text.length);
      /*var col = [];
        for (var i = 0; i < text.length; i++) {
            for (var key in text[i]) {
                if (col.indexOf(key) === -1) {
                    col.push(key);
                }
            }
        }
        alert(col);  */
   				//var tableStr="<table>";
      			//var tableHeader="";
                //
                //for(i=0;i<response.tableData.header.length;i++){
                //tableHeader+=("<th>"+response.tableData.header[i]+"</th>");
                //}
               // tableHeader="<thead><tr>"+tableHeader+"</tr></thead>";
                //var tableBody="";
                //for(i=0;i<response.tableData.rows.length;i++){
                  //  var tableRow="";
                    //for(j=0;j<response.tableData.rows[i].length;j++){
                      //  tableRow+="<td>"+response.tableData.rows[i][j]+"</td>";
                    //}
                    //tableBody=tableBody+"<tr>"+tableRow+"</tr>";
                 //}     
                //tableBody="<tbody>"+tableBody+"</tbody>";
                //$('tableContainer').set('html',"<table border='1'>"+tableHeader+tableBody+"</table>");
                     
   
   
   
    },
    error: function(e){
    alert("n");
    }
    });
   
  });
});
</script> 

<%@ include file = "footer.jsp" %>
