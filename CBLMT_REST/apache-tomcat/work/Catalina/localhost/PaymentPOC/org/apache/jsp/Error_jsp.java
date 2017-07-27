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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Error</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"webform.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("<!--\r\n");
      out.write(".login-button-section {  padding: 5px; font-family: Arial,Helvetica, sans-serif;  font-weight:normal; color: #000000; background-color:#DDDDDD; } \r\n");
      out.write(".noframe-framing-table  {  background-image: none; border-right: 1px solid #000000; border-bottom: 1px solid #000000; border-top: 1px solid #000000; border-left: 1px solid #000000; }\r\n");
      out.write(".column-head {  padding-left: .35em; padding-top: .35em; padding-bottom: .35em; font-family: Arial,Helvetica, sans-serif; font-size: 77.0%; font-weight:bold; text-align: left; color: #FFFFFF; background-color: #8691C7; background-image: none; }  \r\n");
      out.write(".login {  text-align: center; }\r\n");
      out.write(".table-text {padding-left: .5em; padding-right: .5em; font-family: Arial,Helvetica, sans-serif; font-size:70.0%; background-color: #F7F7F7; background-image: none;}\r\n");
      out.write(".table-text-empty {  background-color: #F7F7F7;}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<title>Web Forms Login</title>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

	// tell 'header.html' which tab to put forward.
	int tab = 2;
	int level = 1;
	int row = -1;
	Date startDate = new Date();
	SimpleDateFormat srcFmt = new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy");
	SimpleDateFormat destFmt = new SimpleDateFormat("EEE M/d hh:mm a");
	

      out.write('\r');
      out.write('\n');
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\"/>\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");

	//include java.util package in the .jsp that includes this
	// Get today's date to print out in the table
        java.text.SimpleDateFormat formatter
            = new java.text.SimpleDateFormat ("'<small>'EEEE '-' MMMM'</small>' d");
        Date currentTime_1 = new Date();
        String dateString = formatter.format(currentTime_1);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"banner\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("            <img style=\"margin-left:10px;border:0px\" src=\"images/volante-logo.gif\" alt=\"Volante\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("            <span style=\"font-size:24pt;font-family:Garamond,sans-serif,Arial;color:white;\">Payment Accelerator - Dashboard</span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\" >\r\n");
      out.write("            <img style=\"margin-right:10px;border:0px\" src=\"images/volante.gif\" alt=\"Volante Technologies\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 if (tab != -1) {

      out.write("\r\n");
      out.write("<table class=\"tabMenu\" border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("\r\n");
      out.write("        <td class='");
      out.print( tab==1 ? "tabActive" : "tabInActive");
      out.write("' width=\"150\">\r\n");
      out.write("            <A class='");
      out.print( (tab==1 ? "LNKACTIVE" : "LNK") );
      out.write("' href=\"MessagesSearchForm.jsp\">Search</a>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td  width=\"150\" class='");
      out.print( tab==2 ? "tabActive" : "tabInActive");
      out.write("'>\r\n");
      out.write("        \t<table   width=\"100%\" id=\"menu1\" class=\"ddmx\" border=\"0\">\r\n");
      out.write("\t\t\t    <tr >\r\n");
      out.write("\t\t\t        <td  width=\"150\" nowrap=\"true\" >\r\n");
      out.write("\t\t\t            <a class='item1 ");
      out.print( (tab==2 ? "LNKACTIVE" : "LNK") );
      out.write("' href=\"javascript:void(0)\" width=\"100%\">Payment Processing</a>\r\n");
      out.write("\t\t\t            <!-- -->\r\n");
      out.write("\t\t\t            <div class=\"section\" width=\"100%\">\r\n");
      out.write("\t\t\t                <a class=\"item2\" href=\"InputRawMessage.jsp\" >Raw Message</a>\r\n");
      out.write("\t\t\t                <a class=\"item2\" href=\"PaymentInfoForm.jsp\">Payment Input</a>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t        </td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("       <!--  <td class='");
      out.print( tab==3 ? "tabActive" : "tabInActive");
      out.write("' width=\"150\">\r\n");
      out.write("            <A class='");
      out.print( (tab==3 ? "LNKACTIVE" : "LNK") );
      out.write("' href=\"FXSummary.jsp\">FX Conversion</a>\r\n");
      out.write("        </td> -->\r\n");
      out.write("\r\n");
      out.write("        <td class='");
      out.print( tab==4 ? "tabActive" : "tabInActive");
      out.write("' width=\"80\">\r\n");
      out.write("            <A class='");
      out.print( tab==4 ? "LNKACTIVE" : "LNK");
      out.write("' href=\"NewRawMessage.jsp\">Response Flow</a>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class='");
      out.print( tab==4 ? "tabActive" : "tabInActive");
      out.write("' width=\"80\">\r\n");
      out.write("            <A class='");
      out.print( tab==4 ? "LNKACTIVE" : "LNK");
      out.write("' href=\"ChartList.jsp\">Charts</a>\r\n");
      out.write("        </td>\r\n");
      out.write("\r\n");
      out.write("        ");
 String userName = (String)session.getAttribute("userName") ;
        if (!request.getServletPath().equals("/LoginForm.jsp") && userName != null) {
        
      out.write("\r\n");
      out.write("        <td class=\"tabUserName\">\r\n");
      out.write("            [<A class=\"LNK\" href=\"LoginForm.jsp\"> Logout ");
      out.print( userName);
      out.write("</a>]\r\n");
      out.write("        </td>\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("        <td class=\"tabDate\" width=\"135\">\r\n");
      out.write("            ");
      out.print( dateString );
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"1%\" bgcolor=\"#19355D\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- Needed to initialize drop down menu -->\r\n");
      out.write("<script type=\"text/javascript\" src =\"DropDownMenuX.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var ddmx = new DropDownMenuX('menu1');\r\n");
      out.write("ddmx.delay.show = 0;\r\n");
      out.write("ddmx.delay.hide = 400;\r\n");
      out.write("ddmx.position.levelX.left = 0;\r\n");
      out.write("ddmx.position.levelX.top = 0;\r\n");
      out.write("ddmx.init();\r\n");
      out.write("</script>\r\n");
 }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("\r\n");

    String message = "";
    String debugInfo = "";

    if (exception != null) {
		if(exception instanceof javax.servlet.jsp.JspException) {
			javax.servlet.jsp.JspException jspException = (javax.servlet.jsp.JspException)exception;
			if(jspException.getRootCause() != null) {
				exception= (Exception)jspException.getRootCause();
			}
		}
        message = exception.getMessage();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        exception.printStackTrace(pw);
        debugInfo = "<pre>" + sw.toString() + "</pre>";
    }
    else {
        message = "<i>No message reported</i>";
        debugInfo = "<i>No details available</i>";
    }
	if(exception != null) {
		exception.printStackTrace();
	}
	
	String returnPage= "WebFormIndex.jsp";

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
      out.write("\t\t\t\t\t\t\t<td class=\"table-text\" colspan=\"2\" wrap>\r\n");
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
      out.write("\t\t\t\t\t            <SPAN align=\"center\" valign=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"LookupButtonStyle\" href= \"javascript:window.history.back();\">&nbsp;&nbsp;Return&nbsp;&nbsp;</a> \r\n");
      out.write("\t\t\t\t\t\t\t\t</SPAN>\r\n");
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
      out.write("\t\t<font face=\"verdana\" size=\"-2\">\r\n");
      out.write("\t\t\tCopyright © 2008- 2010 Volante Technologies\r\n");
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
