package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.tplus.transform.runtime.swift.*;

public final class lookupcurrency_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    function updateCurrency() {\r\n");
      out.write("        var currency = document.Currency.CurrencyList.options[document.Currency.CurrencyList.selectedIndex].value;\r\n");
      out.write("        opener.setCurrency(currency);\r\n");
      out.write("        self.close();\r\n");
      out.write("    }\r\n");
      out.write("    //-->\r\n");
      out.write("</script>\r\n");


      out.write("\r\n");
      out.write("<BODY topmargin=\"5\" leftmargin=\"5\" class=\"pgfnt\">\r\n");
      out.write("    <form name=\"Currency\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"pgfnt\"><b>Select Currency</b></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <select class=\"pgfnt\"  size=\"10\" name=\"CurrencyList\">\r\n");
      out.write("                        ");

                            List values = new ArrayList(SwiftFunctions.getCurrencyCodes());
                            //Collections.sort(values);
                            String selectedValue = request.getParameter("value");
                            Set allCodes = new HashSet();
                            for (Iterator iter = values.iterator(); iter.hasNext();) {
                                com.tplus.transform.runtime.DataObject bicInfo = (com.tplus.transform.runtime.DataObject) iter.next();
                                String code = (String) bicInfo.getField("CURRENCY CODE");
                                String name = (String) bicInfo.getField("CURRENCY NAME");
                                if(code.length() == 0 || allCodes.contains(code)) {
                                    continue;
                                }
                                allCodes.add(code);
                                String valueName = code + " - " + name;
                                String selected = code.equals(selectedValue) ? "selected" : "";
                        
      out.write("\r\n");
      out.write("                        <option ");
      out.print(selected);
      out.write(" value=\"");
      out.print( code );
      out.write('"');
      out.write('>');
      out.print( valueName );
      out.write("</option>\r\n");
      out.write("                        ");
 }

                            if (values.size() == 0) { 
      out.write("\r\n");
      out.write("                        <option value=\"INVALID\" >Currency Dictionary Not Available</option>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <font size=\"-2\" color=\"#808080\" face=\" Arial , Helvetica , sans - serif \">\r\n");
      out.write("                        <input type=\"button\" value=\"Set Currency\" onClick=\"javascript:updateCurrency()\"></input>\r\n");
      out.write("\r\n");
      out.write("                    </font>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
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
