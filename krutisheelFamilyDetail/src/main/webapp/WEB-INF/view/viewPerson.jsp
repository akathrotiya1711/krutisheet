<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file = "header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file = "nevigation.jsp" %>

<%! int count = 1; %>
<h3>Person List</h3>
<div class="row col-md-12"><!-- you can use column classes md-3,md-5 as per your table width -->

<div class="table-responsive">
<table class = "text-center table table-hover table-sm w-auto text-center" id= "table1">
	<thead>
	<tr>
 		<th scope = "col">#</th>
 		<th scope = "col">Form Number</th>
 		<th scope = "col">first Name</th>
 		<th scope = "col">Middle Name</th>
 		<th scope = "col">Last Name</th>
 		<th scope = "col">Hod_family_Name</th>
 		<th scope = "col">Res. Number</th>
 		<th scope = "col">Society</th>
 		<th scope = "col">Vibhag</th>
 		<th scope = "col">Note</th>
 		<th scope = "col">Gender</th>
 		<th scope = "col">Birth Date</th>
 		<th scope = "col">Marriage Date</th>
 		<th scope = "col">Ksetradhar </th>
 			<th scope = "col">Education </th>
 				<th scope = "col">Business </th>
 					<th scope = "col">Business Time </th>
 						<th scope = "col">Contect N1 </th>
 							<th scope = "col">Contect N2 </th>
 								<th scope = "col">Note </th>
 								<th scope = "col">Kary Active </th>
 								<th scope = "col">Since Kary </th>
 								
 								
 								<th scope = "col">Last Exam </th>
 								<th scope = "col">Bhavapheri </th>
 								<th scope = "col">Karya Vibhag</th>
 								<th scope = "col">karya_javabadari</th>
 								<th scope = "col">Trikal sandhya </th>
 								<th scope = "col">pratha prathana</th>
 								<th scope = "col">Sayam prathana </th>
 								<th scope = "col">Pravachan</th>
 						
 								<th scope = "col">Ekadashi</th>
 										<th scope = "col">Vrati</th>
 												<th scope = "col">Prayog</th>
 												<th scope = "col">Pujari Date</th>
 												
 												<th scope = "col">Mansuy G. Din</th>
 												<th scope = "col">Other</th>
 												<th scope = "col">Parprant</th>
 												<th scope = "col">Tirth Yatra</th>
 												<th scope = "col">Karya note</th>				
 								
 								
 		<th scope = "col">Edit</th>
 		<th scope = "col">Delete</th>
 	</thead>
 
 
<c:forEach var="person" items="${personList}">   
   <tr>  
  <th scope="row" class="align-middle">  <%= count++ %></th>
  <td class="align-middle">${person.form_number}</td>
   <td class="align-middle">${person.first_name}</td>
   <td class="align-middle">${person.middle_name}</td>
   <td class="align-middle">${person.form_person_last_name}</td>
      <td class="align-middle">${person.form_person_first_name}</td>
   <td class="align-middle">${person.res_no}</td>
   <td class="align-middle">${person.society.name}</td>
<td class="align-middle">${person.society.vibhag.name}</td>
   <td class="align-middle">${person.form_person_note}</td>
    <td class="align-middle">${person.gender}</td>
     <td class="align-middle">${person.dateOfBirth}</td>
      <td class="align-middle">${person.dateOfMarriage}</td>
         <td class="align-middle"></td>
            <td class="align-middle">${person.education}</td>
             <td class="align-middle">${person.business}</td>
              <td class="align-middle">${person.business_time}</td>
               <td class="align-middle">${person.contect_number}</td>
                <td class="align-middle">${person.contect_number_2}</td>
                 <td class="align-middle">${person.note}</td>
                     <td class="align-middle">${person.karya_active}</td>
                         <td class="align-middle">${person.since_karya}</td>
                         
                          <td class="align-middle">${person.last_exam.name}</td>
                         <td class="align-middle">${person.bhavapheri}</td>
                         <td class="align-middle">${person.karya_vibhag.name}</td>
                         <td class="align-middle">${person.karya_javabadari.name}</td>
                         <td class="align-middle">${person.trikal_sandhya}</td>
                         <td class="align-middle">${person.pratah_prathana}</td>
                         <td class="align-middle">${person.sayam_prathana}</td>
                         <td class="align-middle">${person.pravachan}</td>
                         
                       
                         <td class="align-middle">${person.ekadashi.name}</td>
                           <td class="align-middle">${person.vrati.name}</td>
                             <td class="align-middle">${person.prayog.name}</td>  
                              <td class="align-middle">${person.pujari_tarikh}</td>
                              
                              
                               <td class="align-middle">${person.mnsgd_bhaktipheri}</td>
                                <td class="align-middle">${person.other_bhaktipheri}</td>
                                 <td class="align-middle">${person.parprant_bhaktipheri}</td>
                                  <td class="align-middle">${person.tirthayatra}</td>
                              	 <td class="align-middle">${person.karya_note}</td>
                         
   <td class="align-middle"><a href = "/person/${person.id}"><button type="button" class="btn btn-link">Edit</button></a></td>
   <td class="align-middle"><a href = "/person/delete/${person.id}"><button type="button" class="btn btn-link">Delete</button></a></td>  
  
   </c:forEach>
 </table>
 </div>
</div>
<br/>
<%@ include file = "footer.jsp" %>
