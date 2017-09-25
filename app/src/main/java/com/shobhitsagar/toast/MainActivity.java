package com.shobhitsagar.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastBtn(View view) {
        Context context = getApplicationContext();
        LayoutInflater inflater = getLayoutInflater();

        View CustomToastView = inflater.inflate(R.layout.toast_layout, null);
        Toast customToast = new Toast(context);

        customToast.setView(CustomToastView);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();
    }
}
