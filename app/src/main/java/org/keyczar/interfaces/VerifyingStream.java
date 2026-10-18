package org.keyczar.interfaces;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface VerifyingStream extends Stream {
    int digestSize();

    void initVerify();

    void updateVerify(ByteBuffer byteBuffer);

    boolean verify(ByteBuffer byteBuffer);
}
