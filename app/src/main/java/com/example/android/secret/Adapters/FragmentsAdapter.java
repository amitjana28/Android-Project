package com.example.android.secret.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.secret.Fragments.CallsFragment;
import com.example.android.secret.Fragments.ChatsFragment;
import com.example.android.secret.Fragments.PostsFragment;
import com.example.android.secret.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new PostsFragment();
            case 1:
                return new ChatsFragment();
            case 2:
                return new StatusFragment();
            case 3:
                return new CallsFragment();
            default:
                return new ChatsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position==0){
            title = "POSTS";
        }
        if(position==1){
            title = "CHATS";
        }
        if(position==2){
            title = "STATUS";
        }
        if(position==3){
            title = "CALLS";
        }
        return title;

    }
}
