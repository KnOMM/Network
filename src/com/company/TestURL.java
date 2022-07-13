package com.company;

import java.net.URL;
class TestURL {
    public static void main(String args[]) throws Exception {
        URL google = new URL("http://www.google.com");
        System.out.println("Protocol: " + google.getProtocol());
        System.out.println("Port: " + google.getPort());
        System.out.println("Host: " + google.getHost());
        System.out.println("Ext: " + google.toExternalForm());
    }
}
