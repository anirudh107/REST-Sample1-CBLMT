package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.volante.repository.design.web.*;
import com.volante.repository.design.*;
import java.util.*;
import javax.servlet.jsp.JspException;
import com.tplus.transform.design.IDesignElement;
import com.volante.repository.html.RepositoryLinkGenerator;
import java.net.URLEncoder;

public final class ViewItem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/CheckUser.jsp");
  }

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
      out.write("\r\n");

	String forwardPage="NoItem.jsp";
	RepositoryWebPerspective repositorySession = (RepositoryWebPerspective)session.getAttribute("repositorySession");
	Repository repository = (Repository)session.getAttribute("repository");
    pageContext.setAttribute("linkgenerator", new RepositoryLinkGenerator(), PageContext.REQUEST_SCOPE);
	String elmType = request.getParameter("type");
	String id = request.getParameter("ID");
	String name = request.getParameter("name");
	String subname = request.getParameter("subname");
    String toGetType = elmType;
    if(elmType.equals(BusinessSubElement.BUSINESS_SUB_ELEMENT)) {
        toGetType = CompoundBusinessElement.COMPOUND_BUSINESS_ELEMENT;
    }
	if(elmType.equals(Repository.REPOSITORY)) {
		forwardPage = "Repository.jsp";
	}
	else if(elmType.equals(DataDictionary.DATA_DICTIONARY)) {
		forwardPage = "DataDictionary.jsp";
	}
	else if(elmType.equals(MessageCatalog.MESSAGE_CATALOG)) {
		forwardPage = "MessageCatalog.jsp";
	}
	else if(elmType.equals(CartridgeCatalog.CARTRIDGE_CATALOG)) {
		forwardPage = "CartridgeCatalog.jsp";
	}
    else {
        IDesignElement elm = repositorySession.getRepositoryElement(toGetType, name, id);
        //System.out.println("ViewItem?type=" + toGetType +"&ID=" + id + "&name=" + name +"&subname=" + subname);
        if(elm == null) {
            throw new Exception("Error locating " + " type=" + elmType +"&ID=" + id + "&name=" + name);
        }
        request.setAttribute("item", elm);
        if(elmType.equals(MessageMaster.MESSAGE)) {
            forwardPage = "MessageMaster.jsp";
        }
        else if(elmType.equals(Message.MESSAGE_VERSION)) {
            forwardPage = "Message.jsp";
        }
        else if(elmType.equals(BusinessClass.BUSINESS_CLASS_TYPE)) {
            forwardPage = "BusinessClass.jsp";
        }
        else if(elmType.equals(BusinessElementReference.BUSINESS_ELEMENT)) {
            forwardPage = "BusinessElementMaster.jsp";
        }
        else if(elmType.equals(CompoundBusinessElement.COMPOUND_BUSINESS_ELEMENT) || elmType.equals(SimpleBusinessElement.SIMPLE_BUSINESS_ELEMENT)) {
            if(subname != null) {
                CompoundBusinessElement cbe = (CompoundBusinessElement)elm;
                elm = cbe.getBusinessSubElement(subname);
                request.setAttribute("item", elm);
                forwardPage = "BusinessSubElement.jsp";
            }
            else {
                forwardPage = "BusinessElement.jsp";
            }
        }
        else if(elmType.equals(CartridgeMaster.CARTRIDGE)) {
            forwardPage = "CartridgeMaster.jsp";
        }
        else if(elmType.equals(CartridgeVersion.CARTRIDGE_VERSION)) {
            forwardPage = "CartridgeVersion.jsp";
            if(subname != null) {
                IDesignElement childElm = ((CartridgeVersion)elm).findChildElement(subname);
                request.setAttribute("item", childElm);
                forwardPage = "ViewElement.jsp";
            }
        }
        else if(elmType.equals(LocalCartridgeCatalog.LOCAL_CARTRIDGE_CATALOG)) {
            forwardPage = "ViewElement.jsp";
            request.setAttribute("item", elm);
        }
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (true) {
        _jspx_page_context.forward( forwardPage );
        return;
      }
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
