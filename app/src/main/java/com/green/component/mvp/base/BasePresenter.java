package com.green.component.mvp.base;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<M extends  BaseModel,V extends  BaseView, C> {

    public M m;
    public WeakReference<V> mWeakRef;


    public BasePresenter(){

        this.m=getModel();
    }

    public V getView(){
        if(mWeakRef!=null){
            return mWeakRef.get();
        }
        return null;
    }

    public void binder(V v){
        this.mWeakRef =new WeakReference<>(v);
    }

    public void unBinder(){
        if (mWeakRef!=null){
            mWeakRef.clear();
            mWeakRef=null;


        }
    }

    protected abstract  M getModel();
    public abstract  C getContract();
}
