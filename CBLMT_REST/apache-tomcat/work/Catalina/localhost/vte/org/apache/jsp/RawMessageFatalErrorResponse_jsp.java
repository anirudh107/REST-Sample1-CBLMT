package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.*;
import com.tplus.transform.runtime.persistence.expression.*;
import java.util.*;
import java.io.*;

public final class RawMessageFatalErrorResponse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"Error.jsp", true, 8192, true);
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

	if (session.getAttribute("userName") == null) {
	
	session.setAttribute("userName", "xy");
	
	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>SWIFT Message Error</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"scrollpos.js\"></script>\r\n");
      out.write("    <META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
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
      out.write("<center>\r\n");
      out.write("    ");

        String responseStr = (String) request.getAttribute("RawMessageResponse");
        if (responseStr == null) {
            responseStr = "";
        }
        String errorStr = (String) request.getAttribute("ErrorResponse");
    
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <FORM NAME=\"RawMessageForm\">\r\n");
      out.write("        <TABLE class=\"TableStyle\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"90%\" align=\"center\">\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD class=\"Header\" height=\"25\">\r\n");
      out.write("                    <p align=\"left\"><b>&nbsp;Response Message</b></p>\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD class=\"DefaultRendererStyle\" colspan=\"2\">\r\n");
      out.write("                    <TEXTAREA NAME=\"RawMessage\" ROWS=\"20\" STYLE=\"WIDTH: 100%;border:none\"\r\n");
      out.write("                              readonly=\"true\">");
      out.print(responseStr);
      out.write("\r\n");
      out.write("                    </TEXTAREA>\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            ");
 if (errorStr != null) { 
      out.write("\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD class=\"Header\" height=\"25\">\r\n");
      out.write("                    <p align=\"left\"><b>&nbsp;Error</b></p>\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD class=\"DefaultRendererStyle\" colspan=\"2\">\r\n");
      out.write("                    <TEXTAREA NAME=\"Error\" ROWS=\"8\" STYLE=\"WIDTH: 100%;border:none;color:red\"\r\n");
      out.write("                              readonly=\"true\">");
      out.print(errorStr);
      out.write("\r\n");
      out.write("                    </TEXTAREA>\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </TABLE>\r\n");
      out.write("    </FORM>\r\n");
      out.write("</center>\r\n");
      out.write("<center>\r\n");
      out.write("    <input type=\"button\" class=\"LookupButtonStyle\" name=\"Return\" value=\"Return\"\r\n");
      out.write("           onclick=\"window.open('NewRawMessage.jsp', '_self')\"/>\r\n");
      out.write("</center>\r\n");
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
