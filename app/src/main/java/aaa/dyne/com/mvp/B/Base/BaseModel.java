package aaa.dyne.com.mvp.B.Base;

import java.util.Map;

/**
 * p>Describe:负责数据的请求，解析，过滤等数据操作(负责处理数据请求、业务逻辑，不涉及UI操作)
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public abstract class BaseModel<T> {
    //数据请求参数
    protected String[] mParams;

    /**
     * 设置数据请求参数
     *
     * @param args 参数数组
     */
    public BaseModel params(String... args) {
        mParams = args;
        return this;
    }

    // 添加Callback并执行数据请求
    // 具体的数据请求由子类实现
    public abstract void execute(BaseCallback<T> callback);

    // 执行Get网络请求，此类看需求由自己选择写与不写
    public void requestGetAPI(String url, BaseCallback<T> callback) {
        //这里写具体的网络请求
    }

    // 执行Post网络请求，此类看需求由自己选择写与不写
    protected void requestPostAPI(String url, Map params, BaseCallback<T> callback) {
        //这里写具体的网络请求
    }

}
