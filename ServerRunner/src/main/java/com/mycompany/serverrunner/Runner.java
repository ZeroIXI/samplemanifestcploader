package com.mycompany.serverrunner;

import com.mycompany.sampleserver.SampleServer;

/**
 *
 * @author pascal.perau
 */
public class Runner {

    public static void main(String[] args) {
        SampleServer server = new SampleServer();
        server.run();
        System.out.println(server.call());
    }

}
