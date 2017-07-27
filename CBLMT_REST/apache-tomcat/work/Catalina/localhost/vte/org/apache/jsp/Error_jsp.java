package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.text.*;
import javax.servlet.jsp.JspException;

public final class Error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <title>Web Forms Error</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"webform.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <style>\r\n");
      out.write("    <!--\r\n");
      out.write("    .login-button-section {  padding: 5px; font-family: Arial,Helvetica, sans-serif;  font-weight:normal; color: #000000; background-color:#DDDDDD; }\r\n");
      out.write("    .noframe-framing-table  {  background-image: none; border-right: 1px solid #000000; border-bottom: 1px solid #000000; border-top: 1px solid #000000; border-left: 1px solid #000000; }\r\n");
      out.write("    .column-head {  padding-left: .35em; padding-top: .35em; padding-bottom: .35em; font-family: Arial,Helvetica, sans-serif; font-size: 77.0%; font-weight:bold; text-align: left; color: #FFFFFF; background-color: #8691C7; background-image: none; }\r\n");
      out.write("    .login {  text-align: center; }\r\n");
      out.write("    .table-text {padding-left: .5em; padding-right: .5em; font-family: Arial,Helvetica, sans-serif; font-size:70.0%; background-color: #F7F7F7; background-image: none;}\r\n");
      out.write("    .table-text-empty {  background-color: #F7F7F7;}\r\n");
      out.write("    -->\r\n");
      out.write("    </style>\r\n");
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
      out.write("<br><br><br><br>\r\n");
      out.write("\r\n");

    String message = "";

    if (exception != null) {
		if(exception instanceof javax.servlet.jsp.JspException) {
			javax.servlet.jsp.JspException jspException = (javax.servlet.jsp.JspException)exception;
			if(jspException.getRootCause() != null) {
				exception= (Exception)jspException.getRootCause();
			} 
		}
        message = exception.getMessage();
        com.tplus.transform.util.log.Log log = com.tplus.transform.util.log.LogFactory.getLog("stm");
        if(exception instanceof RuntimeException) {
            message = "Unexpected error while processing request.<br>Detail: " + message;
            log.error("Unexpected error while processing request " + request.getRequestURI() + request.getQueryString(), exception);
        }
        else if(exception instanceof Exception) {
            message = "Unexpected error while processing request.<br>Detail: " + message;
            log.error("Unexpected error while processing request " + request.getRequestURI() + request.getQueryString(), exception);
        }
    }
    else {
        message = "<i>No message reported</i>";
    }
	if(exception != null) {
		exception.printStackTrace();
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" >\r\n");
      out.write("\t\t<tr> \r\n");
      out.write("\t\t\t<td  class=\"login\">   \t\r\n");
      out.write("\t\t\t\t<table class=\"noframe-framing-table\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"400\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\" class=\"column-head\" scope=\"rowgroup\"><IMG src=\"images/error.gif\" border=\"0\" />Error&nbsp;&nbsp;</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"table-text-empty\" colspan=\"2\" height=\"30\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"table-text\" width=\"400\" colspan=\"2\" >\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( message );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"table-text-empty\" colspan=\"2\" height=\"30\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"login-button-section\" valign=\"center\" colspan=\"2\" nowrap align=\"center\"> \r\n");
      out.write("\t\t\t\t\t            <span align=\"center\" valign=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"LookupButtonStyle\" href= \"javascript:window.history.back();\">&nbsp;&nbsp;Return&nbsp;&nbsp;</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
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
      out.write("</html>\r\n");
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
