import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class lab1 {

	//public lab1() {

		public static void main(String args[]) {
			Logger myLogger =  Logger.getLogger(lab1.class.getName());
		    PropertyConfigurator.configure("resource/lab1.properties");
		    boolean flag = false;
		    myLogger.info("Logging information for Lab1");
			myLogger.debug("Code debugging started");
		    if(flag == false) {
			myLogger.warn("This is my error message");		
		      }
		}
	}


