<!-- This page allows the user to edit their profile data -->

<?PHP
	session_start();
	// this page is blocked if the user is not currently logged in
	if (!(isset($_SESSION['login']) && $_SESSION['login'] != '')) { 
		header ("Location: blocked.html");
	}
?>

<!DOCTYPE html>
	<head>
		<title>Edit Profile</title>
		<link href="style.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>
		<div id="header">
			<h3>
				<!-- Line below lets the user know who is logged on --> 
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

		<?php
			mysql_connect("localhost", "CIT", "CPT283") or die(mysql_error()); 
			mysql_select_db("Fall2014") or die(mysql_error());

				// check to see if user name field is empty
				if(isset($_POST['name']) && !empty($_POST['name'])){
					$fname = mysql_escape_string($_POST['fname']); 
					$lname = mysql_escape_string($_POST['lname']);
					$age = mysql_escape_string($_POST['age']);
					$gender = mysql_escape_string($_POST['gender']);
					$zip = mysql_escape_string($_POST['zip']);
					$msg = 'Record updated successfully!';
				
				// insert profile data into the table
				mysql_query("INSERT INTO JSJ_member WHERE username=".$_SESSION['username']." (f_name, l_name, age, gender, zip) 
							 VALUES ('". mysql_escape_string($fname) ."',
									 '". mysql_escape_string($lname)."',
									 '". mysql_escape_string($age)."',
									 '". mysql_escape_string($gender) ."', 
									 '". mysql_escape_string($zip) ."')")                             
									 or die(mysql_error()); 
				}                    
		?> 

		<div id="section">
			<p>You can edit your profile information here.</p>
			
			<!-- Status msg for the form -->
			<?php if(isset($msg)){echo '<div class="statusmsg">'.$msg.'</div>';} ?>
			
			<!-- Profile Edit Form --> 
			<form action="" method="post">
				<fieldset>
					<legend>Account Details</legend>
					<p><label class="field" for="fname">First Name:<input type="text" name="fname" class="textbox-150"/></p>
					<p><label class="field" for="lname">Last Name:<input type="text" name="lname" class="textbox-150"/></p>
					<p><label class="field" for="age">Age:<input type="number" name="age" min="1" max="127" class="textbox-150"/></p>
					<p><label class="field" for="gender">Gender:<input type="text" name="gender" class="textbox-150"/></p>
					<p><label class="field" for="zip">Zip:<input type="number" name="zip" class="textbox-150"/></p> 
					<p><input type="submit" class="submit_button" value="Submit" /></p>
				</fieldset>
			</form>
		</div>
		
		<div id="footer">Developed by Jamison Jones</div>
	</body>
	
</html>