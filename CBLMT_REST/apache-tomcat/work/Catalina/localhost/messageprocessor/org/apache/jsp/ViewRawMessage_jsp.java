package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.*;
import com.tplus.transform.runtime.persistence.expression.*;
import java.util.*;
import java.io.*;

public final class ViewRawMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005foutput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005foutput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef.release();
    _005fjspx_005ftagPool_005fvolante_005finput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>New Message</title>\r\n");
      out.write("    <meta http-equiv=\"Cache-control\" content=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
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
      out.write("<center>\r\n");
      out.write("    ");

        String index = request.getParameter("index");
        List normalizedObjectCollection = (List) session.getAttribute("summaryList");
        NormalizedObject normalizedObject = (NormalizedObject) normalizedObjectCollection.get(Integer.parseInt(index));
        String messageType = (String) normalizedObject.getField("MessageName");
    
      out.write('\r');
      out.write('\n');
      //  volante:invokeMessageFlow
      com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag _jspx_th_volante_005finvokeMessageFlow_005f0 = (com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag) _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fname_005ferrorRef.get(com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag.class);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setParent(null);
      // /ViewRawMessage.jsp(28,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setName("GetRawMessageFlow");
      // /ViewRawMessage.jsp(28,0) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
              com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f0 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
              _jspx_th_volante_005fparam_005f0.setPageContext(_jspx_page_context);
              _jspx_th_volante_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
              // /ViewRawMessage.jsp(30,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f0.setValue( normalizedObject );
              int _jspx_eval_volante_005fparam_005f0 = _jspx_th_volante_005fparam_005f0.doStartTag();
              if (_jspx_th_volante_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
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
      out.write("    ");

        String rawMessageStr = (String)pageContext.getAttribute("RawMessage");
		if(rawMessageStr == null) {
			rawMessageStr = "";
		}
    
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <FORM NAME=\"RawMessageForm\" accept-charset=\"UTF-8\" >\r\n");
      out.write("        <TABLE class=\"TableStyle\" style=\"max-width:90%;max-width:800px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"90%\" align=\"center\">\r\n");
      out.write("            <TR class=\"Header\">\r\n");
      out.write("                <TD height=\"25\">\r\n");
      out.write("                    <img src=\"images/icon_test_request.gif\" alt=\"\"/>\r\n");
      out.write("                    <span style=\"vertical-align:middle;\">&nbsp;Raw Message '");
      out.print(messageType);
      out.write("'</span>\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD class=\"DefaultRendererStyle\" colspan=\"2\">\r\n");
      out.write("                    <TEXTAREA style=\"border:none;width:100%;max-width:800px\"  NAME=\"RawMessage\" ROWS=\"20\"  \r\n");
      out.write("                              readonly=\"true\">");
      out.print(rawMessageStr);
      out.write("\r\n");
      out.write("                    </TEXTAREA>\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("        </TABLE>\r\n");
      out.write("    </FORM>\r\n");
      out.write("</center>\r\n");
      out.write("<center>\r\n");
      out.write("    <input type=\"button\" class=\"LookupButtonStyle\" name=\"Return\" value=\"Return\"\r\n");
      out.write("           onclick=\"window.open('MessagesSummary.jsp', '_self')\"/>\r\n");
      out.write("</center>\r\n");
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
        if (_jspx_meth_volante_005fparam_005f1(_jspx_th_volante_005foutput_005f0, _jspx_page_context))
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

  private boolean _jspx_meth_volante_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005foutput_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:param
    com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f1 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
    _jspx_th_volante_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005foutput_005f0);
    // /ViewRawMessage.jsp(33,8) name = valueRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f1.setValueRef("RawMessage");
    int _jspx_eval_volante_005fparam_005f1 = _jspx_th_volante_005fparam_005f1.doStartTag();
    if (_jspx_th_volante_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
    return false;
  }
}
