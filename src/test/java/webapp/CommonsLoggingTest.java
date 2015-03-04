package webapp;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class CommonsLoggingTest {
	
	static Log log = LogFactory.getLog(CommonsLoggingTest.class);

	@Test
	public void test() {
		log.trace("My Trace...");
		log.debug("My Debug...");
		log.info("My Info...");
		log.warn("My warn...");
		log.error("My error...");
		log.fatal("My fatal...");
		
				
	}

}
