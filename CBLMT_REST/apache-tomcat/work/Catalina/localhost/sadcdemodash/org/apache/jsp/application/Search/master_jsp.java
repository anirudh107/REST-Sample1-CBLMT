package org.apache.jsp.application.Search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tplus.transform.runtime.persistence.expression.Expression;
import java.text.SimpleDateFormat;
import java.util.*;
import com.tplus.transform.runtime.*;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;

public final class master_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/application/Search/../../checkUser.jsp");
    _jspx_dependants.add("/application/Search/../../header.html");
    _jspx_dependants.add("/application/Search/../../menu.jsp");
    _jspx_dependants.add("/application/Search/../../footer.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.release();
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplayerrors_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.release();
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
      response.setContentType("text/html;charset=windows-1252");
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
      out.write("\n");
      out.write('\n');

    if(session.getAttribute("user")==null){
        
        
      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("/index.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");

    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>    <meta http-equiv=\"expires\" content=\"-1\">  <META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\">          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     <meta name=\"description\" content=\"\">     <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/main.css\"/>\n");
      out.write("        <link href=\"../../css/redmond/jquery-ui-1.10.2.custom.css\" rel=\"stylesheet\">\n");
      out.write("\t<script type=\"text/javascript\" language=\"javascript\" src=\"volantescripts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"datescripts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"errormessage.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"scrollpos.js\"></script>\n");
      out.write("        <script src=\"../../js/jquery-1.9.1.js\"></script>\n");
      out.write("\t<script src=\"../../js/jquery-ui-1.10.2.custom.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n");
      out.write("        <title>Search Form</title>\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t$('#menu').menu();\n");
      out.write("\t\t\t} );\n");
      out.write("\t\t</script>\n");
      out.write("                ");

                    String user = "sso";//session.getAttribute("user").toString();
                    String label = "Message Info";
                    String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                    if(label != null){
                        session.setAttribute("label", label);
                    }
                    String url = "master.jsp?label="+label;
                
      out.write("\n");
      out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/app.css\">\n");
      out.write("    \t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/webform.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"dt_example\">\n");
      out.write("      \n");
      out.write("      ");
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
      out.write("        ");
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
      out.write("\tSearch > ");
      out.print(label);
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_volante_005fcreateNo_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      //  volante:webform
      com.tplus.transform.runtime.webforms.tag.WebFormTag _jspx_th_volante_005fwebform_005f0 = (com.tplus.transform.runtime.webforms.tag.WebFormTag) _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.get(com.tplus.transform.runtime.webforms.tag.WebFormTag.class);
      _jspx_th_volante_005fwebform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fwebform_005f0.setParent(null);
      // /application/Search/master.jsp(45,8) name = checkMandatoryFields type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setCheckMandatoryFields(true);
      // /application/Search/master.jsp(45,8) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setFormat("TBL_MessageInfoSearch");
      // /application/Search/master.jsp(45,8) name = modelRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setModelRef("searchForm");
      // /application/Search/master.jsp(45,8) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setRequestURI(url);
      // /application/Search/master.jsp(45,8) name = errorStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fwebform_005f0.setErrorStyle("tooltippopup");
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
          out.write("\n");
          out.write("            <!--- Using table for laying out buttons, tabs, error messages & form --->\n");
          out.write("        ");
 if (!completed.booleanValue()) { 
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_volante_005fadderrors_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
 }
        else {
		
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_volante_005fclearerrors_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_volante_005fclearerrors_005f1(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
          out.write('	');

                        NormalizedObject searchObject = (NormalizedObject)session.getAttribute("searchForm");
                        InternalMessage bt = LookupContextFactory.getLookupContext().lookupInternalMessage("TBL_MESSAGEINFO");
                        PersistenceManager persistenceManager = bt.getPersistenceManager();	
                        DynamicQuery query = new DynamicQuery();
                        
                        //DJ Add
                        if(searchObject.getField("AGENT")!=null && !searchObject.getField("AGENT").toString().equals("")){
			    query.add(Expression.like("AGENT", "%"+searchObject.getField("AGENT").toString()+"%"));
                        }if(searchObject.getField("BATCHID")!=null && !searchObject.getField("BATCHID").toString().equals("")){
                            query.add(Expression.like("BATCHID", "%"+searchObject.getField("BATCHID").toString()+"%"));
                        }
                        if(searchObject.getField("MESSAGEID")!=null && !searchObject.getField("MESSAGEID").toString().equals("")){
			    query.add(Expression.like("MESSAGEID", "%"+searchObject.getField("MESSAGEID").toString()+"%"));
                        }
                        if(searchObject.getField("SENDER")!=null && !searchObject.getField("SENDER").toString().equals("")){
			    query.add(Expression.like("SENDER", "%"+searchObject.getField("SENDER").toString()+"%"));
                        }
                        if(searchObject.getField("RECIPIENT")!=null && !searchObject.getField("RECIPIENT").toString().equals("")){
			    query.add(Expression.like("RECIPIENT", "%"+searchObject.getField("RECIPIENT").toString()+"%"));
                        }                        
                        if(searchObject.getField("STATUS")!=null && !searchObject.getField("STATUS").toString().equals("")){                        
                            query.add(Expression.like("STATUS", "%"+searchObject.getField("STATUS").toString()+"%"));
                        }
                        
			NormalizedObjectCollection noCollection = (NormalizedObjectCollection)persistenceManager.find(query);
			session.setAttribute("summaryList",noCollection);
         if(!response.isCommitted()){
                        response.sendRedirect("showAll.jsp");
                        return;
                        }
                        else{
                            
          out.write("\n");
          out.write("                            <script>\n");
          out.write("                                window.location=\"showAll.jsp\";\n");
          out.write("                            </script>\n");
          out.write("                            ");

                        }
        } 
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_volante_005fadderrors_005f1(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        <table width=\"760\" cellspacing=\"0\" cellpadding=\"0\" >\n");
          out.write("            <!--- display top level errors --->\n");
          out.write("            <tr><td>\n");
          out.write("                ");
          if (_jspx_meth_volante_005fdisplayerrors_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t</td></tr>\n");
          out.write("\n");
          out.write("            <!--- display the  form --->\n");
          out.write("            <tr><td style=\"BORDER:#000000 1px solid;\">\n");
          out.write("                ");
          if (_jspx_meth_volante_005fdisplay_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("           \t</td></tr>\n");
          out.write("\n");
          out.write("       <!--- display the  search button --->\n");
          out.write("\t\t\t<tr><td>\n");
          out.write("\t\t\t\t<br>\n");
          out.write("            \t");
          if (_jspx_meth_volante_005fbutton_005f0(_jspx_th_volante_005fwebform_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t</td></tr>\n");
          out.write("        </table>\n");
          out.write("\n");
          out.write("        ");
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
        _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fwebform_0026_005frequestURI_005fmodelRef_005fformat_005ferrorStyle_005fcheckMandatoryFields.reuse(_jspx_th_volante_005fwebform_005f0);
      out.write("\n");
      out.write("            ");
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
      out.write("    </body>\n");
      out.write("    \n");
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

  private boolean _jspx_meth_volante_005fcreateNo_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:createNo
    com.tplus.transform.runtime.webforms.core.CreateNormalizedObjectTag _jspx_th_volante_005fcreateNo_005f0 = (com.tplus.transform.runtime.webforms.core.CreateNormalizedObjectTag) _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.get(com.tplus.transform.runtime.webforms.core.CreateNormalizedObjectTag.class);
    _jspx_th_volante_005fcreateNo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcreateNo_005f0.setParent(null);
    // /application/Search/master.jsp(44,8) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcreateNo_005f0.setFormat("TBL_MessageInfoSearch");
    // /application/Search/master.jsp(44,8) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcreateNo_005f0.setId("searchForm");
    // /application/Search/master.jsp(44,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcreateNo_005f0.setScope("session");
    int _jspx_eval_volante_005fcreateNo_005f0 = _jspx_th_volante_005fcreateNo_005f0.doStartTag();
    if (_jspx_th_volante_005fcreateNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.reuse(_jspx_th_volante_005fcreateNo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcreateNo_0026_005fscope_005fid_005fformat_005fnobody.reuse(_jspx_th_volante_005fcreateNo_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fadderrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:adderrors
    com.tplus.transform.runtime.webforms.tag.AddValidationsTag _jspx_th_volante_005fadderrors_005f0 = (com.tplus.transform.runtime.webforms.tag.AddValidationsTag) _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.AddValidationsTag.class);
    _jspx_th_volante_005fadderrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fadderrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /application/Search/master.jsp(48,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setErrorRef("externalErrors");
    // /application/Search/master.jsp(48,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f0.setScope("session");
    int _jspx_eval_volante_005fadderrors_005f0 = _jspx_th_volante_005fadderrors_005f0.doStartTag();
    if (_jspx_th_volante_005fadderrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fadderrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fadderrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fclearerrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f0 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /application/Search/master.jsp(52,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f0.setErrorRef("externalErrors");
    // /application/Search/master.jsp(52,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f0.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f0 = _jspx_th_volante_005fclearerrors_005f0.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fclearerrors_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:clearerrors
    com.tplus.transform.runtime.webforms.tag.ClearValidationsTag _jspx_th_volante_005fclearerrors_005f1 = (com.tplus.transform.runtime.webforms.tag.ClearValidationsTag) _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ClearValidationsTag.class);
    _jspx_th_volante_005fclearerrors_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fclearerrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /application/Search/master.jsp(53,8) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f1.setErrorRef("processingErrors");
    // /application/Search/master.jsp(53,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fclearerrors_005f1.setScope("session");
    int _jspx_eval_volante_005fclearerrors_005f1 = _jspx_th_volante_005fclearerrors_005f1.doStartTag();
    if (_jspx_th_volante_005fclearerrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fclearerrors_0026_005fscope_005ferrorRef_005fnobody.reuse(_jspx_th_volante_005fclearerrors_005f1);
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
    // /application/Search/master.jsp(93,2) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fadderrors_005f1.setErrorRef("processingErrors");
    // /application/Search/master.jsp(93,2) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_volante_005fdisplay_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:display
    com.tplus.transform.runtime.webforms.tag.DisplayTag _jspx_th_volante_005fdisplay_005f0 = (com.tplus.transform.runtime.webforms.tag.DisplayTag) _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.get(com.tplus.transform.runtime.webforms.tag.DisplayTag.class);
    _jspx_th_volante_005fdisplay_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fdisplay_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    int _jspx_eval_volante_005fdisplay_005f0 = _jspx_th_volante_005fdisplay_005f0.doStartTag();
    if (_jspx_th_volante_005fdisplay_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fdisplay_005fnobody.reuse(_jspx_th_volante_005fdisplay_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005fwebform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:button
    com.tplus.transform.runtime.webforms.tag.ActionButtonTag _jspx_th_volante_005fbutton_005f0 = (com.tplus.transform.runtime.webforms.tag.ActionButtonTag) _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.get(com.tplus.transform.runtime.webforms.tag.ActionButtonTag.class);
    _jspx_th_volante_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fwebform_005f0);
    // /application/Search/master.jsp(108,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setName("Submit");
    // /application/Search/master.jsp(108,13) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setStyle("sbttn");
    // /application/Search/master.jsp(108,13) name = label type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setLabel(" Search ");
    // /application/Search/master.jsp(108,13) name = params type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fbutton_005f0.setParams("task=Search");
    int _jspx_eval_volante_005fbutton_005f0 = _jspx_th_volante_005fbutton_005f0.doStartTag();
    if (_jspx_th_volante_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fbutton_0026_005fstyle_005fparams_005fname_005flabel_005fnobody.reuse(_jspx_th_volante_005fbutton_005f0);
    return false;
  }
}
