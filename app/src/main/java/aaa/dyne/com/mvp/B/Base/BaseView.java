package aaa.dyne.com.mvp.B.Base;

import android.app.Activity;
import android.content.Context;

/**
 * p>Describe:仅仅负责实现单纯的、独立的UI操作，尽量不要去维护数据
 * p>Company:Dyne
 * p>@Author:zsp
 * p>Data:2019/1/10.
 */
public interface BaseView {
    /**
     * 显示正在加载view
     */
    void showLoading();
    /**
     * 关闭正在加载view
     */
    void hideLoading();
    /**
     * 显示提示
     * @param msg
     */
    void showToast(String msg);
    /**
     * 显示请求错误提示
     */
    void showErr();
    /**
     * 获取上下文
     * @return 上下文
     */
    Context getContext();
    /**
     * 获取 Activity 对象
     *
     * @return activity
     */
    <T extends Activity> T getSelfActivity();
}
