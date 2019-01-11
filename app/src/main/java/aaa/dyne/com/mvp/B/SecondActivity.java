package aaa.dyne.com.mvp.B;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;

import aaa.dyne.com.mvp.B.Base.BaseActivity;
import aaa.dyne.com.mvp.B.presenter.PresenterImpl;
import aaa.dyne.com.mvp.B.presenter.mvpView;

/**
 * p>Describe:
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public class SecondActivity extends BaseActivity<PresenterImpl> implements mvpView {
    //进度条
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 初始化进度条
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("正在加载数据");


    }

    @Override
    public PresenterImpl onBindPresenter() {
        return new PresenterImpl(this);
    }

    @Override
    public void showData(String data) {

    }

    @Override
    public void showErr() {
        super.showErr();
    }

    @Override
    public void hideLoading() {
        super.hideLoading();
    }


    @Override
    public Activity getSelfActivity() {
        return this;
    }
}
