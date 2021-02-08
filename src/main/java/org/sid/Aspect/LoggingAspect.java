package org.sid.Aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {

	Logger logger= Logger.getLogger(LoggingAspect.class.getName());
	long t1,t2;
	@Pointcut("execution(* metier.*.*(..))")
	public void pc1() {	}
	
	@Before("pc1()")
	public void avant(JoinPoint joinPoint) {
	t1=System.currentTimeMillis();
	logger.info("----------------------------------");
	logger.info("Avant l'exécution de la méthode"+joinPoint.getSignature());	
	}
	
	@After("pc1()")
	public void apres(JoinPoint joinPoint) {
	logger.info("Après l'exécution de la méthode"+joinPoint.getSignature());	
	t2=System.currentTimeMillis();
	logger.info("Durée d'exécution de la  méthode"+(t2-t1));
	logger.info("------------------------------");
	}
}
