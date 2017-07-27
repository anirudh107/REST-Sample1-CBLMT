package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.volante.repository.design.web.*;
import com.volante.repository.design.*;
import com.tplus.transform.design.IDesignElement;
import com.volante.repository.html.RepositoryLinkGenerator;
import com.volante.repository.util.StringUtils;
import java.util.*;

public final class BusinessElement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/WEB-INF/display.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fscope_005fname_005fborder_005fbgcolor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fscope_005fname_005fborder_005fbgcolor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fscope_005fname_005fborder_005fbgcolor.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005falign_005fnobody.release();
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
      out.write("<html> \r\n");
      out.write("<head>\r\n");
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
      out.write("</head>\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");

	RepositoryWebPerspective repositorySession = (RepositoryWebPerspective)session.getAttribute("repositorySession");
	Repository repository = (Repository)session.getAttribute("repository");
	BusinessElement elm = (BusinessElement) request.getAttribute("item");
	String elmName = elm.getName();
	String elmVersion = Integer.toString(elm.getVersion());
	String aliases = StringUtils.convertToString(elm.getAliases());
	aliases = StringUtils.setEmptyValue(aliases);
	String publishComment = elm.getPublishComment();
	publishComment = StringUtils.setEmptyValue(publishComment);
	String creator = elm.getCreator();
	Date creationTime = elm.getCreationTime();
	int status = elm.getStatus();
	boolean publishedStatus = (status == 1 ? true : false);
	BusinessElementReference masterBE = elm.getBusinessElementReference();
	BusinessClass businessClass = elm.getBusinessClass();
    String businessElementType = "Compound Business Element";
    if (masterBE.isSimpleElement()) {
        businessElementType = "Simple Business Element";
    }	
	String description = masterBE.getDescription();
	description = StringUtils.setEmptyValue(description);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<table  class=\"detailTable\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr class=\"detailTableHeader\">\r\n");
      out.write("\t\t<td class=\"detailTableHeader\">");
      out.print( businessElementType );
      out.write(' ');
      out.write(':');
      out.write(' ');
      out.print( elmName );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\r\n");
      out.write("\t<table class=\"table\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tableDetailName\">Name</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailValue\">");
      out.print( elmName );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tableDetailName\">Version</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailValue\">");
      out.print( elmVersion );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tableDetailName\">Aliases</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailValue\">");
      out.print( aliases );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tableDetailName\">Description</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailValue\">");
      out.print( description );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tableDetailName\">Publish Comment</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailValue\">");
      out.print( publishComment );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t");

		if (elm instanceof SimpleBusinessElement) {
			SimpleBusinessElement simpleElm = (SimpleBusinessElement)elm;
			String type = simpleElm.getType().getName();
			String format = simpleElm.getFormat();
			format = StringUtils.setEmptyValue(format);
			com.volante.repository.design.FieldValidation validation = simpleElm.getFieldValidation();
			String allowedValues = null;
			String formula = null;
			if (validation != null) {
				allowedValues = validation.getAllowedValues();
				formula = validation.getFormula();
			}	
	
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tableDetailName\">Type</td>\r\n");
      out.write("\t\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td class=\"tableDetailValue\">");
      out.print( type );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tableDetailName\">Format</td>\r\n");
      out.write("\t\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td class=\"tableDetailValue\">");
      out.print( format );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t");

			if (!StringUtils.isEmpty(allowedValues)) {
	
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailName\">Allowed Values</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailValue\">");
      out.print( allowedValues );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\t\r\n");
      out.write("\t");

			}	
			if (!StringUtils.isEmpty(formula)) {
	
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailName\">Validation Formula</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailValue\">");
      out.print( formula );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\t\r\n");
      out.write("\t");

			}
		}
		if (elm instanceof CompoundBusinessElement) {		
			CompoundBusinessElement compoundElm = (CompoundBusinessElement)elm;		
			String formula = compoundElm.getFormula();		
			if (!StringUtils.isEmpty(formula)) {
	
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailName\">Validation Formula</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tableDetailValue\">");
      out.print( formula );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\t\r\n");
      out.write("\t");

			}
		}
	
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"tableDetailName\">Creator</td>\r\n");
      out.write("\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t<td class=\"tableDetailValue\">");
      out.print( creator );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"tableDetailName\">Creation Time</td>\r\n");
      out.write("\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t<td class=\"tableDetailValue\">");
      out.print( creationTime );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"tableDetailName\">Published</td>\r\n");
      out.write("\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t<td class=\"tableDetailValue\"><input type='checkbox' disabled ");
      out.print( (publishedStatus ? "CHECKED" : "") );
      out.write(" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t");

		List plafNames = elm.getPlatformSpecificNames();
		if (plafNames != null && plafNames.size() > 0) {
			pageContext.setAttribute("plafNames", plafNames);	
	
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tableDetailName\">Platform Specific Names</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t<td class=\"tableDetailValue\">\r\n");
      out.write("\t\t\t\t");
      //  display:table
      com.volante.util.html.tag.TableTag _jspx_th_display_005ftable_005f0 = (com.volante.util.html.tag.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fscope_005fname_005fborder_005fbgcolor.get(com.volante.util.html.tag.TableTag.class);
      _jspx_th_display_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005ftable_005f0.setParent(null);
      // /BusinessElement.jsp(170,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setName("plafNames");
      // /BusinessElement.jsp(170,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setScope("page");
      // /BusinessElement.jsp(170,4) name = border type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setBorder("0");
      // /BusinessElement.jsp(170,4) name = bgcolor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("\t\t\t\t  ");
          if (_jspx_meth_display_005fcolumn_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t  ");
          if (_jspx_meth_display_005fcolumn_005f1(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t  ");
          if (_jspx_meth_display_005fcolumn_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t");
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
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fscope_005fname_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fscope_005fname_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f0);
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"tableDetailName\">Business Element Master</td>\r\n");
      out.write("\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t<td class=\"tableDetailValue\"><a class='formulalink' href='");
      out.print( RepositoryLinkGenerator.getRepositoryItemLink((IDesignElement)masterBE) );
      out.write('\'');
      out.write('>');
      out.print( masterBE.getName() );
      out.write("</a></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"tableDetailName\">Parent Business Class</td>\r\n");
      out.write("\t\t<td class=\"tableDetailColon\">&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t<td class=\"tableDetailValue\"><a class='formulalink' href='");
      out.print( RepositoryLinkGenerator.getRepositoryItemLink((IDesignElement)businessClass) );
      out.write('\'');
      out.write('>');
      out.print( businessClass.getName() );
      out.write("</a></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");

	if (elm instanceof CompoundBusinessElement) {		
		CompoundBusinessElement compoundElm = (CompoundBusinessElement)elm;		
		List subElements = compoundElm.getBusinessSubElements();
		pageContext.setAttribute("subElements", subElements);			

      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      //  display:table
      com.volante.util.html.tag.TableTag _jspx_th_display_005ftable_005f1 = (com.volante.util.html.tag.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.get(com.volante.util.html.tag.TableTag.class);
      _jspx_th_display_005ftable_005f1.setPageContext(_jspx_page_context);
      _jspx_th_display_005ftable_005f1.setParent(null);
      // /BusinessElement.jsp(201,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setWidth("100%");
      // /BusinessElement.jsp(201,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setName("subElements");
      // /BusinessElement.jsp(201,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setScope("page");
      // /BusinessElement.jsp(201,4) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setCellspacing("0");
      // /BusinessElement.jsp(201,4) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setCellpadding("4");
      // /BusinessElement.jsp(201,4) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setStyleClass("detailTable");
      // /BusinessElement.jsp(201,4) name = border type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setBorder("0");
      // /BusinessElement.jsp(201,4) name = bgcolor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f1.setBgcolor("#CCCCCC");
      int _jspx_eval_display_005ftable_005f1 = _jspx_th_display_005ftable_005f1.doStartTag();
      if (_jspx_eval_display_005ftable_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Integer table_index = null;
        java.lang.Object table_item = null;
        if (_jspx_eval_display_005ftable_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005ftable_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005ftable_005f1.doInitBody();
        }
        table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
        table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
        do {
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f3(_jspx_th_display_005ftable_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f4(_jspx_th_display_005ftable_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f5(_jspx_th_display_005ftable_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f6(_jspx_th_display_005ftable_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fcolumn_005f7(_jspx_th_display_005ftable_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_display_005fsetProperty_005f0(_jspx_th_display_005ftable_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_display_005ftable_005f1.doAfterBody();
          table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
          table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005ftable_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005ftable_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fwidth_005fstyleClass_005fscope_005fname_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_display_005ftable_005f1);
      out.write('\r');
      out.write('\n');

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f0 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /BusinessElement.jsp(171,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setStyleClass("tableColEven");
    // /BusinessElement.jsp(171,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setProperty("platformName");
    // /BusinessElement.jsp(171,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setTitle("Platform");
    int _jspx_eval_display_005fcolumn_005f0 = _jspx_th_display_005fcolumn_005f0.doStartTag();
    if (_jspx_th_display_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
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
    // /BusinessElement.jsp(172,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setStyleClass("tableColOdd");
    // /BusinessElement.jsp(172,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setProperty("platformSpecificName");
    // /BusinessElement.jsp(172,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setTitle("Name");
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
    // /BusinessElement.jsp(173,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setStyleClass("tableColEven");
    // /BusinessElement.jsp(173,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setProperty("platformSpecificType");
    // /BusinessElement.jsp(173,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setTitle("Type");
    int _jspx_eval_display_005fcolumn_005f2 = _jspx_th_display_005fcolumn_005f2.doStartTag();
    if (_jspx_th_display_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f3 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f1);
    // /BusinessElement.jsp(202,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f3.setProperty("displayName");
    // /BusinessElement.jsp(202,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f3.setTitle("Name");
    // /BusinessElement.jsp(202,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f3.setStyleClass("tableColEven");
    // /BusinessElement.jsp(202,6) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f3.setDecorator("com.volante.repository.html.ViewItemDecorator");
    int _jspx_eval_display_005fcolumn_005f3 = _jspx_th_display_005fcolumn_005f3.doStartTag();
    if (_jspx_th_display_005fcolumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f3);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f4 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f4.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f1);
    // /BusinessElement.jsp(203,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f4.setProperty("type");
    // /BusinessElement.jsp(203,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f4.setTitle("Type");
    // /BusinessElement.jsp(203,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f4.setStyleClass("tableColOdd");
    int _jspx_eval_display_005fcolumn_005f4 = _jspx_th_display_005fcolumn_005f4.doStartTag();
    if (_jspx_th_display_005fcolumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f4);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f5 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f5.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f1);
    // /BusinessElement.jsp(204,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f5.setProperty("format");
    // /BusinessElement.jsp(204,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f5.setTitle("Format");
    // /BusinessElement.jsp(204,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f5.setStyleClass("tableColEven");
    int _jspx_eval_display_005fcolumn_005f5 = _jspx_th_display_005fcolumn_005f5.doStartTag();
    if (_jspx_th_display_005fcolumn_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f5);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f6 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005falign_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f6.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f1);
    // /BusinessElement.jsp(205,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f6.setProperty("mandatory");
    // /BusinessElement.jsp(205,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f6.setTitle("Mandatory");
    // /BusinessElement.jsp(205,6) name = align type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f6.setAlign("center");
    // /BusinessElement.jsp(205,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f6.setStyleClass("tableColOdd");
    // /BusinessElement.jsp(205,6) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f6.setDecorator("com.volante.repository.html.BooleanValueDecorator");
    int _jspx_eval_display_005fcolumn_005f6 = _jspx_th_display_005fcolumn_005f6.doStartTag();
    if (_jspx_th_display_005fcolumn_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005falign_005fnobody.reuse(_jspx_th_display_005fcolumn_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005falign_005fnobody.reuse(_jspx_th_display_005fcolumn_005f6);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    com.volante.util.html.tag.ColumnTag _jspx_th_display_005fcolumn_005f7 = (com.volante.util.html.tag.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.get(com.volante.util.html.tag.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f7.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f1);
    // /BusinessElement.jsp(206,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f7.setProperty("fieldValidation");
    // /BusinessElement.jsp(206,6) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f7.setTitle("Allowed Values");
    // /BusinessElement.jsp(206,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f7.setStyleClass("tableColEven");
    // /BusinessElement.jsp(206,6) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f7.setDecorator("com.volante.repository.html.AllowedValuesDecorator");
    int _jspx_eval_display_005fcolumn_005f7 = _jspx_th_display_005fcolumn_005f7.doStartTag();
    if (_jspx_th_display_005fcolumn_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyleClass_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f7);
    return false;
  }

  private boolean _jspx_meth_display_005fsetProperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:setProperty
    com.volante.util.html.tag.SetPropertyTag _jspx_th_display_005fsetProperty_005f0 = (com.volante.util.html.tag.SetPropertyTag) _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.get(com.volante.util.html.tag.SetPropertyTag.class);
    _jspx_th_display_005fsetProperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fsetProperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f1);
    // /BusinessElement.jsp(207,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fsetProperty_005f0.setName("basic.table.header");
    // /BusinessElement.jsp(207,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fsetProperty_005f0.setValue("Business Sub-Elements");
    int _jspx_eval_display_005fsetProperty_005f0 = _jspx_th_display_005fsetProperty_005f0.doStartTag();
    if (_jspx_th_display_005fsetProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_display_005fsetProperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_display_005fsetProperty_005f0);
    return false;
  }
}
