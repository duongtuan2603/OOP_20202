package com.example.oop_20202.ui.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oop_20202.R;
import com.example.oop_20202.databinding.FragmentAccountBinding;


public class AccountFragment extends Fragment {
    FragmentAccountBinding mBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_account,container,false);
        mBinding.cardviewEditProfile.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setView(R.layout.layout_edit_profile).setTitle("Edit Profile").create();
            }
        });
        // Inflate the layout for this fragment
        return mBinding.getRoot();


    }
}