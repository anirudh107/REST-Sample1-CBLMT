package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.volante.repository.design.web.*;
import com.volante.repository.design.*;
import java.util.*;
import javax.servlet.jsp.JspException;
import com.volante.repository.html.DesignerStartup;
import com.tplus.transform.design.app.Designer;
import java.net.URLDecoder;

public final class LoginAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      			"LoginForm.jsp", true, 8192, true);
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

    Designer designer = DesignerStartup.initDesigner(pageContext);
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	System.out.println("userName = " + 	userName);
  	RepositoryWebPerspective repositorySession = new RepositoryWebPerspective();
	Repository repository = (Repository)repositorySession.onOpenRepository(userName, password, designer);
	session.setAttribute("userName", userName);	
	session.setAttribute("repository", repository);	
	session.setAttribute("repositorySession", repositorySession);	
	System.out.println("repositorySession = " + 	repositorySession);
    String forwardTo=null;
    if(request.getQueryString() != null) {
	    //System.out.println("Login  action queryString = " + 	URLDecoder.decode(request.getQueryString()));
        //forwardTo = URLDecoder.decode(request.getQueryString());
    }

      out.write('\r');
      out.write('\n');
 if(forwardTo== null)  {
    response.sendRedirect("index.jsp");
 } else {
    response.sendRedirect(forwardTo);
 } 
      out.write("\r\n");
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
}
