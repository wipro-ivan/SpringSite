
function checkPassword(){
	var enteredPassword = document.forms["registrationForm"]["pwd"].value;
	var confirmationPassword = document.forms["registrationForm"]["pwdConfirmation"].value;
if(enteredPassword != confirmationPassword){
	document.getElementById('errMessage').innerHTML = "passwords dont match";	
}
}