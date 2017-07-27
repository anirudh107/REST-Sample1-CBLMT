package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.*;
import com.tplus.transform.runtime.persistence.expression.*;
import java.util.*;
import java.io.*;

public final class ViewAuditWebForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/MessagesButtons.jsp");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fformat_005ferrorStyle_005fcheckMandatoryFields;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fformat_005ferrorStyle_005fcheckMandatoryFields = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fformat_005ferrorStyle_005fcheckMandatoryFields.release();
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.release();
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
      out.write("<META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <SCRIPT LANGUAGE=\"JAVASCRIPT\" SRC=\"scrollpos.js\"></SCRIPT>\r\n");
      out.write("\t<SCRIPT LANGUAGE=\"JAVASCRIPT\" SRC=\"lookupbic.js\"></SCRIPT>\r\n");
      out.write("    ");

        // tell 'header.html' which tab to put forward.
        int tab = 5;
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"restoreScrollPosition();\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("    ");
 
    List normalizedObjectCollection = (List) session.getAttribute("auditList");
    String format = request.getParameter("format");
    String direction = request.getParameter("direction");
    String index = request.getParameter("index");
    String action = request.getParameter("action");
    NormalizedObject normalizedObject = (NormalizedObject) normalizedObjectCollection.get(Integer.parseInt(index));
    String modelName = format + "model";
    request.setAttribute("format", format);
    session.setAttribute(modelName, normalizedObject);
	String requestURI="ViewAuditWebForm.jsp";
	String returnPage ="AuditSummary.jsp?format=" + request.getParameter("format") + "&direction=" + direction;
	boolean readOnly = true;
        String messageType=format;
        if(format!=null && format.indexOf("IM")!=-1) {
        	messageType= format.substring(0,format.indexOf("IM"));
		}
        if (format == null) {
            format = (String) request.getAttribute("format");
            messageType=format;
        	if(format!=null && format.indexOf("IM")!=-1) {
        		messageType= format.substring(0,format.indexOf("IM"));
			}
            if (format == null) {
                //System.out.println("Webformflow - No format");
    
      out.write("\r\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward("AuditSummary.jsp");
        return;
      }
      out.write("\r\n");
      out.write("    ");

            }
        }
        try {
    
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    ");
      if (_jspx_meth_volante_005fclearerrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_volante_005fclearerrors_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t   ");
      //  volante:webform
      com.tplus.transform.runtime.webforms.tag.WebFormTag _jspx_th_volante_005fwebform_005f0 = (com.tplus.transform.runtime.webforms.tag.WebFormTag) _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fformat_005ferrorStyle_005fcheckMandatoryFields.get(com.tplus.transform.runtime.webforms.tag.WebFormTag.class);
      _jspx_th_volante_005fwebform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fwebform_005f0.setParent(null);
      // /ViewAuditWebForm.jsp(66,4) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setFormat( format );
      // /ViewAuditWebForm.jsp(66,4) name = checkMandatoryFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setCheckMandatoryFields(false);
      // /ViewAuditWebForm.jsp(66,4) name = mandatoryMarker type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setMandatoryMarker(false);
      // /ViewAuditWebForm.jsp(66,4) name = errorStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setErrorStyle("tooltippopup");
      // /ViewAuditWebForm.jsp(66,4) name = modelRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setModelRef( modelName);
      // /ViewAuditWebForm.jsp(66,4) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setRequestURI( requestURI);
      // /ViewAuditWebForm.jsp(66,4) name = readOnly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setReadOnly(true);
      int _jspx_eval_volante_005fwebform_005f0 = _jspx_th_volante_005fwebform_005f0.doStartTag();
      if (_jspx_eval_volante_005fwebform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Boolean errors = null;
        java.lang.Boolean completed = null;
        java.lang.Integer formpages = null;
        java.lang.Integer formpage = null;
        if (_jspx_eval_volante_005fwebform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_volante_005fwebform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_volante_005fwebform_005f0.doInitBody();
        }
        errors = (java.lang.Boolean) _jspx_page_context.findAttribute("errors");
        completed = (java.lang.Boolean) _jspx_page_context.findAttribute("completed");
        formpages = (java.lang.Integer) _jspx_page_context.findAttribute("formpages");
        formpage = (java.lang.Integer) _jspx_page_context.findAttribute("formpage");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
 if (!completed.booleanValue()) { 
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
 }
        else {
            //System.out.println("Submitting NO");
        
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fclearerrors_005f2(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fclearerrors_005f3(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       \t");
          if (true) {
            _jspx_page_context.forward( returnPage);
            return;
          }
          out.write("\r\n");
          out.write("        ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f1(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t<!--- Using table for laying out buttons, tabs, error messages & form --->\r\n");
          out.write("        <table width=\"760\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
          out.write("\r\n");
          out.write("            <!--- display button at top --->\r\n");
          out.write("\t\t\t<tr><td>\r\n");
          out.write("\t\t\t\t");
          out.write("<TABLE width=\"100%\">\r\n");
          out.write("  <TBODY>\r\n");
          out.write("    <TR>\r\n");
          out.write("      <TD>\r\n");
          out.write("        <DIV align=\"left\">\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() > 1) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() < ((java.lang.Integer)pageContext.getAttribute("formpages")).intValue()) { 
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f1(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(readOnly != true) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f2(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f3(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f4(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("         ");
 } 
          out.write("\r\n");
          out.write("        </DIV>\r\n");
          out.write("\t  </TD>\r\n");
          out.write("      <TD>\r\n");
          out.write("        <DIV align=\"right\">\r\n");
          out.write("\t\t\t<A class=\"LookupButtonStyle\" href= \"");
          out.print( returnPage);
          out.write("\">&nbsp;&nbsp;Return&nbsp;&nbsp;</A> \r\n");
          out.write("\t\t</DIV>\r\n");
          out.write("\t   </TD>\r\n");
          out.write("\t</TR>\r\n");
          out.write("  </TBODY>\r\n");
          out.write("</TABLE>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t</td></tr>\r\n");
          out.write("\r\n");
          out.write("            <!--- display top level errors --->\r\n");
          out.write("            <tr><td>\r\n");
          out.write("                ");
          if (_jspx_meth_volante_005fdisplayerrors_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t</td></tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("            <!--- display the  form --->\r\n");
          out.write("            <tr><td style=\"BORDER:#000000 1px solid;\">\r\n");
          out.write("                ");
          if (_jspx_meth_volante_005fdisplay_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("           \t</td></tr>\r\n");
          out.write("\r\n");
          out.write("            <!--- display button at bottom --->\r\n");
          out.write("\t\t\t<tr><td>\r\n");
          out.write("\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t");
          out.write("<TABLE width=\"100%\">\r\n");
          out.write("  <TBODY>\r\n");
          out.write("    <TR>\r\n");
          out.write("      <TD>\r\n");
          out.write("        <DIV align=\"left\">\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() > 1) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f5(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() < ((java.lang.Integer)pageContext.getAttribute("formpages")).intValue()) { 
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f6(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(readOnly != true) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f7(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f8(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f9(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("         ");
 } 
          out.write("\r\n");
          out.write("        </DIV>\r\n");
          out.write("\t  </TD>\r\n");
          out.write("      <TD>\r\n");
          out.write("        <DIV align=\"right\">\r\n");
          out.write("\t\t\t<A class=\"LookupButtonStyle\" href= \"");
          out.print( returnPage);
          out.write("\">&nbsp;&nbsp;Return&nbsp;&nbsp;</A> \r\n");
          out.write("\t\t</DIV>\r\n");
          out.write("\t   </TD>\r\n");
          out.write("\t</TR>\r\n");
          out.write("  </TBODY>\r\n");
          out.write("</TABLE>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t</td></tr>\r\n");
          out.write("\r\n");
          out.write("        </table>\r\n");
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_volante_005fwebform_005f0.doAfterBody();
          errors = (java.lang.Boolean) _jspx_page_context.findAttribute("errors");
          completed = (java.lang.Boolean) _jspx_page_context.findAttribute("completed");
          formpages = (java.lang.Integer) _jspx_page_context.findAttribute("formpages");
          formpage = (java.lang.Integer) _jspx_page_context.findAttribute("formpage");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_volante_005fwebform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_volante_005fwebform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fformat_005ferrorStyle_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fformat_005ferrorStyle_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
      out.write("\r\n");
      out.write("    ");

        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        //System.out.println(((NormalizedObject)session.getAttribute(modelName)).toXMLString());
    
      out.write("\r\n");
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

  private boolean _jspx_meth_volante_005fclearerrors_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f0 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f0.setParent(null);
    // /ViewAuditWebForm.jsp(64,4) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f0.setErrorRef("externalErrors");
    // /ViewAuditWebForm.jsp(64,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f0.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f0 = _jspx_th_volante_005fclearerrors_005f0.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fclearerrors_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f1 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f1.setParent(null);
    // /ViewAuditWebForm.jsp(65,4) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f1.setErrorRef("processingErrors");
    // /ViewAuditWebForm.jsp(65,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f1.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f1 = _jspx_th_volante_005fclearerrors_005f1.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fadderrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:adderrors
    com.tplus.transform.runtime.webforms.tag.AddValidationsTag _jspx_th_volante_005fadderrors_005f0 = (com.tplus.transform.runtime.webforms.tag.AddValidationsTag) _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.AddValidationsTag.class);
    _jspx_th_volante_005fadderrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fadderrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /ViewAuditWebForm.jsp(71,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setErrorRef("externalErrors");
    // /ViewAuditWebForm.jsp(71,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f0 = _jspx_th_volante_005fadderrors_005f0.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fclearerrors_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f2 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /ViewAuditWebForm.jsp(76,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f2.setErrorRef("externalErrors");
    // /ViewAuditWebForm.jsp(76,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f2.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f2 = _jspx_th_volante_005fclearerrors_005f2.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f2);
    return false;
  }

  private boolean _jspx_meth_volante_005fclearerrors_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f3 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f3.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /ViewAuditWebForm.jsp(77,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f3.setErrorRef("processingErrors");
    // /ViewAuditWebForm.jsp(77,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f3.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f3 = _jspx_th_volante_005fclearerrors_005f3.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f3);
    return false;
  }

  private boolean _jspx_meth_volante_005fadderrors_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:adderrors
    com.tplus.transform.runtime.webforms.tag.AddValidationsTag _jspx_th_volante_005fadderrors_005f1 = (com.tplus.transform.runtime.webforms.tag.AddValidationsTag) _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.AddValidationsTag.class);
    _jspx_th_volante_005fadderrors_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fadderrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /ViewAuditWebForm.jsp(82,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setErrorRef("processingErrors");
    // /ViewAuditWebForm.jsp(82,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f1 = _jspx_th_volante_005fadderrors_005f1.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f0 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(7,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(7,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setName("PreviousPage");
    // /MessagesButtons.jsp(7,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setLabel("Previous");
    int _jspx_eval_volante_005fbutton_005f0 = _jspx_th_volante_005fbutton_005f0.doStartTag();
    if (_jspx_th_volante_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f1 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(10,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f1.setName("NextPage");
    // /MessagesButtons.jsp(10,4) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f1.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(10,4) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f1.setLabel(" Next ");
    int _jspx_eval_volante_005fbutton_005f1 = _jspx_th_volante_005fbutton_005f1.doStartTag();
    if (_jspx_th_volante_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f2 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(13,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f2.setName("Submit");
    // /MessagesButtons.jsp(13,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f2.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(13,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f2.setLabel(" Validate ");
    // /MessagesButtons.jsp(13,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f2.setParams("task=validate");
    int _jspx_eval_volante_005fbutton_005f2 = _jspx_th_volante_005fbutton_005f2.doStartTag();
    if (_jspx_th_volante_005fbutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f2);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f3 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f3.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(14,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setName("Submit");
    // /MessagesButtons.jsp(14,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(14,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setLabel(" Validate & Save ");
    // /MessagesButtons.jsp(14,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setParams("task=validateAndSave");
    int _jspx_eval_volante_005fbutton_005f3 = _jspx_th_volante_005fbutton_005f3.doStartTag();
    if (_jspx_th_volante_005fbutton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f3);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f4 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f4.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(15,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setName("Submit");
    // /MessagesButtons.jsp(15,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(15,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setLabel(" Save & Release ");
    // /MessagesButtons.jsp(15,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setParams("task=saveAndRelease");
    int _jspx_eval_volante_005fbutton_005f4 = _jspx_th_volante_005fbutton_005f4.doStartTag();
    if (_jspx_th_volante_005fbutton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f4);
    return false;
  }

  private boolean _jspx_meth_volante_005fdisplayerrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:displayerrors
    com.tplus.transform.runtime.webforms.tag.DisplayErrorsTag _jspx_th_volante_005fdisplayerrors_005f0 = (com.tplus.transform.runtime.webforms.tag.DisplayErrorsTag) _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody.get(com.tplus.transform.runtime.webforms.tag.DisplayErrorsTag.class);
    _jspx_th_volante_005fdisplayerrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fdisplayerrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    int _jspx_eval_volante_005fdisplayerrors_005f0 = _jspx_th_volante_005fdisplayerrors_005f0.doStartTag();
    if (_jspx_th_volante_005fdisplayerrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody.reuse(_jspx_th_volante_005fdisplayerrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody.reuse(_jspx_th_volante_005fdisplayerrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fdisplay_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:display
    com.tplus.transform.runtime.webforms.tag.DisplayTag _jspx_th_volante_005fdisplay_005f0 = (com.tplus.transform.runtime.webforms.tag.DisplayTag) _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.get(com.tplus.transform.runtime.webforms.tag.DisplayTag.class);
    _jspx_th_volante_005fdisplay_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fdisplay_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    int _jspx_eval_volante_005fdisplay_005f0 = _jspx_th_volante_005fdisplay_005f0.doStartTag();
    if (_jspx_th_volante_005fdisplay_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f5 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f5.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(7,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f5.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(7,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f5.setName("PreviousPage");
    // /MessagesButtons.jsp(7,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f5.setLabel("Previous");
    int _jspx_eval_volante_005fbutton_005f5 = _jspx_th_volante_005fbutton_005f5.doStartTag();
    if (_jspx_th_volante_005fbutton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f5);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f6 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f6.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(10,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f6.setName("NextPage");
    // /MessagesButtons.jsp(10,4) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f6.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(10,4) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f6.setLabel(" Next ");
    int _jspx_eval_volante_005fbutton_005f6 = _jspx_th_volante_005fbutton_005f6.doStartTag();
    if (_jspx_th_volante_005fbutton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f6);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f7 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f7.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(13,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setName("Submit");
    // /MessagesButtons.jsp(13,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(13,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setLabel(" Validate ");
    // /MessagesButtons.jsp(13,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setParams("task=validate");
    int _jspx_eval_volante_005fbutton_005f7 = _jspx_th_volante_005fbutton_005f7.doStartTag();
    if (_jspx_th_volante_005fbutton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f7);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f8 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f8.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(14,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f8.setName("Submit");
    // /MessagesButtons.jsp(14,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f8.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(14,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f8.setLabel(" Validate & Save ");
    // /MessagesButtons.jsp(14,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f8.setParams("task=validateAndSave");
    int _jspx_eval_volante_005fbutton_005f8 = _jspx_th_volante_005fbutton_005f8.doStartTag();
    if (_jspx_th_volante_005fbutton_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f8);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f9 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f9.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesButtons.jsp(15,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f9.setName("Submit");
    // /MessagesButtons.jsp(15,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f9.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(15,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f9.setLabel(" Save & Release ");
    // /MessagesButtons.jsp(15,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f9.setParams("task=saveAndRelease");
    int _jspx_eval_volante_005fbutton_005f9 = _jspx_th_volante_005fbutton_005f9.doStartTag();
    if (_jspx_th_volante_005fbutton_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f9);
    return false;
  }
}
