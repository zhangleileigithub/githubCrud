package com.gongsi.githubcrud.cutpage;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 张雷雷
 * 2022/10/4
 */
@Component
@Aspect
public class AopPage {
    /*
    * 使用表达式方式进行切入@Pointcut("execution(* com.cmhit.crm.controller.*.*(..))")
    * execution([修饰符] [返回值类型] [类全路径] [方法名 ( [参数] )])修饰符可以省略不写
    * @Pointcut：切入点，定义切入那些业务方法
    * */
    @Pointcut("execution(* com.gongsi.githubcrud.conroller.UserController.*(..))")
    public void pointOfPenetration(){
        System.out.println("这里不用写方法体，不会执行的");
    }
    /*
    * @Around：把切面方法切入到相应的业务方法前后
    * 使用Value的值 pointOfPenetration() 找到切入点
    * 再根据切入点方法的注解 @Pointcut 找到具体要切入的业务方法
    * */
    @Around(value = "pointOfPenetration()")
    public Object cutLogic(ProceedingJoinPoint joinPoint){
        System.out.println("执行Controller方法前进行参数校验");
        Object result = null;
        try {
            long start = System.currentTimeMillis();
            //执行完切入的方法的返回值
            result = joinPoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("controller的方法：" + joinPoint.getSignature().getName() + "执行耗时：" + (end - start));
            System.out.println("执行Controller方法后对返回值进行修改");
            System.out.println(result);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }

}
