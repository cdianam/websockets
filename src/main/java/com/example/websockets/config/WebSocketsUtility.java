package com.example.websockets.config;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WebSocketsUtility {

    public static final String WS_ENDPOINT = "/ws";
    public static final String WS_APP = "/app";
    public static final String WS_TOPIC = "/topic";
    public static final String WS_QUEUE = "/queue";
    public static final String WS_USER = "/user";

    public static String[] getSimpleBrokerPrefixes() {
        return new String[] {WS_TOPIC, WS_QUEUE, WS_USER};
    }

}
