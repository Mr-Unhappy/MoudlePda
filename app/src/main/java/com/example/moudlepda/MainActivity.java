package com.example.moudlepda;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWindow();
            }
        });

    }

    private void showWindow() {
        View popupView = View.inflate(this, R.layout.view_pop, null);
        PopupWindow window = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setAnimationStyle(R.style.popup_window_anim);
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F8F8F8")));
        window.setFocusable(true);
        window.setOutsideTouchable(true);
        window.update();
        window.setClippingEnabled(false);
        window.showAsDropDown(getWindow().getDecorView().getRootView(), Gravity.CENTER,
                180,
                180);

//        PopupWindow window = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        window.setAnimationStyle(R.style.popup_window_anim);
//        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F8F8F8")));
//        window.setFocusable(true);
//        window.setOutsideTouchable(true);
//        window.update();
//        window.setClippingEnabled(false);
//        window.showAsDropDown(rl_qualtiyexamine, Gravity.CENTER,
//                180,
//                180);
    }

}
