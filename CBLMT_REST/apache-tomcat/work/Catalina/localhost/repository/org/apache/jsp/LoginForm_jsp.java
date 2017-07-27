package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import javax.servlet.jsp.JspException;

public final class LoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/banner.html");
    _jspx_dependants.add("/Footer.html");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("    function login(form) {\r\n");
      out.write("        if(form.userName.value==\"\")\r\n");
      out.write("        {\r\n");
      out.write("          alert(\"Please enter your login name.\")\r\n");
      out.write("          return false;\r\n");
      out.write("        }\r\n");
      out.write("        if(form.password.value==\"\")\r\n");
      out.write("        {\r\n");
      out.write("          alert(\"Please enter your password.\")\r\n");
      out.write("          return false;\r\n");
      out.write("        }\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<title>Repository Login</title>\r\n");

	// tell 'header.html' which tab to put forward.
	int tab = -1;
	int level = 1;	

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\"http://www.w3.org/TR/REC-html40/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"header.css\">\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\">\r\n");
      out.write("\r\n");
      out.write("<table class=\"banner\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t <td class=\"corner\">\r\n");
      out.write("\t\t<IMG src=\"images/repositorylogo.gif\" border=\"0\" >\r\n");
      out.write("\t </td>\r\n");
      out.write("\r\n");
      out.write("\t<td class=\"center\">\r\n");
      out.write("\t\t<IMG src=\"images/logo1.jpg\"  border=\"0\" >\r\n");
      out.write("\t</td>\r\n");
      out.write("  \r\n");
      out.write("\t <td class=\"corner\">\r\n");
      out.write("\t\t<a href=\"http://www.volantetech.com\" target=\"_top\" ><IMG src=\"images/volante.gif\" border=\"0\"></a>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\t\r\n");
      out.write("\t<table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\"><IMG src=\"images/slogan.gif\"><td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
 if (exception != null) { 
	if(exception instanceof JspException) {
		if(exception.getMessage() == null) {
			exception = ((JspException)exception).getRootCause();
		}
	}
	exception.printStackTrace();
 } 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
  
	if (request.getQueryString() != null ) {
		out.println("<form action=\"LoginAction.jsp?" + request.getQueryString() + "\" method=\"post\">");
    }
    else {
		out.println("<form action=\"LoginAction.jsp\" method=\"post\">");
	}
	//System.out.println("Login queryString = " + 	request.getQueryString());
	session.invalidate();

      out.write("\r\n");
      out.write("\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" >\r\n");
      out.write("\t\t<tr> \r\n");
      out.write("\t\t\t<td>   \t\r\n");
      out.write("\t\t\t\t<table class=\"rect-frame\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"400\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\" class=\"login-column-head\">Login&nbsp;&nbsp;</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" colspan=\"2\" wrap=\"true\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
 if(exception != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" colspan=\"2\" wrap=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" colspan=\"2\" wrap>\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"#FF0000\">\r\n");
      out.write("\t\t\t\t\t\t\t<IMG src=\"images/error.gif\" border=\"0\" /> ");
      out.print( exception.getMessage() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"50\"> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" valign=\"bottom\" width=\"33%\" nowrap align=\"right\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"userName\">User Name:</label> \r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" valign=\"bottom\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"userName\" value=\"\" id=\"userName\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>  \r\n");
      out.write("\t\t\t\t\t\t<tr height=\"50\"> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" valign=\"bottom\" width=\"33%\" nowrap align=\"right\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"password\">Password:</label> \r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" valign=\"bottom\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" value=\"\" id=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"50\"> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-table-text\" colspan=\"2\" wrap>\r\n");
      out.write("\t\t\t\t\t\t\t\tPlease contact your Repository administrator \r\n");
      out.write("\t\t\t\t\t\t\t\tif you do not already have a user name and password.\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"&nbsp;OK&nbsp;\" class=\"button\" onClick=\"return login(this.form)\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>    \r\n");
      out.write("\t");
      out.write("<table width=\"100%\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"right\">\r\n");
      out.write("\t\t<font face=\"verdana, helvitica\" size=\"-2\">\r\n");
      out.write("\t\t\tCopyright © 2002-2010 Volante Technologies, Inc.\r\n");
      out.write("\t\t</font>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"1%\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
