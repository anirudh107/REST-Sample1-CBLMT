package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.*;
import com.tplus.transform.runtime.persistence.expression.*;
import java.util.*;
import java.io.*;
import com.tplus.transform.runtime.webforms.summary.SearchHelper;

public final class NewRawMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
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
      out.write("    <title>New Message</title>\r\n");
      out.write("    <META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"scrollpos.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function onCheckSubmit() {\r\n");
      out.write("            if (document.getElementById(\"existingmessage\").checked == true) {\r\n");
      out.write("                var fileValue = document.getElementById(\"inputfile\").value;\r\n");
      out.write("                var rawValue = document.getElementById(\"rawmessage\").value;\r\n");
      out.write("                var fileValueEmpty = (fileValue == null || fileValue.length == 0);\r\n");
      out.write("                var rawValueEmpty = (rawValue == null || rawValue.length == 0);\r\n");
      out.write("                if (fileValueEmpty && rawValueEmpty) {\r\n");
      out.write("                    alert(\"For 'Existing Message', you should provide a local file name or the raw message contents.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if (!fileValueEmpty && !rawValueEmpty) {\r\n");
      out.write("                    alert(\"For 'Existing Message', you should provide either a local file name or the message contents, not both.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            if (document.getElementById(\"emptymessage\").checked == true) {\r\n");
      out.write("                if (document.getElementById(\"messsagename\").selectedIndex == 0) {\r\n");
      out.write("                    alert(\"For 'Empty Message', please select a message name.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            /*\r\n");
      out.write("            -------- to uncomment this line to select a message-------\r\n");
      out.write("            if(document.RawMessageForm.MessageName.selectedIndex==0){\r\n");
      out.write("            \talert(\"Please select a message name.\");\r\n");
      out.write("            \tdocument.RawMessageForm.MessageName.focus();\r\n");
      out.write("            \treturn false;\r\n");
      out.write("            }\r\n");
      out.write("            */\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin :0\">\r\n");
      out.write("<table class=\"banner\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("            <img style=\"margin-left:10px;border:0px\" src=\"images/volante-logo.gif\" alt=\"Volante\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("            <span style=\"font-size:32pt;font-family:Garamond,sans-serif,Arial;color:white;\">Volante Testing Environment</span>\r\n");
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
      out.write("                    <!--<a href=\"NewRawMessage.jsp\" class=\"linktop\" title=\"Create a new message\">New Message</a>-->\r\n");
      out.write("                    <a href=\"LoginForm.jsp\" class=\"linktop\">Log Out</a>\r\n");
      out.write("                    <img src=\"images/spacer.gif\" width=\"10px\" alt=\"\">&nbsp;&nbsp;\r\n");
      out.write("                </span>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
 } 
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
      out.write("          ACTION=\"NewRawMessageAction.jsp\">\r\n");
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
      out.write("                                    ");

                                        List allMessages = SearchHelper.getAllMessages();
                                        for (int i = 0; i < allMessages.size(); i++) {
                                            String message = (String) allMessages.get(i);
                                            message = message.replace('_', '.');

                                    
      out.write("\r\n");
      out.write("                                    <option value=\"");
      out.print(message);
      out.write('"');
      out.write('>');
      out.print(message);
      out.write("\r\n");
      out.write("                                    </option>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <TD style=\"border:none;margin-left:30px\" colspan=\"2\" class=\"DefaultRendererColumnStyle\">\r\n");
      out.write("                                <input id=\"emptymessage\" type=\"radio\" value=\"EmptyMessage\" checked name=\"MessageType\"/>\r\n");
      out.write("                                <span style=\"margin-left: 0\" class=\"DefaultLabelStyle\">Empty message</span>\r\n");
      out.write("                            </TD>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        \r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style=\"border:none;margin-left:30px\" nowrap colspan=\"2\"\r\n");
      out.write("                                class=\"DefaultRendererColumnStyle\">\r\n");
      out.write("                                <input id=\"existingmessage\" type=\"radio\" value=\"ExistingMessage\" checked name=\"MessageType\"/>\r\n");
      out.write("                                <span style=\"margin-left: 0\" class=\"DefaultLabelStyle\">Based on existing message</span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
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
