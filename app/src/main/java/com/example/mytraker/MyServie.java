package com.example.mytraker;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.example.mytraker.Tracklocation.location;

public class MyServie extends IntentService {
    public static boolean IsRunning=false;
    DatabaseReference databaseReference;

    public MyServie(){
        super("MyServie");
        IsRunning=true;
        databaseReference= FirebaseDatabase.getInstance().getReference();


    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        databaseReference.child("Users").child(GlobalInfo.PhoneNumber).
                child("Updates").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (location==null)return;
                databaseReference.child("Users").
                        child(GlobalInfo.PhoneNumber).child("Location").child("lat")
                        .setValue( location.getLatitude());

                databaseReference.child("Users").
                        child(GlobalInfo.PhoneNumber).child("Location").child("lag")
                        .setValue( location.getLongitude());

                DateFormat df= new SimpleDateFormat("yyyy/MM/dd HH:MM:ss");
                Date date= new Date();
                databaseReference.child("Users").
                        child(GlobalInfo.PhoneNumber).child("Location").
                        child("LastOnlineDate")
                        .setValue(df.format(date).toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
