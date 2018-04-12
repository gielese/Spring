package com.sgs.transaction.api.logging;

public class LoggingDTO {

    private String username;
    private String uuidRemote;
    private String stringToLog;

    public LoggingDTO(){}

    public LoggingDTO(String username, String uuidRemote, String stringToLog) {
        this.username = username;
        this.uuidRemote = uuidRemote;
        this.stringToLog = stringToLog;
    }

    public String getUsername() {
        return username;
    }

    public String getUuidRemote() {
        return uuidRemote;
    }

    public String getStringToLog() {
        return stringToLog;
    }
}
