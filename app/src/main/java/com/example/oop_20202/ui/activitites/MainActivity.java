package com.example.oop_20202.ui.activitites;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.oop_20202.ForegroundService;
import com.example.oop_20202.R;
import com.example.oop_20202.utilities.ViewPager2Adapter;
import com.example.oop_20202.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "";
    ActivityMainBinding mBinding;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.viewpager.setAdapter(new ViewPager2Adapter(MainActivity.this));
        mBinding.viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0: {mBinding.bottomnavigation.getMenu().findItem(R.id.item_info).setChecked(true);break;}
                    case 1: {mBinding.bottomnavigation.getMenu().findItem(R.id.item_marks).setChecked(true);break;}
                    case 2: {mBinding.bottomnavigation.getMenu().findItem(R.id.item_notifications).setChecked(true);break;}
                    case 3: {mBinding.bottomnavigation.getMenu().findItem(R.id.item_account).setChecked(true);break;}
                }
            }
        });
        mBinding.bottomnavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_info:{mBinding.viewpager.setCurrentItem(0);break;}
                    case R.id.item_marks:{mBinding.viewpager.setCurrentItem(1);break;}
                    case R.id.item_notifications:{mBinding.viewpager.setCurrentItem(2);break;}
                    case R.id.item_account:{mBinding.viewpager.setCurrentItem(3);break;}
                }
                return false;
            }
        });
        //Channel ID
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "CHANNEL", importance);
            channel.setDescription("DESCRIPTION");
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        Notification notification = new Notification.Builder(getApplicationContext(), CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_baseline_school_24)
                .setContentTitle("Cập nhật điểm: Dương Mạnh Tuấn")
                .setContentText("Toán: Điểm giữa kỳ: 9.5")
                .setPriority(Notification.PRIORITY_DEFAULT)
                .build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// notificationId is a unique int for each notification that you must define
        notificationManager.notify(1010,notification);
    }
}