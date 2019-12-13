import org.apache.log4j.Logger;

public class LogDemo {
	static Logger logger=Logger.getLogger(LogDemo.class);
public static void main(String[] args) {
	int a,b,c;
	
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
			logger.info("Successs Result=" +c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
		logger.info(e.getClass());
		}catch(ArrayIndexOutOfBoundsException e) {
			logger.info(e.getClass());
		}
		catch(NumberFormatException e) {
			logger.info(e.getClass());
		}
	
		// TODO Auto-generated catch block
		/*logger.error(e.getMessage());
		logger.debug(e.getMessage());
		logger.fatal(e.getMessage());
		logger.info(e.getMessage());
		logger.isInfoEnabled();
		logger.trace(e.getMessage());*/
	
	
}
}
