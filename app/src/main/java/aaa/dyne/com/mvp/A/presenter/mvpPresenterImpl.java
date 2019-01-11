package aaa.dyne.com.mvp.A.presenter;

import aaa.dyne.com.mvp.A.Base.BaseCallback;
import aaa.dyne.com.mvp.A.Base.BasePresenter;

import aaa.dyne.com.mvp.A.model.mvpModelImpl;

/**
 * p>Describe:具体的逻辑业务处理类，该类为纯Java类，不包含任何Android API，负责请求数据，并对数据请求的反馈进行处理。
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public class mvpPresenterImpl extends BasePresenter<aaa.dyne.com.mvp.A.contract.mvpView> {


    /**
     * 获取网络数据
     *
     * @param params 参数
     */
    public void getData(String params) {
        if (!isViewAttached()) {
            return;
        }
        //显示正在加载进度条
        getView().showLoading();
        // 调用Model请求数据
        mvpModelImpl.getNetData(params, new BaseCallback<String>() {
            @Override
            public void onSuccess(String data) {
                //调用view接口显示数据
                if (isViewAttached()) {
                    getView().showData(data);
                }
            }

            @Override
            public void onFailure(String msg) {
                //调用view接口提示失败信息
                if (isViewAttached()) {
                    getView().showToast(msg);
                }
            }

            @Override
            public void onError() {
                //调用view接口提示请求异常
                if (isViewAttached()) {
                    getView().showErr();
                }
            }

            @Override
            public void onComplete() {
                // 隐藏正在加载进度条
                if (isViewAttached()) {
                    getView().hideLoading();
                }
            }
        });
    }

}
