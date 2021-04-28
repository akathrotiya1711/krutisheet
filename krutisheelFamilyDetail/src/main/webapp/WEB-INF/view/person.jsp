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
      <div class="col-12">
    		 Head of family details
      </div>
      </div>
     <br/>
     <div class = "row">
      <div class="col-3">
    		 <form:input path="hof_firstName" id="hof_firstName"  placeholder = "Hof First Name" />
      </div>
       <div class="col-3">
    		 <form:input path="hof_middleName" id="hof_middleName"  placeholder = "Hof Middle Name" />
      </div>
      
      <div class="col-3">
    		 <form:input path="hof_lastName" id="hof_lastName"  placeholder = "Hof Last Name" />
      </div>
      
            <div class="col-2">
    				Form Number	
     		 </div>
      <div class="col-1">
    	 <form:input path="form_number" id="form_number"  placeholder = "Form Number" style="width:90%;" />
      </div>
      
     </div>
     <br/>
     
     <div class = "row">
     <div class="col-3">
    		Address	<form:input path="res_no" id="res_no"  placeholder = "Resident Number"  style="width:50%;"/>
     </div>
     
     
   
      <div class="col-3">
      
     <form:select path = "society" multiple="false" style="width:100%;" >
     
                     <c:forEach var = "r" items="${societyList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
       </div>
  <div class="col-3">
      Vibhag
     <form:select path = "res_vibhag" multiple="false" style="width:20%;" >
     
                     <c:forEach var = "r" items="${vibhagList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
       </div>
   
      <div class="col-3" >
    		 <form:input path="family_note" id="family_note"  placeholder = "Note" style="width:100%;" />
      </div>
     </div>
     <br/>
     
     
     <hr/><hr/> 
     
    <div class = "row">
      <div class="col-12">
    		 Personal details
      </div>
      </div>
     <br/>    
     
     <div class = "row">
      <div class="col-4">
    	First Name	 <form:input path="first_name" id="first_name"  placeholder = "First Name" />
      </div>
     
    
      <div class="col-4">
    	Middle Name	 <form:input path="middle_name" id="middle_name"  placeholder = "Middle Name" />
      </div>
      
       <div class="col-4">Relation 
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
  
   <div class="col-2">
    	Gender <form:radiobutton path="gender" value= "M" />M
    	       <form:radiobutton path="gender" value= "F" />F
      </div>
     
       <div class="col-2">
      </div>
    
      <div class="col-4">
    	Birth Date	<form:input type= "date" path="dateOfBirth"/> 
      </div>
 		
      <div class="col-4">Age Group 
     <form:select path = "age_group" multiple="false">
                     <c:forEach var = "r" items="${ageGroupList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
           </div>
     <br/> 
     
      <div class = "row">
      <div class="col-4">
    	Marriage Date	<form:input type= "date" path="dateOfMarriage"/> 
      </div>
      
      <div class="col-4">
    	  Contect Number <form:input path="contect_number" id="contect_number"  placeholder = "Number_1" />
      </div>
      <div class="col-4">
      	Contect Number_2<form:input path="contect_number_2" id="contect_number_2"  placeholder = "Number 2" />
      </div>
     
     </div>
     <br/>
     
     <div class = "row">
      <div class="col-4">
    	Education	
    	<form:select path = "education" multiple="false">
                     <c:forEach var = "r" items="${educationList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  </form:select>
      </div>
      
      <div class="col-4">
    	Is Study Continue ?	 <form:radiobutton path="isStudyContinue" value= "Yes" />Yes
    	      				 <form:radiobutton path="isStudyContinue" value= "No" />No
		    	      		 <form:radiobutton path="isStudyContinue" value= "Part Time" />Part Time
      </div>
     </div>
     <br/>
     
     <div class = "row">
     <div class="col-4">
    	Profession 	 <form:radiobutton path="profession" value= "Business" />Business
    	      				 <form:radiobutton path="profession" value= "Job" />Job
		    	      		 <form:radiobutton path="profession" value= "Other" />Other
      </div>
      <div class="col-4">
    	Profession Name	
    	<form:select path = "business" multiple="false">
                     <c:forEach var = "r" items="${businessList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  </form:select>
      </div>
     
      <div class="col-4">
      Timing <form:input path="business_time" id="business_time"  placeholder = "Business Time" />
      </div> 
      
     </div>
     <br/>
          
     
     <div class = "row">
      <div class="col-5">
    	Kshetradhar Name	 <form:select path = "Kshetradhar" multiple="false" style="width:90%;">
   
                     <c:forEach var = "r" items="${kshetradharList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
      </div>
      
      <div class="col-7">
     	 Note<form:input path="person_note" id="person_note"  placeholder = "Note"  style="width:90%;"/>
      </div>
      
     </div>
    

     
     <hr /> <hr />
    
       <div class = "row">
      <div class="col-12">
    		 Kary details
      </div>
      </div>
     <br/> 
     <div class = "row">
      <div class="col-4">
    	Karya Active <form:radiobutton path="karya_active" value= "Yes" />Yes
    	      		 <form:radiobutton path="karya_active" value= "No" />No
    	      		 <form:radiobutton path="karya_active" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="karya_active" value= "Past" />Past
    	       
      </div>
      
      <div class="col-4">
      Since Karya<form:input path="since_karya" id="since_karya"  placeholder = "1234" />
      </div>
      
      <div class="col-4">
    	Is Krutisheel ?  <form:radiobutton path="isKrutisheel" value= "Yes" />Yes
    	      			 <form:radiobutton path="isKrutisheel" value= "No" />No
    	      		
    	       
      </div>
     </div>
     <br/>
      
   
     <div class = "row">
      <div class="col-4">Last Exam 
     <form:select path = "last_exam" multiple="false">
   
                     <c:forEach var = "r" items="${examList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
                
                  <div class="col-4">Karya Vibhag 
     			<form:select path = "karya_vibhag" multiple="false">
    
                     <c:forEach var = "r" items="${karyaVibhagList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
                
                <div class="col-3">Karya Javabadari
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
    <div class="col-4">Kendra 
     			<form:select path = "kendraname" multiple="false">
                     <c:forEach var = "r" items="${kendraList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
      <div class="col-4">
    	Bhavpheri 
    	      		 <form:radiobutton path="bhavapheri" value= "Yes" />Yes
    	      		 <form:radiobutton path="bhavapheri" value= "No" />No
    	      		 <form:radiobutton path="bhavapheri" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="bhavapheri" value= "Past" />Past
    	       
      </div>
      
       <div class="col-4">
    	Pravachan  
    	      		<form:radiobutton path="pravachan" value= "Yes" />Yes
    	      		 <form:radiobutton path="pravachan" value= "No" />No
    	      		 <form:radiobutton path="pravachan" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="pravachan" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>
     
    <div class = "row">
      <div class="col-4">
    	Trikal Sandhya 
    	      		<form:radiobutton path="trikal_sandhya" value= "Yes" />Yes
    	      		 <form:radiobutton path="trikal_sandhya" value= "No" />No
    	      		 <form:radiobutton path="trikal_sandhya" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="trikal_sandhya" value= "Past" />Past
    	       
      </div>
   <div class="col-4">
    	Pratah Prathan 
    	      		 <form:radiobutton path="pratah_prathana" value= "Yes" />Yes
    	      		 <form:radiobutton path="pratah_prathana" value= "No" />No
    	      		 <form:radiobutton path="pratah_prathana" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="pratah_prathana" value= "Past" />Past
    	       
      </div>
   
      <div class="col-4">
    	Sayam Prathan 
    	      		<form:radiobutton path="sayam_prathana" value= "Yes" />Yes
    	      		 <form:radiobutton path="sayam_prathana" value= "No" />No
    	      		 <form:radiobutton path="sayam_prathana" value= "Irregular" />Irregular
    	      		 <form:radiobutton path="sayam_prathana" value= "Past" />Past
    	       
      </div>
     </div>
     <br/>

	    <div class = "row">
      <div class="col-4">Ekadashi Gam
     <form:select path = "ekadashi" multiple="false">
                     <c:forEach var = "r" items="${evlist}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
   
      <div class="col-4">Vrati Gam
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
       
         <div class="col-3">
    	Is Pujari
    	      		<form:radiobutton path="isPujari" value= "Yes" />Yes
    	      		 <form:radiobutton path="isPujari" value= "No" />No
    	       
      </div>
      <div class="col-4">Prayog 
     <form:select path = "prayog" multiple="false">
                     <c:forEach var = "r" items="${prayogList}">
                     <form:option value = "${r.id}" label=" ${r.name}" /> 
                     </c:forEach>
                  <%--    <form:options items = "${examList.name}" /> --%>
                  </form:select>
                </div>
                
         <div class="col-2">
     			Pujari Tarikh<form:input path="pujari_tarikh" id="pujari_tarikh"  placeholder = "19"  style="width:25%;"/>
     		 </div>
           </div>
     <br/>
   
   
    <div class = "row">
      <div class="col-4">
     Manusya G D Bhaktipheri<form:input path="mnsgd_bhaktipheri" id="mnsgd_bhaktipheri"  placeholder = "19"  style="width:25%;"/>
      </div>
   
      <div class="col-4">
     Other Bhaktipheri<form:input path="other_bhaktipheri" id="other_bhaktipheri"  placeholder = "19"  style="width:25%;"/>
      </div>
   
      <div class="col-4">
     Paraprant Bhaktipheri<form:input path="parprant_bhaktipheri" id="parprant_bhaktipheri"  placeholder = "19" style="width:25%;"  />
      </div>
     </div>
     <br/>
   
    <div class = "row">
      <div class="col-4">
     Tirthyatra<form:input path="tirthayatra" id="tirthayatra"  placeholder = "12"  style="width:25%;" />
      </div>
   
      <div class="col-8">
     Karya Note<form:input path="karya_note" id="karya_note"  placeholder = "" style="width:75%;"/>
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
<div class="row col-md-12"><!-- you can use column classes md-3,md-5 as per your table width -->

