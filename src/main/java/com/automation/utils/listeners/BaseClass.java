package com.automation.utils.listeners;


import com.automation.utils.logger.ILogger;
import com.automation.utils.logger.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * @author Maheswara
 * @created on 28/06/21
 */
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class BaseClass extends AbstractTestNGSpringContextTests implements ILogger {

    static {
        Logger.logger();
    }

}
