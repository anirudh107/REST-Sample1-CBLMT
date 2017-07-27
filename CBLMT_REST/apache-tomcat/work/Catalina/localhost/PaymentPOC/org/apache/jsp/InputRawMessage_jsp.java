package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.*;
import com.tplus.transform.runtime.persistence.expression.*;
import java.util.*;
import java.io.*;

public final class InputRawMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

        // tell 'header.html' which tab to put forward.
        int tab = 2;
        int level = 1;
        int row = -1;
    
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <title>New Message</title>\r\n");
      out.write("    <META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("   \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"scrollpos.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function onCheckSubmit() {\r\n");
      out.write("        \r\n");
      out.write("           if (document.RawMessageForm.messsagename.selectedIndex == 0) {\r\n");
      out.write("\t                    alert(\"Please select a message name.\");\r\n");
      out.write("\t                    return false;\r\n");
      out.write("           }\r\n");
      out.write("           if (document.RawMessageForm.InputFile.value==\"\" && document.RawMessageForm.RawMessage.value==\"\"){\r\n");
      out.write("           \talert(\"Please enter a file name to upload or paste the contents of the message in the space below. One of these fields is mandatory\");\r\n");
      out.write("           }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin :0\">\r\n");
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
      out.write("<center>\r\n");
      out.write("    ");

        String rawMessage = (String) session.getAttribute("RawMessage");
        if (rawMessage == null) {
            rawMessage = "";
        }
        String name = request.getParameter("name");
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <form NAME=\"RawMessageForm\" METHOD=\"POST\" accept-charset=\"UTF-8\" enctype=\"multipart/form-data\"\r\n");
      out.write("          ACTION=\"InputRawMessageAction.jsp\">\r\n");
      out.write("        <table class=\"TableStyle\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"90%\" align=\"center\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"DefaultSectionColumnStyle\" style=\"BORDER-RIGHT: none\">\r\n");
      out.write("                    <span class=\"DefaultSectionStyle\">&nbsp;Create New Message</span>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"DefaultSectionColumnStyle\" style=\"BORDER-Left: none;\">\r\n");
      out.write("                    <span style=\"text-align:right;\">&nbsp;\r\n");
      out.write("                    <INPUT class='LookupButtonStyle' type=\"SUBMIT\" value=\"Submit\" onclick=\"return onCheckSubmit();\"/>&nbsp;</span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"2\" style=\"padding-top:10px;padding-bottom:10px\">\r\n");
      out.write("                    <table style=\"border:none\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\" align=\"center\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td nowrap style=\"border:none;\" class=\"DefaultLabelColumnStyle\">\r\n");
      out.write("                                <p style=\"margin-left: 0\" class=\"DefaultLabelStyle\">Message Name</p>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td style=\"border:none\" class=\"DefaultRendererColumnStyle\">\r\n");
      out.write("                                <select id=\"messsagename\" name=\"MessageName\" size=\"1\" class=\"DefaultRendererStyle\">\r\n");
      out.write("                                    <option value=\"\"></option>\r\n");
      out.write("                                    <option value=\"MT101\">MT101</option>\r\n");
      out.write("                                    <option value=\"MT103\">MT103</option>\r\n");
      out.write("                                    <option value=\"CustomerCreditTransferInitiation\">Customer Credit Transfer Initiation</option>\r\n");
      out.write("                                    <option value=\"PaymentInfo\">PaymentInfo</option>\r\n");
      out.write("                                    \r\n");
      out.write("                                </select>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    <!--    <tr>\r\n");
      out.write("                            <TD style=\"border:none;margin-left:30px\" colspan=\"2\" class=\"DefaultRendererColumnStyle\">\r\n");
      out.write("                                <input id=\"emptymessage\" type=\"radio\" value=\"EmptyMessage\" checked name=\"MessageType\"/>\r\n");
      out.write("                                <span style=\"margin-left: 0\" class=\"DefaultLabelStyle\">Empty message</span>\r\n");
      out.write("                            </TD>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style=\"border:none;margin-left:30px\" nowrap colspan=\"2\"\r\n");
      out.write("                                class=\"DefaultRendererColumnStyle\">\r\n");
      out.write("                                <input id=\"existingmessage\" type=\"radio\" value=\"ExistingMessage\" checked name=\"MessageType\"/>\r\n");
      out.write("                                <span style=\"margin-left: 0\" class=\"DefaultLabelStyle\">Based on existing message</span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr> -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"50\" class=\"DefaultLabelColumnStyle\" style=\"border:none;padding-left:40px\"><p\r\n");
      out.write("                                    style=\"margin-left: 0px\" class=\"DefaultLabelStyle\">File</p></td>\r\n");
      out.write("                            <td class=\"DefaultRendererColumnStyle\" style=\"border:none\">\r\n");
      out.write("                                <input id=\"inputfile\" class=\"DefaultRendererStyle\" type=\"file\" name=\"InputFile\"\r\n");
      out.write("                                       value=\"Browse...\"\r\n");
      out.write("                                       size=\"80\"/>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style=\"border:none\"/>\r\n");
      out.write("                            <td class=\"DefaultRendererColumnStyle\" style=\"border:none\">\r\n");
      out.write("                                <textarea id=\"rawmessage\" name=\"RawMessage\" class=\"DefaultRendererStyle\" rows=\"23\"\r\n");
      out.write("                                          style=\"width: 100%;margin-right: 25\">");
      out.print(rawMessage);
      out.write("</textarea><br>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!--\r\n");
      out.write("            <TR>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <TD class=\"DefaultRendererStyle\" colspan=\"1\">\r\n");
      out.write("                    <TEXTAREA style=\"border:none\" NAME=\"RawMessage\" ROWS=\"25\" STYLE=\"WIDTH: 100%\">");
      out.print(rawMessage);
      out.write("</TEXTAREA>\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR> -->\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <input NAME=\"name\" type=\"hidden\" value='");
      out.print( (name == null ? "" : name));
      out.write("'/>\r\n");
      out.write("    </form>\r\n");
      out.write("</center>\r\n");
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
