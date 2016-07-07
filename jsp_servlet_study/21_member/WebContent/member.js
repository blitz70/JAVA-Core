function checkJoin() {
	form = document.formJoin;
	if (form.id.value == "") {
		alert("ID is required");
		form.id.focus();
		return;
	};
	if (form.pw.value == "") {
		alert("Password is required");
		form.pw.focus();
		return;
	}
	if (form.pw_check.value == "") {
		alert("Password is required");
		form.pw_check.focus();
		return;
	}
	if (form.pw.value != form.pw_check.value) {
		alert("Password check failed");
		form.pw_check.focus();
		return;
	}
	form.submit();
}