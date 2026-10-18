package android.support.v4.g;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
final class j extends i {
    private j() {
        super((byte) 0);
    }

    /* synthetic */ j(byte b2) {
        this();
    }

    @Override // android.support.v4.g.i
    public final int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
