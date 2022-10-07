package com.gongsi.githubcrud.simplefactory;


/**
 * 张雷雷
 * 2022/10/7
 */
public class Factory {
    public Parent creatObject(String parent) throws Exception {
        if (parent.equalsIgnoreCase("BUS")){
            return new Bus();
        }else if (parent.equalsIgnoreCase("TRAIN")){
            return new Train();
        }
        throw new Exception("对不起，该对象暂时无法造车");
    }
}
