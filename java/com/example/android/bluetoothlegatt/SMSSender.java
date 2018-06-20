package com.example.android.bluetoothlegatt;


import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.telephony.SmsManager;

public class SMSSender {

    private String phone = "504665517";
    private String message = "Upadlem";
    private static final int REQUEST_SMS = 0;
    private static final int REQUEST_LOCATION = 1;

    public SMSSender(String phone) {
        this.phone = phone;
    }

    public SMSSender() {
    }

    public void sendSMS(String massageLocation) {

            message = message + " " + massageLocation;
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phone, null, message, null, null);


    }




}