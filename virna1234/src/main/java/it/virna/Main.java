package it.virna;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        Context ctx = tomcat.addContext("/virna", new File(".").getAbsolutePath());
        
        HomePage home = new HomePage();
        
        Tomcat.addServlet(ctx, "virna", home);

        ctx.addServletMapping("/*","virna");

        try {
			tomcat.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        tomcat.getServer().await();

	}

}
