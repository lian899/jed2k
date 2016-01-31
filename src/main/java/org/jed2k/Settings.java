package org.jed2k;

import org.jed2k.protocol.Hash;

public class Settings {
    public Hash userAgent = new Hash(Hash.EMULE);
    public String modName = new String("jed2k");
    public String clientName = new String("jed2k");
    public short listenPort = 4661;
    public int version = 0x3c;
    public int modMajor = 0;
    public int modMinor = 0;
    public int modBuild = 0;
    
    /**
     * send ping message to server every serverPingTimeout 
     * milliseconds
     */
    public long serverPingTimeout = 0;
}