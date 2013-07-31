<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>
		<g:layoutTitle default="Java,J2EE,Database,Grails,Groovy,Eclipse" />
	</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- IMAGES -->
	<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
	<!-- 
	<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}"> 
	<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
	-->
		
	<!-- CSS -->	
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'flexslider.css')}" type="text/css">
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'jquery.tweet.css')}" type="text/css">
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'superfish.css')}" type="text/css">
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'lessframework.css')}" type="text/css">
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'skin.css')}" type="text/css">
	
	<!-- GOOGLE FONTS -->
	<link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,300' rel='stylesheet' type='text/css'>

	<g:layoutHead />
	<r:layoutResources />
</head>
<body lang="en">
	<g:include controller="index" action="showHeader" />
	<div id="main">
		<div class="wrapper clearfix">
			<g:layoutBody />
			<!-- sidebar -->
	        	<aside id="sidebar">
	        		<ul>
		        		<li class="block">
			        		<h4>CATEGORIES</h4>
							<ul>
								<li class="cat-item"><a href="#" title="View all posts">Film and video</a></li>
								<li class="cat-item"><a href="#" title="View all posts">Print</a></li>
								<li class="cat-item"><a href="#" title="View all posts">Photo and lomo</a></li>
								<li class="cat-item"><a href="#" title="View all posts">Habitant morbi</a></li>
								<li class="cat-item"><a href="#" title="View all posts">Film and video</a></li>
								<li class="cat-item"><a href="#" title="View all posts">Print</a></li>
								<li class="cat-item"><a href="#" title="View all posts">Photo and lomo</a></li>
								<li class="cat-item"><a href="#" title="View all posts">Habitant morbi</a></li>
							</ul>
		        		</li>
		        		<li class="block">
			        		<h4>ARCHIVES</h4>
							<ul>
								<li class="cat-item"><a href="#" title="View all posts">January</a></li>
								<li class="cat-item"><a href="#" title="View all posts">February</a></li>
								<li class="cat-item"><a href="#" title="View all posts">March</a></li>
							</ul>
		        		</li>
		        		<li class="block">
			        		<h4>TEST</h4>
							<ul>
								<li class="cat-item"><a href="#" title="View all posts">January</a></li>
								<li class="cat-item"><a href="#" title="View all posts">February</a></li>
								<li class="cat-item"><a href="#" title="View all posts">March</a></li>
							</ul>
		        		</li>
	        		</ul>
	        		<em id="corner"></em>
	        	</aside>
				<!-- ENDS sidebar -->
		</div>
	</div>
	<g:include controller="index" action="showFooter" />
	<g:javascript library="application" />
	<r:layoutResources />
</body>
</html>
