package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.NormalizedObject;
import java.util.List;

public final class MessagesSummaryAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005foutput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005foutput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef.release();
    _005fjspx_005ftagPool_005fvolante_005finput.release();
    _005fjspx_005ftagPool_005fvolante_005foutput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.release();
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

      out.write("<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");

    List normalizedObjectCollection = (List) session.getAttribute("summaryList");
    String index = request.getParameter("index");
    String action = request.getParameter("action");
    NormalizedObject swiftInputObj = (NormalizedObject) normalizedObjectCollection.get(Integer.parseInt(index));

      out.write('\r');
      out.write('\n');

    if ("audit".equals(action)) {
        String messageId = (String) swiftInputObj.getField("MessageId");
        String format = "MessageAudit";
        String forwardTo = "AuditSummary.jsp?" + "format=" + format + "&direction=inbound";
        session.setAttribute("message", swiftInputObj);


      out.write('\r');
      out.write('\n');
      //  volante:query
      com.tplus.transform.runtime.webforms.core.QueryTag _jspx_th_volante_005fquery_005f0 = (com.tplus.transform.runtime.webforms.core.QueryTag) _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.get(com.tplus.transform.runtime.webforms.core.QueryTag.class);
      _jspx_th_volante_005fquery_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fquery_005f0.setParent(null);
      // /MessagesSummaryAction.jsp(24,0) name = queryName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setQueryName("findAuditMessages");
      // /MessagesSummaryAction.jsp(24,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setId("auditList");
      // /MessagesSummaryAction.jsp(24,0) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setFormat(format);
      // /MessagesSummaryAction.jsp(24,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setScope("session");
      int _jspx_eval_volante_005fquery_005f0 = _jspx_th_volante_005fquery_005f0.doStartTag();
      if (_jspx_eval_volante_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          //  volante:param
          com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f0 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
          _jspx_th_volante_005fparam_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fquery_005f0);
          // /MessagesSummaryAction.jsp(25,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fparam_005f0.setValue( messageId );
          int _jspx_eval_volante_005fparam_005f0 = _jspx_th_volante_005fparam_005f0.doStartTag();
          if (_jspx_th_volante_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_volante_005fquery_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_volante_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.reuse(_jspx_th_volante_005fquery_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.reuse(_jspx_th_volante_005fquery_005f0);
      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward( forwardTo);
        return;
      }
      out.write('\r');
      out.write('\n');

}
else {
    Object normalizedXML = swiftInputObj.getField("RawMessage");

      out.write('\r');
      out.write('\n');
      //  volante:invokeMessageFlow
      com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag _jspx_th_volante_005finvokeMessageFlow_005f0 = (com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag) _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef.get(com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag.class);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setParent(null);
      // /MessagesSummaryAction.jsp(33,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setName("ParseInternalMessage");
      // /MessagesSummaryAction.jsp(33,0) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setErrorRef("processingErrors");
      int _jspx_eval_volante_005finvokeMessageFlow_005f0 = _jspx_th_volante_005finvokeMessageFlow_005f0.doStartTag();
      if (_jspx_eval_volante_005finvokeMessageFlow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          //  volante:input
          com.tplus.transform.runtime.webforms.core.InputTag _jspx_th_volante_005finput_005f0 = (com.tplus.transform.runtime.webforms.core.InputTag) _005fjspx_005ftagPool_005fvolante_005finput.get(com.tplus.transform.runtime.webforms.core.InputTag.class);
          _jspx_th_volante_005finput_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finvokeMessageFlow_005f0);
          int _jspx_eval_volante_005finput_005f0 = _jspx_th_volante_005finput_005f0.doStartTag();
          if (_jspx_eval_volante_005finput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("        ");
              //  volante:param
              com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f1 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
              _jspx_th_volante_005fparam_005f1.setPageContext(_jspx_page_context);
              _jspx_th_volante_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
              // /MessagesSummaryAction.jsp(35,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f1.setValue( normalizedXML );
              int _jspx_eval_volante_005fparam_005f1 = _jspx_th_volante_005fparam_005f1.doStartTag();
              if (_jspx_th_volante_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
              out.write("\r\n");
              out.write("    ");
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
          out.write("    ");
          if (_jspx_meth_volante_005foutput_005f0(_jspx_th_volante_005finvokeMessageFlow_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_volante_005finvokeMessageFlow_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_volante_005finvokeMessageFlow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
      out.write("\r\n");
      out.write("\r\n");

    //System.out.println("ERRORs" + pageContext.getAttribute("processingErrors"));
    NormalizedObject messageNormalizedObject = (NormalizedObject) pageContext.getAttribute("noObj");
    String format = swiftInputObj.getField("Source_Message_Type") + "IM";
    String modelName = format + "model";
    request.setAttribute("format", format);
    session.setAttribute(modelName, messageNormalizedObject);
    session.setAttribute(modelName + "input", swiftInputObj);
    String forwardTo = "ViewMessageWebForm.jsp";

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward( forwardTo);
        return;
      }
      out.write("\r\n");
      out.write("\r\n");
 } 
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
        out.write("        ");
        if (_jspx_meth_volante_005fparam_005f2(_jspx_th_volante_005foutput_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
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

  private boolean _jspx_meth_volante_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005foutput_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:param
    com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f2 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
    _jspx_th_volante_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005foutput_005f0);
    // /MessagesSummaryAction.jsp(38,8) name = valueRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f2.setValueRef("noObj");
    int _jspx_eval_volante_005fparam_005f2 = _jspx_th_volante_005fparam_005f2.doStartTag();
    if (_jspx_th_volante_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
    return false;
  }
}
