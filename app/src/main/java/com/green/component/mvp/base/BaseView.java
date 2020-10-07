package com.green.component.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseView<P extends  BasePresenter,C> extends AppCompatActivity {

     protected P p;

     protected abstract  P getPresenter();
     public abstract  C getContract();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        p= getPresenter();
        p.binder(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        p.unBinder();
    }
}
