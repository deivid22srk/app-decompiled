package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class i extends MenuInflater {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f565a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f566b;
    private final Object[] c;
    private final Object[] d;
    private Context e;
    private Object f;

    static {
        Class<?>[] clsArr = {Context.class};
        f565a = clsArr;
        f566b = clsArr;
    }

    public i(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
        this.d = this.c;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof android.support.v4.e.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = this.e.getResources().getLayout(i);
                a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r0 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r9 = r0;
        r0 = r11.next();
        r3 = r2;
        r2 = r1;
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r3 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r0 = r11.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r0.equals("group") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r0 = r4.z.e.obtainStyledAttributes(r12, android.support.v7.b.l.MenuGroup);
        r4.f570b = r0.getResourceId(android.support.v7.b.l.MenuGroup_android_id, 0);
        r4.c = r0.getInt(android.support.v7.b.l.MenuGroup_android_menuCategory, 0);
        r4.d = r0.getInt(android.support.v7.b.l.MenuGroup_android_orderInCategory, 0);
        r4.e = r0.getInt(android.support.v7.b.l.MenuGroup_android_checkableBehavior, 0);
        r4.f = r0.getBoolean(android.support.v7.b.l.MenuGroup_android_visible, true);
        r4.g = r0.getBoolean(android.support.v7.b.l.MenuGroup_android_enabled, true);
        r0.recycle();
        r0 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r0.equals("item") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r5 = r4.z.e.obtainStyledAttributes(r12, android.support.v7.b.l.MenuItem);
        r4.i = r5.getResourceId(android.support.v7.b.l.MenuItem_android_id, 0);
        r4.j = (r5.getInt(android.support.v7.b.l.MenuItem_android_menuCategory, r4.c) & (-65536)) | (r5.getInt(android.support.v7.b.l.MenuItem_android_orderInCategory, r4.d) & 65535);
        r4.k = r5.getText(android.support.v7.b.l.MenuItem_android_title);
        r4.l = r5.getText(android.support.v7.b.l.MenuItem_android_titleCondensed);
        r4.m = r5.getResourceId(android.support.v7.b.l.MenuItem_android_icon, 0);
        r4.n = android.support.v7.view.k.a(r5.getString(android.support.v7.b.l.MenuItem_android_alphabeticShortcut));
        r4.o = android.support.v7.view.k.a(r5.getString(android.support.v7.b.l.MenuItem_android_numericShortcut));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010f, code lost:
    
        if (r5.hasValue(android.support.v7.b.l.MenuItem_android_checkable) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0118, code lost:
    
        if (r5.getBoolean(android.support.v7.b.l.MenuItem_android_checkable, false) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011a, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011b, code lost:
    
        r4.p = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011d, code lost:
    
        r4.q = r5.getBoolean(android.support.v7.b.l.MenuItem_android_checked, false);
        r4.r = r5.getBoolean(android.support.v7.b.l.MenuItem_android_visible, r4.f);
        r4.s = r5.getBoolean(android.support.v7.b.l.MenuItem_android_enabled, r4.g);
        r4.t = r5.getInt(android.support.v7.b.l.MenuItem_showAsAction, -1);
        r4.x = r5.getString(android.support.v7.b.l.MenuItem_android_onClick);
        r4.u = r5.getResourceId(android.support.v7.b.l.MenuItem_actionLayout, 0);
        r4.v = r5.getString(android.support.v7.b.l.MenuItem_actionViewClass);
        r4.w = r5.getString(android.support.v7.b.l.MenuItem_actionProviderClass);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0166, code lost:
    
        if (r4.w == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0168, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0169, code lost:
    
        if (r0 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x016d, code lost:
    
        if (r4.u != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0171, code lost:
    
        if (r4.v != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0173, code lost:
    
        r4.y = (android.support.v4.view.n) r4.a(r4.w, android.support.v7.view.i.f566b, r4.z.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0183, code lost:
    
        r5.recycle();
        r4.h = false;
        r0 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0197, code lost:
    
        if (r0 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0199, code lost:
    
        android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a0, code lost:
    
        r4.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0195, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018e, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0190, code lost:
    
        r4.p = r4.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01aa, code lost:
    
        if (r0.equals("menu") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ac, code lost:
    
        a(r11, r12, r4.b());
        r0 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b8, code lost:
    
        r2 = true;
        r9 = r1;
        r1 = r0;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01be, code lost:
    
        r0 = r11.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c2, code lost:
    
        if (r3 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c8, code lost:
    
        if (r0.equals(r2) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ca, code lost:
    
        r2 = false;
        r9 = r1;
        r1 = null;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d7, code lost:
    
        if (r0.equals("group") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d9, code lost:
    
        r4.a();
        r0 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e7, code lost:
    
        if (r0.equals("item") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01eb, code lost:
    
        if (r4.h != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ef, code lost:
    
        if (r4.y == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f7, code lost:
    
        if (r4.y.e() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f9, code lost:
    
        r4.b();
        r0 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0201, code lost:
    
        r4.h = true;
        r4.a(r4.f569a.add(r4.f570b, r4.i, r4.j, r4.k));
        r0 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0220, code lost:
    
        if (r0.equals("menu") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0222, code lost:
    
        r0 = true;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x022e, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        switch(r0) {
            case 1: goto L78;
            case 2: goto L18;
            case 3: goto L50;
            default: goto L11;
        };
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.i.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    static /* synthetic */ Object b(i iVar) {
        if (iVar.f == null) {
            Context context = iVar.e;
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            iVar.f = context;
        }
        return iVar.f;
    }
}
