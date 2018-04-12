package com.sgs.transaction.api.logging;

public class LoggingDTO {

    private String username;
    private String uuidRemote;
    private String uuidUser;
    private String uuidOrder;

    public LoggingDTO(){}

    public LoggingDTO(String username, String uuidRemote, String uuidUser, String uuidOrder) {
        this.username = username;
        this.uuidRemote = uuidRemote;
        this.uuidUser = uuidUser;
        this.uuidOrder = uuidOrder;
    }

    public String getUsername() {
        return username;
    }

    public String getUuidRemote() {
        return uuidRemote;
    }

    public String getUuidUser() {
        return uuidUser;
    }

    public String getUuidOrder() {
        return uuidOrder;
    }
}
