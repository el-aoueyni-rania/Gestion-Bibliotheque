<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/font-awesome-4.7.0/css/font-awesome.css">
    <link href="css/stylereg.css">
    <title>Registeration</title>
</head>
<body>
    <!-- Navbar-->
<header class="header">
    <nav class="navbar navbar-expand-lg navbar-light py-3">
        <div class="container">
            <!-- Navbar Brand -->
            <a href="#" class="navbar-brand">
                <img src="images/logo.png" alt="logo" width="150">
            </a>
        </div>
    </nav>
</header>


<div class="container">
    <div class="row py-5 mt-4 align-items-center">
       
        <div class="col-md-5 pr-lg-5 mb-5 mb-md-0">
            <img src="" alt="" class="img-fluid mb-3 d-none d-md-block">
            <h1>Create an Account</h1>
            <p class="font-italic text-muted mb-0"> Welcome to E-Biblio </p>
        </div>

        <!-- Registration Form -->
        <div class="col-md-7 col-lg-6 ml-auto">
            <form action="ServletAjoutUtilisateur" method="post">
                <div class="row">


                    <!-- CIN -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <br>
                            </span>
                        </div>
                        <input  type="text" name="cin" placeholder="cin" class="form-control bg-white border-left-0 border-md">
                    </div>

                    <!-- First Name -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                 <br> 
                            </span>
                        </div>
                        <input  type="text" name="nom" placeholder="First Name" class="form-control bg-white border-left-0 border-md">
                    </div>

                    <!-- Last Name -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                  <br>
                            </span>
                        </div>
                        <input type="text" name="prenom" placeholder="Last Name" class="form-control bg-white border-left-0 border-md">
                    </div>
                    <!-- genre -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                 <br>
                            </span>
                        </div>
                        <input  type="text" name="genre" placeholder="genre" class="form-control bg-white border-left-0 border-md">
                    </div>

                   

                    <!-- Phone Number -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                  <br>
                            </span>
                        </div>
                        <select id="phoneNumber" name="phoneNumber" style="max-width: 80px" class="custom-select form-control bg-white border-left-0 border-md h-100 font-weight-bold text-muted">
                            <option value="">+216</option>
                              <br>
                        </select>
                        <input type="text" name="tel" placeholder="Phone Number" class="form-control bg-white border-md border-left-0 pl-3">
                    </div>
                    
                    
                    <!-- Address -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                 <br>
                            </span>
                        </div>
                        <input  type="text" name="adresse" placeholder="Addresse" class="form-control bg-white border-left-0 border-md">
                    </div>
                    
                    
                    <!-- Date naissance -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                  <br>
                            </span>
                        </div>
                        <input  type="text" name="date" placeholder="date naissance" class="form-control bg-white border-left-0 border-md">
                    </div>
                    
                     <!-- Email Address -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                  <br>
                            </span>
                        </div>
                        <input  type="text" name="mail" placeholder="Email" class="form-control bg-white border-left-0 border-md">
                    </div>


                    <!-- Specialite -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <br>
                            </span>
                        </div>
                        <select id="Spec" name="Spec" class="form-control custom-select bg-white border-left-0 border-md">
                            <option value="">Choose your Department</option>
                            <option value="">TI</option>
                            <option value="">GM</option>
                            <option value="">GP</option>
                            <option value="">GI</option>
                            <option value="">Co</option>
                        </select>
                    </div>

                    <!-- Password -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                 <br>
                            </span>
                        </div>
                        <input  type="text" name="password" placeholder="Password" class="form-control bg-white border-left-0 border-md">
                    </div>

                    <!-- Password Confirmation -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                 <br>
                            </span>
                        </div>
                        <input  type="text" name="passwordConfirmation" placeholder="Confirm Password" class="form-control bg-white border-left-0 border-md">
                    </div>


                     <!-- role -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                 <br>
                            </span>
                        </div>
                        <input  type="text" name="role" placeholder="role" class="form-control bg-white border-left-0 border-md">
                    </div>
                    <br>
                    
                    <!-- Submit Button -->
                    <div class="form-group col-lg-12 mx-auto mb-0">
                    <input class="btn btn-primary btn-block py-2" type="submit" value="inscrit" name="action">
                           
                    </div>

                   

                    <!-- Already Registered -->
                    <div class="text-center w-100">
                        <p class="text-muted font-weight-bold">Already Registered? <a href="login.jsp" class="text-primary ml-2">Login</a></p>
                    </div>

                </div>
            </form>
        </div>
    </div>
</div>

</body>

<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/jquery-3.3.1.slim.min.js"></script>
<script src="js/regjs.js"></script>
</html>

