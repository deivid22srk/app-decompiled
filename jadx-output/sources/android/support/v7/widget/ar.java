package android.support.v7.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
final class ar implements aq {
    private ar() {
    }

    /* synthetic */ ar(byte b2) {
        this();
    }

    @Override // android.support.v7.widget.aq
    public final Drawable a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return android.support.a.a.g.a(resources, xmlPullParser, attributeSet, theme);
        } catch (Exception e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
