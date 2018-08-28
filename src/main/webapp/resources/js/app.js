"use strict";
var app = app || {};
app = {
		init : x =>{
			console.log("step1");
			app.session.context(x);
			app.onCreate();
		},
		onCreate : ()=>{
			console.log("step3");
			app.setContentView();
			$("#login").click(()=>{
				location.href = app.x()+"/move/enter/member/login";
			});
			$("#logout").click(()=>{
				app.session.removeMember();
				location.href = app.x()+"/member/logout";
			});
			$("#login_btn").click(()=>{
				$("#loginForm").attr({
					action:app.x()+"/member/login",
					method:"POST"
				}).submit();
				
			});
			$("#join").click(()=>{
				location.href = app.x()+"/move/enter/member/add";
			});
			$("#joinBth").click(()=>{
				/*var form = document.getElementById("joinForm");
				form.action = app.x()+"/member/add";
				form.method = "POST";
				form.submit();*/
				/*메소드 체이닝*/
				$('#joinForm').attr({
					action:app.x()+"/member/add",
					method:"POST"
				}).submit();
			});
			$("#modify").click(()=>{
				location.href = app.x()+"/move/enter/member/modify";
			});
			$("#modifyBtn").click(()=>{
				$('#modifyFrom').attr({
					action:app.x()+"/member/modify",
					method:"POST"
				}).submit();
				
			});
			$('remove').click(()=>{
				location.href = app.x()+"/move/enter/member/remove";
			});
			
		},
		setContentView : ()=>{
			console.log("step4 : "+app.j());
		}
};
app.session = {  //session은 위의 init과 동급, attaching property!!
		context : x=>{
			console.log("step2 : "+x);
			sessionStorage.setItem("context",x);
			sessionStorage.setItem("css",x+"/resources/css");
			sessionStorage.setItem("img",x+"/resources/img");
			sessionStorage.setItem("js",x+"/resources/js");
		},
		path : x=>{
			return sessionStorage.getItem(x);
		},
		setMember : x=>{
			if(x != "" && x != null){
				sessionStorage.setItem("member",x);
			}
		},
		removeMember : ()=>{
			sessionStorage.removeItem("member");
		}
}
app.x = ()=>{
	return app.session.path("context");
}
app.j = ()=>{
	return app.session.path("js");
}
app.c = ()=>{
	return app.session.path("css");
}
app.i = ()=>{
	return app.session.path("img");
}
app.member = ()=>{
	return app.session.path("member");
}