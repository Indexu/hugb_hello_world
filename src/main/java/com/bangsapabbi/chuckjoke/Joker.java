package com.bangsapabbi.chuckjoke;

import static spark.Spark.*;

public class Joker {
    public static void main(String[] args) {
        ChuckJoke chuck = new ChuckJoke();
        get("/random", (req, res) -> chuck.random());
    }
}
