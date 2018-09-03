<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<body background="blue">
<table width="100%" height="90">
<tr height="10%">
<td colspan="3" bgcolor="" align="center">
<tiles:insertAttribute name="HEADER"/>
</td>
</tr>
<tr height="80%">
<td width="100%" bgcolor="" align="center">
<tiles:insertAttribute name="BODY"/>
</td></tr>

<tr height="10%">
<td colspan="3" bgcolor="" align="center">
<tiles:insertAttribute name="FOOTER"/>
</td>
</tr>
</table>
</body>
</html>