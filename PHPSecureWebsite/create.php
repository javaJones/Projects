<!-- This is the page that allows the user to create an account -->

<!DOCTYPE html >
	<head>
		<title>Registration Page</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>	
		<div id="header">
			<h3>
				Register
				<a href="index.html" style="float: right"> Home </a>
				<a href="logout.php" style="float: right"> Logout </a>
				<a href="guest.php" style="float: right"> Guests </a>          
				<a href="login.php" style="float: right"> Login </a>
				<a href="user.php" style="float: right"> Members </a>
			</h3>
		</div>
		  
		<div id="wrap">
			<?php
				mysql_connect("localhost", "CIT", "CPT283") or die(mysql_error()); 
				mysql_select_db("Fall2014") or die(mysql_error());

					// searches the database if there are matches of the username and email
					if(isset($_POST['name']) && !empty($_POST['name']) AND isset($_POST['email']) && !empty($_POST['email'])){
						$name = mysql_escape_string($_POST['name']); 
						$email = mysql_escape_string($_POST['email']);
						$search = mysql_query("SELECT email, active FROM JSJ_member WHERE email='".$email."' AND active='1'") or die(mysql_error()); 
						$search2 = mysql_query("SELECT username, active FROM JSJ_member WHERE username='".$name."' AND active='1'") or die(mysql_error()); 
						$match  = mysql_num_rows($search);
						$match2  = mysql_num_rows($search2);
							
						// lets the user know that the chosen email is already taken
						if(!eregi("^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$", $email) || $match > 0 ){
							$msg = 'The email you have entered is either invalid or already in use.';
						}
						
						// lets the user that the chosen username is already taken
						if ( $match2 > 0 ){
							$msg = 'That username is already taken!';
						}
							
							// email the user to verify the account 
							else{
							$to      = $email;                  // Send email to our user
							$subject = 'Signup | Verification'; // Give the email a subject 
							$head    = 'From: Jamison Jones';
							
							// the email msg
							$message = '
							 
							Thanks for signing up!
							Your account has been created, you can login with the following credentials after you have activated your account by pressing the url below.
		 
							------------------------
							Username: '.$name.'
							Password: '.$password.'
							------------------------
		 
							Please click this link to activate your account:
							http://24.213.119.247/~jjones53/CPT283/Tests/Final/verify.php?email='.$email.'&hash='.$hash.'
		
							'; 
							 
							mail($to, $subject, $message, $head); // Send 
							$hash = md5( rand(0,1000) ); // link hash  
							$password = rand(1000,5000); // emailed password
							$msg = 'Your account has been made, <br /> 
									please verify it by clicking the activation link below.<br />
									<FORM METHOD="POST" ACTION="http://24.213.119.247/~jjones53/CPT283/Tests/Final/verify.php?email='.$email.'&hash='.$hash.'"><INPUT TYPE="submit" VALUE="Verify"></FORM><br />
									username: '.$name.' <br />
									password: '.$password.'';
							
							// add the new user to the database
							mysql_query("INSERT INTO JSJ_member (username, password, email, hash) 
								VALUES ('". mysql_escape_string($name) ."',
										'". mysql_escape_string(md5($password))."', 
										'". mysql_escape_string($email) ."', 
										'". mysql_escape_string($hash) ."')")
										or die(mysql_error());                     
							}
					}
			?> 
				  
			<h3>Create an Account</h3>
			<p>Please enter your username and email address to create your account</p>

			<!-- Status msg for the form -->
			<?php if(isset($msg)){ echo '<div class="statusmsg">'.$msg.'</div>'; } ?>
			 
			 <!-- Create account form -->
			<form action="" method="post">
				<label for="name">username:</label>
				<input type="text" name="name" value="" />
				<label for="email">email:</label>
				<input type="text" name="email" value="" /> 
				<input type="submit" class="submit_button" value="Submit" />
			</form>
			
		</div>
		
	</body>
</html>