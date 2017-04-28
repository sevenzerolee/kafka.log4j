package org.sevenzero.kafka.log4j;

import org.apache.log4j.Logger;

/**
 * Hello world!
 * 
 */
public class App {

	private static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			
			logger.info("This is Message [" + i + "] from log4j producer .. ");
			
			try {
				Thread.sleep(3000L);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
