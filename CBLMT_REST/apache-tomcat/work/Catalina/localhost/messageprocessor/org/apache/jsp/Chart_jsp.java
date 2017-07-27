package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import javax.servlet.jsp.JspException;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.servlet.ServletUtilities;
import com.tplus.transform.runtime.*;
import org.jfree.data.general.PieDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.util.TableOrder;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeriesCollection;
import com.tplus.transform.util.SequencedHashMap;
import org.jfree.data.time.Day;

public final class Chart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/CheckUser.jsp");
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/Footer.html");
    _jspx_dependants.add("/WEB-INF/webforms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005finput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005foutput;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fwidth_005fstyleClass_005frequestURI_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005finput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005foutput = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fwidth_005fstyleClass_005frequestURI_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.release();
    _005fjspx_005ftagPool_005fvolante_005finput.release();
    _005fjspx_005ftagPool_005fvolante_005foutput.release();
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.release();
    _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fwidth_005fstyleClass_005frequestURI_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder.release();
    _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	if (session.getAttribute("userName") == null) {

      out.write('\r');
      out.write('\n');
      out.write('	');
      if (true) {
        _jspx_page_context.forward("LoginForm.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <title>Charts Menu</title>\r\n");
      out.write("\r\n");
      out.write("    <META HTTP-EQUIV=\"Cache-control\" CONTENT=\"no-cache, no-store, must-revalidate\">\r\n");
      out.write("    <META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("    <META HTTP-EQUIV=\"Expires\" CONTENT=\"01 Apr 1995 01:10:10 GMT\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"app.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webform.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin :0\">\r\n");
      out.write("<table class=\"banner\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("            <img style=\"margin-left:10px;border:0px\" src=\"images/volante-logo.gif\" alt=\"Volante\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("            <span style=\"font-size:32pt;font-family:Garamond,sans-serif,Arial;color:white;\">Message Processor</span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\" >\r\n");
      out.write("            <img style=\"margin-right:10px;border:0px\" src=\"images/volante.gif\" alt=\"Volante Technologies\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
 if(session.getAttribute("userName") != null) { 
      out.write("\r\n");
      out.write("<!-- no menus if the user is not logged in -->\r\n");
      out.write("<table width=\"100%\" class=\"toolbar\" cellpadding=0 cellspacing=0 border=0>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td class=\"toplinksbold\" nowrap width=\"100%\"></td>\r\n");
      out.write("        <td class=\"toplinks\" nowrap>&nbsp;</td>\r\n");
      out.write("        <td class=\"toplinksdivide\" align=\"right\" nowrap></td>\r\n");
      out.write("        <td class=\"toplinks2\" align=right valign=\"middle\" nowrap>\r\n");
      out.write("                <span class=\"linktop\">&nbsp;&nbsp;\r\n");
      out.write("                    <a href=\"MessagesSearchForm.jsp\" class=\"linktop\" title=\"Message Processor\">\r\n");
      out.write("                        <img style=\"border:0px\" src=\"images/icon-home.gif\" align=\"bottom\" alt=\"Console Home\">&nbsp;Home</a>\r\n");
      out.write("                    <a href=\"NewRawMessage.jsp\" class=\"linktop\" title=\"Create a new message\">New Message</a>\r\n");
      out.write("                    <a href=\"ChartList.jsp\" class=\"linktop\" title=\"Display Charts\">Charts</a>\r\n");
      out.write("                    <a href=\"LoginForm.jsp\" class=\"linktop\">Log Out</a>\r\n");
      out.write("                    <img src=\"images/spacer.gif\" width=\"10px\" alt=\"\">&nbsp;&nbsp;\r\n");
      out.write("                </span>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
 } 
      out.write('\r');
      out.write('\n');

    String flowName = request.getParameter("name");
    if (flowName == null) {
        flowName = "MessagesByBIC";
    }
    System.out.println("Flow = " + flowName);
    //String flowName ="GroupByMessageType";

      out.write('\r');
      out.write('\n');
      //  volante:invokeMessageFlow
      com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag _jspx_th_volante_005finvokeMessageFlow_005f0 = (com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag) _005fjspx_005ftagPool_005fvolante_005finvokeMessageFlow_0026_005fscope_005fname_005ferrorRef.get(com.tplus.transform.runtime.webforms.core.InvokeMessageFlowTag.class);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005finvokeMessageFlow_005f0.setParent(null);
      // /Chart.jsp(45,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setName(flowName);
      // /Chart.jsp(45,0) name = errorRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setErrorRef("processingErrors");
      // /Chart.jsp(45,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005finvokeMessageFlow_005f0.setScope("session");
      int _jspx_eval_volante_005finvokeMessageFlow_005f0 = _jspx_th_volante_005finvokeMessageFlow_005f0.doStartTag();
      if (_jspx_eval_volante_005finvokeMessageFlow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_volante_005finput_005f0(_jspx_th_volante_005finvokeMessageFlow_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_volante_005foutput_005f0(_jspx_th_volante_005finvokeMessageFlow_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
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
      out.write("\r\n");
      out.write("\r\n");

    // Recipient
    DataObject chartInfo = (DataObject) session.getAttribute("chartInfo");
    //String chartType = "Line";
    //String chartType = "XY-Series";
    String chartType = (String) chartInfo.getField("ChartType");


    System.out.println(chartInfo);
    DefaultCategoryDataset chartDataset = new DefaultCategoryDataset();
    DataObjectSection sec = chartInfo.getSection("ChartData");
    session.setAttribute("chartData", sec);
    for (int i = 0; i < sec.size(); ++i) {
        DataObject chartData = sec.getElement(i);
        chartDataset.addValue((Number) chartData.getField("Value"), (String) chartData.getField("RowIndex"), (String) chartData.getField("ColumnIndex"));
    }
    JFreeChart chart = null;
    String title = (String) chartInfo.getField("Title");
    String categoryAxisLabel = (String) chartInfo.getField("CategoryAxisLabel");
    String valueAxisLabel = (String) chartInfo.getField("ValueAxisLabel");
    boolean legend = ((Boolean) chartInfo.getField("Legend")).booleanValue();
    if (chartType.equalsIgnoreCase("Bar")) {
        chart = ChartFactory.createBarChart(
                title, // chart title
                categoryAxisLabel, // domain axis label
                valueAxisLabel, // range axis label
                chartDataset, // data
                PlotOrientation.VERTICAL, // orientation
                legend, // include legend
                true, // tooltips?
                false // URLs?
        );
    }
    else if (chartType.equalsIgnoreCase("Line")) {
        chart = ChartFactory.createLineChart(
                title, // chart title
                categoryAxisLabel, // domain axis label
                valueAxisLabel, // range axis label
                chartDataset, // data
                PlotOrientation.VERTICAL, // orientation
                legend, // include legend
                true, // tooltips?
                false // URLs?
        );
    }
    else if (chartType.equalsIgnoreCase("Pie")) {
        chart = ChartFactory.createPieChart(
                title, // chart title
                new CategoryToPieDataset(chartDataset, TableOrder.BY_ROW, 0),// data
                legend, // include legend
                true, // tooltips?
                false // URLs?
        );
        Plot plot = chart.getPlot();
    }
    if (chartType.equalsIgnoreCase("XY-Series")) {
        Map dataSeries = new SequencedHashMap();
        for (int i = 0; i < sec.size(); ++i) {
            DataObject chartData = sec.getElement(i);
            String rowIndex = (String) chartData.getField("RowIndex");
            XYSeries series = (XYSeries) dataSeries.get(rowIndex);
            if (series == null) {
                series = new XYSeries(rowIndex);
                dataSeries.put(rowIndex, series);
            }
            Number value = (Number) chartData.getField("Value");
            String columnIndex = (String) chartData.getField("ColumnIndex");
            double columnValue;
            if (columnIndex.indexOf("/") != -1) {
                Date date = Parsing.parseDate(columnIndex, "yyyy/MM/dd");
                columnValue = date.getTime();
            }
            else {
                columnValue = Double.parseDouble(columnIndex);
            }
            series.add(columnValue, value.doubleValue());
        }
        XYSeriesCollection xydataset = new XYSeriesCollection();
        for (Iterator iterator = dataSeries.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            XYSeries value = (XYSeries) entry.getValue();
            xydataset.addSeries(value);
        }
        chart = ChartFactory.createXYLineChart(
                title, // chart title
                categoryAxisLabel, // domain axis label
                valueAxisLabel, // range axis label
                xydataset, // data
                PlotOrientation.VERTICAL, // orientation
                legend, // include legend
                true, // tooltips?
                false // URLs?
        );
    }
    if (chartType.equalsIgnoreCase("Time-Series")) {
        Class type = Day.class;
        Map dataSeries = new SequencedHashMap();
        for (int i = 0; i < sec.size(); ++i) {
            DataObject chartData = sec.getElement(i);
            String rowIndex = (String) chartData.getField("RowIndex");
            TimeSeries series = (TimeSeries) dataSeries.get(rowIndex);
            if (series == null) {
                series = new TimeSeries(rowIndex);
                dataSeries.put(rowIndex, series);
            }
            Number value = (Number) chartData.getField("Value");
            String columnIndex = (String) chartData.getField("ColumnIndex");
            double columnValue;
            if (columnIndex.indexOf("/") != -1) {
                Date date = Parsing.parseDate(columnIndex, "yyyy/MM/dd");
                columnValue = date.getTime();
            }
            else {
                columnValue = Double.parseDouble(columnIndex);
            }
            RegularTimePeriod rtp = RegularTimePeriod.createInstance(Day.class, new Date((long) columnValue), TimeZone.getDefault());
            series.add(rtp, value.doubleValue());
        }
        TimeSeriesCollection xydataset = new TimeSeriesCollection();
        for (Iterator iterator = dataSeries.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            TimeSeries value = (TimeSeries) entry.getValue();
            xydataset.addSeries(value);
        }
        chart = ChartFactory.createTimeSeriesChart(
                title, // chart title
                categoryAxisLabel, // domain axis label
                valueAxisLabel, // range axis label
                xydataset, // data
                legend, // include legend
                true, // tooltips?
                false // URLs?
        );
    }
    ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
    int height = 400;
    String chartFilename = ServletUtilities.saveChartAsPNG(chart, 500, height, info, session);
    ChartUtilities.writeImageMap(new java.io.PrintWriter(out), chartFilename, info, true);
    out.flush();
    String chartFileURL = request.getContextPath() + "/servlet/DisplayChart?filename=" + chartFilename;


      out.write("\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("            <img src=\"");
      out.print( chartFileURL );
      out.write("\" border=0 usemap=\"#");
      out.print( chartFilename );
      out.write("\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td valign=\"center\" align=\"center\">\r\n");
      out.write("            ");
      //  volante:table
      com.tplus.transform.runtime.webforms.summary.TableTag _jspx_th_volante_005ftable_005f0 = (com.tplus.transform.runtime.webforms.summary.TableTag) _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fwidth_005fstyleClass_005frequestURI_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder.get(com.tplus.transform.runtime.webforms.summary.TableTag.class);
      _jspx_th_volante_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_volante_005ftable_005f0.setParent(null);
      // /Chart.jsp(204,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setWidth("100%");
      // /Chart.jsp(204,12) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setId("1");
      // /Chart.jsp(204,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setName("chartData");
      // /Chart.jsp(204,12) name = requestURI type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setRequestURI("chart.jsp");
      // /Chart.jsp(204,12) name = decorator type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setDecorator("com.tplus.transform.runtime.webforms.summary.MessagesDataObjectWrapper");
      // /Chart.jsp(204,12) name = border type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setBorder("0");
      // /Chart.jsp(204,12) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setCellspacing("0");
      // /Chart.jsp(204,12) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_volante_005ftable_005f0.setCellpadding("0");
      // /Chart.jsp(204,12) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("\r\n");
          out.write("                ");
          //  volante:column
          com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f0 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
          _jspx_th_volante_005fcolumn_005f0.setPageContext(_jspx_page_context);
          _jspx_th_volante_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
          // /Chart.jsp(208,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f0.setProperty("ColumnIndex");
          // /Chart.jsp(208,16) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f0.setTitle(categoryAxisLabel);
          // /Chart.jsp(208,16) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f0.setNowrap("true");
          // /Chart.jsp(208,16) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f0.setSort("true");
          // /Chart.jsp(208,16) name = caseInsensitiveSort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f0.setCaseInsensitiveSort(true);
          int _jspx_eval_volante_005fcolumn_005f0 = _jspx_th_volante_005fcolumn_005f0.doStartTag();
          if (_jspx_th_volante_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f0);
          out.write("\r\n");
          out.write("                ");
          //  volante:column
          com.tplus.transform.runtime.webforms.summary.ColumnTag _jspx_th_volante_005fcolumn_005f1 = (com.tplus.transform.runtime.webforms.summary.ColumnTag) _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody.get(com.tplus.transform.runtime.webforms.summary.ColumnTag.class);
          _jspx_th_volante_005fcolumn_005f1.setPageContext(_jspx_page_context);
          _jspx_th_volante_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005ftable_005f0);
          // /Chart.jsp(210,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f1.setProperty("Value");
          // /Chart.jsp(210,16) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f1.setTitle(valueAxisLabel);
          // /Chart.jsp(210,16) name = nowrap type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f1.setNowrap("true");
          // /Chart.jsp(210,16) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f1.setSort("true");
          // /Chart.jsp(210,16) name = caseInsensitiveSort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_volante_005fcolumn_005f1.setCaseInsensitiveSort(true);
          int _jspx_eval_volante_005fcolumn_005f1 = _jspx_th_volante_005fcolumn_005f1.doStartTag();
          if (_jspx_th_volante_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fvolante_005fcolumn_0026_005ftitle_005fsort_005fproperty_005fnowrap_005fcaseInsensitiveSort_005fnobody.reuse(_jspx_th_volante_005fcolumn_005f1);
          out.write("\r\n");
          out.write("            ");
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
        _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fwidth_005fstyleClass_005frequestURI_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder.reuse(_jspx_th_volante_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fvolante_005ftable_0026_005fwidth_005fstyleClass_005frequestURI_005fname_005fid_005fdecorator_005fcellspacing_005fcellpadding_005fborder.reuse(_jspx_th_volante_005ftable_005f0);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"right\">\r\n");
      out.write("\t\t<font face=\"tahoma\" size=\"-2\">\r\n");
      out.write("\t\t\tCopyright © 2002-2010 Volante Technologies, Inc.\r\n");
      out.write("\t\t</font>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"1%\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"right\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"1%\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
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

  private boolean _jspx_meth_volante_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005finvokeMessageFlow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:input
    com.tplus.transform.runtime.webforms.core.InputTag _jspx_th_volante_005finput_005f0 = (com.tplus.transform.runtime.webforms.core.InputTag) _005fjspx_005ftagPool_005fvolante_005finput.get(com.tplus.transform.runtime.webforms.core.InputTag.class);
    _jspx_th_volante_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005finvokeMessageFlow_005f0);
    int _jspx_eval_volante_005finput_005f0 = _jspx_th_volante_005finput_005f0.doStartTag();
    if (_jspx_eval_volante_005finput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_volante_005finput_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_volante_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005finput.reuse(_jspx_th_volante_005finput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005finput.reuse(_jspx_th_volante_005finput_005f0);
    return false;
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
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_volante_005fparam_005f0(_jspx_th_volante_005foutput_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
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

  private boolean _jspx_meth_volante_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_volante_005foutput_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  volante:param
    com.tplus.transform.runtime.webforms.core.ParamTag _jspx_th_volante_005fparam_005f0 = (com.tplus.transform.runtime.webforms.core.ParamTag) _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.get(com.tplus.transform.runtime.webforms.core.ParamTag.class);
    _jspx_th_volante_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_volante_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_volante_005foutput_005f0);
    // /Chart.jsp(49,8) name = valueRef type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_volante_005fparam_005f0.setValueRef("chartInfo");
    int _jspx_eval_volante_005fparam_005f0 = _jspx_th_volante_005fparam_005f0.doStartTag();
    if (_jspx_th_volante_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fvolante_005fparam_0026_005fvalueRef_005fnobody.reuse(_jspx_th_volante_005fparam_005f0);
    return false;
  }
}
