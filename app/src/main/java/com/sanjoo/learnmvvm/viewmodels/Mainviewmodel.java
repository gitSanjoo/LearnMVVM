package com.sanjoo.learnmvvm.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.sanjoo.learnmvvm.models.Customer;

public class Mainviewmodel extends AndroidViewModel {

    Customer customer;
    public Mainviewmodel(@NonNull Application application) {
        super(application);
        customer=new Customer("helloooo");
    }
    public  Customer getCustomer(){
        return this.customer;
    }
}
