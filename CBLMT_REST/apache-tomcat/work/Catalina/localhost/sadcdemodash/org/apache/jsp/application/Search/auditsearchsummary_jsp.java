package org.apache.jsp.application.Search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.diff.MessageDiffer;
import com.tplus.transform.runtime.DataObjectSection;
import com.tplus.transform.runtime.*;
import com.tplus.transform.runtime.webforms.*;
import com.tplus.transform.runtime.persistence.expression.*;
import java.util.*;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;

public final class auditsearchsummary_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.release();
    _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.release();
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
      			null, true, 24576, true);
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
      out.write("<html>\n");
      out.write(" \n");
      out.write("\t<head>    <meta http-equiv=\"expires\" content=\"-1\">  <META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\">          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">     <meta name=\"description\" content=\"\">     <meta name=\"author\" content=\"\"> <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/main.css\"/>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("                <script type=\"text/javascript\" src=\"../../js/volantescripts.js\" ></script>\n");
      out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/jquery.dataTables.css\"/>                \n");
      out.write("                <link href=\"../../css/redmond/jquery-ui-1.10.2.custom.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<title>Search Result</title>\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\" src=\"../../js/jquery.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\" src=\"../../js/jquery.dataTables.js\"></script>                \n");
      out.write("                <script type=\"text/javascript\" language=\"javascript\" src=\"../../js/ZeroClipboard.js\"></script>\n");
      out.write("\t\t<script src=\"../../js/jquery-ui-1.10.2.custom.js\"></script>\n");
      out.write("\t\t<script src=\"../js/jquery-ui-1.10.2.custom.js\"></script>\n");
      out.write("\t\t    \t\t<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t\t                        var dt1;\n");
      out.write("\t\t                        var dt2;\n");
      out.write("\t\t                        $(document).ready(function() {\n");
      out.write("\t\t    \t\t\t\t$('#menu').menu();\n");
      out.write("\t\t    \t\t\t} );\n");
      out.write("\t\t                        \n");
      out.write("\t\t    \t\t\t$(document).ready(function() {\n");
      out.write("\t\t                                \n");
      out.write("\t\t                                \n");
      out.write("\t\t    \t\t\t\tdt1=$('#generalTable').dataTable({\n");
      out.write("\t\t                                        \"sDom\": 'T<\"clear\">lfrtip',\n");
      out.write("\t\t                                        \"sPaginationType\":\"full_numbers\"\n");
      out.write("\t\t                                        \n");
      out.write("\t\t                                    });\n");
      out.write("\t\t    \t\t\t} );\n");
      out.write("\t\t                            \n");
      out.write("\t\t                            $(document).ready(function() {\n");
      out.write("\t\t    \t\t\t\tdt2=$('#pendTable').dataTable({\n");
      out.write("\t\t                                        \"sDom\": 'T<\"clear\">lfrtip',\n");
      out.write("\t\t                                        \"sPaginationType\":\"full_numbers\"\n");
      out.write("\t\t                                        \n");
      out.write("\t\t                                    });\n");
      out.write("\t\t                                    \n");
      out.write("\t\t                                    \n");
      out.write("\t\t                                    $('.dataTables_filter input')\n");
      out.write("\t\t                                .unbind('keypress keyup')\n");
      out.write("\t\t                                .bind('keypress keyup', function(e){\n");
      out.write("\t\t                            if($(this).val().length === 0 && e.keyCode === 8){\n");
      out.write("\t\t                                      var myId = this.getAttribute(\"aria-controls\");\n");
      out.write("\t\t                                    if(myId === \"generalTable\"){\n");
      out.write("\t\t                                      dt1.fnFilter($(this).val());\n");
      out.write("\t\t                                    }\n");
      out.write("\t\t                                    else{\n");
      out.write("\t\t                                      dt2.fnFilter($(this).val());\n");
      out.write("\t\t                                    }\n");
      out.write("\t\t                                  }\n");
      out.write("\t\t                                  if (e.keyCode !== 13)\n");
      out.write("\t\t                                      return;\n");
      out.write("\t\t                                  var myId = this.getAttribute(\"aria-controls\");\n");
      out.write("\t\t                                  if(myId === \"generalTable\"){\n");
      out.write("\t\t                                    dt1.fnFilter($(this).val());\n");
      out.write("\t\t                                  }\n");
      out.write("\t\t                                  else{\n");
      out.write("\t\t                                    dt2.fnFilter($(this).val());\n");
      out.write("\t\t                                  }\n");
      out.write("\t\t                                });\n");
      out.write("\t\t    \t\t\t} );\n");
      out.write("\t\t                            \n");
      out.write("\t\t                            \n");
      out.write("\t\t                            \n");
      out.write("\t\t                            function doDelete(uri){\n");
      out.write("\t\t                               if(confirm(\"do you want to delete this record ?\")){\n");
      out.write("\t\t                                   window.location = uri;\n");
      out.write("\t\t                               }\n");
      out.write("\t\t                           }\n");
      out.write("\t\t                           \n");
      out.write("\t\t                           function linkToButton(uri){\n");
      out.write("\t\t                               window.location = uri;\n");
      out.write("\t\t                           }\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t        function ensureAtLeastOneSelected() {\n");
      out.write("\t            if (countSelections() < 1) {\n");
      out.write("\t                alert(\"You need to select at least one message.\");\n");
      out.write("\t                return false;\n");
      out.write("\t            }\n");
      out.write("\t            return true;\n");
      out.write("\t        }\n");
      out.write("\t        function ensureOneSelected() {\n");
      out.write("\t            if (countSelections() < 1) {\n");
      out.write("\t                alert(\"You need to select one message\");\n");
      out.write("\t                return false;\n");
      out.write("\t            }\n");
      out.write("\t            if (countSelections() > 1) {\n");
      out.write("\t                alert(\"You need to select only one message\");\n");
      out.write("\t                return false;\n");
      out.write("\t            }\n");
      out.write("\t            return true;\n");
      out.write("\t        }\n");
      out.write("\t        function countSelections() {\n");
      out.write("\t            var cbs = document.summaryform.getElementsByTagName(\"input\");\n");
      out.write("\t            if (cbs == undefined) return false;\n");
      out.write("\t            var count = 0;\n");
      out.write("\t            for (var i = 0; i < cbs.length; i++) {\n");
      out.write("\t                if (cbs[i].type != \"checkbox\") {\n");
      out.write("\t                    continue;\n");
      out.write("\t                }\n");
      out.write("\t                if (cbs[i].name == \"all\") {\n");
      out.write("\t                    continue;\n");
      out.write("\t                }\n");
      out.write("\t                if (cbs[i].checked) {\n");
      out.write("\t                    ++count;\n");
      out.write("\t                }\n");
      out.write("\t            }\n");
      out.write("\t            return count;\n");
      out.write("\t        }\n");
      out.write("\t        function onRawXML() {\n");
      out.write("\t            if (ensureOneSelected()) {\t          \n");
      out.write("\t                return true;\n");
      out.write("\t            }\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t        function onView() {\n");
      out.write("\t            if (ensureOneSelected()) {\n");
      out.write("\t                return true;\n");
      out.write("\t            }\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t        function onEdit() {\n");
      out.write("\t            if (ensureOneSelected()) {\n");
      out.write("\t                return true;\n");
      out.write("\t            }\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t        function onAudit() {\n");
      out.write("\t            if (ensureOneSelected()) {\n");
      out.write("\t                return true;\n");
      out.write("\t            }\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t          functin onDetailView(){\n");
      out.write("\t\t\t        \tif (ensureOneSelected()) {\n");
      out.write("\t\t\t\t\t\t                return true;\n");
      out.write("\t\t\t\t\t\t            }\n");
      out.write("\t\t\t            \treturn false;\n");
      out.write("\t        }\n");
      out.write("\t        function onDelete() {\n");
      out.write("\t            if (ensureAtLeastOneSelected()) {\n");
      out.write("\t                if (confirm(\"Do you want to delete the selected message(s) from the database? This cannot be undone\")) {\n");
      out.write("\t                    disableButtons();\n");
      out.write("\t                    return true;\n");
      out.write("\t                }\n");
      out.write("\t            }\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t        function onCopy() {\n");
      out.write("\t            if (ensureAtLeastOneSelected()) {\n");
      out.write("\t                if (confirm(\"Do you want to copy the selected message(s)?\")) {\n");
      out.write("\t                    disableButtons();\n");
      out.write("\t                    return true;\n");
      out.write("\t                }\n");
      out.write("\t            }\n");
      out.write("\t            //window.event.returnValue = false;\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t        function onRelease() {\n");
      out.write("\t            if (ensureAtLeastOneSelected()) {\n");
      out.write("\t                disableButtons();\n");
      out.write("\t                return true;\n");
      out.write("\t            }\n");
      out.write("\t            //window.event.returnValue = false;\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t        function onDownload() {\n");
      out.write("\t            if (ensureAtLeastOneSelected()) {\n");
      out.write("\t                return true;\n");
      out.write("\t            }\n");
      out.write("\t            //window.event.returnValue = false;\n");
      out.write("\t            return false;\n");
      out.write("\t        }\n");
      out.write("\t        function checkAll(cAll) {\n");
      out.write("\t            var cbs = document.summaryform.getElementsByTagName(\"input\");\n");
      out.write("\t            if (cbs == undefined) return;\n");
      out.write("\t            var checked = cAll.checked;\n");
      out.write("\t            for (var i = 0; i < cbs.length; i++) {\n");
      out.write("\t                if (cbs[i].type != \"checkbox\") {\n");
      out.write("\t                    continue;\n");
      out.write("\t                }\n");
      out.write("\t                cbs[i].checked = checked;\n");
      out.write("\t            }\n");
      out.write("\t        }\n");
      out.write("\t        function disableButtons() {\n");
      out.write("\t\n");
      out.write("\t            //this.disabled=true;document.body.style.cursor = \\\"wait\\\"; this.className=\\\"buttondisabled\\\";\n");
      out.write("\t\n");
      out.write("\t            var buttons = document.getElementsByTagName(\"input\");\n");
      out.write("\t            for (var i = 0; i < buttons.length; i++) {\n");
      out.write("\t                if (buttons[i].type == 'button') {\n");
      out.write("\t                    buttons[i].disabled = true;\n");
      out.write("\t                    buttons[i].className = 'buttondisabled';\n");
      out.write("\t                }\n");
      out.write("\t            }\n");
      out.write("\t            document.body.style.cursor = 'wait';\n");
      out.write("\t        }\n");
      out.write("\t\n");
      out.write("    \t\t</script>\n");
      out.write("\t\t\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/app.css\">\n");
      out.write("    \t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/webform.css\">\n");
      out.write("\t</head>\n");
      out.write("\t<body style=\"margin :0\">\n");
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
      out.write("            ");
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
      out.write("            \n");
 
    String user = session.getAttribute("user").toString();
    session.removeAttribute("format");
    String format = request.getParameter("table");
    String label = session.getAttribute("label").toString();
    session.setAttribute("format", format);
    session.setAttribute("label", label);
    
     List normalizedObjectCollection = (List) session.getAttribute("summaryList");
      
        String summaryPageSize = request.getParameter("SummaryPageSize");
        if (summaryPageSize != null) {
            session.setAttribute("pageSize", summaryPageSize);
        }
        summaryPageSize = (String) session.getAttribute("pageSize");
        if (summaryPageSize == null) {
            summaryPageSize = "50";
        }
        String pageSize = summaryPageSize;
        if (pageSize.equals("All")) {
            pageSize = "100000";
        }
        boolean forexport = false;
        String exportType = request.getParameter("exportType");
        if (exportType != null && exportType.length() > 0) {
            forexport = true;
            pageSize = "10000";
        }
    String[] allowedPagesSizes = new String[]{"10", "25", "50", "100", "All"};	
     
    

      out.write("\n");
      out.write("\n");
      out.write(" <br/>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("<!--Search > -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div style=\"text-align: center;\">\n");
      out.write("\t\t\t    <input type=\"button\" class=\"LookupButtonStyle\" name=\"Return\" value=\"Return\" onclick=\"window.open('auditmaster.jsp', '_self')\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t  <br/>\n");
      out.write("\t\t\t    <table width=\"90%\">\n");
      out.write("\t\t\t        <tr>\n");
      out.write("\t\t\t            <td>\n");
      out.write("\t\t\t                ");
      //  volante:table
      com.tplus.transform.runtime.webforms.summary.TableTag _jspx_th_volante_005ftable_005f0 = (com.tplus.transform.runtime.webforms.summary.TableTag) _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.get(com.tplus.transform.runtime.webforms.summary.TableTag.class);
      _jspx_th_volante_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005ftable_005f0.setParent(null);
      // /application/Search/auditsearchsummary.jsp(267,19) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setId("1");
      // /application/Search/auditsearchsummary.jsp(267,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setName("summaryList");
      // /application/Search/auditsearchsummary.jsp(267,19) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setRequestURI("auditsearchsummary.jsp");
      // /application/Search/auditsearchsummary.jsp(267,19) name = pagesize type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setPagesize("15");
      // /application/Search/auditsearchsummary.jsp(267,19) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setDecorator("com.tplus.transform.runtime.webforms.summary.DataObjectWrapperImpl");
      // /application/Search/auditsearchsummary.jsp(267,19) name = border type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setBorder("0");
      // /application/Search/auditsearchsummary.jsp(267,19) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setCellspacing("0");
      // /application/Search/auditsearchsummary.jsp(267,19) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setCellpadding("0");
      // /application/Search/auditsearchsummary.jsp(267,19) name = bgcolor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setBgcolor("#CCCCCC");
      // /application/Search/auditsearchsummary.jsp(267,19) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setStyleClass("TableStyle");
      int _jspx_eval_volante_005ftable_005f0 = _jspx_th_volante_005ftable_005f0.doStartTag();
      if (_jspx_eval_volante_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Integer table_index = null;
        java.lang.Object table_item = null;
        if (_jspx_eval_volante_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_volante_005ftable_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_volante_005ftable_005f0.doInitBody();
        }
        table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
        table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
        do {
          out.write("\n");
          out.write("\t\t\t                    ");
          if (_jspx_meth_volante_005fsetProperty_005f0(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("                    \n");
          out.write("\t\t\t                    //DJ Add\n");
          out.write("\t\t\t                    ");
          if (_jspx_meth_volante_005fcolumn_005f0(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t                    ");
          if (_jspx_meth_volante_005fcolumn_005f1(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t                    ");
          if (_jspx_meth_volante_005fcolumn_005f2(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t                    ");
          if (_jspx_meth_volante_005fcolumn_005f3(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t                    ");
          if (_jspx_meth_volante_005fcolumn_005f4(_jspx_th_volante_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t                ");
          int evalDoAfterBody = _jspx_th_volante_005ftable_005f0.doAfterBody();
          table_index = (java.lang.Integer) _jspx_page_context.findAttribute("table_index");
          table_item = (java.lang.Object) _jspx_page_context.findAttribute("table_item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_volante_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_volante_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_volante_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fstyleClass_005frequestURI_005fpagesize_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder_005fbgcolor.reuse(_jspx_th_volante_005ftable_005f0);
      out.write("\n");
      out.write("\t\t\t            </td>\n");
      out.write("\t\t\t        </tr>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t    </table>\n");
      out.write("\t\t\t</center>\n");
      out.write("<br/>\n");
      out.write("          <br/>\n");
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

  private boolean _jspx_meth_volante_005fsetProperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:setProperty
    com.tplus.transform.runtime.webforms.summary.SetPropertyTag _jspx_th_volante_005fsetProperty_005f0 = (com.tplus.transform.runtime.webforms.summary.SetPropertyTag) _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.get(com.tplus.transform.runtime.webforms.summary.SetPropertyTag.class);
    _jspx_th_volante_005fsetProperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fsetProperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /application/Search/auditsearchsummary.jsp(270,23) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fsetProperty_005f0.setName("sort.behavior");
    // /application/Search/auditsearchsummary.jsp(270,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fsetProperty_005f0.setValue("all");
    int _jspx_eval_volante_005fsetProperty_005f0 = _jspx_th_volante_005fsetProperty_005f0.doStartTag();
    if (_jspx_th_volante_005fsetProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fsetProperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_volante_005fsetProperty_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f0 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /application/Search/auditsearchsummary.jsp(272,23) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f0.setProperty("Agent");
    // /application/Search/auditsearchsummary.jsp(272,23) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f0.setTitle("Role");
    // /application/Search/auditsearchsummary.jsp(272,23) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f0.setNowrap("true");
    // /application/Search/auditsearchsummary.jsp(272,23) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f0.setSort("true");
    int _jspx_eval_volante_005fcolumn_005f0 = _jspx_th_volante_005fcolumn_005f0.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f1 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /application/Search/auditsearchsummary.jsp(273,23) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setProperty("BatchID");
    // /application/Search/auditsearchsummary.jsp(273,23) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setTitle("BatchID");
    // /application/Search/auditsearchsummary.jsp(273,23) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setNowrap("true");
    // /application/Search/auditsearchsummary.jsp(273,23) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f1.setSort("true");
    int _jspx_eval_volante_005fcolumn_005f1 = _jspx_th_volante_005fcolumn_005f1.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f2 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /application/Search/auditsearchsummary.jsp(274,23) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setProperty("MessageId");
    // /application/Search/auditsearchsummary.jsp(274,23) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setTitle("MessageId");
    // /application/Search/auditsearchsummary.jsp(274,23) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setNowrap("true");
    // /application/Search/auditsearchsummary.jsp(274,23) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f2.setSort("true");
    int _jspx_eval_volante_005fcolumn_005f2 = _jspx_th_volante_005fcolumn_005f2.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f3 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /application/Search/auditsearchsummary.jsp(275,23) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setProperty("Status");
    // /application/Search/auditsearchsummary.jsp(275,23) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setTitle("Status");
    // /application/Search/auditsearchsummary.jsp(275,23) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setNowrap("true");
    // /application/Search/auditsearchsummary.jsp(275,23) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f3.setSort("true");
    int _jspx_eval_volante_005fcolumn_005f3 = _jspx_th_volante_005fcolumn_005f3.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f3);
    return false;
  }

  private boolean _jspx_meth_volante_005fcolumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:column
    com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f4 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
    _jspx_th_volante_005fcolumn_005f4.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fcolumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
    // /application/Search/auditsearchsummary.jsp(276,23) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setProperty("Timestamp");
    // /application/Search/auditsearchsummary.jsp(276,23) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setTitle("Timestamp");
    // /application/Search/auditsearchsummary.jsp(276,23) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setSort("true");
    // /application/Search/auditsearchsummary.jsp(276,23) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fcolumn_005f4.setDecorator("com.tplus.transform.runtime.webforms.summary.TimestampColumnDecorator");
    int _jspx_eval_volante_005fcolumn_005f4 = _jspx_th_volante_005fcolumn_005f4.doStartTag();
    if (_jspx_th_volante_005fcolumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f4);
    return false;
  }
}
