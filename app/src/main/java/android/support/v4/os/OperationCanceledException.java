package android.support.v4.os;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((byte) 0);
    }

    private OperationCanceledException(byte b2) {
        super("The operation has been canceled.");
    }
}
