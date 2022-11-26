package it.virna;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("   <title>Secondo esempio</title>\r\n"
        		+ " <link href=\"css/mio_stile.css\" type=\"text/css\" rel=\"stylesheet\">\r\n"
        		+ "</head>\r\n"
        		
        		+ "<body>\r\n"
        		+ "    <div>\r\n"
        		+ "        <header>"
        		+ "        <nav>"
        		+ "           <center> <h1>La mia Home Page</h1></center>"
        	
        		+ "          <center> <a href=\"http:/home\">Home </a>"
        		+ "            <a href=#>Chi sono </a>"
        		+ "            <a href=#>Servizi </a>"
        		+ "            <a href=#>Contatti </a>"
        		+ "            </center>"
        		+ "        </nav>\r\n"
        		+ "        </header>\r\n"   
        		
        		+ "        <div>\r\n"
        		        
        		+ "            <center> <img src=\" https://th.bing.com/th/id/OIP.YmTeg-4CqOihBjFvFuooZAHaE8?w=242&h=180&c=7&r=0&o=5&pid=1.7 \"></center>\r\n"
        		          
        		+ "            <footer class=\"myfooter\">\r\n"
        		+ "               <center> <div id=\"foot-content-1\"></center>\r\n"
        		+ "                 <center>   <p>Novembre 2022</p></center>\r\n"
        		+ "                </div>\r\n"
        		+ "                <div id=\"foot-content-2\"> \r\n"
        		+ "                   <center> <div id=\"foot-content-2-1\">\r\n"
        		+ "                        <p>\r\n"
        		+ "                            &copy; Copyright  by Virna\r\n"
        		+ "                        </p>\r\n"
        		+ "                    </div>\r\n"
        		+ "                    <div id=\"foot-content-2-2\"></center>\r\n"
        		
        		+ "                    </div>\r\n"
        		+ "                </div>\r\n"
        		+ "            </footer>\r\n"
        		+ "            </div>\r\n"
        		+ "    </div>\r\n"
        		+ "</body>\r\n"
        		+ "</html>");		 
        w.flush();
        w.close();
    }
	
	
}

