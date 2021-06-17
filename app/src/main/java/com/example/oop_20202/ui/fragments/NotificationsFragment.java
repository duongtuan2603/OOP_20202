package com.example.oop_20202.ui.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oop_20202.utilities.NotificationAdapter;
import com.example.oop_20202.R;
import com.example.oop_20202.data.Notification;
import com.example.oop_20202.databinding.FragmentNotificationsBinding;

import java.util.ArrayList;
import java.util.List;


public class NotificationsFragment extends Fragment {
    List<Notification> mNotification = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentNotificationsBinding mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_notifications, container, false);
        mNotification.add(new Notification("12/6","Ngữ văn: Điểm một tiết: 7.5"));
        mNotification.add(new Notification("11/6","Toán: Điểm miệng: 9"));
        mNotification.add(new Notification("7/6","Địa lý: Điểm miệng: 7"));
        mNotification.add(new Notification("5/6","Nghỉ học có phép"));
        mNotification.add(new Notification("4/6","Ngoại ngữ: Điểm một tiết: 10"));
        mNotification.add(new Notification("4/6","Sinh học: Điểm miệng: 8"));
        mNotification.add(new Notification("3/6","GDCD: Điểm một tiết: 7"));

        mBinding.recyclerviewnotifications.setLayoutManager(new LinearLayoutManager(getContext().getApplicationContext()));
        mBinding.recyclerviewnotifications.setAdapter(new NotificationAdapter(mNotification));
        // Inflate the layout for this fragment
        return mBinding.getRoot();


    }
}