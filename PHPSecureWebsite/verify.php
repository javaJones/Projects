<!-- This page allows the user to verify their account -->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
 
	<html xmlns="http://www.w3.org/1999/xhtml">
	
	<head>
		<title>Verify</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>

	<body>
		<div id="header">
			<h3>
				Verify
				<a href="index.html" style="float: right"> Home </a>
				<a href="logout.php" style="float: right"> Logout </a>
				<a href="guest.php" style="float: right"> Guests </a>         
				<a href=" create.php "style="float: right"> Register </a>
				<a href=" login.php " style="float: right"> Sign In </a>
		   </h3>
		</div>
		     
		<div id="wrap">
			<?php
				mysql_connect("localhost", "CIT", "CPT283") or die(mysql_error()); 
				mysql_select_db("Fall2014") or die(mysql_error()); 
				
				// make sure form fields are filled out
				if(isset($_GET['email']) && !empty($_GET['email']) AND isset($_GET['hash']) && !empty($_GET['hash'])){
					$email = mysql_escape_string($_GET['email']); 
					$hash = mysql_escape_string($_GET['hash']); 
					
					// search for account that was just created
					$search = mysql_query("SELECT email, hash, active FROM JSJ_member WHERE email='".$email."' AND hash='".$hash."' AND active='0'") or die(mysql_error()); 
					$match  = mysql_num_rows($search);
				
					// set account to active (1) if it is found in the database
					if($match > 0){
						mysql_query("UPDATE JSJ_member SET active='1' WHERE email='".$email."' AND hash='".$hash."' AND active='0'") or die(mysql_error());
							echo '<div class="statusmsg">Your account has been activated, you can now login</div>';
					}
						
						// notify the user if the account has already been activated or invalid link
						else{
							echo '<div class="statusmsg">The url is either invalid or you already have activated your account.</div>';
						}
						 
				}
						// notify the user of invalid approach from just typing the link into the url
						else{
							echo '<div class="statusmsg">Invalid approach, please use the link provided.</div>';            
						} 
			?>
		</div>
	</body>
	
</html>