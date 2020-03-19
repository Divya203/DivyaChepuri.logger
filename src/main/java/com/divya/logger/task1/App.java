package com.divya.logger.task1;

import java.util.logging.Level;
import java.util.logging.Logger;
public class App 
{
    public static void main( String[] args )
    {
    	CalculateInterests simpleinterest = new SimpleInterest((double) 20000, 5, 6.8);
        CalculateInterests compoundinterest = new CompoundInterest((double) 20000, 5, 6.8);
    	Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    	logger.log(Level.INFO,"simple interest:"+simpleinterest.calculateInterest());
    	logger.log(Level.INFO,"compound interest:"+compoundinterest.calculateInterest());
    
    }
}
