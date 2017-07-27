package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.tplus.transform.runtime.LookupContext;
import com.tplus.transform.runtime.DataObject;
import com.tplus.transform.runtime.diff.MessageDiffer;
import com.tplus.transform.runtime.DataObjectSection;
import com.tplus.transform.runtime.webforms.summary.SearchHelper;

public final class DiffMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
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
      			"Error.jsp", true, 49152, true);
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Comparison Details </title>\r\n");
      out.write("    <meta http-equiv=\"Cache-control\" content=\"no-cache, no-store, must-revalidate\" >\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"scrollpos.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"lookupbic.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin :0\">\r\n");
      out.write("<table class=\"banner\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" >\r\n");
      out.write("    <tr style=\"background-color: #1d4873;\">\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("            <img style=\"margin-left:10px;border:0px\" src=\"images/volante-logo.gif\" alt=\"Volante\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("            <span style=\"font-size:32pt;font-family:Garamond,sans-serif,Arial;color:white;\">Message Processor</span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\" >\r\n");
      out.write("            <img style=\"margin-right:10px;border:0px\" src=\"images/volante.gif\" alt=\"Volante Technologies\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");

	
	if(session.getAttribute("userName") == null){
		session.setAttribute("userName", "user");
	}
	if(session.getAttribute("userName").equals("admin")) { 

      out.write("\r\n");
      out.write("<!-- no menus if the user is not logged in -->\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" class=\"toolbar\" cellpadding=0 cellspacing=0 border=0>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td class=\"toplinksbold\" nowrap width=\"100%\"></td>\r\n");
      out.write("        <td class=\"toplinks\" nowrap>&nbsp;</td>\r\n");
      out.write("        <td class=\"toplinksdivide\" align=\"right\" nowrap></td>\r\n");
      out.write("        <td class=\"toplinks2\" align=right valign=\"middle\" nowrap>\r\n");
      out.write("                <span class=\"linktop\">&nbsp;&nbsp;\r\n");
      out.write("                    <a href=\"MessagesSearchForm.jsp\" class=\"linktop\" title=\"Message Processor\">\r\n");
      out.write("                        <img style=\"border:0px\" src=\"images/icon-home.gif\" align=\"bottom\" alt=\"Console Home\">&nbsp;Home</a>\r\n");
      out.write("                    <a href=\"NewRawMessage.jsp\" class=\"linktop\" title=\"Create a new message\">New Message</a>\r\n");
      out.write("                    <!-- <a href=\"ChartList.jsp\" class=\"linktop\" title=\"Display Charts\">Charts</a> -->\r\n");
      out.write("                    <a href=\"LoginForm.jsp\" class=\"linktop\">Log Out</a>\r\n");
      out.write("                    <img src=\"images/spacer.gif\" width=\"10px\" alt=\"\">&nbsp;&nbsp;\r\n");
      out.write("                </span>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");

	Object diffNormalizedObj = session.getAttribute("diffObj");
	String updateObj = "false"; 

      out.write("\r\n");
      out.write("<form NAME=\"CloseForm\" METHOD=\"POST\" accept-charset=\"UTF-8\" enctype=\"multipart/form-data\"\r\n");
      out.write("          ACTION=\"CloseForm.jsp\">\r\n");
      out.write("\t\t  \r\n");
      out.write("       <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"90%\" align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>&nbsp</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><h2 align=\"center\">Comparison Report</h2></td>\r\n");
      out.write("\t\t\t</tr>\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border:none\"></td>\r\n");
      out.write("\t\t\t\t<td class=\"DefaultRendererColumnStyle\" style=\"border:none\">\r\n");
      out.write("\t\t\t\t\t<textarea readOnly class=\"DefaultRendererStyle\" rows=\"30\"\r\n");
      out.write("                                          style=\"width:100%;margin-right: 25\">");
      out.print(diffNormalizedObj.toString());
      out.write("</textarea><br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("\t\t   <td></td>\r\n");
      out.write("\t\t\t<td align=\"center\" style=\"LookupButtonStyle\">\r\n");
      out.write("\t\t\t<input type=\"button\" class=\"LookupButtonStyle\" name=\"Return\" value=\"Return\" \r\n");
      out.write("                           onclick=\"window.history.back()\"/>\r\n");
      out.write("\t\t\t<input type=\"submit\" class=\"LookupButtonStyle\" name=\"Close\" value=\"Accept & Close\" />\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("        ");
 
		updateObj = "true";
		session.setAttribute("saveUpdateObj", updateObj);
		
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
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
