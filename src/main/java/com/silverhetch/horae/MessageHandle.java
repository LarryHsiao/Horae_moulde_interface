package com.silverhetch.horae;

public interface MessageHandle {
    String messageType();
    void onReceive(String deviceId,String message);
}
