package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;

public final class lookupbic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<style>\r\n");
      out.write("    <!--\r\n");
      out.write(".pgfnt {\r\n");
      out.write("    font-family: verdana,Arial, Helvetica, sans-serif;\r\n");
      out.write("    font-size: 70.0%;\r\n");
      out.write("}\r\n");
      out.write("    -->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("    <!--\r\n");
      out.write("    function updateBIC() {\r\n");
      out.write("        var bic = document.BIC.BICList.options[document.BIC.BICList.selectedIndex].value;\r\n");
      out.write("        opener.setBIC(bic);\r\n");
      out.write("        self.close();\r\n");
      out.write("    }\r\n");
      out.write("    //-->\r\n");
      out.write("</script>\r\n");
      out.write("<BODY  class=\"pgfnt\">\r\n");
      out.write("<center>\r\n");
      out.write("    <form name=\"BIC\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"pgfnt\"><b>Select BIC</b></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <select class=\"pgfnt\"  size=\"10\" name=\"BICList\">\r\n");
      out.write("                        ");

                            String selectedBic = request.getParameter("value");
                            List bicInfos = com.tplus.transform.runtime.swift.SwiftFunctions.getBICInfos("");
                            for (Iterator iter = bicInfos.iterator(); iter.hasNext();) {
                                com.tplus.transform.runtime.DataObject bicInfo = (com.tplus.transform.runtime.DataObject) iter.next();
                                String bic;
                                String name;
                                if(bicInfo.getMetaInfo().getFieldIndexIfExists("BIC CODE") == -1) {
                                    bic = (String) bicInfo.getField("BIC");
                                    name = (String) bicInfo.getField("Name");
                                }
                                else {
                                    bic = (String) bicInfo.getField("BIC CODE") + (String)bicInfo.getField("BRANCH CODE");
                                    name = (String) bicInfo.getField("INSTITUTION NAME");
                                }
                                String bicName = bic + "::" + name;
                                String selected = bic.equals(selectedBic) ? "selected" : "";
                        
      out.write("\r\n");
      out.write("                        <option ");
      out.print(selected);
      out.write(" value=\"");
      out.print( bic );
      out.write('"');
      out.write('>');
      out.print( bicName );
      out.write("</option>\r\n");
      out.write("                        ");
 }

                            if (bicInfos.size() == 0) { 
      out.write("\r\n");
      out.write("                        <option value=\"INVALID\">BIC Dictionary Not Available</option>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <font size=\"-2\" color=\"#808080\" face=\" Arial , Helvetica , sans - serif \">\r\n");
      out.write("                        <input type=\"button\" value=\"Set BIC\" onClick=\"javascript:updateBIC()\"></input></font>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("</center>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
