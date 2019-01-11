package aaa.dyne.com.mvp.B.Base;

/**
 * p>Describe:请求数据时以具体Model的包名+类型作为Token，利用反射机制直接找到对应的Model。
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public class DataModel {
    public static BaseModel request(String token){
        // 声明一个空的BaseModel
        BaseModel model = null;
        try {
            //利用反射机制获得对应Model对象的引用
            model = (BaseModel)Class.forName(token).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return model;
    }
}
