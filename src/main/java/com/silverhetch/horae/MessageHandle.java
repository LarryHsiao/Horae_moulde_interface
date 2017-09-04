package com.silverhetch.horae;

public interface MessageHandle {
    String deviceId();
    String messageType();
    void onReceive(String message);
}
