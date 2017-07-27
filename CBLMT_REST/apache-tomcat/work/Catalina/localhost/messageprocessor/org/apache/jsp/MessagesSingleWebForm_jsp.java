package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class MessagesSingleWebForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005ferrorBackground_005femitStyles_005fcheckMandatoryFields;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplay_0026_005fpage_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005ferrorBackground_005femitStyles_005fcheckMandatoryFields = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplay_0026_005fpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005ferrorBackground_005femitStyles_005fcheckMandatoryFields.release();
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplay_0026_005fpage_005fnobody.release();
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
      out.write("<html>\r\n");

    String returnPage = (String) session.getAttribute("WebFormReturnPage");
    if (returnPage == null) {
        returnPage = "MessagesSummary.jsp"; 
    }
    String requestURI = "MessagesSingleWebForm.jsp";
    boolean readOnly = true;
    String format = request.getParameter("format");
    if (format == null) {
        format = (String) request.getAttribute("format");
        if (format == null) {

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("MessagesSearchForm.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

        }
    }
    String modelName = format + "model";

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>SWIFT Message Details - ");
      out.print(format);
      out.write(" - STM </title>\r\n");
      out.write("    <META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <SCRIPT type=\"text/javascript\" SRC=\"scrollpos.js\"></SCRIPT>\r\n");
      out.write("\t<SCRIPT type=\"text/javascript\" SRC=\"lookupbic.js\"></SCRIPT>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webprintform.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"restoreScrollPosition();\" style=\"margin :0;\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    ");
      //  volante:webform
      com.tplus.transform.runtime.webforms.tag.WebFormTag _jspx_th_volante_005fwebform_005f0 = (com.tplus.transform.runtime.webforms.tag.WebFormTag) _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005ferrorBackground_005femitStyles_005fcheckMandatoryFields.get(com.tplus.transform.runtime.webforms.tag.WebFormTag.class);
      _jspx_th_volante_005fwebform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fwebform_005f0.setParent(null);
      // /MessagesSingleWebForm.jsp(38,4) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setFormat( format );
      // /MessagesSingleWebForm.jsp(38,4) name = checkMandatoryFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setCheckMandatoryFields(false);
      // /MessagesSingleWebForm.jsp(38,4) name = errorStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setErrorStyle("text-right-align");
      // /MessagesSingleWebForm.jsp(38,4) name = modelRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setModelRef( modelName);
      // /MessagesSingleWebForm.jsp(38,4) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setRequestURI( requestURI);
      // /MessagesSingleWebForm.jsp(38,4) name = readOnly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setReadOnly( readOnly);
      // /MessagesSingleWebForm.jsp(38,4) name = mandatoryMarker type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setMandatoryMarker( !readOnly);
      // /MessagesSingleWebForm.jsp(38,4) name = hideNullFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setHideNullFields( readOnly);
      // /MessagesSingleWebForm.jsp(38,4) name = useLabelForReadOnly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setUseLabelForReadOnly(true);
      // /MessagesSingleWebForm.jsp(38,4) name = errorBackground type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setErrorBackground("#FFFFFF");
      // /MessagesSingleWebForm.jsp(38,4) name = emitStyles type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("\r\n");
          out.write("        ");
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
          out.write("        <!--- Using table for laying out buttons, tabs, error messages & form -->\r\n");
          out.write("        <table width=\"90%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
          out.write("\r\n");
          out.write("            <!--- display top level errors -->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_volante_005fdisplayerrors_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("            </tr>\r\n");
          out.write("\r\n");
          out.write("            <!--- display a row of tabs-->\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td><br></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                 <td>\r\n");
          out.write("            <!--- display the  form -->\r\n");
          out.write("            ");

              int totalPages = ((java.lang.Integer)pageContext.getAttribute("formpages")).intValue();
                for(int i =1; i<=totalPages;++i ) {  
          out.write("\r\n");
          out.write("                    ");
          //  volante:display
          com.tplus.transform.runtime.webforms.tag.DisplayTag _jspx_th_volante_005fdisplay_005f0 = (com.tplus.transform.runtime.webforms.tag.DisplayTag) _005fjspx_005ftagPool_005fvolante_005fdisplay_0026_005fpage_005fnobody.get(com.tplus.transform.runtime.webforms.tag.DisplayTag.class);
          _jspx_th_volante_005fdisplay_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005fdisplay_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
          // /MessagesSingleWebForm.jsp(69,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fdisplay_005f0.setPage(i );
          int _jspx_eval_volante_005fdisplay_005f0 = _jspx_th_volante_005fdisplay_005f0.doStartTag();
          if (_jspx_th_volante_005fdisplay_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005fdisplay_0026_005fpage_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005fdisplay_0026_005fpage_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f0);
          out.write("\r\n");
          out.write("            ");
 }  
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
        _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005ferrorBackground_005femitStyles_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005fuseLabelForReadOnly_005frequestURI_005freadOnly_005fmodelRef_005fmandatoryMarker_005fhideNullFields_005fformat_005ferrorStyle_005ferrorBackground_005femitStyles_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
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

  private boolean _jspx_meth_volante_005fadderrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:adderrors
    com.tplus.transform.runtime.webforms.tag.AddValidationsTag _jspx_th_volante_005fadderrors_005f0 = (com.tplus.transform.runtime.webforms.tag.AddValidationsTag) _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.AddValidationsTag.class);
    _jspx_th_volante_005fadderrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fadderrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /MessagesSingleWebForm.jsp(43,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setErrorRef("externalErrors");
    // /MessagesSingleWebForm.jsp(43,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /MessagesSingleWebForm.jsp(49,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setErrorRef("processingErrors");
    // /MessagesSingleWebForm.jsp(49,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f1 = _jspx_th_volante_005fadderrors_005f1.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f1);
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
}
