package com.google.android.finsky.a;

import android.accounts.Account;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.layout.play.da;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.volley.DisplayMessageError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class i {
    private static boolean c = false;
    private static long d;
    private static Boolean e;
    private static l i;

    /* renamed from: a, reason: collision with root package name */
    public final g f1485a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.a.v f1486b;
    private final com.google.android.finsky.d.d f;
    private final boolean g;
    private String[] h;

    public static i a(Context context, Account account, com.google.android.finsky.d.d dVar, boolean z) {
        return new i(context, account, dVar, com.google.android.finsky.c.d.V.b().booleanValue(), z);
    }

    private i(Context context, Account account, com.google.android.finsky.d.d dVar, boolean z, boolean z2) {
        com.google.android.play.a.v vVar = null;
        this.f = dVar;
        this.g = z2;
        if (com.google.android.finsky.c.d.U.b().booleanValue() && (account != null || z)) {
            com.google.android.play.a.z zVar = new com.google.android.play.a.z();
            zVar.f6795b = com.google.android.finsky.c.d.X.b().longValue();
            zVar.c = com.google.android.finsky.c.d.Y.b().longValue();
            zVar.e = com.google.android.finsky.c.d.Z.b().longValue();
            zVar.f = com.google.android.finsky.c.d.aa.b().longValue();
            zVar.g = com.google.android.finsky.c.d.ab.b();
            if (z2) {
                zVar.f6794a = "safe_mode_logs";
            }
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            vVar = new com.google.android.play.a.v(context, com.google.android.finsky.auth.g.a(dVar, 12604382L), com.google.android.play.a.aa.MARKET, com.google.android.finsky.api.e.b(context), com.google.android.finsky.api.d.p.b().longValue(), Integer.toString(FinskyApp.a().k()), simOperator, zVar, account);
            vVar.a(new j(this));
        }
        this.f1486b = vVar;
        this.f1485a = g.a();
    }

    public static boolean a() {
        if (e == null) {
            e = bg.ap.a();
        }
        return e.booleanValue();
    }

    public final void a(String str, ad adVar) {
        byte[] a2 = com.google.protobuf.nano.c.a(adVar);
        a(str, a2);
        if (this.f1486b != null) {
            com.google.android.play.a.v vVar = this.f1486b;
            com.google.android.play.a.b a3 = this.f != null ? this.f.a() : null;
            String[] strArr = this.h;
            long currentTimeMillis = System.currentTimeMillis();
            com.google.android.play.utils.a.a(strArr == null || strArr.length % 2 == 0, "Extras must be null or of even length.");
            com.google.android.play.a.m a4 = vVar.f6789a.f6744a.a();
            a4.f6771a = currentTimeMillis;
            a4.B = TimeZone.getDefault().getRawOffset() / 1000;
            a4.g = str;
            a4.y = a3;
            a4.s = a2;
            if (strArr != null && strArr.length != 0) {
                int length = strArr.length / 2;
                a4.o = new com.google.android.play.a.n[length];
                for (int i2 = 0; i2 < length; i2++) {
                    com.google.android.play.a.n a5 = vVar.f6789a.f6745b.a();
                    int i3 = i2 * 2;
                    a5.f6773a = strArr[i3];
                    a5.c = strArr[i3 + 1] != null ? strArr[i3 + 1] : "null";
                    a4.o[i2] = a5;
                }
            }
            vVar.f6790b.obtainMessage(2, a4).sendToTarget();
            g gVar = this.f1485a;
            if (adVar.f1443a != null) {
                ac acVar = adVar.f1443a;
                if (acVar.f1441a != null) {
                    gVar.a(acVar.f1441a);
                }
                for (ai aiVar : acVar.f1442b) {
                    gVar.a(aiVar);
                }
                acVar.b();
                gVar.f1482b.a(acVar);
            }
            if (adVar.f1444b != null) {
                z zVar = adVar.f1444b;
                for (ai aiVar2 : zVar.f1513a) {
                    gVar.a(aiVar2);
                }
                zVar.b();
                gVar.c.a(zVar);
            }
            if (adVar.g != null) {
                ab abVar = adVar.g;
                for (ai aiVar3 : abVar.f1440a) {
                    gVar.a(aiVar3);
                }
                abVar.b();
                gVar.d.a(abVar);
            }
            if (adVar.c != null) {
                y yVar = adVar.c;
                if (yVar.H != null) {
                    ao aoVar = yVar.H;
                    aoVar.b();
                    gVar.g.a(aoVar);
                }
                yVar.b();
                gVar.e.a(yVar);
            }
            if (adVar.d != null) {
                af afVar = adVar.d;
                afVar.b();
                gVar.f.a(afVar);
            }
            adVar.b();
            gVar.f1481a.a(adVar);
        }
    }

    public final void a(Runnable runnable) {
        if (this.f1486b == null) {
            return;
        }
        this.f1486b.f6790b.obtainMessage(4, runnable).sendToTarget();
    }

    private static synchronized void a(String str, byte[] bArr) {
        synchronized (i.class) {
            if (i != null) {
                com.google.android.play.a.m mVar = new com.google.android.play.a.m();
                mVar.f6771a = System.currentTimeMillis();
                mVar.g = str;
                if (bArr != null) {
                    mVar.s = bArr;
                }
                com.google.protobuf.nano.c.a(mVar);
            }
        }
    }

    public static ai a(int i2) {
        ai e2 = g.a().e();
        e2.f1453a = i2;
        e2.f1454b = true;
        return e2;
    }

    public static y b() {
        return g.a().e.a();
    }

    public static z c() {
        return g.a().d();
    }

    public static ac d() {
        return g.a().c();
    }

    public static af e() {
        return g.a().f.a();
    }

    public static ao f() {
        return g.a().g.a();
    }

    public static ai a(ai aiVar, byte[] bArr) {
        if (bArr != null) {
            aiVar.c = bArr;
            aiVar.d = true;
        }
        return aiVar;
    }

    public final void a(cy cyVar) {
        if (cyVar != null) {
            z d2 = this.f1485a.d();
            a(cyVar, d2);
            a(d2);
        }
    }

    public final void a(int i2, byte[] bArr, cy cyVar) {
        z d2 = this.f1485a.d();
        ai e2 = this.f1485a.e();
        e2.f1453a = i2;
        e2.f1454b = true;
        if (bArr != null) {
            e2.c = bArr;
            e2.d = true;
        }
        d2.f1513a = (ai[]) a(d2.f1513a, e2);
        if (cyVar != null) {
            a(cyVar, d2);
        }
        a(d2);
    }

    private static <T> T[] a(T[] tArr, T t) {
        if (t == null) {
            FinskyLog.e("Adding null to element array.", new Object[0]);
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(t.getClass(), tArr.length + 1));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    public final void a(int i2, aj ajVar, cy cyVar) {
        z d2 = this.f1485a.d();
        ai e2 = this.f1485a.e();
        e2.f1453a = i2;
        e2.f1454b = true;
        if (ajVar != null) {
            e2.e = ajVar;
        }
        d2.f1513a = (ai[]) a(d2.f1513a, e2);
        if (cyVar != null) {
            a(cyVar, d2);
        }
        a(d2);
    }

    public final void a(z zVar) {
        if (a() && a()) {
            FinskyLog.a("Sending click event:", new Object[0]);
            String str = "";
            for (ai aiVar : zVar.f1513a) {
                a(aiVar, str);
                str = str + "  ";
            }
        }
        ad b2 = this.f1485a.b();
        b2.f1444b = zVar;
        a("3", b2);
    }

    private static void a(cy cyVar, z zVar) {
        ai[] aiVarArr = zVar.f1513a;
        while (true) {
            if (cyVar == null) {
                break;
            }
            ai playStoreUiElement = cyVar.getPlayStoreUiElement();
            if (playStoreUiElement == null) {
                FinskyLog.c("Unexpected null PlayStoreUiElement from node %s", cyVar);
                break;
            } else {
                aiVarArr = (ai[]) a(aiVarArr, a(playStoreUiElement));
                cyVar = cyVar.getParentNode();
            }
        }
        zVar.f1513a = aiVarArr;
    }

    public final void a(int i2, cy cyVar) {
        b(i2, null, cyVar);
    }

    public final void b(int i2, byte[] bArr, cy cyVar) {
        ac c2 = this.f1485a.c();
        if (0 != 0) {
            c2.c = 0L;
            c2.d = true;
        }
        ArrayList arrayList = new ArrayList();
        ai e2 = this.f1485a.e();
        e2.f1453a = i2;
        e2.f1454b = true;
        a(e2, bArr);
        arrayList.add(e2);
        while (cyVar != null) {
            arrayList.add(cyVar.getPlayStoreUiElement());
            cyVar = cyVar.getParentNode();
        }
        ai a2 = a(arrayList);
        if (a2 != null) {
            c2.f1441a = a2;
        } else {
            FinskyLog.e("Encountered empty tree.", new Object[0]);
        }
        a(c2);
    }

    public final void a(long j, cy cyVar) {
        ac c2 = this.f1485a.c();
        if (j != 0) {
            c2.c = j;
            c2.d = true;
        }
        ArrayList arrayList = new ArrayList();
        while (cyVar != null) {
            arrayList.add(cyVar.getPlayStoreUiElement());
            cyVar = cyVar.getParentNode();
        }
        ai a2 = a(arrayList);
        if (a2 != null) {
            c2.f1441a = a2;
        } else {
            FinskyLog.e("Encountered empty tree.", new Object[0]);
        }
        a(c2);
    }

    public static ai a(List<ai> list) {
        Iterator<ai> it = list.iterator();
        ai aiVar = null;
        while (it.hasNext()) {
            ai a2 = a(it.next());
            if (aiVar != null) {
                a2.f = (ai[]) a(a2.f, aiVar);
            }
            aiVar = a2;
        }
        return aiVar;
    }

    public final void a(ac acVar) {
        if (a()) {
            a("Sending", acVar.f1441a);
        }
        if (a()) {
            a("Sending", acVar.c, acVar.f1441a, (String) null);
        }
        ad b2 = this.f1485a.b();
        b2.f1443a = acVar;
        a("1", b2);
    }

    public static void a(cy cyVar, cy cyVar2) {
        ai playStoreUiElement = cyVar2.getPlayStoreUiElement();
        if (playStoreUiElement == null) {
            throw new IllegalArgumentException("childNode has null element");
        }
        if (a(cyVar, playStoreUiElement) && playStoreUiElement.f.length == 0) {
            if (a()) {
                FinskyLog.a("Skip reporting existing leaf node type=%d", Integer.valueOf(playStoreUiElement.f1453a));
                return;
            }
            return;
        }
        cyVar.getParentNode().a(cyVar);
    }

    public static boolean a(cy cyVar, ai aiVar) {
        boolean z;
        ai playStoreUiElement = cyVar.getPlayStoreUiElement();
        ai[] aiVarArr = playStoreUiElement.f;
        int length = aiVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if (!d(aiVar, aiVarArr[i2])) {
                i2++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            playStoreUiElement.f = (ai[]) a(playStoreUiElement.f, aiVar);
        }
        return z;
    }

    public static boolean a(ai aiVar, ai aiVar2) {
        ai[] aiVarArr = aiVar.f;
        for (int i2 = 0; i2 < aiVarArr.length; i2++) {
            if (d(aiVarArr[i2], aiVar2)) {
                aiVar.f = (ai[]) com.google.android.finsky.utils.p.a(aiVarArr, i2);
                return true;
            }
        }
        return false;
    }

    public static void a(Handler handler, long j, cy cyVar, cy cyVar2) {
        if (cyVar2 == null || cyVar2.getPlayStoreUiElement() == null) {
            throw new IllegalArgumentException("null child node or element");
        }
        ai playStoreUiElement = cyVar.getPlayStoreUiElement();
        if (cyVar2 != null) {
            a(cyVar, cyVar2.getPlayStoreUiElement());
        }
        if (a()) {
            a("Collecting", playStoreUiElement);
        }
        if (a()) {
            a("Collecting", 0L, playStoreUiElement, (String) null);
        }
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new k(j, cyVar), com.google.android.finsky.c.d.ac.b().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(long j, cy cyVar, boolean z) {
        if (!z || cyVar.getPlayStoreUiElement().f.length != 0) {
            ac c2 = g.a().c();
            ai a2 = a(0);
            b(cyVar.getPlayStoreUiElement(), a2);
            c2.f1441a = a2;
            if (j != 0) {
                c2.c = j;
                c2.d = true;
            }
            FinskyApp.a().h().a(c2);
        }
    }

    public static void b(cy cyVar) {
        for (cy cyVar2 = cyVar; cyVar2 != null; cyVar2 = cyVar2.getParentNode()) {
            if (cyVar2 instanceof da) {
                ((da) cyVar2).i();
                return;
            }
        }
        FinskyLog.e("No RootUiElementNode found in parent chain", new Object[0]);
    }

    public static void a(Handler handler, long j, da daVar) {
        ai playStoreUiElement = daVar.getPlayStoreUiElement();
        if (a()) {
            a("Flushing", playStoreUiElement);
        }
        if (a()) {
            a("Flushing", 0L, playStoreUiElement, (String) null);
        }
        handler.removeCallbacksAndMessages(null);
        a(j, (cy) daVar, true);
    }

    private static void b(ai aiVar, ai aiVar2) {
        c(aiVar, aiVar2);
        for (ai aiVar3 : aiVar.f) {
            ai a2 = a(0);
            b(aiVar3, a2);
            aiVar2.f = (ai[]) a(aiVar2.f, a2);
        }
        aiVar.f = ai.b();
    }

    public static ai a(ai aiVar) {
        ai a2 = a(0);
        c(aiVar, a2);
        return a2;
    }

    private static void c(ai aiVar, ai aiVar2) {
        aiVar2.f1453a = aiVar.f1453a;
        aiVar2.f1454b = aiVar.f1454b;
        aiVar2.e = aiVar.e;
        aiVar2.c = aiVar.c;
        aiVar2.d = aiVar2.c.length != 0;
    }

    private static boolean d(ai aiVar, ai aiVar2) {
        if (aiVar == aiVar2) {
            return true;
        }
        if (aiVar == null || aiVar2 == null) {
            return false;
        }
        return aiVar.f1453a == aiVar2.f1453a && Arrays.equals(aiVar.c, aiVar2.c);
    }

    public static void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            b(viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt);
            }
        }
        if (viewGroup instanceof cy) {
            d((cy) viewGroup);
            return;
        }
        if (viewGroup instanceof com.google.android.play.layout.a) {
            cy cyVar = (cy) ((com.google.android.play.layout.a) viewGroup).getLoggingData();
            if (cyVar != null) {
                d(cyVar);
                return;
            }
            return;
        }
        if (viewGroup.getTag() instanceof cy) {
            d((cy) viewGroup.getTag());
        }
    }

    private static void d(cy cyVar) {
        if (a()) {
            FinskyLog.c("TRAVERSE: Found %s", cyVar.getClass().getSimpleName());
        }
        cy parentNode = cyVar.getParentNode();
        if (parentNode != null) {
            parentNode.a(cyVar);
        }
    }

    public static long g() {
        if (!c) {
            d = System.currentTimeMillis() ^ System.nanoTime();
            c = true;
        }
        long j = d + 1;
        d = j;
        if (j == 0) {
            d++;
        }
        return d;
    }

    public static void c(cy cyVar) {
        cy cyVar2 = cyVar;
        for (cy parentNode = cyVar.getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            cyVar2 = parentNode;
        }
        if (cyVar2 instanceof da) {
            ((da) cyVar2).p_();
        }
    }

    private static void a(String str, ai aiVar) {
        if (a()) {
            int[] iArr = {0};
            FinskyLog.a("%s impression at root. Type=%d top children=%d total children=%d depth=%d", str, Integer.valueOf(aiVar.f1453a), Integer.valueOf(aiVar.f.length), Integer.valueOf(iArr[0]), Integer.valueOf(a(aiVar, iArr)));
        }
    }

    private static int a(ai aiVar, int[] iArr) {
        ai[] aiVarArr = aiVar.f;
        int length = aiVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            ai aiVar2 = aiVarArr[i2];
            iArr[0] = iArr[0] + 1;
            int a2 = a(aiVar2, iArr) + 1;
            if (a2 <= i3) {
                a2 = i3;
            }
            i2++;
            i3 = a2;
        }
        return i3;
    }

    private static void a(String str, long j, ai aiVar, String str2) {
        if (a()) {
            if (str != null) {
                FinskyLog.a("%s impression tree, id=%x", str, Long.valueOf(j));
            }
            if (str2 == null) {
                str2 = "";
            }
            a(aiVar, str2);
            String str3 = str2 + "  ";
            for (ai aiVar2 : aiVar.f) {
                a((String) null, 0L, aiVar2, str3);
            }
        }
    }

    public static void a(aa aaVar) {
        if (a()) {
            StringBuilder sb = new StringBuilder("Sending deeplink event");
            sb.append(" type=").append(aaVar.c);
            sb.append(" package_name=").append(aaVar.e);
            sb.append(" external_referrer=").append(aaVar.o);
            sb.append(" external_url=").append(aaVar.f1438a);
            a(sb, aaVar.m);
            FinskyLog.a("%s", sb);
        }
    }

    public static void a(af afVar) {
        if (a()) {
            FinskyLog.a("Sending search event query=%s queryUrl=%s", afVar.f1447a, afVar.c);
        }
    }

    private static void a(ai aiVar, String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("type=").append(aiVar.f1453a);
        a(sb, aiVar.c);
        FinskyLog.a("%s", sb);
    }

    private static void a(StringBuilder sb, byte[] bArr) {
        if (bArr != null) {
            sb.append(" s.cookie[").append(bArr.length).append("]={ ");
            sb.append(Base64.encodeToString(bArr, 10));
            sb.append(" }");
            return;
        }
        sb.append(" (no s-cookie)");
    }

    public final void a(int i2, String str, String str2, int i3, String str3, n nVar) {
        b(new b(i2).a(str).b(str2).a(i3).c(str3).a(nVar).f1473a);
    }

    public final void a(int i2, byte[] bArr) {
        b(new b(i2).a(bArr).f1473a);
    }

    public final void a(int i2, String str, int i3, String str2, int i4, byte[] bArr, long j) {
        b(new b(i2).a(str).a(i4).c(str2).a(bArr).b(i3).a(-1L).b(j).f1473a);
    }

    public final void a(int i2, Integer num, Integer num2, String str) {
        b(new b(i2).b(num).a(num2).b(str).f1473a);
    }

    public final void a(int i2, boolean z) {
        b(new b(i2).a(z).f1473a);
    }

    public final void b(y yVar) {
        if (this.g) {
            yVar.Z = true;
            yVar.aa = true;
        }
        if (a() && a()) {
            StringBuffer append = new StringBuffer("type=").append(yVar.f1511a);
            if (yVar.d) {
                append.append(", document=").append(yVar.c);
            }
            if (yVar.h) {
                append.append(", error_code=").append(yVar.g);
            }
            if (yVar.f) {
                append.append(", reason=").append(yVar.e);
            }
            if (yVar.j) {
                append.append(", exception_type=").append(yVar.i);
            }
            if (yVar.n) {
                append.append(", offer_type=").append(yVar.m);
            }
            if (yVar.v) {
                append.append(", server_latency_ms=").append(yVar.u);
            }
            if (yVar.x) {
                append.append(", client_latency_ms=").append(yVar.w);
            }
            if (yVar.H != null) {
                ao aoVar = yVar.H;
                append.append(", query=").append(aoVar.f1465a);
                if (aoVar.d) {
                    append.append(", suggested_query=").append(aoVar.c);
                }
                append.append(", client_latency_ms=").append(aoVar.e);
            }
            if (yVar.P != null) {
                ae aeVar = yVar.P;
                if (a()) {
                    if (aeVar.f1446b) {
                        append.append(", url=").append(aeVar.f1445a);
                    }
                    if (aeVar.d) {
                        append.append(", client_latency_ms=").append(aeVar.c);
                    }
                    if (aeVar.f) {
                        append.append(", server_latency_ms=").append(aeVar.e);
                    }
                    if (aeVar.h) {
                        append.append(", num_attempts=").append(aeVar.g);
                    }
                    if (aeVar.j) {
                        append.append(", timeout_ms=").append(aeVar.i);
                    }
                    if (aeVar.l) {
                        append.append(", backoff_multiplier=").append(aeVar.k);
                    }
                    if (aeVar.n) {
                        append.append(", was_successful=").append(aeVar.m);
                    }
                    if (aeVar.p) {
                        append.append(", cur_connection_type=").append(aeVar.o);
                    }
                    if (aeVar.r) {
                        append.append(", end_connection_type=").append(aeVar.q);
                    }
                    if (aeVar.t) {
                        append.append(", response_body_size_bytes=").append(aeVar.s);
                    }
                    if (aeVar.v) {
                        append.append(", volley_error_type=").append(aeVar.u);
                    }
                    FinskyLog.a("%s", append);
                }
            }
            if (yVar.C != null) {
                p pVar = yVar.C;
                if (a()) {
                    if (pVar.f1495b) {
                        append.append(", skipped_due_to_projection=").append(pVar.f1494a);
                    }
                    if (pVar.d) {
                        append.append(", skipped_due_to_power=").append(pVar.c);
                    }
                    if (pVar.f) {
                        append.append(", skipped_due_to_wifi=").append(pVar.e);
                    }
                    if (pVar.h) {
                        append.append(", recheck_state=").append(pVar.g);
                    }
                    if (pVar.j) {
                        append.append(", skipped_due_to_new_permission=").append(pVar.i);
                    }
                    if (pVar.l) {
                        append.append(", skipped_due_to_large_download=").append(pVar.k);
                    }
                    if (pVar.n) {
                        append.append(", skipped_due_to_disabled_by_user=").append(pVar.m);
                    }
                    if (pVar.p) {
                        append.append(", skipped_due_to_global_disabled=").append(pVar.o);
                    }
                    if (pVar.v) {
                        append.append(", skipped_due_to_foreground=").append(pVar.u);
                    }
                    if (pVar.t) {
                        append.append(", num_packages_deferred=").append(pVar.s);
                    }
                    if (pVar.r) {
                        append.append(", num_packages_installed=").append(pVar.q);
                    }
                    if (pVar.x) {
                        append.append(", rescheduled=").append(pVar.w);
                    }
                }
            }
            if (yVar.aa) {
                append.append(", safe_mode=").append(yVar.Z);
            }
            FinskyLog.a("Sending background event %s", append);
            n nVar = yVar.t;
            if (nVar != null) {
                FinskyLog.a("  app_data {version=%d, old_version=%d, system_app=%b}", Integer.valueOf(nVar.f1490a), Integer.valueOf(nVar.c), Boolean.valueOf(nVar.e));
            }
            w wVar = yVar.ab;
            if (wVar != null) {
                FinskyLog.a("  module_data {module_name=%s, module_version=%d}", wVar.f1507a, Long.valueOf(wVar.c));
            }
        }
        ad b2 = this.f1485a.b();
        b2.c = yVar;
        a("4", b2);
    }

    public final void a(int i2, String str, String str2, String str3, String str4, byte[] bArr) {
        b(i2, str, str2, str3, str4, bArr);
        a((Runnable) null);
    }

    public final void b(int i2, String str, String str2, String str3, String str4, byte[] bArr) {
        aa aaVar = new aa();
        aaVar.c = i2;
        aaVar.d = true;
        if (!TextUtils.isEmpty(str)) {
            aaVar.f1438a = str;
            aaVar.f1439b = true;
        }
        if (!TextUtils.isEmpty(str2)) {
            aaVar.e = str2;
            aaVar.f = true;
        }
        if (!TextUtils.isEmpty(str3)) {
            aaVar.o = str3;
            aaVar.p = true;
        }
        if (!TextUtils.isEmpty(str4)) {
            aaVar.q = str4;
            aaVar.r = true;
        }
        if (bArr != null) {
            aaVar.m = bArr;
            aaVar.n = true;
        }
        if (a()) {
            a(aaVar);
        }
        ad b2 = this.f1485a.b();
        b2.e = aaVar;
        a("6", b2);
    }

    public final void a(String str, p pVar, String str2, n nVar) {
        b a2 = new b(131).b(str2).a(str);
        a2.f1473a.C = pVar;
        b(a2.a(nVar).f1473a);
    }

    private static int a(NetworkInfo networkInfo) {
        switch (com.google.android.play.utils.e.a(networkInfo)) {
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 2;
            case 7:
                return 8;
            case 8:
                return 1;
            default:
                return 0;
        }
    }

    public final void a(String str, long j, long j2, int i2, int i3, float f, boolean z, VolleyError volleyError, NetworkInfo networkInfo, NetworkInfo networkInfo2, int i4, boolean z2) {
        int i5 = 0;
        if (volleyError != null) {
            if (volleyError instanceof TimeoutError) {
                i5 = 1;
            } else if (volleyError instanceof NetworkError) {
                i5 = volleyError instanceof NoConnectionError ? 6 : 2;
            } else if (volleyError instanceof ParseError) {
                i5 = 3;
            } else if (volleyError instanceof AuthFailureError) {
                i5 = 4;
            } else if (volleyError instanceof ServerError) {
                i5 = 5;
            } else if (volleyError instanceof DisplayMessageError) {
                i5 = 7;
            }
        }
        ae aeVar = new ae();
        if (!TextUtils.isEmpty(str)) {
            aeVar.f1445a = str;
            aeVar.f1446b = true;
        }
        if (j >= 0) {
            aeVar.c = j;
            aeVar.d = true;
        }
        if (j2 >= 0) {
            aeVar.e = j2;
            aeVar.f = true;
        }
        if (i2 >= 0) {
            aeVar.g = i2;
            aeVar.h = true;
        }
        if (i3 >= 0) {
            aeVar.i = i3;
            aeVar.j = true;
        }
        if (f > 0.0f) {
            aeVar.k = f;
            aeVar.l = true;
        }
        aeVar.m = z;
        aeVar.n = true;
        if (!z) {
            aeVar.u = i5;
            aeVar.v = true;
        }
        aeVar.o = a(networkInfo);
        aeVar.p = true;
        aeVar.q = a(networkInfo2);
        aeVar.r = true;
        if (i4 >= 0) {
            aeVar.s = i4;
            aeVar.t = true;
        }
        aeVar.w = z2;
        aeVar.x = true;
        b bVar = new b(5);
        bVar.f1473a.P = aeVar;
        b(bVar.f1473a);
    }

    public final void a(y yVar) {
        b(yVar);
        a((Runnable) null);
    }
}
