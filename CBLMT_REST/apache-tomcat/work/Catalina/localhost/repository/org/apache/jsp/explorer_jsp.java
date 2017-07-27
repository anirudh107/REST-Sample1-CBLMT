package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.volante.repository.design.web.*;
import com.tplus.transform.design.*;
import com.volante.repository.design.*;
import java.util.*;
import javax.servlet.jsp.JspException;
import com.volante.repository.design.MessageFormat;
import com.volante.repository.html.RepositoryExplorerTableDecorator;
import java.net.URLEncoder;

public final class explorer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/WEB-INF/display.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005fvalign_005ftitle_005fproperty_005fnowrap_005fdecorator_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005fvalign_005ftitle_005fproperty_005fnowrap_005fdecorator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005fvalign_005ftitle_005fproperty_005fnowrap_005fdecorator_005fnobody.release();
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
      out.write('\r');
      out.write('\n');

	if (session.getAttribute("userName") == null || session.getAttribute("repositorySession") == null) {
    String forwardTo = "LoginForm.jsp";
	if (request.getQueryString() != null ) {
        //forwardTo +="?" + URLEncoder.encode(request.getRequestURI() + "?" + request.getQueryString());
    }
     forwardTo = "Reload.html";

      out.write('\r');
      out.write('\n');
      out.write('	');
      if (true) {
        _jspx_page_context.forward( forwardTo );
        return;
      }
      out.write('\r');
      out.write('\n');

	}
	else {
		//System.out.println("User = " + session.getAttribute("userName"));
	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"explorer.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("<SCRIPT LANGUAGE=\"JAVASCRIPT\" SRC=\"tree.js\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" rightmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");

    long start = System.currentTimeMillis();
    RepositoryWebPerspective repositorySession = (RepositoryWebPerspective)session.getAttribute("repositorySession");
	Repository repository = (Repository)session.getAttribute("repository");
	String toExpand= request.getParameter("expand");
    if(toExpand != null) {
        String elmType = request.getParameter("type");
        String id = request.getParameter("ID");
        String name = request.getParameter("name");
    	IDesignElement elm = repositorySession.getRepositoryElement(elmType, name, id);
        if(elm instanceof RepositoryElement) {
            repositorySession.loadAllVersions(elm);
        }
        request.setAttribute("toExpand", elm);
    }

    List allElements = RepositoryExplorerTableDecorator.getAllElements(repository, pageContext);
	pageContext.setAttribute("explorer", allElements);

      out.write('\r');
      out.write('\n');
      out.write('	');
      //  display:table
      com.volante.util.html.tag.TableTag _jspx_th_display_005ftable_005f0 = (com.volante.util.html.tag.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.get(com.volante.util.html.tag.TableTag.class);
      _jspx_th_display_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005ftable_005f0.setParent(null);
      // /explorer.jsp(43,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setWidth("100%");
      // /explorer.jsp(43,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setName("explorer");
      // /explorer.jsp(43,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setScope("page");
      // /explorer.jsp(43,1) name = border type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setBorder("0");
      // /explorer.jsp(43,1) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setCellpadding("1");
      // /explorer.jsp(43,1) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setCellspacing("0");
      // /explorer.jsp(43,1) name = bgcolor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setBgcolor("#CCCCCC");
      // /explorer.jsp(43,1) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setStyleClass("explorertable");
      // /explorer.jsp(43,1) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setDecorator("com.volante.repository.html.RepositoryExplorerTableDecorator");
      int _jspx_eval_display_005ftable_005f0 = _jspx_th_display_005ftable_005f0.doStartTag();
      if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Integer table_index = null;
        java.lang.Object table_item = null;
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005ftable_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005ftable_005f0.doInitBody();
        }
        table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
        table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
        do {
          out.write("\r\n");
          out.write(" \t  ");
          if (_jspx_meth_display_005fcolumn_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_display_005ftable_005f0.doAfterBody();
          table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
          table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_display_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f0 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005fvalign_005ftitle_005fproperty_005fnowrap_005fdecorator_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /explorer.jsp(44,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setProperty("name");
    // /explorer.jsp(44,4) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setTitle("Explorer");
    // /explorer.jsp(44,4) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setNowrap("true");
    // /explorer.jsp(44,4) name = valign type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setValign("center");
    // /explorer.jsp(44,4) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setDecorator("com.volante.repository.html.RepositoryExplorerDecorator");
    int _jspx_eval_display_005fcolumn_005f0 = _jspx_th_display_005fcolumn_005f0.doStartTag();
    if (_jspx_th_display_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005fvalign_005ftitle_005fproperty_005fnowrap_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005fvalign_005ftitle_005fproperty_005fnowrap_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
    return false;
  }
}
