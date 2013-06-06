package com.loopj.android.http;

public class AsyncHttpClientException extends Exception {
	
	public AsyncHttpClientException(String message) {
		super(message);
	}
	
	public AsyncHttpClientException(String message, Exception ex) {
		super(message, ex);
	}
}
