import jakarta.servlet.*;
import java.io.*;
public class MeraServlet extends GenericServlet{
  public void service(ServletRequest rq,ServletResponse rs){
   try{ 
         PrintWriter pw=rs.getWriter();
         pw.println("MERA PEHLA OR AKHARI SERVLET");
     }catch(Exception e){
          System.out.println(e);
     }

}
}