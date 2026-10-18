package com.google.android.wallet.common.util;

import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

/* loaded from: classes.dex */
public final class f {
    public static ArrayList<InetAddress> a() {
        ArrayList<InetAddress> arrayList = new ArrayList<>();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        arrayList.add(nextElement);
                    }
                }
            }
        } catch (SocketException e) {
            Log.e("NetUtils", "Unable to retrieve network interfaces", e);
        }
        return arrayList;
    }
}
