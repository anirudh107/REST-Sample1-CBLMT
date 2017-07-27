package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.LookupHelper;
import com.tplus.transform.runtime.webforms.summary.SearchHelper;
import javax.servlet.jsp.JspException;
import java.util.List;

public final class MessagesSearchForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005foverride_0026_005ffieldName_005fchoiceList_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005faction_0026_005fstyle_005fparams_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005foverride_0026_005ffieldName_005fchoiceList_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005faction_0026_005fstyle_005fparams_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.release();
    _005fjspx_005ftagPool_005fvolante_005foverride_0026_005ffieldName_005fchoiceList_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005faction_0026_005fstyle_005fparams_005fname.release();
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
      out.write("<head>\r\n");
      out.write("    <title>Search Messages</title>\r\n");
      out.write("    <script src=\"scrollpos.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"datescripts.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\">\r\n");
      out.write("</head>\r\n");

    String requestURI = "MessagesSearchForm.jsp";
    String forwardPage = "MessagesSummary.jsp";
    boolean readOnly = false;
    String format = "MessagesSearch";
    String modelName = format + "model";
    List allMessages = SearchHelper.getAllMessages();
    allMessages.add(0, "");
    if (session.getAttribute(modelName) == null) {

      out.write('\r');
      out.write('\n');
      //  volante:createNo
      com.tplus.transform.runtime.webforms.core.CreateNormalizedObjectTag _jspx_th_volante_005fcreateNo_005f0 = (com.tplus.transform.runtime.webforms.core.CreateNormalizedObjectTag) _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.get(com.tplus.transform.runtime.webforms.core.CreateNormalizedObjectTag.class);
      _jspx_th_volante_005fcreateNo_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fcreateNo_005f0.setParent(null);
      // /MessagesSearchForm.jsp(28,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fcreateNo_005f0.setId( modelName);
      // /MessagesSearchForm.jsp(28,0) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fcreateNo_005f0.setFormat( format);
      // /MessagesSearchForm.jsp(28,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fcreateNo_005f0.setScope("session");
      int _jspx_eval_volante_005fcreateNo_005f0 = _jspx_th_volante_005fcreateNo_005f0.doStartTag();
      if (_jspx_th_volante_005fcreateNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.reuse(_jspx_th_volante_005fcreateNo_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.reuse(_jspx_th_volante_005fcreateNo_005f0);
      out.write('\r');
      out.write('\n');
 } 
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
      out.write("    ");
      if (_jspx_meth_volante_005fclearerrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_volante_005fclearerrors_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      //  volante:webform
      com.tplus.transform.runtime.webforms.tag.WebFormTag _jspx_th_volante_005fwebform_005f0 = (com.tplus.transform.runtime.webforms.tag.WebFormTag) _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.get(com.tplus.transform.runtime.webforms.tag.WebFormTag.class);
      _jspx_th_volante_005fwebform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fwebform_005f0.setParent(null);
      // /MessagesSearchForm.jsp(35,4) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setFormat( format );
      // /MessagesSearchForm.jsp(35,4) name = checkMandatoryFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setCheckMandatoryFields(false);
      // /MessagesSearchForm.jsp(35,4) name = errorStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setErrorStyle("tooltippopup");
      // /MessagesSearchForm.jsp(35,4) name = modelRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setModelRef( modelName);
      // /MessagesSearchForm.jsp(35,4) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setRequestURI( requestURI);
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
          out.write("       ");
          //  volante:override
          com.tplus.transform.runtime.webforms.tag.OverrideTag _jspx_th_volante_005foverride_005f0 = (com.tplus.transform.runtime.webforms.tag.OverrideTag) _005fjspx_005ftagPool_005fvolante_005foverride_0026_005ffieldName_005fchoiceList_005fnobody.get(com.tplus.transform.runtime.webforms.tag.OverrideTag.class);
          _jspx_th_volante_005foverride_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005foverride_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
          // /MessagesSearchForm.jsp(37,7) name = fieldName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005foverride_005f0.setFieldName("MessageName");
          // /MessagesSearchForm.jsp(37,7) name = choiceList type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005foverride_005f0.setChoiceList( allMessages);
          int _jspx_eval_volante_005foverride_005f0 = _jspx_th_volante_005foverride_005f0.doStartTag();
          if (_jspx_th_volante_005foverride_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005foverride_0026_005ffieldName_005fchoiceList_005fnobody.reuse(_jspx_th_volante_005foverride_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005foverride_0026_005ffieldName_005fchoiceList_005fnobody.reuse(_jspx_th_volante_005foverride_005f0);
          out.write(" \r\n");
          out.write("        <!--- Using table for laying out buttons, tabs, error messages & form -->\r\n");
          out.write("        ");
 if (completed.booleanValue()) {
            DataObject model = (DataObject) session.getAttribute(modelName);
            List objectCollection = SearchHelper.search(model);
            session.setAttribute("summaryList", objectCollection);
        
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          if (true) {
            _jspx_page_context.forward( forwardPage);
            return;
          }
          out.write("\r\n");
          out.write("        ");
 }
        else { 
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f1(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        <table style=\"margin-left:50px\" width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
          out.write("            <!--- display top level errors -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td style=\"height:40\"><span class=\"titleStyle\"> SEARCH   </span></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <!--- display the  form -->\r\n");
          out.write("            <tr >\r\n");
          out.write("                <td style=\"border-width:1px;border-style:solid;border-color:gray\">");
          if (_jspx_meth_volante_005fdisplay_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <!--- display the  search button -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td align=\"right\"><br>\r\n");
          out.write("                    ");
          if (_jspx_meth_volante_005faction_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
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
        _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
      out.write("\r\n");
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
    // /MessagesSearchForm.jsp(33,4) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f0.setErrorRef("externalErrors");
    // /MessagesSearchForm.jsp(33,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /MessagesSearchForm.jsp(34,4) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f1.setErrorRef("processingErrors");
    // /MessagesSearchForm.jsp(34,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /MessagesSearchForm.jsp(48,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setErrorRef("externalErrors");
    // /MessagesSearchForm.jsp(48,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f0 = _jspx_th_volante_005fadderrors_005f0.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
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
    // /MessagesSearchForm.jsp(51,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setErrorRef("processingErrors");
    // /MessagesSearchForm.jsp(51,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f1 = _jspx_th_volante_005fadderrors_005f1.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
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

  private boolean _jspx_meth_volante_005faction_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:action
    com.tplus.transform.runtime.webforms.tag.ActionTag _jspx_th_volante_005faction_005f0 = (com.tplus.transform.runtime.webforms.tag.ActionTag) _005fjspx_005ftagPool_005fvolante_005faction_0026_005fstyle_005fparams_005fname.get(com.tplus.transform.runtime.webforms.tag.ActionTag.class);
    _jspx_th_volante_005faction_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005faction_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesSearchForm.jsp(64,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005faction_005f0.setName("Submit");
    // /MessagesSearchForm.jsp(64,20) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005faction_005f0.setStyle("SearchStyle");
    // /MessagesSearchForm.jsp(64,20) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005faction_005f0.setParams("task=Search");
    int _jspx_eval_volante_005faction_005f0 = _jspx_th_volante_005faction_005f0.doStartTag();
    if (_jspx_eval_volante_005faction_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_volante_005faction_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_volante_005faction_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_volante_005faction_005f0.doInitBody();
      }
      do {
        out.write("<img class=\"SearchStyle\" src=\"images/searchlink.gif\" alt=\"Search\"/>");
        int evalDoAfterBody = _jspx_th_volante_005faction_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_volante_005faction_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_volante_005faction_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005faction_0026_005fstyle_005fparams_005fname.reuse(_jspx_th_volante_005faction_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005faction_0026_005fstyle_005fparams_005fname.reuse(_jspx_th_volante_005faction_005f0);
    return false;
  }
}
