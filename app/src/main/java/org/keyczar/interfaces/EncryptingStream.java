package org.keyczar.interfaces;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface EncryptingStream extends Stream {
    int doFinalEncrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    SigningStream getSigningStream();

    int initEncrypt(ByteBuffer byteBuffer);

    int maxOutputSize(int i);

    int updateEncrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
