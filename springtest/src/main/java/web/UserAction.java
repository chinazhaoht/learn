package web;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2015-8-24.
 */
@Controller
public class UserAction {
    public void queryUsers(){
        System.out.println("��ѯ�����û���all users list]");
    }

    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-aop.xml");
        UserAction userAction  = (UserAction) ctx.getBean("userAction");
        userAction.queryUsers();
        ctx.destroy();
    }


}