<div class="table-responsive">
<table class = "text-center table  text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">#</th>
 		<th scope = "col">Form Number</th>
 		<th scope = "col">Hof Full Name </th>
 		<th scope = "col">Name</th>
 		<th scope = "col">Gender</th>
 		<th scope = "col">DOB</th>
 		<th scope = "col">Education</th>
 		<th scope = "col">Profession</th>
 		<th scope = "col">Marriage Date</th>
 		<th scope = "col">Contact number</th>
 		<th scope = "col">Contact number 2</th>
 		<th scope = "col">Age Group</th>
 		<th scope = "col">Address</th>
 		<th scope = "col">Relation</th>
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
   <td class="align-middle">${person.hof_fullName}</td>
   <td class="align-middle">${person.first_name}<%= " " %>${person.middle_name}</td>
      <td class="align-middle">${person.gender}</td>
         <td class="align-middle">${person.dateOfBirth}</td>
         <td class="align-middle">${person.education.name}</td>
         <td class="align-middle">${person.business.name}</td>
           <td class="align-middle">${person.dateOfMarriage}</td>
             <td class="align-middle">${person.contect_number} </td>
               <td class="align-middle"> ${person.contect_number_2}</td>
            <td class="align-middle">${person.age_group.name}</td>
   <td class="align-middle">${person.res_no} <%= " " %>${person.society.name}</td>
   <td class="align-middle">${person.relation.name}</td>
   <td class="align-middle">${person.society.name}</td>
  	<td class="align-middle">${person.res_vibhag.name}</td>
   <td class="align-middle">${person.family_note}</td>
   <td class="align-middle"><a href = "/person/${person.id}"><button type="button" class="btn btn-link">Edit</button></a></td>
   <td class="align-middle"><a href = "/person/delete/${person.id}"><button type="button" class="btn btn-link">Delete</button></a></td>  
  
   </c:forEach>
 </table>
 </div>
</div>
<br/>
<%@ include file = "footer.jsp" %>
