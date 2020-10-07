package com.green.component.mvp.login;

import com.green.component.mvp.bean.BaseBean;

public interface LoginConstract<T extends BaseBean> {
     interface  Model{
         void doLogin(String name,String pwd) throws Exception;
     }
     interface View<T extends BaseBean>{
          void loginResponse(T t);
     }
    interface Presenter<T extends BaseBean>{
         void doLogin(String name,String pwd) throws Exception;
         void loginResponse(T t);
    }
}
