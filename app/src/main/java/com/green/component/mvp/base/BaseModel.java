package com.green.component.mvp.base;

public abstract class BaseModel<P extends BasePresenter,C> {

    public P p;

    public BaseModel(){}

    public BaseModel(P p){
        this.p = p;
    }

    public abstract P getPresenter();

   public  abstract C getContract();
}
