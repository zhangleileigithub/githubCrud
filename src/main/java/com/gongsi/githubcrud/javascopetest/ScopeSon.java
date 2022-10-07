package com.gongsi.githubcrud.javascopetest;

import com.gongsi.githubcrud.javascope.Scope;

/**
 * 张雷雷
 * 2022/10/7
 */
/*
* 不同包中，当前类的子类
* */
public class ScopeSon extends Scope {
    @Override
    public void publicMethod() {
        super.publicMethod();
    }
    /*
    * 子类可以重写protected修饰的方法
    * */
    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}
