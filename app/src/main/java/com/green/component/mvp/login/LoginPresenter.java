package com.green.component.mvp.login;

import com.green.component.LoginActivity;
import com.green.component.bean.UserInfo;

import com.green.component.mvp.base.BasePresenter;


public class LoginPresenter extends BasePresenter<LoginModel,LoginActivity,LoginConstract.Presenter>{

    public LoginPresenter() {
           super();
    }

    @Override
    protected LoginModel getModel() {
        return new LoginModel(this);
    }

    @Override
    public LoginConstract.Presenter getContract() {
        return new LoginConstract.Presenter<UserInfo>(){

            @Override
            public void doLogin(String name, String pwd) throws Exception {
                m.getContract().doLogin(name, pwd);
            }

            @Override
            public void loginResponse(UserInfo userInfo) {

                getView().getContract().loginResponse(userInfo);
            }
        };
    }
}
