/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
<<<<<<< HEAD
 * Generated at: 2023-06-23 05:22:14 UTC
=======
 * Generated at: 2023-06-26 00:17:54 UTC
>>>>>>> b5dcab951256a7e0f0e380ce324b61a8ba7a26a4
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;

public final class mainMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
<<<<<<< HEAD
    _jspx_dependants.put("/view/header-navi.jsp", Long.valueOf(1687495784679L));
=======
    _jspx_dependants.put("/view/header-navi.jsp", Long.valueOf(1687495446199L));
>>>>>>> b5dcab951256a7e0f0e380ce324b61a8ba7a26a4
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("model");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPではGET、POST、またはHEADのみが許可されます。 JasperはOPTIONSも許可しています。");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
<<<<<<< HEAD
      out.write("<link rel=\"stylesheet\" href=\"");
=======
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"");
>>>>>>> b5dcab951256a7e0f0e380ce324b61a8ba7a26a4
      out.print(request.getContextPath());
      out.write("/view/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<h2>メインメニュー</h2>\n");
      out.write("	");
      out.write('\n');
      out.write('\n');
      model.LoginInfo loginInfo = null;
      synchronized (session) {
        loginInfo = (model.LoginInfo) _jspx_page_context.getAttribute("loginInfo", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (loginInfo == null){
          loginInfo = new model.LoginInfo();
          _jspx_page_context.setAttribute("loginInfo", loginInfo, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

String employeeName = loginInfo.getName();
if (employeeName == null){
	request.setAttribute("errorMsg", "セッションが切れました。再ログインをしてください。");
	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	rd.forward(request, response);
}

      out.write("\n");
      out.write("<hr>\n");
      out.write("<div class=\"parent\">\n");
      out.write("	| <a href=\"");
      out.print(request.getContextPath());
      out.write("/view/mainMenu.jsp\">メインメニュー</a> \n");
      out.write("	| <a href=\"");
      out.print(request.getContextPath());
      out.write("/MypageServlet\">マイページ</a>\n");
      out.write("	");
if (loginInfo.getPermissionLevel() > 3){ 
      out.write("| <a href=\"");
      out.print(request.getContextPath());
      out.write("/view/administratorMenu.jsp\">管理者メニュー</a>");
} 
      out.write("\n");
      out.write("	| <a href=\"");
      out.print(request.getContextPath());
      out.write("/LogoutServlet\">ログアウト</a> |\n");
      out.write("	<div class=\"right\">\n");
      out.write("		");
      out.print(employeeName);
      out.write("さん\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
<<<<<<< HEAD
      out.write("	<a href=\"");
      out.print(request.getContextPath());
      out.write("/MypageServlet\">マイページ</a><br>\n");
      out.write("	");

	if (loginInfo.getPermissionLevel() > 3){
=======
      out.write("	<p class=\"errorMsg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.errorMsg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("	<a href=\"");
      out.print(request.getContextPath());
      out.write("/MypageServlet\">マイページ</a>\n");
      out.write("	<br>\n");
      out.write("	");

	if (loginInfo.getPermissionLevel() > 3) {
>>>>>>> b5dcab951256a7e0f0e380ce324b61a8ba7a26a4
	
      out.write("\n");
      out.write("	<a href=\"");
      out.print(request.getContextPath());
      out.write("/view/administratorMenu.jsp\">管理者メニュー</a>\n");
      out.write("	");

	}
	
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
