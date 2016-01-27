<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	java.util.Date today = new java.util.Date();
	String showDate = "";
	java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd (EEE)", pageContext.getResponse().getLocale());
	showDate = formatter.format(today);

%>
<script>
function openLink(link) {
	if (!inputFormActiveIndicator_g) {
		blockPageUi();
		window.location = link;
		return;
	}
	generalJqDialog_g.fnShowGeneralConfirmDialog(
		"Confirm",
		"OK",
		generalJqDialog_g.buttonContinue, function() {
			blockPageUi();
			window.location = link;
	});
}
function globalChangeLocale(locale) {
	if (window.refreshFormWithLocale != null) {
		refreshFormWithLocale(locale);
	} else {
		var href = location.href;
		var idx = href.indexOf('?');
		var qs;
		if (idx == -1) {
			if (location.href.lastIndexOf("#") == (location.href.length - 1) &&
				location.href.lastIndexOf('/') == (location.href.length - 2)) {
				location = "${pageContext.request.contextPath}/home?lang=" + locale;
			} else {
				if (location.href.lastIndexOf("#") == (location.href.length - 1)) {
					location = location.href.substring(0, location.href.length - 1) + "?lang=" + locale;
				} else if (location.href.lastIndexOf("#") > 0) {
					var _st = location.href.lastIndexOf("#");
					location = location.href.substring(0, _st) + "?lang=" + locale + location.href.substring(_st);
				} else {
					location = location.href + "?lang=" + locale;
				}
			}
			return;
		}
		var loc = href.substring(0, idx);
		qs = href.substring(idx);
		var idx2 = qs.lastIndexOf("#");
		if (idx2 != -1) {
			qs = qs.substring(0, idx2);
		}
		var newqs = changeParameter(qs, "lang", locale);
		//location = loc + newqs;
		if (idx2 != -1) {
			location = loc + newqs + href.substring(href.lastIndexOf("#"));
		} else {
			location = loc + newqs;
		}
	}
}
function changeParameter(qs, param, value) {
	var newqs = qs;
	var idx2=-1;
	idx = qs.indexOf(param+'=');
	if (idx!=-1) {
		idx2 = qs.indexOf('&', idx+1);
		newqs = qs.substring(0, idx);
	}
	if (idx2!=-1) {
		newqs += qs.substring(idx2+1);
	}
	var pValue = param + "=" + value;
	if (newqs.lastIndexOf("&") != newqs.length-1 && newqs.lastIndexOf("?") != newqs.length - 1) {
		pValue = "&" + pValue;
	}
	return newqs + pValue;
}
</script>







