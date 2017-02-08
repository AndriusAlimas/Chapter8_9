package example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import example.foo.*;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException{
		    // created a Person object:
		 	Person person = new Person();
		 	// set person object name:
	        person.setName("Leelu");
	        // created a dog object:
	        Dog dog = new Dog();
	        // set dog object name:
	        dog.setName("Clyde");
	        // created toy object:
	        Toy toy = new Toy();
	        // set toy object name:
	        toy.setName("stick");
	        // create second toy object:
	        Toy toy2 = new Toy();
	        // and set as well name to it:
	        toy2.setName("neighbor's cat");
	        // create third toy object and give it name:
	        Toy toy3 = new Toy();
	        toy3.setName("Barbie\u2122 doll head");
	        // dog can have array of toys objects, so set new Toy array:
	        dog.setToys(new Toy[]{toy, toy2, toy3});
	        // person can have a dog, so set it:
	        person.setDog(dog);
	        // set request scope attribute:
	        request.setAttribute("person", person);
	        
	        // and get from request object request dispatcher object:
	        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Test.jsp");
	        // using request dispatcher object forward these request and response object to jsp servlet:
	        requestDispatcher.forward(request, response);
	}
}
