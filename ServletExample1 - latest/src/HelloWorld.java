/**
 * Created by Mec on 22/01/2017.
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

public class HelloWorld extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        // reading the user input
        String color= request.getParameter("color");
        String numVal = "50";
        int colVal = color.length();
        int numMulti = 0;

        numVal = request.getParameter("numVal");

        numMulti = parseInt(numVal)*50;

        numMulti = parseInt(request.getParameter("numVal"))*75;


        PrintWriter out = response.getWriter();
        out.println (
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\n" + "<html> \n" + "<head> \n" + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
                        "<title> My first jsp  </title> \n" +
                        "</head> \n" +
                        "<body> \n" +
                        "<font size=\"12px\" color=\"" + color + "\">" +
                        "Hello World <br>Colour Length:" + colVal +
                        "<p>Initial Num: " + numVal + "<br> Multiplied Num: "+ numMulti +"</p>" +
                        "</font> \n" +
                        "</body> \n" +
                        "</html>"
        );
    }
}
