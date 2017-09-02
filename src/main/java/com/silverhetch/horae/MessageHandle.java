package com.silverhetch.horae;

public interface MessageHandle {
    String messageType();
    void onReceive(String message);
}
