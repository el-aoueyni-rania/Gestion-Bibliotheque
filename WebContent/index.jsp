<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | E-Biblio</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>
	<header id="header"><!--header-->
		<div class="header_top"><!--header_top-->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
								<li><a href="#"><i class="fa fa-phone"></i> +2 78 569 258</a></li>
								<li><a href="#"><i class="fa fa-envelope"></i> info@domain.com</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="social-icons pull-right">
							<ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
								<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
								<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header_top-->

		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="index.jsp"><img src="images/home/logo.png" alt="" /></a>
						</div>
						
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><a href="profil.jsp" alt=""><i class="fa fa-user"></i> Account</a></li>
								<li><a href="http://localhost:8081/GestionBib/ServletUtilisateurs" alt=""><i class="fa fa-users"></i> Utilisateurs</a></li>									
								<li><a href="ServletEmprunts" alt=""><i class="fa fa-book"></i> Emprunts</a></li>
								<li><a href="http://localhost:8081/GestionBib/ServletMessages" alt=""><i class="fa fa-envelope"></i> Messages</a></li>						
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-middle-->
	
		<div class="header-bottom"><!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="index.jsp" class="active">Home</a></li>
								

								
								
							</ul>
						</div>
					</div>
					
				</div>
			</div>
		</div><!--/header-bottom-->
	</header><!--/header-->
	
	<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						<!--Partie Caroussel illi theb alliha Montehe xD-->
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>E</span>-Biblio</h1>
									<h2>Bibliotheque Iset Bizerte</h2>
									<p>Cette Bibliothèque contient plusieurs catégories (Informatique , Mécanique , Eléctrique , Commerce , Génie des procédés ... ) </p>
									<a href="index.jsp" type="button" class="btn btn-default get">Consulter	</a>
								</div>
								<div class="col-sm-6">
									<img src="images/home/biblio.png" class="girl img-responsive" alt="" />
									
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1><span>Emprunter </span>des documents</h1>
									
									<p>Choisir votre département et emprunter des documents qui vous aidez dans votre études </p>
									<br><br><br><br>
								</div>
								<div class="col-sm-6">
									<img src="images/home/emprr.png" class="girl img-responsive" alt="" />
									
								</div>
							</div>
							
						</div>
						
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</section><!--/slider-->
	                                   <!--Container elli fiih el Ktoba -->
									            <!--/category-Books-->
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Catégories</h2>
						<div class="panel-group category-Book" id="accordian"><!--category-products-->
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a  href="http://localhost:8081/GestionBib/ServletDocumentsInfo">
											Informatique
										</a>
									</h4>
								</div>
								
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a  href="http://localhost:8081/GestionBib/ServletDocumentsElec">											
											Electrique
										</a>
									</h4>
								</div>
								
							</div>
							
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a  href="http://localhost:8081/GestionBib/ServletDocumentsMec">
											Mécanique										
										</a>
									</h4>
								</div>
								
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a  href="http://localhost:8081/GestionBib/ServletDocumentsProc">
											Génie des procédés
										</a>
									</h4>
								</div>							
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a  href="http://localhost:8081/GestionBib/ServletDocumentsCom">
											Commerce
										</a>
									</h4>
								</div>								
							</div>
							
							
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a  href="http://localhost:8081/GestionBib/ServletDocumentsAutre">
											Autres
										</a>
									</h4>
								</div>								
							</div>
							
							
					</div>	
					</div>
				</div>
				
				<div class="col-sm-9 padding-right">
					<div class="features_items"><!--Biblio-->
						<h2 class="title text-center">La Bibliotheque</h2>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
										<div class="productinfo text-center">
											<img width="100" height="150" src="images/home/infoo.jpg" alt="" />
											<h2>----</h2>
											<p>Departement Informatique</p>
											<a href="http://localhost:8081/GestionBib/ServletDocumentsInfo" class="btn btn-default add-to-cart">Consulter</a>
										</div>
										
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/home/elec.jpg" alt="" />
										<h2>----</h2>
											<p>Departement Genie Electrique</p>
										<a href="http://localhost:8081/GestionBib/ServletDocumentsElec" class="btn btn-default add-to-cart">Consulter</a>
									</div>
									
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/home/mec.jpg" alt="" />
										<h2>----</h2>
											<p>Departement Genie Mecanique</p>
										<a href="http://localhost:8081/GestionBib/ServletDocumentsMec" class="btn btn-default add-to-cart">Consulter</a>
									</div>						
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/home/proc.jpg" alt="" />
										<h2>----</h2>
											<p>Departement Genie Des Procedes</p>
										<a href="http://localhost:8081/GestionBib/ServletDocumentsProc" class="btn btn-default add-to-cart">Consulter</a>
									</div>						
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/home/com.jpg" alt="" />
										<h2>----</h2>
											<p>Departement Commerce</p>
										<a href="http://localhost:8081/GestionBib/ServletDocumentsCom" class="btn btn-default add-to-cart">Consulter</a>
									</div>						
								</div>
							</div>
						</div>
						
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/home/autr.jpg" alt="" />
										<h2>----</h2>
											<p>Autres</p>
										<a href="http://localhost:8081/GestionBib/ServletDocumentsAutre" class="btn btn-default add-to-cart">Consulter</a>
									</div>						
								</div>
							</div>
						</div>
						
											
						
					</div><!--features_items-->
					
					
							
						</div>
					</div><!--/category-tab-->

				</div>
	</section>
	
	<footer id="footer"><!--Footer-->
		<div class="footer-top">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="companyinfo">
							<h2><span>E</span>-Biblio</h2>
							<p>Cette Bibliothèque contient plusieurs catégories (Informatique , Mécanique , Eléctrique , Commerce , Génie des procédés ... ) </p>
						</div>
					</div>
					<div class="col-sm-7">
						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="images/home/iframe1.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								
							</div>
						</div>
						
						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="images/home/iframe2.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								
							</div>
						</div>
						
						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="images/home/iframe3.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								
							</div>
						</div>
						
						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="images/home/iframe4.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="address">
							<img src="images/home/map.png" alt="" />
							<p>Route Menzel Abderrahmen â€“ Zarzouna Bizerte 7021</p>
						</div>
					</div>
				</div>
			</div>
		</div>

	</footer><!--/Footer-->

  
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>