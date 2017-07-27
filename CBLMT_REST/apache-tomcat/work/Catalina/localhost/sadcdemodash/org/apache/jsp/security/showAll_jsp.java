package org.apache.jsp.security;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.diff.MessageDiffer;
import com.tplus.transform.runtime.DataObjectSection;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;

public final class showAll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/security/../checkUser.jsp");
    _jspx_dependants.add("/security/../header.html");
    _jspx_dependants.add("/security/../menu.jsp");
    _jspx_dependants.add("/security/../footer.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005foutput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005foutput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname.release();
    _005fjspx_005ftagPool_005fvolante_005finput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005foutput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\t<head>    <meta http-equiv=\"expires\" content=\"-1\">  <META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\">          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     <meta name=\"description\" content=\"\">     <meta name=\"author\" content=\"\"> <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\"/>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/jquery.dataTables.css\"/>\n");
      out.write("                \n");
      out.write("                <link href=\"../css/redmond/jquery-ui-1.10.2.custom.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<title>Security Configuration</title>\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\" src=\"../js/jquery.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\" src=\"../js/jquery.dataTables.js\"></script>\n");
      out.write("                \n");
      out.write("                <script type=\"text/javascript\" language=\"javascript\" src=\"../js/ZeroClipboard.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery-ui-1.10.2.custom.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("                    var dt1;\n");
      out.write("                    var dt2;\n");
      out.write("                    $(document).ready(function() {\n");
      out.write("\t\t\t\t$('#menu').menu();\n");
      out.write("\t\t\t} );\n");
      out.write("                    \n");
      out.write("\t\t\t$(document).ready(function() {\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\t\t\t\tdt1=$('#generalTable').dataTable({\n");
      out.write("                                    \"sDom\": 'T<\"clear\">lfrtip',\n");
      out.write("                                    \"sPaginationType\":\"full_numbers\"\n");
      out.write("                                    \n");
      out.write("                                });\n");
      out.write("\t\t\t} );\n");
      out.write("                        \n");
      out.write("                        $(document).ready(function() {\n");
      out.write("\t\t\t\tdt2=$('#pendTable').dataTable({\n");
      out.write("                                    \"sDom\": 'T<\"clear\">lfrtip',\n");
      out.write("                                    \"sPaginationType\":\"full_numbers\"\n");
      out.write("                                    \n");
      out.write("                                });\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                $('.dataTables_filter input')\n");
      out.write("                            .unbind('keypress keyup')\n");
      out.write("                            .bind('keypress keyup', function(e){\n");
      out.write("                        if($(this).val().length === 0 && e.keyCode === 8){\n");
      out.write("                                  var myId = this.getAttribute(\"aria-controls\");\n");
      out.write("                                if(myId === \"generalTable\"){\n");
      out.write("                                  dt1.fnFilter($(this).val());\n");
      out.write("                                }\n");
      out.write("                                else{\n");
      out.write("                                  dt2.fnFilter($(this).val());\n");
      out.write("                                }\n");
      out.write("                              }\n");
      out.write("                              if (e.keyCode !== 13)\n");
      out.write("                                  return;\n");
      out.write("                              var myId = this.getAttribute(\"aria-controls\");\n");
      out.write("                              if(myId === \"generalTable\"){\n");
      out.write("                                dt1.fnFilter($(this).val());\n");
      out.write("                              }\n");
      out.write("                              else{\n");
      out.write("                                dt2.fnFilter($(this).val());\n");
      out.write("                              }\n");
      out.write("                            });\n");
      out.write("\t\t\t} );\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        function doDelete(uri){\n");
      out.write("                           if(confirm(\"do you want to delete this record ?\")){\n");
      out.write("                               window.location = uri;\n");
      out.write("                           }\n");
      out.write("                       }\n");
      out.write("                       \n");
      out.write("                       function linkToButton(uri){\n");
      out.write("                           window.location = uri;\n");
      out.write("                       }\n");
      out.write("\t\t</script>\n");
      out.write("\t</head>\n");
      out.write("\t<body id=\"dt_example\">\n");
      out.write("            ");
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
      out.write("            \n");
 
    session.removeAttribute("format");
    String format = request.getParameter("table");
    String label = request.getParameter("label");
    String req = request.getParameter("req");
    String usr = session.getAttribute("user").toString();
    session.setAttribute("format", format);
    session.setAttribute("label", label);
    session.removeAttribute("lista");


      out.write("\n");
      out.write("         \n");
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
      out.write("      \n");
      out.write("                ");

                String user = session.getAttribute("user").toString();
            
      out.write("\n");
      out.write("             \n");
      out.write("            <br/>\n");
      out.write("         Security Configuration > ");
      out.print(label);
      out.write("\n");
      out.write("         ");
      //  volante:invokeMessageFlow
      com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag _jspx_th_volante_005finvokeMessageFlow_005f0 = (com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag) _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname.get(com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag.class);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setParent(null);
      // /security/showAll.jsp(106,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setName("GetAccessLevel");
      // /security/showAll.jsp(106,9) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setScope("session");
      int _jspx_eval_volante_005finvokeMessageFlow_005f0 = _jspx_th_volante_005finvokeMessageFlow_005f0.doStartTag();
      if (_jspx_eval_volante_005finvokeMessageFlow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");
          //  volante:input
          com.tplus.transform.runtime.webforms.core.InputTag _jspx_th_volante_005finput_005f0 = (com.tplus.transform.runtime.webforms.core.InputTag) _005fjspx_005ftagPool_005fvolante_005finput.get(com.tplus.transform.runtime.webforms.core.InputTag.class);
          _jspx_th_volante_005finput_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finvokeMessageFlow_005f0);
          int _jspx_eval_volante_005finput_005f0 = _jspx_th_volante_005finput_005f0.doStartTag();
          if (_jspx_eval_volante_005finput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              //  volante:param
              com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f0 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
              _jspx_th_volante_005fparam_005f0.setPageContext(_jspx_page_context);
              _jspx_th_volante_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
              // /security/showAll.jsp(108,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f0.setName("user");
              // /security/showAll.jsp(108,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f0.setValue(user);
              int _jspx_eval_volante_005fparam_005f0 = _jspx_th_volante_005fparam_005f0.doStartTag();
              if (_jspx_th_volante_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
              out.write("\n");
              out.write("                ");
              //  volante:param
              com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f1 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
              _jspx_th_volante_005fparam_005f1.setPageContext(_jspx_page_context);
              _jspx_th_volante_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finput_005f0);
              // /security/showAll.jsp(109,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f1.setName("table");
              // /security/showAll.jsp(109,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_volante_005fparam_005f1.setValue(format);
              int _jspx_eval_volante_005fparam_005f1 = _jspx_th_volante_005fparam_005f1.doStartTag();
              if (_jspx_th_volante_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f1);
              out.write("\n");
              out.write("            ");
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
          out.write("            ");
          if (_jspx_meth_volante_005foutput_005f0(_jspx_th_volante_005finvokeMessageFlow_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_volante_005finvokeMessageFlow_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_volante_005finvokeMessageFlow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname.reuse(_jspx_th_volante_005finvokeMessageFlow_005f0);
      out.write('\n');
      out.write(' ');
      out.write(' ');
      //  volante:query
      com.tplus.transform.runtime.webforms.core.QueryTag _jspx_th_volante_005fquery_005f0 = (com.tplus.transform.runtime.webforms.core.QueryTag) _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat_005fnobody.get(com.tplus.transform.runtime.webforms.core.QueryTag.class);
      _jspx_th_volante_005fquery_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fquery_005f0.setParent(null);
      // /security/showAll.jsp(115,2) name = queryName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setQueryName("All");
      // /security/showAll.jsp(115,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setId("lista");
      // /security/showAll.jsp(115,2) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setFormat(format);
      // /security/showAll.jsp(115,2) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f0.setScope("session");
      int _jspx_eval_volante_005fquery_005f0 = _jspx_th_volante_005fquery_005f0.doStartTag();
      if (_jspx_th_volante_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat_005fnobody.reuse(_jspx_th_volante_005fquery_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat_005fnobody.reuse(_jspx_th_volante_005fquery_005f0);
      out.write(" \n");
      out.write("\n");
      out.write("          \n");

        String accessLevel = session.getAttribute("al").toString();
        DataObjectSection lista =  (DataObjectSection)session.getAttribute("lista");
        if((accessLevel.equals("RW"))){
                
      out.write("\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                Access Level: Read & Write\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                ");

            }
            else{
                
      out.write("\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                Access Level: Read Only\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                ");

            }
        if(!lista.isEmpty()){

      out.write("\n");
      out.write("\t\t\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"dataTable\" id=\"generalTable\" width=\"100%\">\n");
      out.write("\t<thead>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t");

                            for(int i=0; i<lista.getElement(0).getFieldCount();i++){
                        
      out.write("<th>");
      out.print(lista.getElement(0).getFieldName(i));
      out.write("</th>");

                            }
                        if(accessLevel.equals("RW")){
                                
      out.write("\n");
      out.write("                        <th></th>\n");
      out.write("                        <th></th>\n");
      out.write("                            ");

                            }
      out.write("\n");
      out.write("                        \n");
      out.write("\t\t</tr>\n");
      out.write("\t</thead>\n");
      out.write("\t<tbody>\n");
      out.write("\t\t");

                            for(int i=0;i<lista.size();i++){
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    ");

                                for(int j=0;j<lista.getElement(i).getFieldCount();j++){
//                                    System.out.println("i:"+i+", j:"+j+", campo:"+lista.getElement(i).getFieldName(j)+", valor:"+lista.getElement(i).getField(j).toString());
                                    if(lista.getElement(i).getField(j)==null){
                                        
      out.write("<td></td>");

                                    }
                                    else{
                                    
      out.write("\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(lista.getElement(i).getField(j).toString() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                ");

                                    }
                                }
                                if(lista.getElement(i).getField("LOCKED")!= null && lista.getElement(i).getField("LOCKED").toString().equals("N")&&accessLevel.equals("RW")){
                                
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <button onclick=\"linkToButton('webform.jsp?index=");
      out.print(i);
      out.write("&req=");
      out.print(req);
      out.write("&lab=");
      out.print(label);
      out.write("');\">Edit</button>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <button onclick=\"doDelete('doDelete.jsp?index=");
      out.print(i);
      out.write("&req=");
      out.print(req);
      out.write("&lab=");
      out.print(label);
      out.write("');\">Delete</button>\n");
      out.write("                                </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                }
                                else if(accessLevel.equals("R")){
      out.write("\n");
      out.write("\t\t\t\t                    </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
                                 else if((lista.getElement(i).getField("LOCKED")!= null && lista.getElement(i).getField("LOCKED").toString().equals("Y"))){
                                    
      out.write("\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                ");

                                    
                                }
                                
                            }
        }
        else{
            out.println("This table is empty, please enter a new record");
        }
                
      out.write("\n");
      out.write("\t</tbody>\n");
      out.write("</table><br/>\n");
      out.write("        ");
if(accessLevel.equals("RW")){
            
      out.write("\n");
      out.write("        <button onclick=\"linkToButton('webform.jsp?table=");
      out.print(format);
      out.write("&req=");
      out.print(req);
      out.write("&lab=");
      out.print(label);
      out.write("');\">New Record</button>\n");
      out.write("            ");

        }
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- here starts the pending messages -->\n");
      out.write("        ");
      //  volante:query
      com.tplus.transform.runtime.webforms.core.QueryTag _jspx_th_volante_005fquery_005f1 = (com.tplus.transform.runtime.webforms.core.QueryTag) _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.get(com.tplus.transform.runtime.webforms.core.QueryTag.class);
      _jspx_th_volante_005fquery_005f1.setPageContext(_jspx_page_context);
      _jspx_th_volante_005fquery_005f1.setParent(null);
      // /security/showAll.jsp(217,8) name = format type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f1.setFormat("DASH4EYES");
      // /security/showAll.jsp(217,8) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f1.setId("pendChanges");
      // /security/showAll.jsp(217,8) name = queryName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f1.setQueryName("QueryPendByTable");
      // /security/showAll.jsp(217,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005fquery_005f1.setScope("session");
      int _jspx_eval_volante_005fquery_005f1 = _jspx_th_volante_005fquery_005f1.doStartTag();
      if (_jspx_eval_volante_005fquery_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            \n");
          out.write("                ");
          //  volante:param
          com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f3 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
          _jspx_th_volante_005fparam_005f3.setPageContext(_jspx_page_context);
          _jspx_th_volante_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fquery_005f1);
          // /security/showAll.jsp(219,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fparam_005f3.setName("table");
          // /security/showAll.jsp(219,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fparam_005f3.setValue(format);
          int _jspx_eval_volante_005fparam_005f3 = _jspx_th_volante_005fparam_005f3.doStartTag();
          if (_jspx_th_volante_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f3);
          out.write("\n");
          out.write("                ");
          //  volante:param
          com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f4 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
          _jspx_th_volante_005fparam_005f4.setPageContext(_jspx_page_context);
          _jspx_th_volante_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005fquery_005f1);
          // /security/showAll.jsp(220,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fparam_005f4.setName("user");
          // /security/showAll.jsp(220,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fparam_005f4.setValue(usr);
          int _jspx_eval_volante_005fparam_005f4 = _jspx_th_volante_005fparam_005f4.doStartTag();
          if (_jspx_th_volante_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f4);
          out.write("\n");
          out.write("            \n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_volante_005fquery_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_volante_005fquery_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.reuse(_jspx_th_volante_005fquery_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005fquery_0026_005fscope_005fqueryName_005fid_005fformat.reuse(_jspx_th_volante_005fquery_005f1);
      out.write(" \n");
      out.write("        ");

            DataObjectSection pendList = (DataObjectSection)session.getAttribute("pendChanges");
            if(!pendList.isEmpty()&&accessLevel.equals("RW")){
                
      out.write("\n");
      out.write("                <h1>Pending Changes</h1>\n");
      out.write("                <table id=\"pendTable\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"dataTable\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                    ");

                        for(int i=0; i<pendList.getElement(0).getFieldCount();i++){
                            
      out.write("\n");
      out.write("                            <th>");
      out.print(pendList.getElement(0).getFieldName(i));
      out.write("</th>\n");
      out.write("                            ");

                        }
                    
      out.write("\n");
      out.write("                            <th></th>\n");
      out.write("                            <th></th>\n");
      out.write("                            <th></th>\n");
      out.write("                        </tr>\n");
      out.write("                       </thead>\n");
      out.write("                       <tbody>\n");
      out.write("                        ");

                        for(int i=0;i<pendList.getElementCount();i++){
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                ");

                                    for(int j=0;j<pendList.getElement(i).getFieldCount();j++){
                                        if(pendList.getElement(i).getField(j)!=null){
                                        
      out.write("\n");
      out.write("                                        <td>");
      out.print(pendList.getElement(i).getField(j).toString());
      out.write("</td>\n");
      out.write("                                        ");

                                        }
                                        else{
                                            
      out.write("<td></td>");

                                    }
                                    }
                                    
                                
      out.write("\n");
      out.write("                                <td><button onclick=\"linkToButton('detail.jsp?index=");
      out.print(i);
      out.write("&action=A&req=");
      out.print(req);
      out.write("');\">Message Detail</button></td>\n");
      out.write("                                <td><button onclick=\"linkToButton('authorize.jsp?index=");
      out.print(i);
      out.write("&action=A&req=");
      out.print(req);
      out.write("');\">Authorize</button></td>\n");
      out.write("                                <td><button onclick=\"linkToButton('authorize.jsp?index=");
      out.print(i);
      out.write("&action=R&req=");
      out.print(req);
      out.write("');\">Reject</button></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                        }
                        
      out.write("\n");
      out.write("                       </tbody>\n");
      out.write("                </table>\n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
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
      out.write("\t</body>\n");
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
        out.write("                ");
        if (_jspx_meth_volante_005fparam_005f2(_jspx_th_volante_005foutput_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
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
    com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f2 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
    _jspx_th_volante_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005foutput_005f0);
    // /security/showAll.jsp(112,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f2.setName("accessLevel");
    // /security/showAll.jsp(112,16) name = valueRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f2.setValueRef("al");
    int _jspx_eval_volante_005fparam_005f2 = _jspx_th_volante_005fparam_005f2.doStartTag();
    if (_jspx_th_volante_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fname_005fnobody.reuse(_jspx_th_volante_005fparam_005f2);
    return false;
  }
}
