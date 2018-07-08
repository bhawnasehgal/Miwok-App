package com.example.android.miwok;

public class word {
    private String mDefaultTranslation;
    private String mMewokTranslation;

    public word(String defaultTranslation, String mewokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMewokTranslation = mewokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMewokTranslation() {
        return mMewokTranslation;
    }
}
