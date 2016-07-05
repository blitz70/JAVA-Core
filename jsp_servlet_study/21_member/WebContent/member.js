function joinFormat() {
	
	if (document.join_form.pw.value == "") {
		alert("no password");
		document.join_form.focus();
		return;
	};
	
	document.join_form.submit();
	
}