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
        this.printLog("�Ѿ���¼�²�����־@Before����ִ��ǰ");
    }

    @Around("recordLog()")
    public void around(ProceedingJoinPoint pjp)throws Throwable{
        this.printLog("�Ѿ���¼�²�����־@Around����ִ��ǰ");
        pjp.proceed();
        this.printLog("@Around����ִ��֮��");
    }

    @After(("recordLog()"))
    public void after(){
        this.printLog("@After����ִ��֮��");
    }

    private void printLog(String str){
        System.out.println(str);
    }
}
