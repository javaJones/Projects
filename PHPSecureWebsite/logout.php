<!-- This will destroy the session and log the current user out -->

<?PHP
	session_start();
	session_destroy();
	header ("Location: logoutredirect.html");
?>
