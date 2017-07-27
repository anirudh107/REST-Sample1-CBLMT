package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.tplus.transform.runtime.webforms.summary.SummaryAction;
import com.tplus.transform.runtime.webforms.summary.SearchHelper;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.LookupHelper;
import java.util.*;
import com.tplus.transform.runtime.LookupContext;
import com.tplus.transform.runtime.DataObject;
import com.tplus.transform.runtime.diff.MessageDiffer;
import com.tplus.transform.runtime.DataObjectSection;
import com.tplus.transform.runtime.webforms.summary.SearchHelper;

public final class MessageForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/MessagesWebForm.jsp");
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/MessagesButtons.jsp");
    _jspx_dependants.add("/WebFormTabs.jsp");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fname_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ffieldPrefix_005ferrorStyle_005femitStyles_005fcheckMandatoryFields;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005femitStyles_005fcollapseEmptySections_005fcheckMandatoryFields;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005foutput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005faction_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fname_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ffieldPrefix_005ferrorStyle_005femitStyles_005fcheckMandatoryFields = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005femitStyles_005fcollapseEmptySections_005fcheckMandatoryFields = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005foutput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005faction_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fname_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ffieldPrefix_005ferrorStyle_005femitStyles_005fcheckMandatoryFields.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005femitStyles_005fcollapseEmptySections_005fcheckMandatoryFields.release();
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.release();
    _005fjspx_005ftagPool_005fvolante_005finput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005foutput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005faction_0026_005fname.release();
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
 
	String requestURI="MessageForm.jsp";
	
	boolean readOnly= true;
	boolean newMessage = false;
	HashMap urlParm = new HashMap();
	Object summaryList = session.getAttribute("summaryList");
	String MessageId = request.getParameter("MessageId");
	String action = request.getParameter("Action");
	if(action != null){
	session.setAttribute("Action",action);
	}
	else{
	action =(String) session.getAttribute("Action");
	}
	//System.out.println("Action--->"+action);
	if(action.equals("Edit")){
		readOnly = false;
		//System.out.println("readOnly--->"+readOnly);
	}
	//System.out.println("MessageId--->"+request.getParameter("MessageId"));
	if(MessageId != null){
		Enumeration enParams1 = request.getParameterNames(); 
		while(enParams1.hasMoreElements()){
		 String paramName = (String)enParams1.nextElement();
		 urlParm.put(paramName, (request.getParameter(paramName)).toString());
		}
		//urlParm.put(paramName, (request.getParameter(paramName)).toString());
		
		
		List objectCollection = SearchHelper.searchURL(urlParm);
		//System.out.println("allMessages allMessages - "+objectCollection);
		session.setAttribute("viewSummaryList", objectCollection);
		String forwardPage = SummaryAction.onhandle(request, response);
    }	

    //session.removeAttribute("externalErrors");
    //session.removeAttribute("processingErrors");
	

      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ");

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
      out.write(" -->\r\n");
      out.write("<html>\r\n");

    String returnPage = (String) session.getAttribute("WebFormReturnPage"); 
    if (returnPage == null) {
        //returnPage = "MessagesSummary.jsp"; 
        returnPage = "CloseForm.jsp"; 
    }
    String format = request.getParameter("format");
    if (format == null) {
        format = (String) request.getAttribute("format");
        if (format == null) {

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("CloseForm.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

        }
    }
    //String messageName = format.substring(0, format.length() -2);
    String modelName = format + "model";
    String lastSavedModelName = modelName + "LastSaved";
    String commonModelName = modelName + "output";
    DataObject commonNormalizedObject = (DataObject) session.getAttribute(commonModelName);
	session.setAttribute("tempCommonNormalizedObject",commonNormalizedObject);
    String messageName = (String) commonNormalizedObject.getField("MessageName");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Message Details - ");
      out.print(format);
      out.write(" </title>\r\n");
      out.write("    <meta http-equiv=\"Cache-control\" content=\"no-cache, no-store, must-revalidate\" >\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"scrollpos.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"lookupbic.js\"></script>\r\n");
      out.write("    ");

	if (readOnly) {
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webprintform.css\">\r\n");
      out.write("    ");

    }
    else {
    
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\">\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"restoreScrollPosition();\" style=\"margin :0\">\r\n");
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
      out.write("    <br>\r\n");
      //  volante:webform
      com.tplus.transform.runtime.webforms.tag.WebFormTag _jspx_th_volante_005fwebform_005f0 = (com.tplus.transform.runtime.webforms.tag.WebFormTag) _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fname_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ffieldPrefix_005ferrorStyle_005femitStyles_005fcheckMandatoryFields.get(com.tplus.transform.runtime.webforms.tag.WebFormTag.class);
      _jspx_th_volante_005fwebform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fwebform_005f0.setParent(null);
      // /MessagesWebForm.jsp(59,0) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setFormat( "MessageInfo" );
      // /MessagesWebForm.jsp(59,0) name = fieldPrefix type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setFieldPrefix("SMRY");
      // /MessagesWebForm.jsp(59,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setName("SummaryView");
      // /MessagesWebForm.jsp(59,0) name = checkMandatoryFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setCheckMandatoryFields(false);
      // /MessagesWebForm.jsp(59,0) name = errorStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setErrorStyle("tooltippopup");
      // /MessagesWebForm.jsp(59,0) name = modelRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setModelRef( commonModelName);
      // /MessagesWebForm.jsp(59,0) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setRequestURI( requestURI);
      // /MessagesWebForm.jsp(59,0) name = readOnly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setReadOnly(true);
      // /MessagesWebForm.jsp(59,0) name = mandatoryMarker type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setMandatoryMarker( false);
      // /MessagesWebForm.jsp(59,0) name = useLabelForReadOnly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setUseLabelForReadOnly(true);
      // /MessagesWebForm.jsp(59,0) name = hideNullFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setHideNullFields(false);
      // /MessagesWebForm.jsp(59,0) name = emitStyles type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setEmitStyles(false);
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
          out.write("    <table width=\"90%\" cellspacing=\"0\" border=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
          out.write("        <tr>\r\n");
          out.write("            <td>");
          if (_jspx_meth_volante_005fdisplay_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("            <td width=\"30%\"></td>\r\n");
          out.write("        </tr>\r\n");
          out.write("    </table> \r\n");
          out.write("\r\n");
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
        _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fname_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ffieldPrefix_005ferrorStyle_005femitStyles_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fname_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ffieldPrefix_005ferrorStyle_005femitStyles_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    ");
      //  volante:webform
      com.tplus.transform.runtime.webforms.tag.WebFormTag _jspx_th_volante_005fwebform_005f1 = (com.tplus.transform.runtime.webforms.tag.WebFormTag) _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005femitStyles_005fcollapseEmptySections_005fcheckMandatoryFields.get(com.tplus.transform.runtime.webforms.tag.WebFormTag.class);
      _jspx_th_volante_005fwebform_005f1.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fwebform_005f1.setParent(null);
      // /MessagesWebForm.jsp(73,4) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setFormat( format );
      // /MessagesWebForm.jsp(73,4) name = checkMandatoryFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setCheckMandatoryFields(false);
      // /MessagesWebForm.jsp(73,4) name = errorStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setErrorStyle("tooltippopup");
      // /MessagesWebForm.jsp(73,4) name = modelRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setModelRef( modelName);
      // /MessagesWebForm.jsp(73,4) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setRequestURI( requestURI);
      // /MessagesWebForm.jsp(73,4) name = readOnly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setReadOnly( readOnly);
      // /MessagesWebForm.jsp(73,4) name = mandatoryMarker type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setMandatoryMarker( !readOnly);
      // /MessagesWebForm.jsp(73,4) name = useLabelForReadOnly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setUseLabelForReadOnly( readOnly);
      // /MessagesWebForm.jsp(73,4) name = collapseEmptySections type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setCollapseEmptySections(true);
      // /MessagesWebForm.jsp(73,4) name = hideNullFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setHideNullFields( readOnly);
      // /MessagesWebForm.jsp(73,4) name = emitStyles type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f1.setEmitStyles(false);
      int _jspx_eval_volante_005fwebform_005f1 = _jspx_th_volante_005fwebform_005f1.doStartTag();
      if (_jspx_eval_volante_005fwebform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Boolean errors = null;
        java.lang.Boolean completed = null;
        java.lang.Integer formpages = null;
        java.lang.Integer formpage = null;
        if (_jspx_eval_volante_005fwebform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_volante_005fwebform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_volante_005fwebform_005f1.doInitBody();
        }
        errors = (java.lang.Boolean) _jspx_page_context.findAttribute("errors");
        completed = (java.lang.Boolean) _jspx_page_context.findAttribute("completed");
        formpages = (java.lang.Integer) _jspx_page_context.findAttribute("formpages");
        formpage = (java.lang.Integer) _jspx_page_context.findAttribute("formpage");
        do {
          out.write("\r\n");
          out.write("        ");
 if (!completed.booleanValue()) {
        
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f0(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f1(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
 }
        else {
            String task = request.getParameter("task");
            DataObject normalizedObj = (DataObject) session.getAttribute(modelName);
			//session.setAttribute("normalObj",normalizedObj);
			 if (task.equals("compare")) {
                DataObject orgnalNormalizedObj = (DataObject) session.getAttribute(lastSavedModelName);
				session.setAttribute("tempObj",normalizedObj);
                DataObjectSection diffObj = MessageDiffer.diff(orgnalNormalizedObj, normalizedObj);
				if (diffObj.size() > 0) {
				session.setAttribute("diffObj", diffObj);
		
          out.write("\r\n");
          out.write("\t\t");
          if (true) {
            _jspx_page_context.forward("DiffMessage.jsp");
            return;
          }
          out.write(" \r\n");
          out.write("\t\t");

				}
				else{
				session.setAttribute("diffObj", "");
		
          out.write("\r\n");
          out.write("\t\t");
          if (true) {
            _jspx_page_context.forward("DiffMessage.jsp");
            return;
          }
          out.write(" \r\n");
          out.write("\t\t");

				}
			}
            
        else {
            boolean canReturn = true;
        
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fclearerrors_005f0(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fclearerrors_005f1(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          //  volante:invokeMessageFlow
          com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag _jspx_th_volante_005finvokeMessageFlow_005f0 = (com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag) _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.get(com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag.class);
          _jspx_th_volante_005finvokeMessageFlow_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005finvokeMessageFlow_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
          // /MessagesWebForm.jsp(109,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005finvokeMessageFlow_005f0.setName("SaveFlow");
          // /MessagesWebForm.jsp(109,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005finvokeMessageFlow_005f0.setErrorRef("processingErrors");
          // /MessagesWebForm.jsp(109,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005finvokeMessageFlow_005f0.setScope("session");
          int _jspx_eval_volante_005finvokeMessageFlow_005f0 = _jspx_th_volante_005finvokeMessageFlow_005f0.doStartTag();
          if (_jspx_eval_volante_005finvokeMessageFlow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("            ");
              //  volante:input
              com.tplus.transform.runtime.webforms.core.InputTag _jspx_th_volante_005finput_005f0 = (com.tplus.transform.runtime.webforms.core.InputTag) _005fjspx_005ftagPool_005fvolante_005finput.get(com.tplus.transform.runtime.webforms.core.InputTag.class);
              _jspx_th_volante_005finput_005f0.setPageContext(_jspx_page_context);
              _jspx_th_volante_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finvokeMessageFlow_005f0);
              int _jspx_eval_volante_005finput_005f0 = _jspx_th_volante_005finput_005f0.doStartTag();
              if (_jspx_eval_volante_005finput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("                ");
                  //  volante:param
                  com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f0 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
                  _jspx_th_volante_005fparam_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_volante_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
                  // /MessagesWebForm.jsp(111,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_volante_005fparam_005f0.setValue(commonNormalizedObject );
                  int _jspx_eval_volante_005fparam_005f0 = _jspx_th_volante_005fparam_005f0.doStartTag();
                  if (_jspx_th_volante_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
                  out.write("\r\n");
                  out.write("                ");
                  //  volante:param
                  com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f1 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
                  _jspx_th_volante_005fparam_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_volante_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
                  // /MessagesWebForm.jsp(112,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_volante_005fparam_005f1.setValue(normalizedObj );
                  int _jspx_eval_volante_005fparam_005f1 = _jspx_th_volante_005fparam_005f1.doStartTag();
                  if (_jspx_th_volante_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
                  out.write("\r\n");
                  out.write("                ");
                  //  volante:param
                  com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f2 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
                  _jspx_th_volante_005fparam_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_volante_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
                  // /MessagesWebForm.jsp(113,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_volante_005fparam_005f2.setValue( messageName );
                  int _jspx_eval_volante_005fparam_005f2 = _jspx_th_volante_005fparam_005f2.doStartTag();
                  if (_jspx_th_volante_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
                  out.write("\r\n");
                  out.write("                ");
                  //  volante:param
                  com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f3 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
                  _jspx_th_volante_005fparam_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_volante_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
                  // /MessagesWebForm.jsp(114,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_volante_005fparam_005f3.setValue( task );
                  int _jspx_eval_volante_005fparam_005f3 = _jspx_th_volante_005fparam_005f3.doStartTag();
                  if (_jspx_th_volante_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f3);
                  out.write("\r\n");
                  out.write("                ");
                  //  volante:param
                  com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f4 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
                  _jspx_th_volante_005fparam_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_volante_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
                  // /MessagesWebForm.jsp(115,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_volante_005fparam_005f4.setValue( session.getAttribute("userName") );
                  int _jspx_eval_volante_005fparam_005f4 = _jspx_th_volante_005fparam_005f4.doStartTag();
                  if (_jspx_th_volante_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f4);
                  out.write("\r\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_volante_005finput_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_volante_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fvolante_005finput.reuse(_jspx_th_volante_005finput_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fvolante_005finput.reuse(_jspx_th_volante_005finput_005f0);
              out.write("\r\n");
              out.write("            ");
              if (_jspx_meth_volante_005foutput_005f0(_jspx_th_volante_005finvokeMessageFlow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_volante_005finvokeMessageFlow_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_volante_005finvokeMessageFlow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f2(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
 if ((session.getAttribute("processingErrors") == null || task.equals("saveAsDraft")) && !task.equals("validate")) {
			session.setAttribute(lastSavedModelName, normalizedObj.clone());
            if (task.equals("saveAndRelease")) {
                boolean b = SearchHelper.isFileExists(commonNormalizedObject);
                if (!"false".equals(request.getParameter("filecheck")) && b) {
                    canReturn = false;
        
          out.write("\r\n");
          out.write("        <div id=\"warnmesssageid\" class=\"FormBox\" align=\"center\">\r\n");
          out.write("            <div class=\"FormTitle\">Dupicate file</div>\r\n");
          out.write("            <div class=\"FormBody\">\r\n");
          out.write("                The specified file already exists. Would you like to overwrite the existing file?\r\n");
          out.write("                <br><br>\r\n");
          out.write("                ");
          if (_jspx_meth_volante_005fbutton_005f0(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                <input type=\"Button\" class=\"LookupButtonStyle\" name=\"Continue\" value=\"Continue Editing\"\r\n");
          out.write("                       onclick=\"document.getElementById('warnmesssageid').style.display='none'\"/>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("        ");

				}
				else {
					String rawOut = (String) session.getAttribute("rawOut");
					SearchHelper.saveOutput(rawOut, commonNormalizedObject);
				}
			}
         if (canReturn) {	
        
          out.write("\r\n");
          out.write("         ");
          if (true) {
            _jspx_page_context.forward( returnPage);
            return;
          }
          out.write(" \r\n");
          out.write("\t\t \r\n");
          out.write("        ");
 }
        }
        }
        }
        
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <!--- Using table for laying out buttons, tabs, error messages & form -->\r\n");
          out.write("        <table  width=\"90%\" cellspacing=\"0\" border=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
          out.write("\r\n");
          out.write("            <!--- display buttons at top -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>\r\n");
          out.write("                    ");
          out.write("<table width=\"100%\">\r\n");
          out.write("  <tbody>\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td>\r\n");
          out.write("        <div align=\"left\">\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() > 1) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f1(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() < ((java.lang.Integer)pageContext.getAttribute("formpages")).intValue()) { 
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f2(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(readOnly != true) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f3(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f4(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f5(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write(" \r\n");
          out.write("\t\t\t<!-- ");
          if (_jspx_meth_volante_005fbutton_005f6(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write(" -->\r\n");
          out.write("         ");
 }
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("\t  </td>\r\n");
          out.write("      <td align=\"right\">\r\n");
          out.write("         <span align=\"right\">\r\n");
          out.write("              <input type=\"button\" class=\"LookupButtonStyle\" name=\"Print\" value=\"Printable View\" onclick=\"window.open('");
          out.print( "MessagesSingleWebForm.jsp?format=" + format  );
          out.write("')\"/>\r\n");
          out.write("          </span>\r\n");
          out.write("\t\t      ");
 if(readOnly == true){ 
          out.write("\r\n");
          out.write("        <span align=\"right\">\r\n");
          out.write("            <!-- ");
          if (_jspx_meth_volante_005fbutton_005f7(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write(" -->\r\n");
          out.write("            <!-- <input type=\"button\" class=\"LookupButtonStyle\" name=\"Return\" value=\"Return\" onclick=\"window.open('");
          out.print( returnPage);
          out.write("', '_self')\"/> -->\r\n");
          out.write("\t\t\t<input type=\"button\" class=\"LookupButtonStyle\" name=\"Close\" value=\"Close\" onclick=\"window.open('CloseForm.jsp', '_self')\"/>\r\n");
          out.write("\t\t\t\t\t\t   \r\n");
          out.write("\t\t</span>\r\n");
          out.write("\t\t");
}
          out.write("\r\n");
          out.write("\t   </td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("  </tbody>\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("\r\n");
          out.write("            <!--- display top level errors -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_volante_005fdisplayerrors_005f0(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("            </tr>\r\n");
          out.write("\r\n");
          out.write("            <!--- display a row of tabs -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td nowrap=\"nowrap\">\r\n");
          out.write("                    ");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"tabs.css\">   \r\n");
          out.write("<div id=\"tabs11\">\r\n");
          out.write("\t<ul>\r\n");
          out.write("\t ");
 { 
	    int currentPage = ((java.lang.Integer)pageContext.getAttribute("formpage")).intValue();
		String[] pageNames = (String[])pageContext.getAttribute("pagenames");
		 for (int i=1;i<=pageNames.length;i++){
			String pageName = pageNames[i-1];
			String pageId = "Page" + i;
		
          out.write("\r\n");
          out.write("\t\t\t<li >\r\n");
          out.write("\t\t\t");
	if(i == currentPage) {
          out.write("\r\n");
          out.write("\t\t\t\t<div>\r\n");
          out.write("\t\t\t\t\t<span>");
          out.print( pageName);
          out.write("</span>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t        ");
 } else {
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t\t");
          //  volante:action
          com.tplus.transform.runtime.webforms.tag.ActionTag _jspx_th_volante_005faction_005f0 = (com.tplus.transform.runtime.webforms.tag.ActionTag) _005fjspx_005ftagPool_005fvolante_005faction_0026_005fname.get(com.tplus.transform.runtime.webforms.tag.ActionTag.class);
          _jspx_th_volante_005faction_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005faction_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
          // /WebFormTabs.jsp(18,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005faction_005f0.setName( pageId);
          int _jspx_eval_volante_005faction_005f0 = _jspx_th_volante_005faction_005f0.doStartTag();
          if (_jspx_eval_volante_005faction_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_volante_005faction_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_volante_005faction_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_volante_005faction_005f0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<span>");
              out.print( pageName);
              out.write("</span>\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_volante_005faction_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_volante_005faction_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_volante_005faction_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005faction_0026_005fname.reuse(_jspx_th_volante_005faction_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005faction_0026_005fname.reuse(_jspx_th_volante_005faction_005f0);
          out.write("\t\t\r\n");
          out.write("\t        ");
 } 
          out.write("\r\n");
          out.write("\t\t\t</li>\r\n");
          out.write("\t  ");
 } }
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t</ul>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("\r\n");
          out.write("            <!--- display the  form -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_volante_005fdisplay_005f1(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("            </tr>\r\n");
          out.write("\r\n");
          out.write("            <!--- display button at bottom -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td><br>\r\n");
          out.write("                    ");
          out.write("<table width=\"100%\">\r\n");
          out.write("  <tbody>\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td>\r\n");
          out.write("        <div align=\"left\">\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() > 1) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f8(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(((java.lang.Integer)pageContext.getAttribute("formpage")).intValue() < ((java.lang.Integer)pageContext.getAttribute("formpages")).intValue()) { 
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f9(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      ");
 } 
          out.write("\r\n");
          out.write("\t\t ");
 if(readOnly != true) { 
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f10(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f11(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_volante_005fbutton_005f12(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write(" \r\n");
          out.write("\t\t\t<!-- ");
          if (_jspx_meth_volante_005fbutton_005f13(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write(" -->\r\n");
          out.write("         ");
 }
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("\t  </td>\r\n");
          out.write("      <td align=\"right\">\r\n");
          out.write("         <span align=\"right\">\r\n");
          out.write("              <input type=\"button\" class=\"LookupButtonStyle\" name=\"Print\" value=\"Printable View\" onclick=\"window.open('");
          out.print( "MessagesSingleWebForm.jsp?format=" + format  );
          out.write("')\"/>\r\n");
          out.write("          </span>\r\n");
          out.write("\t\t      ");
 if(readOnly == true){ 
          out.write("\r\n");
          out.write("        <span align=\"right\">\r\n");
          out.write("            <!-- ");
          if (_jspx_meth_volante_005fbutton_005f14(_jspx_th_volante_005fwebform_005f1, _jspx_page_context))
            return;
          out.write(" -->\r\n");
          out.write("            <!-- <input type=\"button\" class=\"LookupButtonStyle\" name=\"Return\" value=\"Return\" onclick=\"window.open('");
          out.print( returnPage);
          out.write("', '_self')\"/> -->\r\n");
          out.write("\t\t\t<input type=\"button\" class=\"LookupButtonStyle\" name=\"Close\" value=\"Close\" onclick=\"window.open('CloseForm.jsp', '_self')\"/>\r\n");
          out.write("\t\t\t\t\t\t   \r\n");
          out.write("\t\t</span>\r\n");
          out.write("\t\t");
}
          out.write("\r\n");
          out.write("\t   </td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("  </tbody>\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("        </table>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_volante_005fwebform_005f1.doAfterBody();
          errors = (java.lang.Boolean) _jspx_page_context.findAttribute("errors");
          completed = (java.lang.Boolean) _jspx_page_context.findAttribute("completed");
          formpages = (java.lang.Integer) _jspx_page_context.findAttribute("formpages");
          formpage = (java.lang.Integer) _jspx_page_context.findAttribute("formpage");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_volante_005fwebform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_volante_005fwebform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005femitStyles_005fcollapseEmptySections_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005femitStyles_005fcollapseEmptySections_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_volante_005fadderrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:adderrors
    com.tplus.transform.runtime.webforms.tag.AddValidationsTag _jspx_th_volante_005fadderrors_005f0 = (com.tplus.transform.runtime.webforms.tag.AddValidationsTag) _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.AddValidationsTag.class);
    _jspx_th_volante_005fadderrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fadderrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesWebForm.jsp(79,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setErrorRef("externalErrors");
    // /MessagesWebForm.jsp(79,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f0 = _jspx_th_volante_005fadderrors_005f0.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fadderrors_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:adderrors
    com.tplus.transform.runtime.webforms.tag.AddValidationsTag _jspx_th_volante_005fadderrors_005f1 = (com.tplus.transform.runtime.webforms.tag.AddValidationsTag) _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.AddValidationsTag.class);
    _jspx_th_volante_005fadderrors_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fadderrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesWebForm.jsp(80,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setErrorRef("processingErrors");
    // /MessagesWebForm.jsp(80,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f1 = _jspx_th_volante_005fadderrors_005f1.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fclearerrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f0 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesWebForm.jsp(107,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f0.setErrorRef("externalErrors");
    // /MessagesWebForm.jsp(107,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f0.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f0 = _jspx_th_volante_005fclearerrors_005f0.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fclearerrors_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f1 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesWebForm.jsp(108,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f1.setErrorRef("processingErrors");
    // /MessagesWebForm.jsp(108,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f1.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f1 = _jspx_th_volante_005fclearerrors_005f1.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005foutput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005finvokeMessageFlow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:output
    com.tplus.transform.runtime.webforms.core.OutputTag _jspx_th_volante_005foutput_005f0 = (com.tplus.transform.runtime.webforms.core.OutputTag) _005fjspx_005ftagPool_005fvolante_005foutput.get(com.tplus.transform.runtime.webforms.core.OutputTag.class);
    _jspx_th_volante_005foutput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005foutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finvokeMessageFlow_005f0);
    int _jspx_eval_volante_005foutput_005f0 = _jspx_th_volante_005foutput_005f0.doStartTag();
    if (_jspx_eval_volante_005foutput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_volante_005fparam_005f5(_jspx_th_volante_005foutput_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_volante_005foutput_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_volante_005foutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005foutput.reuse(_jspx_th_volante_005foutput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005foutput.reuse(_jspx_th_volante_005foutput_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fparam_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005foutput_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:param
    com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f5 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
    _jspx_th_volante_005fparam_005f5.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fparam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005foutput_005f0);
    // /MessagesWebForm.jsp(118,16) name = valueRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f5.setValueRef("rawOut");
    int _jspx_eval_volante_005fparam_005f5 = _jspx_th_volante_005fparam_005f5.doStartTag();
    if (_jspx_th_volante_005fparam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f5);
    return false;
  }

  private boolean _jspx_meth_volante_005fadderrors_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:adderrors
    com.tplus.transform.runtime.webforms.tag.AddValidationsTag _jspx_th_volante_005fadderrors_005f2 = (com.tplus.transform.runtime.webforms.tag.AddValidationsTag) _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.AddValidationsTag.class);
    _jspx_th_volante_005fadderrors_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fadderrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesWebForm.jsp(122,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f2.setErrorRef("processingErrors");
    // /MessagesWebForm.jsp(122,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f2.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f2 = _jspx_th_volante_005fadderrors_005f2.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f2);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f0 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesWebForm.jsp(135,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setName("Submit");
    // /MessagesWebForm.jsp(135,16) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setStyle("LookupButtonStyle");
    // /MessagesWebForm.jsp(135,16) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setLabel(" Overwrite ");
    // /MessagesWebForm.jsp(135,16) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setParams("task=saveAndRelease&filecheck=false");
    int _jspx_eval_volante_005fbutton_005f0 = _jspx_th_volante_005fbutton_005f0.doStartTag();
    if (_jspx_th_volante_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f1 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(7,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f1.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(7,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f1.setName("PreviousPage");
    // /MessagesButtons.jsp(7,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f1.setLabel("Previous");
    int _jspx_eval_volante_005fbutton_005f1 = _jspx_th_volante_005fbutton_005f1.doStartTag();
    if (_jspx_th_volante_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f2 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(10,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f2.setName("NextPage");
    // /MessagesButtons.jsp(10,4) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f2.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(10,4) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f2.setLabel(" Next ");
    int _jspx_eval_volante_005fbutton_005f2 = _jspx_th_volante_005fbutton_005f2.doStartTag();
    if (_jspx_th_volante_005fbutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f2);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f3 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f3.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(13,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setName("Submit");
    // /MessagesButtons.jsp(13,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(13,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setLabel(" Validate ");
    // /MessagesButtons.jsp(13,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f3.setParams("task=validate");
    int _jspx_eval_volante_005fbutton_005f3 = _jspx_th_volante_005fbutton_005f3.doStartTag();
    if (_jspx_th_volante_005fbutton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f3);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f4 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f4.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(14,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setName("Submit");
    // /MessagesButtons.jsp(14,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(14,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setLabel(" Save and Close");
    // /MessagesButtons.jsp(14,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f4.setParams("task=saveAsDraft");
    int _jspx_eval_volante_005fbutton_005f4 = _jspx_th_volante_005fbutton_005f4.doStartTag();
    if (_jspx_th_volante_005fbutton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f4);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f5 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f5.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(15,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f5.setName("Submit");
    // /MessagesButtons.jsp(15,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f5.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(15,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f5.setLabel(" Compare");
    // /MessagesButtons.jsp(15,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f5.setParams("task=compare");
    int _jspx_eval_volante_005fbutton_005f5 = _jspx_th_volante_005fbutton_005f5.doStartTag();
    if (_jspx_th_volante_005fbutton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f5);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f6 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f6.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(16,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f6.setName("Submit");
    // /MessagesButtons.jsp(16,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f6.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(16,8) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f6.setLabel(" Save & Release ");
    // /MessagesButtons.jsp(16,8) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f6.setParams("task=saveAndRelease");
    int _jspx_eval_volante_005fbutton_005f6 = _jspx_th_volante_005fbutton_005f6.doStartTag();
    if (_jspx_th_volante_005fbutton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f6);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f7 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f7.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(26,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setName("Submit");
    // /MessagesButtons.jsp(26,17) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(26,17) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setLabel("Return");
    // /MessagesButtons.jsp(26,17) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f7.setParams("task=return");
    int _jspx_eval_volante_005fbutton_005f7 = _jspx_th_volante_005fbutton_005f7.doStartTag();
    if (_jspx_th_volante_005fbutton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f7);
    return false;
  }

  private boolean _jspx_meth_volante_005fdisplayerrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:displayerrors
    com.tplus.transform.runtime.webforms.tag.DisplayErrorsTag _jspx_th_volante_005fdisplayerrors_005f0 = (com.tplus.transform.runtime.webforms.tag.DisplayErrorsTag) _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_0026_005ftype_005fnobody.get(com.tplus.transform.runtime.webforms.tag.DisplayErrorsTag.class);
    _jspx_th_volante_005fdisplayerrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fdisplayerrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesWebForm.jsp(170,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fdisplayerrors_005f0.setType("field-message");
    int _jspx_eval_volante_005fdisplayerrors_005f0 = _jspx_th_volante_005fdisplayerrors_005f0.doStartTag();
    if (_jspx_th_volante_005fdisplayerrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_0026_005ftype_005fnobody.reuse(_jspx_th_volante_005fdisplayerrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_0026_005ftype_005fnobody.reuse(_jspx_th_volante_005fdisplayerrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fdisplay_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:display
    com.tplus.transform.runtime.webforms.tag.DisplayTag _jspx_th_volante_005fdisplay_005f1 = (com.tplus.transform.runtime.webforms.tag.DisplayTag) _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.get(com.tplus.transform.runtime.webforms.tag.DisplayTag.class);
    _jspx_th_volante_005fdisplay_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fdisplay_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    int _jspx_eval_volante_005fdisplay_005f1 = _jspx_th_volante_005fdisplay_005f1.doStartTag();
    if (_jspx_th_volante_005fdisplay_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f8 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f8.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(7,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f8.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(7,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f8.setName("PreviousPage");
    // /MessagesButtons.jsp(7,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f8.setLabel("Previous");
    int _jspx_eval_volante_005fbutton_005f8 = _jspx_th_volante_005fbutton_005f8.doStartTag();
    if (_jspx_th_volante_005fbutton_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f8);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f9 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f9.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(10,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f9.setName("NextPage");
    // /MessagesButtons.jsp(10,4) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f9.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(10,4) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f9.setLabel(" Next ");
    int _jspx_eval_volante_005fbutton_005f9 = _jspx_th_volante_005fbutton_005f9.doStartTag();
    if (_jspx_th_volante_005fbutton_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f9);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f10 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f10.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(13,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f10.setName("Submit");
    // /MessagesButtons.jsp(13,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f10.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(13,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f10.setLabel(" Validate ");
    // /MessagesButtons.jsp(13,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f10.setParams("task=validate");
    int _jspx_eval_volante_005fbutton_005f10 = _jspx_th_volante_005fbutton_005f10.doStartTag();
    if (_jspx_th_volante_005fbutton_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f10);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f11 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f11.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(14,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f11.setName("Submit");
    // /MessagesButtons.jsp(14,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f11.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(14,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f11.setLabel(" Save and Close");
    // /MessagesButtons.jsp(14,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f11.setParams("task=saveAsDraft");
    int _jspx_eval_volante_005fbutton_005f11 = _jspx_th_volante_005fbutton_005f11.doStartTag();
    if (_jspx_th_volante_005fbutton_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f11);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f12 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f12.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(15,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f12.setName("Submit");
    // /MessagesButtons.jsp(15,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f12.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(15,3) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f12.setLabel(" Compare");
    // /MessagesButtons.jsp(15,3) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f12.setParams("task=compare");
    int _jspx_eval_volante_005fbutton_005f12 = _jspx_th_volante_005fbutton_005f12.doStartTag();
    if (_jspx_th_volante_005fbutton_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f12);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f13 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f13.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(16,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f13.setName("Submit");
    // /MessagesButtons.jsp(16,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f13.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(16,8) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f13.setLabel(" Save & Release ");
    // /MessagesButtons.jsp(16,8) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f13.setParams("task=saveAndRelease");
    int _jspx_eval_volante_005fbutton_005f13 = _jspx_th_volante_005fbutton_005f13.doStartTag();
    if (_jspx_th_volante_005fbutton_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f13);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f14 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f14.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f1);
    // /MessagesButtons.jsp(26,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f14.setName("Submit");
    // /MessagesButtons.jsp(26,17) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f14.setStyle("LookupButtonStyle");
    // /MessagesButtons.jsp(26,17) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f14.setLabel("Return");
    // /MessagesButtons.jsp(26,17) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f14.setParams("task=return");
    int _jspx_eval_volante_005fbutton_005f14 = _jspx_th_volante_005fbutton_005f14.doStartTag();
    if (_jspx_th_volante_005fbutton_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f14);
    return false;
  }
}
