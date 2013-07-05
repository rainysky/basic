<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set value="${pageContext.request.contextPath}" var="webRoot"></c:set>
<link rel="stylesheet" type="text/css" href="${webRoot}/css/default.css"  />
<link rel="stylesheet" type="text/css" href="${webRoot}/js/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${webRoot}/js/themes/icon.css" />
<script type="text/javascript" src="${webRoot}/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${webRoot}/js/jquery.easyui.min.js"></script>
<script type="text/javascript">
		function showMessage(message){
			using(['messager'], function(){
				$.messager.show({
					title:'操作结果',
					msg:message
				});
			});
		}

		function subForm(url){
			$('commonForm').action = url;
			$('commonForm').submit();
		}

		function localUrl(url){
			window.location.href=url;
		}
		function updateTip(message){
			setTimeout("showMessage('"+message+"')",2000);
		}
</script>
<div id="message" style="display:none"></div>
<form method="post" id="commonForm" action=""></form>