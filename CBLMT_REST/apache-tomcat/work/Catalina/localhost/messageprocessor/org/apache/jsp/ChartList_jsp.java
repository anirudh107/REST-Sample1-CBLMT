package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import javax.servlet.jsp.JspException;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.servlet.ServletUtilities;
import com.tplus.transform.runtime.*;
import org.jfree.data.general.PieDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.util.TableOrder;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeriesCollection;
import com.tplus.transform.util.SequencedHashMap;
import org.jfree.data.time.Day;

public final class ChartList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/Footer.html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 if(session.getAttribute("userName") == null){
	session.setAttribute("userName", "user");
}
	
	if (session.getAttribute("userName") == null) {

      out.write("\r\n");
      out.write("\t\t");
      if (true) {
        _jspx_page_context.forward("LoginForm.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

		}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <title>Charts Menu</title>\r\n");
      out.write("\r\n");
      out.write("    <META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\">\r\n");
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
      out.write("                    <a href=\"ChartList.jsp\" class=\"linktop\" title=\"Display Charts\">Charts</a>\r\n");
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
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("            <table class=\"rect-frame\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"400\" align=\"center\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th colspan=\"2\" class=\"login-column-head\">Charts Menu&nbsp;&nbsp;</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr height=\"50\">\r\n");
      out.write("                    <td class=\"login-table-text\" valign=\"bottom\" width=\"33%\" nowrap align=\"left\">\r\n");
      out.write("                        <a href=\"Chart.jsp?name=MessagesByDate\">Messages by Date</a><br>\r\n");
      out.write("                        <font size=\"2\">Selects all messages sent; groups by date. Presents these results in a line graph with date on the x-axis and #msgs on the y-axis..</font>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr height=\"50\">\r\n");
      out.write("                    <td class=\"login-table-text\" valign=\"bottom\" width=\"33%\" nowrap align=\"left\">\r\n");
      out.write("                        <a href=\"Chart.jsp?name=MessagesByBIC\">Messages By BIC</a><br>\r\n");
      out.write("                        <font size=\"2\">Select all messages; group by destination BIC.  Present these results in a pie chart</font>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr height=\"50\">\r\n");
      out.write("                    <td class=\"login-table-text\" valign=\"bottom\" width=\"33%\" nowrap align=\"left\">\r\n");
      out.write("                        <a href=\"Chart.jsp?name=FailedMessagesByDate\">Failed Message by Date</a><br>\r\n");
      out.write("                        <font size=\"2\">Select messages which have failed validation; group by date.  Present as a bar chart</font>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
