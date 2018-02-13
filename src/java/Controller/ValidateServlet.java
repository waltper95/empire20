package Controller;

import Model.DAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Error;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ValidateServlet", urlPatterns = {"/Validate.do"})
public class ValidateServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        DAO dao = new DAO();
        
        String User,Pass;
        
        User = request.getParameter("txtMail");
        Pass = request.getParameter("txtPass");
        
        User u = new User(User, Pass);
        User user2 = dao.exist(u);
        
        HttpSession session = request.getSession();
        
        if (user2.errorExist()){
            List<Error> errors = user2.getErrors();
            session.setAttribute("errors", errors);
            request.getRequestDispatcher("Error.view").forward(request, response);
        }else{
            /*Menu*/
            session.setAttribute("user", user2);
            request.getRequestDispatcher("Menu.view").forward(request, response);
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


}
