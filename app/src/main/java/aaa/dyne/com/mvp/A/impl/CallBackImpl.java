package aaa.dyne.com.mvp.A.impl;

/**
 * p>Describe:
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public interface CallBackImpl<T> {
    void onSuccess(T data);

    void onFailure(String msg);

    void onError();

    void onComplete();

}
