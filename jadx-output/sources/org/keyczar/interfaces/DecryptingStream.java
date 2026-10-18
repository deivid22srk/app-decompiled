package org.keyczar.interfaces;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface DecryptingStream extends Stream {
    int doFinalDecrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    VerifyingStream getVerifyingStream();

    void initDecrypt(ByteBuffer byteBuffer);

    int maxOutputSize(int i);

    int updateDecrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
