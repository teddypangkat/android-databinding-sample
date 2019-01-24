package com.educa62.databindingexample;

import android.databinding.ObservableField;

public class User {

    public static ObservableField<String> name = new ObservableField<>();
    public static ObservableField<String> email= new ObservableField<>();


    public ObservableField<String> getName() {
        return name;
    }

    public ObservableField<String> getEmail() {
        return email;
    }

}
