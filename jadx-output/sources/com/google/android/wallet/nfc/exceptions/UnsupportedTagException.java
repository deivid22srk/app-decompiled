package com.google.android.wallet.nfc.exceptions;

/* loaded from: classes.dex */
public class UnsupportedTagException extends Exception {
    public UnsupportedTagException() {
        super("Tag technology is not supported.");
    }
}
