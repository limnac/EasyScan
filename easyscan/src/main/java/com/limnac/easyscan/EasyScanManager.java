package com.limnac.easyscan;

import android.app.Activity;
import android.content.Intent;

import com.limnac.easyscan.Activity.ScanActivity;

import org.jetbrains.annotations.NotNull;

public class EasyScanManager {

    private static EasyScanManager instance;

    public static EasyScanManager getInstance() {
        if (instance == null) {
            instance = new EasyScanManager();
        }
        return instance;
    }

    private EasyScanManager() {

    }

    private IEasyScan mIEasyScan;

    public void setIEasyScanOnSuccess(String msg) {
        if (mIEasyScan != null) {
            mIEasyScan.onSuccess(msg);
        }
    }

    public void setIEasyScanOnFailed(int code, String msg) {
        if (mIEasyScan != null) {
            mIEasyScan.onFailed(code, msg);
        }
    }


    public void getScanInfo(Activity activity, @NotNull IEasyScan mIEasyScan) {
        this.mIEasyScan = mIEasyScan;
        Intent intent = new Intent(activity, ScanActivity.class);
        activity.startActivity(intent);
    }
}
