<!-- This is the guest page -->

<?PHP session_start(); ?>

<!DOCTYPE html>
	
	<head>
		<title>Guest Page</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>
		<div id="header">
			<h3>
				<!-- Lets the user know that they are logged in as a guest -->
				<?php echo "You are logged in as Guest ..."; ?>
				<a href="index.html" style="float: right"> Home </a>                  
				<a href=" create.php "style="float: right"> Register </a>
				<a href=" login.php " style="float: right"> Login </a>
				<a href="user.php" style="float: right"> Members </a>
			</h3>
		</div>

		<!-- Page content -->
		<div id="section">
			<p>	Not much going on here in the guest area. Sign-up for more content! </p>
		</div>
	</body>
	
</html>