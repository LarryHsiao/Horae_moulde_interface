package com.silverhetch.horae;

public interface Message {
    String deviceId();
    String messageType();
    String content();
}
