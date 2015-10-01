<!-- This is the members' section -->

<?PHP
	session_start();
	// this page is blocked if the user is not currently logged on
	if (!(isset($_SESSION['login']) && $_SESSION['login'] != '')) {
		header ("Location: blocked.html");
	}	
?>

<!DOCTYPE html>
	<head>
		<title>Members' Page</title>
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
			<a href="" id="edit"> Link1 </a><br>
			<a href="" id="reset"> Link2 </a><br>
			<a href="" id="delete"> Link3 </a><br>
		</div>

		<div id="section">
			<h1>Hello</h1>
			<p> Welcome to the members' area! You can take a look at all the member exclusive content by checking out the links to your left. Also, you can check out the "My Account" tab above to make changes to your profile or to reset your password. Enjoy! </p>
		</div>

		<div id="footer"> Developed by Jamison Jones </div>
	</body>
	
</html>