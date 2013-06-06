package com.loopj.android.http;

public class AsyncHttpAbortException extends AsyncHttpClientException {
	
	public AsyncHttpAbortException(String message) {
		super(message);
	}
	
	public AsyncHttpAbortException(String message, Exception ex) {
		super(message, ex);
	}
}
