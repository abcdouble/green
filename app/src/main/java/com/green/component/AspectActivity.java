package com.green.component;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.green.component.aop.annotation.CheckLogin;
import com.green.component.aop.annotation.ClickBehavior;

public class AspectActivity extends AppCompatActivity {

    private static final String TAG = "AspectActivity";

    Button btFavorite;
    Button btShoppingCart;
    Button btPersonal;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspect);
        btFavorite = findViewById(R.id.bt_favorite);
        btShoppingCart = findViewById(R.id.bt_shopping_cart);
        btPersonal = findViewById(R.id.bt_personal);
    }


    @CheckLogin
    @ClickBehavior("click")
    public void click(View view) {
        switch (view.getId()) {
            case R.id.bt_favorite:
                startActivity(new Intent(this, MainActivity.class));
                Log.d(TAG, "go to mainActivity end");
                break;
            case R.id.bt_shopping_cart:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.bt_personal:
                startActivity(new Intent(this, MainActivity.class));
                break;
            default:
                break;
        }
    }

}
