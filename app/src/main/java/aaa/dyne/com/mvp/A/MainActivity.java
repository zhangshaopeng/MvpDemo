package aaa.dyne.com.mvp.A;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import aaa.dyne.com.mvp.A.Base.BaseActivity;
import aaa.dyne.com.mvp.A.contract.mvpView;
import aaa.dyne.com.mvp.R;
import aaa.dyne.com.mvp.A.presenter.mvpPresenterImpl;

public class MainActivity extends BaseActivity implements mvpView {
    //进度条
    ProgressDialog progressDialog;
    private EditText et;
    private TextView tv;
    mvpPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et);
        tv = findViewById(R.id.tv_a);
        // 初始化进度条
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("正在加载数据");
        presenter = new mvpPresenterImpl();
        presenter.attachView(this);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getData("normal");
            }
        });
    }

    @Override
    public void showData(String data) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
