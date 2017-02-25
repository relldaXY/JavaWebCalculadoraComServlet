package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcBasic
 */
@WebServlet("/CalcBasic")
public class CalcBasic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcBasic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sValorA = request.getParameter("valorA");
		String sValorB = request.getParameter("valorB");
		String sOpcao = request.getParameter("opcao");
		
		double dValorA = Double.parseDouble(sValorA);
		double dValorB = Double.parseDouble(sValorB);
		
		double resultado = 0;
		
		if(sOpcao.equals("+") ){
			resultado = dValorA + dValorB;
		}else if(sOpcao.equals("-")){
			resultado = dValorA - dValorB;
		}else if(sOpcao.equals("*")){
			resultado = dValorA * dValorB;
		}else{
			resultado = dValorA / dValorB;
		}
		
		out.print("Resultado: <br>"+resultado);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
