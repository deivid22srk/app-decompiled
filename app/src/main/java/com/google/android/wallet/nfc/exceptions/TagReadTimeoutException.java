package com.google.android.wallet.nfc.exceptions;

/* loaded from: classes.dex */
public class TagReadTimeoutException extends Exception {
    public TagReadTimeoutException(Exception exc) {
        super("Timeout when trying to read credit card information from NFC tag.", exc);
    }
}
