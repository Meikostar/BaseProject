package com.canplay.base.base;

import android.support.annotation.NonNull;

public interface BasePresenter<View extends BaseView> {

    void attachView(@NonNull View view);

    void detachView();
}
