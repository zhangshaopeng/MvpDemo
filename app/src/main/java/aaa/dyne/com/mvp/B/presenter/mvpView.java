package aaa.dyne.com.mvp.B.presenter;

import aaa.dyne.com.mvp.B.Base.BaseView;

/**
 * p>Describe:Activity与Presenter层的中间层，它的作用是根据具体业务的需要，为Presenter提供调用Activity中具体UI逻辑操作的方法。
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public interface mvpView extends BaseView {
    /**
     * 当数据请求成功后，调用此接口显示数据
     * @param data 数据源
     */
    void showData(String data);

}
