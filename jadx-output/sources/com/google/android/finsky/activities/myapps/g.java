package com.google.android.finsky.activities.myapps;

import android.content.Context;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MultiInstallActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.jm;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1823a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f1824b;
    private static final /* synthetic */ g[] c;

    public abstract int a();

    public abstract void a(Context context, c cVar);

    public abstract boolean a(c cVar);

    public abstract boolean b(c cVar);

    private g(String str, int i) {
    }

    /* synthetic */ g(String str, int i, byte b2) {
        this(str, i);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) c.clone();
    }

    static {
        final String str = "UPDATE_ALL";
        f1823a = new g(str) { // from class: com.google.android.finsky.activities.myapps.h
            {
                byte b2 = 0;
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final void a(Context context, c cVar) {
                j jVar;
                List list;
                jVar = cVar.h;
                list = jVar.f1825a;
                context.startActivity(MultiInstallActivity.a(context, cz.a(list)));
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final int a() {
                return R.string.update_all;
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final boolean a(c cVar) {
                j jVar;
                jVar = cVar.d;
                return jVar.getCount() == 0;
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final boolean b(c cVar) {
                com.google.android.finsky.receivers.f unused;
                unused = cVar.e;
                return false;
            }
        };
        final String str2 = "STOP_ALL_DOWNLOADS";
        f1824b = new g(str2) { // from class: com.google.android.finsky.activities.myapps.i
            {
                int i = 1;
                byte b2 = 0;
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final void a(Context context, c cVar) {
                j jVar;
                j jVar2;
                com.google.android.finsky.receivers.f fVar;
                jVar = cVar.d;
                int count = jVar.getCount();
                for (int i = 1; i < count; i++) {
                    jVar2 = cVar.d;
                    Document document = (Document) jVar2.getItem(i);
                    fVar = cVar.e;
                    fVar.k(document.E().w);
                }
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final int a() {
                return R.string.stop_all_downloads;
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final boolean a(c cVar) {
                List list;
                com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
                list = cVar.f1819a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (jm.a(fVar.i(((Document) it.next()).E().w))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.android.finsky.activities.myapps.g
            public final boolean b(c cVar) {
                return false;
            }
        };
        c = new g[]{f1823a, f1824b};
    }
}
