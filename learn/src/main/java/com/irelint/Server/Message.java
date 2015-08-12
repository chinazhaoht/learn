package com.irelint.Server;

/**
 * Created by Administrator on 2015-8-12.
 */
public abstract class Message {
    private User sender;
    private User receiver;

    public void process(String message){

    }
    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getSender() {

        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}
