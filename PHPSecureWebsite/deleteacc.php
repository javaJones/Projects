<!-- This is where a user can delete their account -->

<?PHP
	session_start();
	// this page is blocked if the user is not currently logged in
	if (!(isset($_SESSION['login']) && $_SESSION['login'] != '')) {
		header ("Location: blocked.html");
	}
?>

<!DOCTYPE html>
	<head>
		<title>Deactivate Account</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>	 
		<div id="header">
			<h3>
				<!-- Lets the user know who is currently logged in -->
				<?php echo "You are logged in as ".$_SESSION['username']." !"; ?>
				<a href="index.html" style="float: right"> Home </a>
				<a href="logout.php" style="float: right"> Logout </a>         
				<a href="user.php" style="float: right"> Members </a>
				<a href="myaccount.php" style="float: right"> My Account </a>		  
			</h3>
		</div>

		<div id="nav">
			<a href="editpro.php" id="edit"> Edit Profile </a><br>
			<a href="reset.php" id="reset"> Reset Password </a><br>	
			<a href="deleteacc.php" id="delete"> Delete Account </a><br>
		</div>

		<div id="section">
			<p>You don't want to, but you can delete your account here.</p>
		</div>

		<div id="footer">
			Developed by Jamison Jones
		</div>
	</body>
	
</html>