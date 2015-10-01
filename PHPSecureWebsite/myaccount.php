<!-- This is where the user can edit their account -->

<?PHP
	session_start();
	// if user is not logged in this page is blocked
	if (!(isset($_SESSION['login']) && $_SESSION['login'] != '')) {
		header ("Location: blocked.html");
	}
?>

<!DOCTYPE html>
	<head>
		<title>My Account</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>
		<div id="header">
			<h3>
				<!-- Lets the user know who they are logged in as -->
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
			<h1>My Account</h1>
			<p> This is the "My Account" section of this website. Here you can do all sorts of things pertaining to your account. You are able to add/edit your profile data. Users are also able to update their passwords here. Account deletion can also be done here. (but why would you want to do that ??) </p>
		</div>

		<div id="footer"> Developed by Jamison Jones </div>
	</body>
	
</html>