package com.function.models;

public class Log {

    private String id;
    private Event type;
    private String trace;
    private String action;

    public Log(String id, String trace, String action) {
        this.id = id;
        this.type = Event.INFO;
        this.trace = trace;
        this.action = action;
    }

    public Log(String trace, String action) {
        this.id = "1";
        this.type = Event.INFO;
        this.trace = trace;
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public Event getType() {
        return type;
    }

    public void setType(Event type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

}
