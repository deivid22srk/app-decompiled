package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cz implements Iterable<Intent> {

    /* renamed from: b, reason: collision with root package name */
    private static final db f216b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f217a;
    private final ArrayList<Intent> c = new ArrayList<>();

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f216b = new dd();
        } else {
            f216b = new dc();
        }
    }

    private cz(Context context) {
        this.f217a = context;
    }

    public static cz a(Context context) {
        return new cz(context);
    }

    public final cz a(Intent intent) {
        this.c.add(intent);
        return this;
    }

    public final cz a(ComponentName componentName) {
        int size = this.c.size();
        try {
            Intent a2 = bb.a(this.f217a, componentName);
            while (a2 != null) {
                this.c.add(size, a2);
                a2 = bb.a(this.f217a, a2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.c.iterator();
    }

    public final void a() {
        boolean z = true;
        if (this.c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.c.toArray(new Intent[this.c.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f217a;
        int i = Build.VERSION.SDK_INT;
        if (i < 16) {
            if (i >= 11) {
                context.startActivities(intentArr);
            } else {
                z = false;
            }
        } else {
            context.startActivities(intentArr, null);
        }
        if (z) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f217a.startActivity(intent);
    }
}
