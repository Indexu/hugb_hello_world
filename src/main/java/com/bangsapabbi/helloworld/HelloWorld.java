package com.bangsapabbi.helloworld;

import net.joningi.icndb.ICNDBClient;
import net.joningi.icndb.Joke;

public class HelloWorld {

    private static final ICNDBClient client = new ICNDBClient();    

    public static void main(String[] args) {
        Joke randomJoke = client.getRandom();
        System.out.println(randomJoke.getJoke());
    }
}
