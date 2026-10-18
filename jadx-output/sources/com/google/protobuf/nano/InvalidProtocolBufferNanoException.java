package com.google.protobuf.nano;

import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferNanoException extends IOException {
    private InvalidProtocolBufferNanoException(String str) {
        super(str);
    }

    static InvalidProtocolBufferNanoException a() {
        return new InvalidProtocolBufferNanoException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static InvalidProtocolBufferNanoException b() {
        return new InvalidProtocolBufferNanoException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferNanoException c() {
        return new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferNanoException d() {
        return new InvalidProtocolBufferNanoException("Protocol message contained an invalid tag (zero).");
    }

    static InvalidProtocolBufferNanoException e() {
        return new InvalidProtocolBufferNanoException("Protocol message end-group tag did not match expected tag.");
    }

    static InvalidProtocolBufferNanoException f() {
        return new InvalidProtocolBufferNanoException("Protocol message tag had invalid wire type.");
    }

    static InvalidProtocolBufferNanoException g() {
        return new InvalidProtocolBufferNanoException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
