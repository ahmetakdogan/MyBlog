<%
session.removeAttribute("user_id");
session.removeAttribute("un");
session.invalidate();
response.sendRedirect("index.jsp");
    
%>