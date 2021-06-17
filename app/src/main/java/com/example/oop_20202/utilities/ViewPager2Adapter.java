package com.example.oop_20202.utilities;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.oop_20202.ui.fragments.AccountFragment;
import com.example.oop_20202.ui.fragments.InfoFragment;
import com.example.oop_20202.ui.fragments.MarksFragment;
import com.example.oop_20202.ui.fragments.NotificationsFragment;

public class ViewPager2Adapter extends FragmentStateAdapter {
    public ViewPager2Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new InfoFragment();
            case 1:
                return new MarksFragment();
            case 2:
                return new NotificationsFragment();
            case 3:
                return new AccountFragment();
            default:
                return new InfoFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
