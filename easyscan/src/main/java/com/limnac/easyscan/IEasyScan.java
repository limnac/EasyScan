package com.limnac.easyscan;

public interface IEasyScan {
    void onSuccess(String msg);

    void onFailed(int code, String msg);
}
