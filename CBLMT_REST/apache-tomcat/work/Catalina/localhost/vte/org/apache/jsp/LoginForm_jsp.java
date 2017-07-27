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
    _jspx_dependants.add("/Header.html");
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
      out.write("<html>\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Web Forms Login</title>\r\n");
      out.write("    <meta http-equiv=\"Cache-control\" content=\"no-cache, no-store, must-revalidate\" >\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("        function login(form) {\r\n");
      out.write("            if (form.userName.value == \"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Please enter your login name.\")\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (form.password.value == \"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Please enter your password.\")\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    ");
session.setAttribute("userName", null); 
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin :0\">\r\n");
      out.write("<table class=\"banner\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("            <img style=\"margin-left:10px;border:0px\" src=\"images/ubs-logo.gif\" alt=\"UBS\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("            <span style=\"font-size:32pt;font-family:Garamond,sans-serif,Arial;color:white;\">UBS MT-Validation Environment Version 0.9.2</span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\" >\r\n");
      out.write("            <img style=\"margin-right:10px;border:0px\" src=\"images/volante.gif\" alt=\"Volante Technologies\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
 if(session.getAttribute("userName") != null) { 
      out.write("\r\n");
      out.write("<!-- no menus if the user is not logged in -->\r\n");
      out.write("<table width=\"100%\" class=\"toolbar\" cellpadding=0 cellspacing=0 border=0>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td class=\"toplinksbold\" nowrap width=\"100%\"></td>\r\n");
      out.write("        <td class=\"toplinks\" nowrap>&nbsp;</td>\r\n");
      out.write("        <td class=\"toplinksdivide\" align=\"right\" nowrap></td>\r\n");
      out.write("        <td class=\"toplinks2\" align=right valign=\"middle\" nowrap>\r\n");
      out.write("                <span class=\"linktop\">&nbsp;&nbsp;\r\n");
      out.write("                    <a href=\"NewRawMessage.jsp\" class=\"linktop\" title=\"Volante Testing Environment\">\r\n");
      out.write("                        <img style=\"border:0px\" src=\"images/icon-home.gif\" align=\"bottom\" alt=\"Console Home\">&nbsp;Home</a>\r\n");
      out.write("                </span>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
 if (exception != null) {
    if (exception instanceof JspException) {
        if (exception.getMessage() == null) {
            exception = ((JspException) exception).getRootCause();
        }
    }
    exception.printStackTrace();
}

      out.write("\r\n");
      out.write("\r\n");

    session.invalidate();
    String requestStr = request.getQueryString();

      out.write("\r\n");
      out.write("<form action='");
      out.print("LoginAction.jsp" + (requestStr == null ? "" :  ("?" + request.getQueryString()) ) );
      out.write("' method=\"post\">\r\n");
      out.write("    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <table class=\"rect-frame\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"400\" align=\"center\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"2\" class=\"login-column-head\">Login&nbsp;&nbsp;</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"login-table-text\" colspan=\"2\" wrap=\"true\">\r\n");
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 if (exception != null) { 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"login-table-text\" colspan=\"2\" wrap=\"true\">\r\n");
      out.write("                            <br/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"login-table-text\" colspan=\"2\" wrap>\r\n");
      out.write("                            <font color=\"#FF0000\">\r\n");
      out.write("                                <IMG src=\"images/error.gif\" border=\"0\"/> ");
      out.print( exception.getMessage() );
      out.write("\r\n");
      out.write("                            </font>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    <tr height=\"50\">\r\n");
      out.write("                        <td class=\"login-table-text\" valign=\"bottom\" width=\"33%\" nowrap align=\"right\">\r\n");
      out.write("                            <label for=\"userName\">User Name:</label>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td class=\"login-table-text\" valign=\"bottom\">\r\n");
      out.write("                            <input type=\"text\" name=\"userName\" value=\"\" id=\"userName\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr height=\"50\">\r\n");
      out.write("                        <td class=\"login-table-text\" valign=\"bottom\" width=\"33%\" nowrap align=\"right\">\r\n");
      out.write("                            <label for=\"password\">Password:</label>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td class=\"login-table-text\" valign=\"bottom\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\" value=\"\" id=\"password\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr height=\"50\">\r\n");
      out.write("                        <td class=\"login-table-text\" colspan=\"2\" wrap>\r\n");
      out.write("                            Please register on the Volante website (<a href=http://volantetech.com>http://volantetech.com</a>) if you \r\n");
      out.write("                            do not already have a user name and password.\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"2\" align=\"center\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                            <input type=\"submit\" name=\"submit\" value=\"&nbsp;OK&nbsp;\" class=\"button\"\r\n");
      out.write("                                   onClick=\"return login(this.form)\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"right\">\r\n");
      out.write("\t\t<font face=\"tahoma\" size=\"-2\">\r\n");
      out.write("\t\t\tCopyright © 2002-2010 Volante Technologies, Inc.\r\n");
      out.write("\t\t</font>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"1%\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"right\">\r\n");
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
