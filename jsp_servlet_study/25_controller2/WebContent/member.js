function checkLogin() {
	//로그인 : id, pw 필수
	form = document.formLogin;
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
	form.submit();
}

function checkJoin() {
	//회원가입 : id, pw & check, email 필수
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
	if (form.email.value == "") {
		alert("Email is required");
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

function checkModify() {
	//정보수정 : id, pw & check, email 필수
	form = document.formModify;
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
	if (form.email.value == "") {
		alert("Email is required");
		form.pw_check.focus();
		return;
	}
	if (form.name.value == "") {
		alert("Name is required");
		form.pw_check.focus();
		return;
	}
	if (form.address.value == "") {
		alert("Address is required");
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