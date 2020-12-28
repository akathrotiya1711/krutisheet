<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file = "header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file = "nevigation.jsp" %>

<c:if test="${not empty message}"> 
<div class="alert alert-success alert-sm text-center alert-dismissible">
<button type="button" class="close" data-dismiss="alert">&times;</button>
  <strong>${message}</strong> 
</div>
</c:if>
<div class="container">
  <div class="row">
    <div class="col"></div>
    <div class="col">
    	<p class= "h3 text-center">
    	<c:if test="${person.id==0}">  
   			Add New Person
		</c:if> 
		<c:if test="${person.id>0}">
			Update person  
		</c:if>
    	</div>
    <div class="col">
    	<c:if test="${person.id>0}">
    		<a href="person"> <button type="button" class="btn btn-link">New Person</button> </a>
    	</c:if> 
   	</div>
  </div>
  </div>



<form:form  id ="person" method="POST" modelAttribute="person" action="/person/" name="person" class="text-center border border-light p-5">
     
     <form:hidden path="id"/>

     <div class = "row">
      <div class="col">
    		 <form:input path="form_person_first_name" id="form_person_first_name"  placeholder = "First Name" />
      </div>
     </div>
     <br/>
     
     <div class = "row">
      <div class="col">
    		 <form:input path="form_person_middle_name" id="form_person_middle_name"  placeholder = "Middle Name" />
      </div>
     </div>
     <br/>
     
     <div class = "row">
      <div class="col">
    		 <form:input path="form_person_last_name" id="form_person_last_name"  placeholder = "Last Name" />
      </div>
     </div>
     <br/>
     
     <div class = "row">
      <div class="col">
    		 <form:input path="res_no" id="res_no"  placeholder = "Resident Number" />
      </div>
     </div>
     <br/>
     
     <div class = "row">
      <div class="col">Society Name
     <form:select path = "society" multiple="false">
     
                     <c:forEach var = "r" items="${societyList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/> 
     <div class = "row">
      <div class="col">Relation 
     <form:select path = "relation" multiple="false">
                     <c:forEach var = "r" items="${relationList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/> 
     
     <div class = "row">
      <div class="col">
    	Form Number	 <form:input path="form_number" id="form_number"  placeholder = "Form Number" />
      </div>
     </div>
     <br/>
     
          
     <div class = "row">
      <div class="col">
    		 <form:input path="form_person_note" id="form_person_note"  placeholder = "Note" />
      </div>
     </div>
     <br/>
     
     
     <hr/><hr/> 
     
     
     
     <div class = "row">
      <div class="col">
    	First Name	 <form:input path="first_name" id="first_name"  placeholder = "First Name" />
      </div>
     </div>
     <br/>
     
     <div class = "row">
      <div class="col">
    	Middle Name	 <form:input path="middle_name" id="middle_name"  placeholder = "Middle Name" />
      </div>
     </div>
     <br/>
     
     
     <div class = "row">
      <div class="col">Relation 
     <form:select path = "relation" multiple="false">
                     <c:forEach var = "r" items="${relationList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/> 

    <div class = "row">
      <div class="col">
    	Gender <form:radiobutton path="gender" value= "M" />M
    	       <form:radiobutton path="gender" value= "F" />F
      </div>
     </div>
     <br/>
   
     
     <div class = "row">
      <div class="col">
    	Birth Date	<form:input type= "date" path="dateOfBirth"/> 
      </div>
     </div>
     <br/>
     
      <div class = "row">
      <div class="col">
    	Marriage Date	<form:input type= "date" path="dateOfMarriage"/> 
      </div>
     </div>
     <br/>
     
     
     <div class = "row">
      <div class="col">
    	Kshetradhar Name	 <form:input path="kshetradhar_name" id="kshetradhar_name"  placeholder = "kshetradhar Name" />
      </div>
     </div>
     <br/>
          
     <div class = "row">
      <div class="col">
    	Education	 <form:input path="education" id="education"  placeholder = "Education" />
      </div>
     </div>
     <br/>
          
     <div class = "row">
      <div class="col">
    	Business	 <form:input path="business" id="business"  placeholder = "Business Name" />
      </div>
     </div>
     <br/>
          
     <div class = "row">
      <div class="col">
      Time	 <form:input path="business_time" id="business_time"  placeholder = "Business Time" />
      </div>
     </div>
     <br/>
     
     <div class = "row">
      <div class="col">
      Contect Number <form:input path="contect_number" id="contect_number"  placeholder = "Number_1" />
      </div>
     </div>
     <br/>
     
     <div class = "row">
      <div class="col">
      Contect Number_2<form:input path="contect_number_2" id="contect_number_2"  placeholder = "Number 2" />
      </div>
     </div>
     <br/>

     <div class = "row">
      <div class="col">
      Note<form:input path="note" id="note"  placeholder = "Note" />
      </div>
     </div>
     <br/>

     
     <hr /> <hr />
     
     <div class = "row">
      <div class="col">
    	Karya Active <form:radiobutton path="karya_active" value= "Yes" />Yes
    	      		 <form:radiobutton path="karya_active" value= "No" />No
    	      		 <form:radiobutton path="karya_active" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="karya_active" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>
     
     
     <div class = "row">
      <div class="col">
      Since Karya<form:input path="since_karya" id="since_karya"  placeholder = "1234" />
      </div>
     </div>
     <br/>
     
   
     <div class = "row">
      <div class="col">Last Exam 
     <form:select path = "last_exam" multiple="false">
   
                     <c:forEach var = "r" items="${examList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/>
   
    <div class = "row">
      <div class="col">
    	Bhavpheri 
    	      		 <form:radiobutton path="bhavapheri" value= "Yes" />Yes
    	      		 <form:radiobutton path="bhavapheri" value= "No" />No
    	      		 <form:radiobutton path="bhavapheri" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="bhavapheri" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>
     
   
    <div class = "row">
      <div class="col">Karya Vibhag 
     <form:select path = "karya_vibhag" multiple="false">
    
                     <c:forEach var = "r" items="${karyaVibhagList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/>
   
    <div class = "row">
      <div class="col">Karya Javabadari
     <form:select path = "karya_javabadari" multiple="false">
                     <c:forEach var = "r" items="${javabadariList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/>
   
   
   
    <div class = "row">
      <div class="col">
    	Trikal Sandhya 
    	      		<form:radiobutton path="trikal_sandhya" value= "Yes" />Yes
    	      		 <form:radiobutton path="trikal_sandhya" value= "No" />No
    	      		 <form:radiobutton path="trikal_sandhya" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="trikal_sandhya" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>
     
   
    <div class = "row">
      <div class="col">
    	Pratah Prathan 
    	      		 <form:radiobutton path="pratah_prathana" value= "Yes" />Yes
    	      		 <form:radiobutton path="pratah_prathana" value= "No" />No
    	      		 <form:radiobutton path="pratah_prathana" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="pratah_prathana" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col">
    	Sayam Prathan 
    	      		<form:radiobutton path="sayam_prathana" value= "Yes" />Yes
    	      		 <form:radiobutton path="sayam_prathana" value= "No" />No
    	      		 <form:radiobutton path="sayam_prathana" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="sayam_prathana" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col">
    	Pravachan  
    	      		<form:radiobutton path="pravachan" value= "Yes" />Yes
    	      		 <form:radiobutton path="pravachan" value= "No" />No
    	      		 <form:radiobutton path="pravachan" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="pravachan" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>

	    <div class = "row">
      <div class="col">Ekadashi Gam
     <form:select path = "ekadashi" multiple="false">
                     <c:forEach var = "r" items="${evlist}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/>
   
   
	    <div class = "row">
      <div class="col">Vrati Gam
     <form:select path = "vrati" multiple="false">
                     <c:forEach var = "r" items="${evlist}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/>
   
       <div class = "row">
      <div class="col">Pujari
     <form:select path = "prayog" multiple="false">
                     <c:forEach var = "r" items="${prayogList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/>
   
    <div class = "row">
      <div class="col">
     Pujari Tarikh<form:input path="pujari_tarikh" id="pujari_tarikh"  placeholder = "1234" />
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col">
     Manusya G D Bhaktipheri<form:input path="mnsgd_bhaktipheri" id="mnsgd_bhaktipheri"  placeholder = "1234" />
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col">
     Other Bhaktipheri<form:input path="other_bhaktipheri" id="other_bhaktipheri"  placeholder = "1234" />
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col">
     Paraprant Bhaktipheri<form:input path="parprant_bhaktipheri" id="parprant_bhaktipheri"  placeholder = "1234" />
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col">
     Tirthyatra<form:input path="tirthayatra" id="tirthayatra"  placeholder = "1234" />
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col">
     Karya Note<form:input path="karya_note" id="karya_note"  placeholder = "" />
      </div>
     </div>
     <br/>
   
   
   
     <div class = "row">
      <div class="col">
            <button type="submit" id = "submit1" class="btn btn-outline-primary">Submit</button>
            <button type="reset" class="btn btn-outline-secondary">Reset</button>
      </div>
    </div>
