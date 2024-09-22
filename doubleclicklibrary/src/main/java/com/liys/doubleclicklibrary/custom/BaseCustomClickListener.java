package com.liys.doubleclicklibrary.custom;

import android.view.View;

/**
 * @Description: 基类
 * @Author: liys
 * @CreateDate: 2019/8/22 15:55
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/22 15:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseCustomClickListener implements IOnClickListener {

    private View.OnClickListener onClickListener;

    @Override
    public void setOnclick(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }


    @Override
    public void onClick(View v) {
        if(onClickListener != null && isNext(v)){
            onClickListener.onClick(v);
            after(v);
        }
    }

    /**
     * 是否继续往下执行
     * @return
     */
    public abstract boolean isNext(View view);

    /**
     * 执行完click之后
     * @param view
     */
    public abstract void after(View view);
}
