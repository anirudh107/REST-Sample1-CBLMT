package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.volante.repository.design.web.*;
import com.tplus.transform.design.*;
import com.volante.repository.design.*;
import java.util.*;
import javax.servlet.jsp.JspException;

public final class ViewElement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/WEB-INF/display.tld");
    _jspx_dependants.add("/WEB-INF/repository.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005frepository_005fviewitem_0026_005fdesignElement_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005frepository_005fviewitem_0026_005fdesignElement_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005frepository_005fviewitem_0026_005fdesignElement_005fnobody.release();
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"designer.css\">\r\n");
      out.write("<SCRIPT LANGUAGE=\"JAVASCRIPT\" SRC=\"tree.js\"></SCRIPT>\r\n");
      out.write("\r\n");
	// tell 'header.html' which tab to put forward.
	int tab = 0;
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("<body leftmargin=\"5\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");

	RepositoryWebPerspective repositorySession = (RepositoryWebPerspective)session.getAttribute("repositorySession");
	IDesignElement elm= (IDesignElement)request.getAttribute("item");

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("     <p class='title1'>");
      out.print( elm.getDisplayName() );
      out.write(" </p>\r\n");
      out.write("</center>\r\n");
      out.write("\t  ");
      //  repository:viewitem
      com.volante.repository.design.serial.html.tag.DesignElementTag _jspx_th_repository_005fviewitem_005f0 = (com.volante.repository.design.serial.html.tag.DesignElementTag) _005fjspx_005ftagPool_005frepository_005fviewitem_0026_005fdesignElement_005fnobody.get(com.volante.repository.design.serial.html.tag.DesignElementTag.class);
      _jspx_th_repository_005fviewitem_005f0.setPageContext(_jspx_page_context);
      _jspx_th_repository_005fviewitem_005f0.setParent(null);
      // /ViewElement.jsp(37,3) name = designElement type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_repository_005fviewitem_005f0.setDesignElement( elm );
      int _jspx_eval_repository_005fviewitem_005f0 = _jspx_th_repository_005fviewitem_005f0.doStartTag();
      if (_jspx_th_repository_005fviewitem_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005frepository_005fviewitem_0026_005fdesignElement_005fnobody.reuse(_jspx_th_repository_005fviewitem_005f0);
        return;
      }
      _005fjspx_005ftagPool_005frepository_005fviewitem_0026_005fdesignElement_005fnobody.reuse(_jspx_th_repository_005fviewitem_005f0);
      out.write("\r\n");
      out.write("\t <br>\r\n");
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
