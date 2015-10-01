<!-- This is where the user can reset their password -->

<!DOCTYPE html >
	<head>
		<title>Reset Password</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>	
		<div id="header">
			<h3>
				Forgot your password ?
				<a href="index.html" style="float: right"> Home </a>
				<a href="logout.php" style="float: right"> Logout </a>
				<a href="guest.php" style="float: right"> Guests </a>          
				<a href="login.php" style="float: right"> Login </a>
				<a href="user.php" style="float: right"> Members </a>
			</h3>
		</div>
		
		<div id="nav">
			<a href="editpro.php" id="edit"> Edit Profile </a><br>
			<a href="reset.php" id="reset"> Reset Password </a><br>
			<a href="deleteacc.php" id="delete"> Delete Account </a><br>
		</div>
		  
		<div id="wrap">		 
			<?php
			mysql_connect("localhost", "CIT", "CPT283") or die(mysql_error()); 
			mysql_select_db("Fall2014") or die(mysql_error());

				// make sure form is filled out
				if(isset($_POST['name']) && !empty($_POST['name']) AND isset($_POST['email']) && !empty($_POST['email'])){
					$name = mysql_escape_string($_POST['name']); 
					$email = mysql_escape_string($_POST['email']);
					
					// search for account in the database
					$search = mysql_query("SELECT email, active FROM JSJ_member WHERE email='".$email."' AND active='1'") or die(mysql_error()); 
					$search2 = mysql_query("SELECT username, active FROM JSJ_member WHERE username='".$name."' AND active='1'") or die(mysql_error()); 
					$match  = mysql_num_rows($search);
					$match2  = mysql_num_rows($search2);
					
					// notifies user if email provided is not in correct format
					if(!eregi("^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$", $email)/* || $match > 0 */){
						$msg = 'The email you have entered is invalid.';
					}
						 else{ 
							// show new password to user  
							$password = rand(1000,5000); 
							$msg = 'username: '.$name.' <br />
									new pass: '.$password.'';
							
							// update password in the database
							if (mysqli_query("UPDATE JSJ_member SET password='.$password.' WHERE username='.$name.'")) 
							   { echo "Record updated successfully"; } else { echo "Error updating record: " . mysqli_error($conn); }                    
						}
				}
			?> 

			<h3>Reset your password</h3>
			<p>Please enter the username and email address that was used to create your account</p>

			<!-- Status msg for the form -->
			<?php if(isset($msg)){echo '<div class="statusmsg">'.$msg.'</div>';} ?>
				 
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