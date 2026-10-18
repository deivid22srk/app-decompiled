package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.keyczar.Keyczar;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class x extends DataSetObservable {
    private static final String c = x.class.getSimpleName();
    private static final Object d = new Object();
    private static final Map<String, x> e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    final Object f869a;

    /* renamed from: b, reason: collision with root package name */
    final List<y> f870b;
    private final List<aa> f;
    private final Context g;
    private final String h;
    private Intent i;
    private z j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ab p;

    static /* synthetic */ boolean c(x xVar) {
        xVar.l = true;
        return true;
    }

    public final int a() {
        int size;
        synchronized (this.f869a) {
            c();
            size = this.f870b.size();
        }
        return size;
    }

    public final ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f869a) {
            c();
            resolveInfo = this.f870b.get(i).f871a;
        }
        return resolveInfo;
    }

    public final int a(ResolveInfo resolveInfo) {
        synchronized (this.f869a) {
            c();
            List<y> list = this.f870b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f871a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final Intent b(int i) {
        synchronized (this.f869a) {
            if (this.i == null) {
                return null;
            }
            c();
            y yVar = this.f870b.get(i);
            ComponentName componentName = new ComponentName(yVar.f871a.activityInfo.packageName, yVar.f871a.activityInfo.name);
            Intent intent = new Intent(this.i);
            intent.setComponent(componentName);
            if (this.p != null) {
                new Intent(intent);
                if (this.p.a()) {
                    return null;
                }
            }
            a(new aa(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final ResolveInfo b() {
        synchronized (this.f869a) {
            c();
            if (!this.f870b.isEmpty()) {
                return this.f870b.get(0).f871a;
            }
            return null;
        }
    }

    private boolean e() {
        if (this.j == null || this.i == null || this.f870b.isEmpty() || this.f.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f);
        return true;
    }

    final boolean a(aa aaVar) {
        byte b2 = 0;
        boolean add = this.f.add(aaVar);
        if (add) {
            this.n = true;
            f();
            if (!this.m) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (this.n) {
                this.n = false;
                if (!TextUtils.isEmpty(this.h)) {
                    ac acVar = new ac(this, b2);
                    Object[] objArr = {new ArrayList(this.f), this.h};
                    if (Build.VERSION.SDK_INT < 11) {
                        acVar.execute(objArr);
                    } else {
                        acVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
                    }
                }
            }
            e();
            notifyChanged();
        }
        return add;
    }

    private void f() {
        int size = this.f.size() - this.k;
        if (size > 0) {
            this.n = true;
            for (int i = 0; i < size; i++) {
                this.f.remove(0);
            }
        }
    }

    private void g() {
        try {
            FileInputStream openFileInput = this.g.openFileInput(this.h);
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, Keyczar.DEFAULT_ENCODING);
                    for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                    }
                    if (!"historical-records".equals(newPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<aa> list = this.f;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput != null) {
                                try {
                                    openFileInput.close();
                                    return;
                                } catch (IOException e2) {
                                    return;
                                }
                            }
                            return;
                        }
                        if (next != 3 && next != 4) {
                            if (!"historical-record".equals(newPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new aa(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                Log.e(c, "Error reading historical recrod file: " + this.h, e4);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (XmlPullParserException e6) {
                Log.e(c, "Error reading historical recrod file: " + this.h, e6);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e7) {
                    }
                }
            }
        } catch (FileNotFoundException e8) {
        }
    }

    final void c() {
        boolean z;
        boolean z2 = true;
        if (!this.o || this.i == null) {
            z = false;
        } else {
            this.o = false;
            this.f870b.clear();
            List<ResolveInfo> queryIntentActivities = this.g.getPackageManager().queryIntentActivities(this.i, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                this.f870b.add(new y(this, queryIntentActivities.get(i)));
            }
            z = true;
        }
        if (this.l && this.n && !TextUtils.isEmpty(this.h)) {
            this.l = false;
            this.m = true;
            g();
        } else {
            z2 = false;
        }
        boolean z3 = z | z2;
        f();
        if (z3) {
            e();
            notifyChanged();
        }
    }
}
