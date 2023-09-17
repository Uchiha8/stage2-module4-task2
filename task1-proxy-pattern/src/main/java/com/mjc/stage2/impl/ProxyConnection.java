package com.mjc.stage2.impl;


import com.mjc.stage2.Connection;

public class ProxyConnection implements Connection {
    private RealConnection realConnection;

    public ProxyConnection(RealConnection realConnection) {
        this.realConnection = realConnection;
    }

    public void reallyClose() {
        // Write your code here!
        isClosed();
    }

    @Override
    public void close() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        connectionPool.getConnection();
    }

    @Override
    public boolean isClosed() {
        return true;
    }
    // Implement methods here!
}
