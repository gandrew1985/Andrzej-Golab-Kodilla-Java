package com.kodilla.kodillapatterns2.facade.api;

import com.kodilla.kodillapatterns2.facade.Order;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class WatcherFacade {

    private final static Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Logging event" );
    }

    @Around("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))")
    public Object countTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long start = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long finish = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (finish - start) + " [ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
