	// usage:		startRequest(actionPage,responseDiv)
	// actionPage:	the page which interact with database
	// responseDiv:	whose id will response the result from actionPage
	// design by jzw

	var xmlHttp;
	var ajaxRequestId;
	function setAjaxRequestId(responseDiv){
	ajaxRequestId=responseDiv;}
	function createXMLHttpRequest(){
		try{
			if(window.ActiveXObject){
				xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
			}
			else if(window.XMLHttpRequest){
				xmlHttp=new XMLHttpRequest();
			}
			
		}catch(_e){
			try{
				xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
			}catch(_e){
				xmlHttp=false;
			}
			
		}
		}	
	function startRequest(actionPage,responseDiv){		
		setAjaxRequestId(responseDiv);		
		createXMLHttpRequest();
		xmlHttp.onreadystatechange=handleStateChange;
		xmlHttp.open("GET",actionPage,true);
		xmlHttp.send(null);		
		}
	function handleStateChange(){
		if(xmlHttp.readyState==4){
			if(xmlHttp.status==200){
				document.getElementById(ajaxRequestId).innerHTML=xmlHttp.responseText;
				}else{
				alert("请求的页面有错误");
			}
		}
		
		}