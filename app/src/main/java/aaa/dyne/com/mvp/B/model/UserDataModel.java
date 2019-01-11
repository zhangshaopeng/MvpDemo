package aaa.dyne.com.mvp.B.model;

import android.os.Handler;

import aaa.dyne.com.mvp.A.Base.BaseCallback;
import aaa.dyne.com.mvp.B.Base.BaseModel;

/**
 * p>Describe:
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public class UserDataModel extends BaseModel<String> {
    @Override
    public void execute(final BaseCallback<String> callback) {
        // 模拟网络请求耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // mParams 是从父类得到的请求参数
                switch (mParams[0]) {
                    case "normal":
                        callback.onSuccess("根据参数" + mParams[0] + "的请求网络数据成功");
                        break;
                    case "failure":
                        callback.onFailure("请求失败：参数有误");
                        break;
                    case "error":
                        callback.onError();
                        break;
                    default:
                        break;
                }
                callback.onComplete();
            }
        }, 2000);
    }
}