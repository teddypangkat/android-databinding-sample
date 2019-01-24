package com.educa62.databindingexample;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickListeners {

    private Context context;
    private User user;

    public MyClickListeners(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    public void onShowToast(View view) {
        user.name.set("Jhony English");
        user.email.set("Jhony.English@gmail.com");
    }

}
