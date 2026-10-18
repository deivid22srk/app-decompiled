package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
abstract class p extends Activity {
    abstract View a(View view, String str, Context context, AttributeSet attributeSet);

    p() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 11 && getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a(null, str, context, attributeSet);
        if (a2 == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return a2;
    }
}
