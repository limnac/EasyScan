package com.limnac.easyscan.Activity;

import android.app.Activity;
import android.content.Intent;

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

    protected void setIEasyScanOnSuccess(String msg) {
        if (mIEasyScan != null) {
            mIEasyScan.getScanInfo(msg);
        }
    }

    public void startEasyScan(Activity activity, @NotNull IEasyScan mIEasyScan) {
        this.mIEasyScan = mIEasyScan;
        Intent intent = new Intent(activity, ScanActivity.class);
        activity.startActivity(intent);
    }
}
