package com.example.oop_20202;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ForegroundService extends Service {
    PendingIntent pendingIntent;

    private static final String CHANNEL_ID = "CHANNEL_ID";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Service", "Successfully created");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        createchannelID();
        sendnotification();
        return START_NOT_STICKY;
    }

    private void createchannelID() {
        //Create channel ID
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void sendnotification() {
        //Create Notification
        Notification notification = new Notification.Builder(getApplicationContext(), CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_baseline_school_24)
                .setContentTitle("Cập nhật điểm: Dương Mạnh Tuấn")
                .setContentText("Toán: Điểm giữa kỳ: 9.5")
                .setPriority(Notification.PRIORITY_DEFAULT)
                .build();
        startForeground(1, notification);
    }
}
