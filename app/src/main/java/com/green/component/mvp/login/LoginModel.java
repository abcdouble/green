package com.green.component.mvp.login;

import com.green.component.bean.UserInfo;
import com.green.component.mvp.base.BaseModel;

public class LoginModel extends BaseModel<LoginPresenter,LoginConstract.Model>{


    public  LoginModel(LoginPresenter loginPresenter){
        super(loginPresenter);
    }


    @Override
    public LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    public LoginConstract.Model getContract() {
        return new LoginConstract.Model() {
            @Override
            public void doLogin(String name, String pwd) throws Exception {
                if ("123456".equalsIgnoreCase(name) && "123456".equalsIgnoreCase(pwd)){
                    p.getContract().loginResponse(new UserInfo(100,true,"login successful!","abcd","18"));
                }else{
                    p.getContract().loginResponse(new UserInfo(-1,false,"login failed!","",""));

                }
            }
        };
    }
}
