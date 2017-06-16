package com.alibaba.idst.nls.event;

public abstract interface NlsListener {

	public abstract void onMessageReceived(NlsEvent paramNlsEvent);

	public abstract void onOperationFailed(NlsEvent paramNlsEvent);

	public abstract void onChannelClosed(NlsEvent paramNlsEvent);
}