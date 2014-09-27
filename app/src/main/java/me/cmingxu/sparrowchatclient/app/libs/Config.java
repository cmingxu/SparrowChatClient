package me.cmingxu.sparrowchatclient.app.libs;

/**
 * Created by xcm on 9/27/14.
 */
public class Config {
    public static final Config instance = new Config();
    public String ip = "127.0.0.1";
    public int port = 8000;
    private Config(){};

}
