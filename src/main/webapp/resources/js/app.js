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
				location.href = app.x()+"/move/member/login";
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