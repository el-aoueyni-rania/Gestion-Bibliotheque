<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/font-awesome-4.7.0/css/font-awesome.css">
    <link href="css/stylereg.css">
    <link rel="icon" type="image/png" href="images/icons/favicons.ico"/>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	
	
	
    <title>Emprunter un document</title>
</head>
<body>



		<div class="container-login100">
			<div class="wrap-login100">
				<form action="ServletEmpruntDocUtilisateur"  method="post" >
				<c:if test="${!empty sessionScope.utilisateur  }">
					<span class="login100-form-title p-b-26" style="font-family:Poppins-Regular">
						
						Emprunter un document
					</span>
					<span class="login100-form-title p-b-48">	
					</span>
					
					 <!-- cin -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <br>  Cin :  <br>
                            </span>
                        </div>
                        <input  type="text" name="cin_e" placeholder="cin" value="${sessionScope.utilisateur.cin}" class="form-control bg-white border-left-0 border-md">
                    </div>

                    <!-- nom -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <br>  Nom :   <br> 
                            </span>
                        </div>
                        <input  type="text" name="nom_e" placeholder="nom" value="${sessionScope.utilisateur.nom}" class="form-control bg-white border-left-0 border-md">
                    </div>

                    <!-- prenom -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <br> Prenom :   <br>
                            </span>
                        </div>
                        <input type="text" name="prenom_e" placeholder="prenom " value="${sessionScope.utilisateur.prenom}" class="form-control bg-white border-left-0 border-md">
                    </div>
                    <!-- titre -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                               <br> Titre du document :  <br> 
                            </span>
                        </div>
                        <input  type="text" name="titre_doc" placeholder="titre" class="form-control bg-white border-left-0 border-md">
                    </div>
                    <br>
                    <!-- date d'emprunt -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                               <br> date d'emprunt :  <br> 
                            </span>
                        </div>
                        <input  type="text" name="date_emprunt" placeholder="date d'emprunt" class="form-control bg-white border-left-0 border-md">
                    </div>
                    <br>
     
                    
                     <!-- Submit Button -->
                    <div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							   </c:if>
							<input class="login100-form-btn btn btn-primary btn-sm" type="submit" value="Emprunter" name="empruntdoc">

						</div>
					</div>

					
				</form>
			</div>
		</div>


</body>
	

<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/jquery-3.3.1.slim.min.js"></script>
<script src="js/main.js"></script>
<script src="js/regjs.js"></script>
</html>


