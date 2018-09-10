package com.canplay.base.mvp.component;


import com.canplay.base.base.AppComponent;


import com.canplay.base.mvp.ActivityScope;

import dagger.Component;

/**
 * Created by leo on 2016/9/27.
 */
@ActivityScope
@Component(dependencies = AppComponent.class)
public interface BaseComponent{



}
