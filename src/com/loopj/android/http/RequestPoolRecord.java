package com.loopj.android.http;

import java.lang.ref.WeakReference;
import java.util.concurrent.Future;

public class RequestPoolRecord {
    private WeakReference<Future<?>> mRequestFuture;
    private AsyncHttpRequest mHttpRequest;
    private Object mTag;

    public RequestPoolRecord(WeakReference<Future<?>> requestFuture, AsyncHttpRequest httpRequest,
                             Object tag) {
        mRequestFuture = requestFuture;
        mHttpRequest = httpRequest;
        mTag = tag;
    }

    public WeakReference<Future<?>> getRequestFuture() {
        return mRequestFuture;
    }

    public void setRequestFuture(WeakReference<Future<?>> requestFuture) {
        mRequestFuture = requestFuture;
    }

    public AsyncHttpRequest getHttpRequest() {
        return mHttpRequest;
    }

    public void setHttpRequest(AsyncHttpRequest httpRequest) {
        mHttpRequest = httpRequest;
    }

    public Object getTag() {
        return mTag;
    }

    public void setTag(Object tag) {
        mTag = tag;
    }
}
