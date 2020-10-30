package com.grupoica.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaServlet
 */
@WebServlet("/hola")
public class HolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strNombre = request.getParameter("nombre");
		
		String html = "<html><head><title>Formulario envio</title></head><body>";
		if(strNombre == null|| "".equals(strNombre) ){
			html += "<h2>Pon el nombre</h2>";
		}else {
			html+="<form action='./hola.do' method='post'>" +
					"	Veces: <input name='veces' type='number'/>" +
					"	<input type='submit' value='POST'/>" + 
					"</form>";
		}
		html+="</body></html>";
				
		response.getWriter().append(html);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<h1>Hola desde servlet</h1> ");
		String veces = request.getParameter("veces");
		
		for(int i = 0;i<Integer.parseInt(veces);i++) {
			response.getWriter().append("<p>" + i + "vez</p> ");
		}
		
	}
	
	
	
	
}
