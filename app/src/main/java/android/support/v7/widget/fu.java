package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class fu extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<WeakReference<fu>> f831a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private Resources f832b;
    private final Resources.Theme c;

    public static Context a(Context context) {
        if (!(context instanceof fu)) {
            int size = f831a.size();
            for (int i = 0; i < size; i++) {
                WeakReference<fu> weakReference = f831a.get(i);
                fu fuVar = weakReference != null ? weakReference.get() : null;
                if (fuVar != null && fuVar.getBaseContext() == context) {
                    return fuVar;
                }
            }
            fu fuVar2 = new fu(context);
            f831a.add(new WeakReference<>(fuVar2));
            return fuVar2;
        }
        return context;
    }

    private fu(Context context) {
        super(context);
        this.c = getResources().newTheme();
        this.c.setTo(context.getTheme());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        this.c.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f832b == null) {
            this.f832b = new fw(this, super.getResources());
        }
        return this.f832b;
    }
}
