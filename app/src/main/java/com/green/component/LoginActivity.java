package com.green.component;

import android.os.Bundle;
import android.support.annotation.Nullable;


import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.green.component.bean.UserInfo;
import com.green.component.mvp.base.BaseView;
import com.green.component.mvp.login.LoginConstract;
import com.green.component.mvp.login.LoginPresenter;

public class LoginActivity extends BaseView<LoginPresenter, LoginConstract.View>{
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = findViewById(R.id.bt_login);
        button = findViewById(R.id.bt_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    p.getContract().doLogin("123456","123456");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    public LoginConstract.View getContract() {
        return new LoginConstract.View<UserInfo>(){
            @Override
            public void loginResponse(UserInfo userInfo) {

               Toast.makeText(LoginActivity.this,userInfo.getMsg(),Toast.LENGTH_SHORT).show();

            }
        };
    }
}
