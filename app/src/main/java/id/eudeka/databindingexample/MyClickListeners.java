package id.eudeka.databindingexample;

import android.content.Context;
import android.view.View;

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
