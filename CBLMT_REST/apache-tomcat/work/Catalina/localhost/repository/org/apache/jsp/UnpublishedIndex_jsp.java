package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.volante.repository.design.web.*;
import java.util.*;

public final class UnpublishedIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/WEB-INF/display.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fpagesize_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fpagesize_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fpagesize_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
	// tell 'header.html' which tab to put forward.
	int tab = 2;
	int level = 1;
	int row = -1;	

      out.write('\r');
      out.write('\n');
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"header.css\">   \r\n");
      out.write("\r\n");

	//include java.util package in the .jsp that includes this
	// Get today's date to print out in the table
        java.text.SimpleDateFormat formatter
            = new java.text.SimpleDateFormat ("'<small>'EEEE '-' MMMM'</small>' d");
        Date currentTime_1 = new Date();
        String dateString = formatter.format(currentTime_1);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 if (tab != -1) {

      out.write("\r\n");
      out.write("\t<table class=\"tabMenu\" border=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
		if (tab == 2)  {

      out.write(" \r\n");
      out.write("\t\t\t<td class=\"tabActive\" width=\"60\">Unpublished</td>\r\n");
		} else { 

      out.write("\r\n");
      out.write("\t\t\t<td class=\"tabInactive\" width=\"60\">\r\n");
      out.write("\t\t\t\t<A class=\"LNK\" href=\"UnpublishedIndex.jsp\">Unpublished</a>\r\n");
      out.write("\t\t\t</td>\r\n");
		} 
      out.write("\r\n");
      out.write("\r\n");
		if (tab == 3)  { 

      out.write("\r\n");
      out.write("\t\t\t<td class=\"tabActive\" nowrap=\"true\"  align='center' width=\"115\">Data Dictionary</td>\r\n");
		} else { 

      out.write(" \r\n");
      out.write("\t\t\t<td class=\"tabInactive\" nowrap=\"true\" align='center' width=\"115\">\r\n");
      out.write("\t\t\t\t<A class=\"LNK\" href=\"DataDictionary.jsp\">Data Dictionary</a>\r\n");
      out.write("\t\t\t</td>\r\n");
		} 

      out.write('\r');
      out.write('\n');
		if (tab == 4)  { 

      out.write("\r\n");
      out.write("\t\t\t<td class=\"tabActive\" width=\"55\">EIM</td>\r\n");
		} else { 

      out.write(" \r\n");
      out.write("\t\t\t<td class=\"tabInactive\" width=\"55\">\r\n");
      out.write("\t\t\t\t<A class=\"LNK\" href=\"MessageCatalog.jsp\">EIM</a>\r\n");
      out.write("\t\t\t</td>\r\n");
		} 

      out.write('\r');
      out.write('\n');
		if (tab == 5)  {

      out.write("\r\n");
      out.write("\t\t\t<td class=\"tabActive\" width=\"55\">Search</td>\r\n");
		} else {

      out.write("\r\n");
      out.write("\t\t\t<td class=\"tabInactive\" width=\"55\">\r\n");
      out.write("\t\t\t\t<A class=\"LNK\" href=\"Search.jsp\">Search</a>\r\n");
      out.write("\t\t\t</td>\r\n");
		}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
				String userName = (String)session.getAttribute("userName") ;
		if (!request.getServletPath().equals("/LoginForm.jsp") && userName != null) {   

      out.write("\r\n");
      out.write("  \t\t\t<td class=\"tabUserName\" >   \r\n");
      out.write("    \t\t\t[<A class=\"LNK\" href=\"LoginForm.jsp\" TARGET=\"_top\"> Logout ");
      out.print( userName);
      out.write("</a>]\r\n");
      out.write("  \t\t\t</td>\r\n");

		}

      out.write("\r\n");
      out.write("\t\t<td class=\"tabDate\" width=\"135\">\r\n");
      out.write("\t\t\t");
      out.print( dateString );
      out.write("\r\n");
      out.write("\t\t</td>\t\r\n");
      out.write("\t\t<td width=\"1%\" bgcolor=\"#BBCEDB\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
 } 

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"designer.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<!-- Top level table that contains category tables in its rows -->\t\t\t\t\t\t\r\n");
      out.write("<!--table width=\"95%\"  border=\"0\" cellpadding=\"10\" cellspacing=\"10\" -->\r\n");
      out.write("\r\n");

	RepositoryWebPerspective repositorySession = (RepositoryWebPerspective)session.getAttribute("repositorySession");
	System.out.println("*********RepositoryWebPerspective = " + 	repositorySession);
	List unpublished = repositorySession.getUnpublishedElements();
	session.setAttribute("unpublished", unpublished);

      out.write("\r\n");
      out.write("    ");
      //  display:table
      com.volante.util.html.tag.TableTag _jspx_th_display_005ftable_005f0 = (com.volante.util.html.tag.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fpagesize_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.get(com.volante.util.html.tag.TableTag.class);
      _jspx_th_display_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005ftable_005f0.setParent(null);
      // /UnpublishedIndex.jsp(34,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setWidth("100%");
      // /UnpublishedIndex.jsp(34,4) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setStyleClass("detailTable");
      // /UnpublishedIndex.jsp(34,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setName("unpublished");
      // /UnpublishedIndex.jsp(34,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setScope("session");
      // /UnpublishedIndex.jsp(34,4) name = pagesize type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setPagesize("15");
      // /UnpublishedIndex.jsp(34,4) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setCellspacing("0");
      // /UnpublishedIndex.jsp(34,4) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setCellpadding("4");
      // /UnpublishedIndex.jsp(34,4) name = border type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setBorder("0");
      // /UnpublishedIndex.jsp(34,4) name = bgcolor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setBgcolor("#CCCCCC");
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
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f1(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f3(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f4(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fsetProperty_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
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
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fpagesize_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fpagesize_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f0);
      out.write("\r\n");
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

  private boolean _jspx_meth_display_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f0 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /UnpublishedIndex.jsp(35,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setProperty("name");
    // /UnpublishedIndex.jsp(35,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setTitle("Name");
    // /UnpublishedIndex.jsp(35,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setStyleClass("tableColEven");
    // /UnpublishedIndex.jsp(35,6) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setDecorator("com.volante.repository.html.ViewItemDecorator");
    int _jspx_eval_display_005fcolumn_005f0 = _jspx_th_display_005fcolumn_005f0.doStartTag();
    if (_jspx_th_display_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f1 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /UnpublishedIndex.jsp(36,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setProperty("version");
    // /UnpublishedIndex.jsp(36,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setTitle("Version");
    // /UnpublishedIndex.jsp(36,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setStyleClass("tableColOdd");
    int _jspx_eval_display_005fcolumn_005f1 = _jspx_th_display_005fcolumn_005f1.doStartTag();
    if (_jspx_th_display_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f2 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /UnpublishedIndex.jsp(37,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setProperty("description");
    // /UnpublishedIndex.jsp(37,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setTitle("Description");
    // /UnpublishedIndex.jsp(37,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setStyleClass("tableColEven");
    int _jspx_eval_display_005fcolumn_005f2 = _jspx_th_display_005fcolumn_005f2.doStartTag();
    if (_jspx_th_display_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f3 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /UnpublishedIndex.jsp(38,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f3.setProperty("creator");
    // /UnpublishedIndex.jsp(38,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f3.setTitle("Creator");
    // /UnpublishedIndex.jsp(38,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f3.setStyleClass("tableColOdd");
    int _jspx_eval_display_005fcolumn_005f3 = _jspx_th_display_005fcolumn_005f3.doStartTag();
    if (_jspx_th_display_005fcolumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f3);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f4 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f4.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /UnpublishedIndex.jsp(39,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f4.setProperty("creationTime");
    // /UnpublishedIndex.jsp(39,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f4.setTitle("Creation Time");
    // /UnpublishedIndex.jsp(39,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f4.setStyleClass("tableColEven");
    int _jspx_eval_display_005fcolumn_005f4 = _jspx_th_display_005fcolumn_005f4.doStartTag();
    if (_jspx_th_display_005fcolumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f4);
    return false;
  }

  private boolean _jspx_meth_display_005fsetProperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:setProperty
    com.volante.util.html.tag.SetPropertyTag _jspx_th_display_005fsetProperty_005f0 = (com.volante.util.html.tag.SetPropertyTag) _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.get(com.volante.util.html.tag.SetPropertyTag.class);
    _jspx_th_display_005fsetProperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fsetProperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /UnpublishedIndex.jsp(40,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fsetProperty_005f0.setName("basic.table.header");
    // /UnpublishedIndex.jsp(40,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fsetProperty_005f0.setValue("Unpublished Elements");
    int _jspx_eval_display_005fsetProperty_005f0 = _jspx_th_display_005fsetProperty_005f0.doStartTag();
    if (_jspx_th_display_005fsetProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_display_005fsetProperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_display_005fsetProperty_005f0);
    return false;
  }
}
