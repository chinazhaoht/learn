package web;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015-8-24.
 */
@Aspect
@Component
public class LogIntercept {

    @Pointcut("execution(public *action..*.*(..))")
    public void recordLog(){}

    @Before("recordLog()")
    public void before(){
        this.printLog("已经记录下操作日志@Before方法执行前");
    }

    @Around("recordLog()")
    public void around(ProceedingJoinPoint pjp)throws Throwable{
        this.printLog("已经记录下操作日志@Around方法执行前");
        pjp.proceed();
        this.printLog("@Around方法执行之后");
    }

    @After(("recordLog()"))
    public void after(){
        this.printLog("@After方法执行之后");
    }

    private void printLog(String str){
        System.out.println(str);
    }
}
