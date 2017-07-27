package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.tplus.transform.runtime.*;

public final class AuditSummary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fborder_005fbgcolor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fproperty_005fnowrap_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fborder_005fbgcolor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fproperty_005fnowrap_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fborder_005fbgcolor.release();
    _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fproperty_005fnowrap_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        <!--\r\n");
      out.write("        .titleclass {\r\n");
      out.write("            padding-top: 1px;\r\n");
      out.write("            padding-right: 10px;\r\n");
      out.write("            padding-left: 10px;\r\n");
      out.write("            color: windowtext;\r\n");
      out.write("            font-size: 10.0pt;\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-family: verdana, tahoma, arial, helvetica, sans-serif;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            border: .5pt solid windowtext;\r\n");
      out.write("            background: silver;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .valueclass {\r\n");
      out.write("            padding-top: 1px;\r\n");
      out.write("            padding-right: 10px;\r\n");
      out.write("            padding-left: 10px;\r\n");
      out.write("            color: windowtext;\r\n");
      out.write("            font-size: 10.0pt;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-family: verdana, tahoma, arial, helvetica, sans-serif;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            border: .5pt solid windowtext;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        -->\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    ");

        String format = "MessageAudit";
        String direction = request.getParameter("direction");
        DataObject messageObj = (DataObject) session.getAttribute("message");
        String requestURI = "AuditSummary.jsp?format=" + format + "&direction=" + direction;
        boolean outbound = "outbound".equals(direction);
        String returnPage =  "MessagesSummary.jsp"               + "?format=MessageAudit";
        int tab = outbound ? 2 : 1;
        int level = 1;
        int row = -1;

    
      out.write("\r\n");
      out.write("    ");
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
      out.write("</head>\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("    <p>\r\n");
      out.write("\r\n");
      out.write("    <h1><Font face=\"verdana\" size=\"2\"><B>Message Audit Trace</B></Font></h1>\r\n");
      out.write("\r\n");
      out.write("    <table styleClass=\"TableStyle\" border=0 cellpadding=0 cellspacing=0 >\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td class='titleclass'>Type</td>\r\n");
      out.write("            <td class='valueclass'>");
      out.print(messageObj.getField("Source_Message_Type"));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td class='titleclass'>Sender</td>\r\n");
      out.write("            <td class='valueclass'>");
      out.print(messageObj.getField("Sender"));
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td class='titleclass'>Reference</td>\r\n");
      out.write("            <td class='valueclass'>");
      out.print(messageObj.getField("Reference"));
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <td></td>\r\n");
      out.write("\r\n");
      out.write("                <td class='titleclass'>Recipient</td>\r\n");
      out.write("            <td class='valueclass'>");
      out.print(messageObj.getField("Recipient"));
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td class='titleclass'>Status</td>\r\n");
      out.write("            <td class='valueclass'>");
      out.print(messageObj.getField("Status"));
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <br/>\r\n");
      out.write("    <table width=\"900\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                ");
      //  volante:table
      com.tplus.transform.runtime.webforms.summary.TableTag _jspx_th_volante_005ftable_005f0 = (com.tplus.transform.runtime.webforms.summary.TableTag) _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fborder_005fbgcolor.get(com.tplus.transform.runtime.webforms.summary.TableTag.class);
      _jspx_th_volante_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005ftable_005f0.setParent(null);
      // /AuditSummary.jsp(111,16) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setStyleClass("TableStyle");
      // /AuditSummary.jsp(111,16) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setId("1");
      // /AuditSummary.jsp(111,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setName("auditList");
      // /AuditSummary.jsp(111,16) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setRequestURI( requestURI);
      // /AuditSummary.jsp(111,16) name = pagesize type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setPagesize("15");
      // /AuditSummary.jsp(111,16) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setDecorator("com.tplus.transform.runtime.webforms.summary.AuditDataObjectWrapper");
      // /AuditSummary.jsp(111,16) name = border type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setBorder("0");
      // /AuditSummary.jsp(111,16) name = bgcolor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setBgcolor("#CCCCCC");
      int _jspx_eval_volante_005ftable_005f0 = _jspx_th_volante_005ftable_005f0.doStartTag();
      if (_jspx_eval_volante_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Integer table_index = null;
        java.lang.Object table_item = null;
        if (_jspx_eval_volante_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_volante_005ftable_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_volante_005ftable_005f0.doInitBody();
        }
        table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
        table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
        do {
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_volante_005fsetProperty_005f0(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_volante_005fcolumn_005f0(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_volante_005fcolumn_005f1(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_volante_005fcolumn_005f2(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_volante_005fcolumn_005f3(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_volante_005fcolumn_005f4(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_volante_005ftable_005f0.doAfterBody();
          table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
          table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_volante_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_volante_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fborder_005fbgcolor.reuse(_jspx_th_volante_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fborder_005fbgcolor.reuse(_jspx_th_volante_005ftable_005f0);
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</center>\r\n");
      out.write("<br/>\r\n");
      out.write("<center>\r\n");
      out.write("    <a class=\"LookupButtonStyle\" href=\"");
      out.print( returnPage );
      out.write("\">&nbsp;&nbsp;Return&nbsp;&nbsp;</a>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_volante_005fsetProperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:setProperty
    com.tplus.transform.runtime.webforms.summary.SetPropertyTag _jspx_th_volante_005fsetProperty_005f0 = (com.tplus.transform.runtime.webforms.summary.SetPropertyTag) _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.summary.SetPropertyTag.class);
    _jspx_th_volante_005fsetProperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fsetProperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /AuditSummary.jsp(114,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fsetProperty_005f0.setName("sort.behavior");
    // /AuditSummary.jsp(114,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fsetProperty_005f0.setValue("all");
    int _jspx_eval_volante_005fsetProperty_005f0 = _jspx_th_volante_005fsetProperty_005f0.doStartTag();
    if (_jspx_th_volante_005fsetProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fsetProperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fsetProperty_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f0 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /AuditSummary.jsp(115,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f0.setProperty("Action");
    // /AuditSummary.jsp(115,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f0.setTitle("Action");
    // /AuditSummary.jsp(115,20) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f0.setNowrap("true");
    int _jspx_eval_volante_005fcolumn_005f0 = _jspx_th_volante_005fcolumn_005f0.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f1 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /AuditSummary.jsp(116,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setProperty("Type");
    // /AuditSummary.jsp(116,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setTitle("Source");
    // /AuditSummary.jsp(116,20) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setNowrap("true");
    // /AuditSummary.jsp(116,20) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setSort("true");
    int _jspx_eval_volante_005fcolumn_005f1 = _jspx_th_volante_005fcolumn_005f1.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f2 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /AuditSummary.jsp(117,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setProperty("Actor");
    // /AuditSummary.jsp(117,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setTitle("Actor");
    // /AuditSummary.jsp(117,20) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setNowrap("true");
    // /AuditSummary.jsp(117,20) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setSort("true");
    int _jspx_eval_volante_005fcolumn_005f2 = _jspx_th_volante_005fcolumn_005f2.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f3 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /AuditSummary.jsp(118,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setProperty("Event");
    // /AuditSummary.jsp(118,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setTitle("Event");
    // /AuditSummary.jsp(118,20) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setNowrap("true");
    // /AuditSummary.jsp(118,20) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setSort("true");
    int _jspx_eval_volante_005fcolumn_005f3 = _jspx_th_volante_005fcolumn_005f3.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f3);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f4 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f4.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /AuditSummary.jsp(119,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setProperty("Timestamp");
    // /AuditSummary.jsp(119,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setTitle("Timestamp");
    // /AuditSummary.jsp(119,20) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setSort("true");
    // /AuditSummary.jsp(119,20) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setDecorator("com.tplus.transform.runtime.webforms.summary.TimestampColumnDecorator");
    int _jspx_eval_volante_005fcolumn_005f4 = _jspx_th_volante_005fcolumn_005f4.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f4);
    return false;
  }
}
