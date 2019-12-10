function validate() {
	var name = document.getElementById("name").value;
	var mid = document.getElementById("mid").value;
	var salary = document.getElementById("salary").value;
	if (salary == '') {
		alert('Please enter a valid salary.');
		return false;
	}
	else if(mid ==''){
		alert('Please enter a valid mid.');
		return false;
	}
	else if(name ==''||(!isNaN(name)){
		alert('Please enter a valid name.');
		return false;
	}
	else{
		
		return true;
	}

	
}
