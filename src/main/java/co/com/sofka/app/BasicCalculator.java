package co.com.sofka.app;


import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class BasicCalculator {
    //private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    private static final Logger logger = (Logger) LoggerFactory.getLogger(BasicCalculator.class);
    public Long sum(Long number1, Long number2) {
        //logger.info( "Summing {} + {}", number1, number2 );
        logger.info( "Summing {"+ number1 +"} + {"+ number2+"}" );
        return number1 + number2;
    }
}
