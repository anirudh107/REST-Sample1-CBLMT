package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.tplus.transform.runtime.*;
import java.util.Date;
import java.text.DateFormat;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005foutput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fscope_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005foutput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fscope_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.release();
    _005fjspx_005ftagPool_005fvolante_005finput.release();
    _005fjspx_005ftagPool_005fvolante_005foutput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fscope_005fname_005fnobody.release();
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>    <meta http-equiv=\"expires\" content=\"-1\">  <META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"css/redmond/jquery-ui-1.10.2.custom.css\" rel=\"stylesheet\">\n");
      out.write("\t<script src=\"js/jquery-1.9.1.js\"></script>\n");
      out.write("\t<script src=\"js/jquery-ui-1.10.2.custom.js\"></script>\n");
      out.write("        <title>DashBoard</title>\n");
      out.write("        \n");
      out.write("    <link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"css/app.css\">\n");
      out.write("    \t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/webform.css\">\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("    <body style=\"margin :0\">\n");
      out.write("         ");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" style=\"background-color: white; text-align: center; vertical-align: middle;\">\r\n");
      out.write("    <tbody><tr>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("            <img alt=\"VOLANTE\" src=\"images/volante.png\" style=\"margin-left:10px;border:0px\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td style=\"width: 33%;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</tbody></table>\r\n");
      out.write("</div>\r\n");
      out.write("    <div id=\"content\">");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
        String sso = request.getHeader("georaclehrid");
        // hardcoded sso
        sso = "steve";
        if(request.getParameter("sso")!=null&&request.getParameter("sso").length()>0){
            sso = request.getParameter("sso");
        }
        if(session.getAttribute("sso")==null){
            if(sso==null){
                response.sendRedirect("index.jsp?error=true");
                return;
            }
                else{
                    
      out.write("\n");
      out.write("                    ");
      //  volante:query
      com.tplus.transform.runtime.webforms.core.QueryTag _jspx_th_volante_005fquery_005f0 = (com.tplus.transform.runtime.webforms.core.QueryTag) _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.get(com.tplus.transform.runtime.webforms.core.QueryTag.class);
      _jspx_th_volante_005fquery_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fquery_005f0.setParent(null);
      // /index.jsp(48,20) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setFormat("USERS");
      // /index.jsp(48,20) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setId("authList");
      // /index.jsp(48,20) name = queryName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setQueryName("FindUser");
      // /index.jsp(48,20) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setScope("session");
      int _jspx_eval_volante_005fquery_005f0 = _jspx_th_volante_005fquery_005f0.doStartTag();
      if (_jspx_eval_volante_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          //  volante:param
          com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f0 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
          _jspx_th_volante_005fparam_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fquery_005f0);
          // /index.jsp(49,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fparam_005f0.setName("sso");
          // /index.jsp(49,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fparam_005f0.setValue(sso);
          int _jspx_eval_volante_005fparam_005f0 = _jspx_th_volante_005fparam_005f0.doStartTag();
          if (_jspx_th_volante_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
          out.write("\n");
          out.write("                    ");
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
      out.write("\n");
      out.write("                    ");

                    if(session.getAttribute("authList")!=null){
                        DataObjectSection authList = (DataObjectSection)session.getAttribute("authList");
                        if(!authList.isEmpty()){
                            NormalizedObject authUsr = (NormalizedObject)authList.get(0);
                            if(authUsr.getField("SSO").toString().equals(sso)){
                            session.setAttribute("user", authUsr.getField("SSO").toString());
                            session.removeAttribute("authList");
                            }
                            
                            else{
                                response.sendRedirect("index.jsp?error=true");
                                return;
                            }

                        }
                        else{response.sendRedirect("index.jsp?error=true");
                        return;
                        }
                    }
                    else{response.sendRedirect("index.jsp?error=true");
                    return;
                    }
                }
            }
            else{
                sso = session.getAttribute("user").toString();
        }
        
                
      out.write("\n");
      out.write("                 \n");
      out.write("    ");
      //  volante:invokeMessageFlow
      com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag _jspx_th_volante_005finvokeMessageFlow_005f0 = (com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag) _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.get(com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag.class);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setParent(null);
      // /index.jsp(82,4) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setErrorRef("errorRef");
      // /index.jsp(82,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setName("GetMenus");
      // /index.jsp(82,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setScope("session");
      int _jspx_eval_volante_005finvokeMessageFlow_005f0 = _jspx_th_volante_005finvokeMessageFlow_005f0.doStartTag();
      if (_jspx_eval_volante_005finvokeMessageFlow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        ");
          //  volante:input
          com.tplus.transform.runtime.webforms.core.InputTag _jspx_th_volante_005finput_005f0 = (com.tplus.transform.runtime.webforms.core.InputTag) _005fjspx_005ftagPool_005fvolante_005finput.get(com.tplus.transform.runtime.webforms.core.InputTag.class);
          _jspx_th_volante_005finput_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finvokeMessageFlow_005f0);
          int _jspx_eval_volante_005finput_005f0 = _jspx_th_volante_005finput_005f0.doStartTag();
          if (_jspx_eval_volante_005finput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("            ");
              //  volante:param
              com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f1 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
              _jspx_th_volante_005fparam_005f1.setPageContext(_jspx_page_context);
              _jspx_th_volante_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
              // /index.jsp(84,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f1.setName("user");
              // /index.jsp(84,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f1.setValue(sso);
              int _jspx_eval_volante_005fparam_005f1 = _jspx_th_volante_005fparam_005f1.doStartTag();
              if (_jspx_th_volante_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
              out.write("\n");
              out.write("        ");
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
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_volante_005foutput_005f0(_jspx_th_volante_005finvokeMessageFlow_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_volante_005finvokeMessageFlow_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_volante_005finvokeMessageFlow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
      out.write(" \n");
      out.write("       ");
      out.write('\n');
      out.write('\n');

        String path = request.getContextPath();
        
      out.write("<link href=\"");
      out.print(path);
      out.write("/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        ");

       
        com.tplus.transform.runtime.DataObjectSection tablesMenu = (com.tplus.transform.runtime.DataObjectSection)session.getAttribute("tablesMenus");
        
        boolean sec = false;
        boolean app = false;
        boolean mon = false;
        boolean fe = false;
       
        for(int i =0; i< tablesMenu.size();i++){
            if(tablesMenu.getElement(i).getField("MENU").equals("application"))
                app = true;
            if(tablesMenu.getElement(i).getField("MENU").equals("security"))
                sec= true;
            if(tablesMenu.getElement(i).getField("MENU").equals("monitor"))
                mon = true;
            if(tablesMenu.getElement(i).getField("TABLE_NAME").equals("DASH4EYES"))
                fe = true;
            
        }
        
    
      out.write("\n");
      out.write("    \n");
      out.write("     <div id=\"environment\">\n");
      out.write("                ");

                String env = "MessageInfo Demo";
                String dt = new java.text.SimpleDateFormat("dd/MM/yyyy").format(new Date());
                        
                
            
      out.write("\n");
      out.write("             1.0.20131202.1 | ");
      out.print(env);
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print(dt);
      out.write("\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                <div class=\"navbar navbar-static\" id=\"navbar-example\">\n");
      out.write("              <div class=\"navbar-inner\">\n");
      out.write("                <div style=\"width: auto;\" class=\"container\">                    \n");
      out.write("                    <!-- <a href=\"");
      out.print(path);
      out.write("/index.jsp\" class=\"brand\">Volante Dashboard</a> -->\n");
      out.write("                <ul role=\"navigation\" class=\"nav\">\n");
      out.write("                    ");

        
                        if(mon){
                
      out.write("\n");
      out.write("                <li class=\"dropdown\"><a data-toggle=\"dropdown\" class=\"dropdown-toggle\" role=\"button\" href=\"#\" id=\"drop2\">Monitoring <b class=\"caret\"></b></a>\n");
      out.write("                    <ul aria-labelledby=\"drop2\" role=\"menu\" class=\"dropdown-menu\">\n");
      out.write("                    ");

                            for(int i =0; i< tablesMenu.size();i++){
                                String tableName = tablesMenu.getElement(i).getField("TABLE_NAME").toString();
                                String tableLabel = tablesMenu.getElement(i).getField("TABLE_LABEL").toString();
                                if(tablesMenu.getElement(i).getField("MENU").equals("monitor")){
                                    
      out.write("\n");
      out.write("                                    <li role=\"presentation\"><a href=\"");
      out.print(path);
      out.write("/monitor/showAll.jsp?table=");
      out.print(tableName);
      out.write("&label=");
      out.print(tableLabel);
      out.write("\" tabindex=\"-1\" role=\"menuitem\">");
      out.print(tableLabel);
      out.write("</a></li>\n");
      out.write("                                    ");

                                }
                            }
                    
      out.write("\n");
      out.write("                                    <li class=\"divider\" role=\"presentation\"></li>\n");
      out.write("                    ");

                            for(int i =0; i< tablesMenu.size();i++){
                                String tableName = tablesMenu.getElement(i).getField("TABLE_NAME").toString();
                                String tableLabel = tablesMenu.getElement(i).getField("TABLE_LABEL").toString();
                                if(tablesMenu.getElement(i).getField("MENU").equals("monitor")){
                                    
      out.write("\n");
      out.write("                                    <li role=\"presentation\"><a href=\"");
      out.print(path);
      out.write("/monitor/search/");
      out.print(tableName);
      out.write("Search.jsp?label=");
      out.print(tableLabel);
      out.write("\" tabindex=\"-1\" role=\"menuitem\">");
      out.print(tableLabel);
      out.write(" Search</a></li>\n");
      out.write("                                    ");

                                }
                            }
                    
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                ");

                        }
                            
                            if(app){
                
      out.write("\n");
      out.write("                <li class=\"dropdown\"><a data-toggle=\"dropdown\" class=\"dropdown-toggle\" role=\"button\" href=\"#\" id=\"drop3\">Menu Options <b class=\"caret\"></b></a>\n");
      out.write("                    <ul aria-labelledby=\"drop3\" role=\"menu\" class=\"dropdown-menu\">\n");
      out.write("                        \n");
      out.write("                    ");

                            for(int i =0; i< tablesMenu.size();i++){
                                String tableName = tablesMenu.getElement(i).getField("TABLE_NAME").toString();
                                String tableLabel = tablesMenu.getElement(i).getField("TABLE_LABEL").toString();
                                String req4eyes = tablesMenu.getElement(i).getField("REQ_4EYES").toString();
                                if(tablesMenu.getElement(i).getField("MENU").equals("application")){
                                    
      out.write("\n");
      out.write("                                   <!-- <li role=\"presentation\"><a href=\"");
      out.print(path);
      out.write("/application/showAll.jsp?table=");
      out.print(tableName);
      out.write("&label=");
      out.print(tableLabel);
      out.write("&req=");
      out.print(req4eyes);
      out.write("\" tabindex=\"-1\" role=\"menuitem\">");
      out.print(tableLabel);
      out.write("</a></li> -->\n");
      out.write("                                    ");

                                }
                            }

      out.write("\n");
      out.write("                                    <li class=\"divider\" role=\"presentation\"></li>\n");
      out.write("                                    \t<li role=\"presentation\"><a href=\"");
      out.print(path);
      out.write("/application/Search/master.jsp\">MessageInfo Search</a></li>\n");
      out.write("                                    <li class=\"divider\" role=\"presentation\"></li>\n");
      out.write("                                    <li class=\"divider\" role=\"presentation\"></li>\n");
      out.write("\t\t\t\t       <li role=\"presentation\"><a href=\"");
      out.print(path);
      out.write("/application/Search/auditmaster.jsp\">MessageLog Search</a></li>\n");
      out.write("                                    <li class=\"divider\" role=\"presentation\"></li>\n");
      out.write("                    ");



                            if(fe){
                            
      out.write("\n");
      out.write("                            <li role=\"presentation\" >\n");
      out.write("                            <a href=\"");
      out.print(path);
      out.write("/application/FourEyes.jsp\" tabindex=\"-1\" role=\"menuitem\">Four Eyes</a></li>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                ");

                        }
                        
                        if(sec){
                    
      out.write("\n");
      out.write("                <li class=\"dropdown\"><a data-toggle=\"dropdown\" class=\"dropdown-toggle\" role=\"button\" href=\"#\" id=\"drop1\">Security<b class=\"caret\"></b></a>\n");
      out.write("                    <ul aria-labelledby=\"drop1\" role=\"menu\" class=\"dropdown-menu\">\n");
      out.write("                    ");

                            for(int i =0; i< tablesMenu.size();i++){
                                String tableName = tablesMenu.getElement(i).getField("TABLE_NAME").toString();
                                String tableLabel = tablesMenu.getElement(i).getField("TABLE_LABEL").toString();
                                String req4eyes = tablesMenu.getElement(i).getField("REQ_4EYES").toString();
                                if(tablesMenu.getElement(i).getField("MENU").equals("security")){
                     
      out.write("\n");
      out.write("                                    <li role=\"presentation\"><a href=\"");
      out.print(path);
      out.write("/security/showAll.jsp?table=");
      out.print(tableName);
      out.write("&label=");
      out.print(tableLabel);
      out.write("&req=");
      out.print(req4eyes);
      out.write("\" tabindex=\"-1\" role=\"menuitem\">");
      out.print(tableLabel);
      out.write("</a></li>\n");
      out.write("                                    ");

                                }
                            }
                    
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                ");

                        }  
                
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"nav pull-right\">\n");
      out.write("                    <li class=\"dropdown\" id=\"fat-menu\">\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" role=\"button\" id=\"drop5\" href=\"#\">");
      out.print(session.getAttribute("user").toString() );
      out.write(" <b class=\"caret\"></b></a>\n");
      out.write("                      <ul aria-labelledby=\"drop3\" role=\"menu\" class=\"dropdown-menu\">\n");
      out.write("                        <li role=\"presentation\"><a href=\"");
      out.print(path);
      out.write("/logout.jsp\" tabindex=\"-1\" role=\"menuitem\">Logout</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                    </li>\n");
      out.write("        </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                </div>\n");
      out.write("                      \n");
      out.write("                      <!-- Le javascript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/bootstrap.js\"></script>");
      out.write("\n");
      out.write("        ");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <table style=\"width: 100%;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td align=\"center\" width=\"33%\">\r\n");
      out.write("                <span style=\"font-size: 11px; vertical-align: middle;font-family:Lucida Grande,Lucida Sans,Arial,sans-serif;color: grey;\" >\r\n");
      out.write("            Volante Technologies Inc.</span>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table> \r\n");
      out.write("</div>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_volante_005fparam_005f2(_jspx_th_volante_005foutput_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
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
    com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f2 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fscope_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
    _jspx_th_volante_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005foutput_005f0);
    // /index.jsp(87,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f2.setName("ALlTables");
    // /index.jsp(87,12) name = valueRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f2.setValueRef("tablesMenus");
    // /index.jsp(87,12) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f2.setScope("session");
    int _jspx_eval_volante_005fparam_005f2 = _jspx_th_volante_005fparam_005f2.doStartTag();
    if (_jspx_th_volante_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fscope_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fscope_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
    return false;
  }
}
