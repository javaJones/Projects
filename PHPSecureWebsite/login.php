<!-- Login Page -->

<?php session_start() ?>

<!DOCTYPE html>
	
	<head>
		<title>Login</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>
		 
		<div id="header">
			<h3>Login			
				<a href="index.html" style="float: right"> Home </a>
				<a href="logout.php" style="float: right"> Logout </a>
				<a href="guest.php" style="float: right"> Guests </a>          
				<a href="create.php"style="float: right"> Register </a>
				<a href="user.php" style="float: right"> Members </a>
			</h3>
		</div>
			 
		<div id="wrap">
			<?php
				mysql_connect("localhost", "CIT", "CPT283") or die(mysql_error());
				mysql_select_db("Fall2014") or die(mysql_error());
				
				// checks for empty fields in the form
				if(isset($_POST['name']) && !empty($_POST['name']) AND isset($_POST['password']) && !empty($_POST['password']))
					{
						$username = mysql_escape_string($_POST['name']);
						$password = mysql_escape_string(md5($_POST['password']));         
						
						// search for user in the database
						$search = mysql_query("SELECT username, password, active FROM JSJ_member WHERE username='".$username."' AND password='".$password."' AND active='1'") or die(mysql_error()); 
						$match  = mysql_num_rows($search);
					}       
					
					// log user in if credentials are correct
					if ($match > 0){
						session_start();
						$_SESSION["username"] = $username;
						$_SESSION["pass"] = $password;
						$_SESSION["login"] = "1";
						header("Location:user.php");
					
					// notify the user of failed login attempt
					} else {
						$msg = 'Login Failed! Please make sure that you enter the correct details and that you have activated your account.<br /> <a href="forgotpass.php" style="color:blue"> Forgot Password? </a>';
						session_start();
						$_SESSION["login"]='';
					}
			?>
			
			<h3>Login</h3>
			<p>Please enter your username and password to login</p>

			<!-- Form status msg -->
			<?php if(isset($msg)){ echo '<div class="statusmsg">'.$msg.'</div>'; }?>
			
			<!-- Login form -->
			<form action="" method="post">
				<label for="name">username:</label>
				<input type="text" name="name" value="" />
				<label for="password">password:</label>
				<input type="password" name="password" value="" />	
				<input type="submit" class="submit_button" value="Login" />
			</form>
		</div>
	</body>
	
</html>