package com.gongsi.githubcrud.javascope;

/**
 * 张雷雷
 * 2022/10/7
 */
public class Scope {
//    全局
    public void publicMethod(){
        System.out.println("public修饰的方法");
    }
//    受保护的
    protected void protectedMethod(){System.out.println("protected修饰的方法");}
//    默认的
    void Method(){System.out.println("默认default修饰的方法");}
//    私有的
    private void privateMethod(){System.out.println("private修饰的方法");}
//    当前类中 上述作用域都可使用
    public void test(){
        Scope scope = new Scope();
        scope.publicMethod();
        scope.protectedMethod();
        scope.Method();
        scope.privateMethod();
    }
}
