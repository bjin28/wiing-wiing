package com.jyami.wiingwiing_black.ui.about_us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QnAViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QnAViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}