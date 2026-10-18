package org.keyczar.interfaces;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface SigningStream extends Stream {
    int digestSize();

    void initSign();

    void sign(ByteBuffer byteBuffer);

    void updateSign(ByteBuffer byteBuffer);
}