</form:form >
<!-- <form class="form-inline my-2 my-lg-0"> -->
<%--  <form:form id ="javabadariSerch" method="GET" action="/javabadari/serch" name="javabadariSerch" class="text-center border border-light p-5 form-inline my-2 my-lg-0">

      <input class="form-control mr-sm-2" type="search"  id = "serch" name = "serch" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> 
    </form:form >
 --%>
<%! int count = 1; %>
<h3>Person List</h3>
<div class="row col-md-6"><!-- you can use column classes md-3,md-5 as per your table width -->

<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">#</th>
 		<th scope = "col">Form Number</th>
 		<th scope = "col">first Name</th>
 		<th scope = "col">Middle Name</th>
 		<th scope = "col">Last Name</th>
 		<th scope = "col">Res. Number</th>
 		<th scope = "col">Society</th>
 		<th scope = "col">Vibhag</th>
 		<th scope = "col">Note</th>
 		
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="person" items="${personList}">   
   <tr>  
  <th scope="row" class="align-middle">  <%= count++ %></th>
  <td class="align-middle">${person.form_number}</td>
   <td class="align-middle">${person.form_person_first_name}</td>
   <td class="align-middle">${person.form_person_middle_name}</td>
   <td class="align-middle">${person.form_person_last_name}</td>
   <td class="align-middle">${person.res_no}</td>
   <td class="align-middle">${person.society.name}</td>
  	<td class="align-middle">${person.society.vibhag.name}</td>
   <td class="align-middle">${person.form_person_note}</td>
   <td class="align-middle"><a href = "/person/${person.id}"><button type="button" class="btn btn-link">Edit</button></a></td>
   <td class="align-middle"><a href = "/person/delete/${person.id}"><button type="button" class="btn btn-link">Delete</button></a></td>  
  
   </c:forEach>
 </table>
 </div>
</div>
<br/>
<%@ include file = "footer.jsp" %>
