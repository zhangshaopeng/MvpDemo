package aaa.dyne.com.mvp.A.Base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import aaa.dyne.com.mvp.R;

/**
 * p>Describe:
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public abstract class BaseActivity extends Activity implements BaseView {
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
    }

    @Override
    public void showLoading() {
        if (!mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
    }
    @Override
    public void hideLoading() {
        if (mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }
    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void showErr() {
        showToast(getResources().getString(R.string.api_error_msg));
    }
    @Override
    public Context getContext() {
        return BaseActivity.this;
    }

}
