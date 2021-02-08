package org.sid.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SecurityAspect {

	@Around(value="@annotation(securedByAspect)",argNames = "proceedingJoinPoint,secured")
    public Object security(ProceedingJoinPoint proceedingJoinPoint, Security secured) {
        String[] roles=secured.roles();
        boolean authorized=false;
        for (String r:roles){
            if(Context.hasRole(r)) authorized=true;
        }
        if(!authorized){
            throw new RuntimeException("Not Authorized");
        }
        else {
            try {
                Object o=proceedingJoinPoint.proceed();
                return o;
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        }
    }
}
