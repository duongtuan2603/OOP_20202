package com.example.oop_20202.utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.oop_20202.R;
import com.example.oop_20202.data.Notification;
import com.example.oop_20202.databinding.EachNotificationBinding;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder> {
    List<Notification> mNotification;

    public NotificationAdapter(List<Notification> mNotification) {
        this.mNotification = mNotification;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        EachNotificationBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.each_notification,parent,false);
        return new NotificationViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.NotificationViewHolder holder, int position) {
        Notification notification = mNotification.get(position);
        holder.binding.setNotification(notification);
    }

    @Override
    public int getItemCount() {
        return mNotification.size();
    }

    public class NotificationViewHolder extends RecyclerView.ViewHolder{
        EachNotificationBinding binding;
        public NotificationViewHolder(@NonNull EachNotificationBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
