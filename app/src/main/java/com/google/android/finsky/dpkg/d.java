package com.google.android.finsky.dpkg;

import android.text.TextUtils;
import com.google.android.finsky.cpkg.o;
import com.google.android.finsky.protos.pn;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static int f2476b;
    public static int d;
    public final String g;
    public android.support.v4.h.f<String> i;
    public String j;
    public String k;

    /* renamed from: a, reason: collision with root package name */
    public static final android.support.v4.h.f<String> f2475a = new android.support.v4.h.f<>();
    public static final android.support.v4.h.f<String> c = new android.support.v4.h.f<>();
    public com.google.android.play.apkg.b e = new com.google.android.play.apkg.b();
    public final android.support.v4.h.f<String> f = new android.support.v4.h.f<>();
    public final List<e> h = new ArrayList();

    static {
        b(12605163L, "prevent tab preloading on home");
        b(12605193L, "prevent tab preloading on highlights");
        b(12602328L, "show buy verb in button");
        b(12603136L, "hide sale prices");
        b(12602050L, "cleanup auth settings");
        b(12602632L, "increase cart details touch target");
        b(12605524L, "move cart details chevron");
        b(12605725L, "open purchase auth help link with webview");
        b(12602631L, "always show play logo");
        b(12602810L, "use 2500ms as prepare purchase timeout");
        b(12602812L, "use 3500ms as prepare purchase timeout");
        b(12602814L, "use 5000ms as prepare purchase timeout");
        b(12602816L, "use 7000ms as prepare purchase timeout");
        b(12603704L, "enable inline consumption app install flow");
        b(12602035L, "prompt for fop");
        b(12603124L, "cart details old expander");
        b(12603133L, "hide edit payment my account");
        b(12603134L, "enable post purchase xsell all corpora");
        b(89L, "details album start cover expanded");
        b(12602358L, "force through sdcard");
        b(87L, "details album all access enabled");
        b(12602761L, "details album all access alternate enabled");
        b(12602049L, "details hide download count in title");
        b(12603111L, "use reauth api for password");
        b(12604372L, "use client login for delegated auth");
        b(12604203L, "send auth token with ad click request");
        b(12603961L, "disable fingerprint auth for purchase");
        b(12603137L, "transitions enabled");
        b(12603044L, "use dfe for music search suggestions");
        b(12602735L, "auto update pre l strategy using broadcast enabled");
        b(12603102L, "dora searchbox zero query suggest enabled");
        b(742L, "backstack clear enabled");
        b(12602880L, "disable patch output buffering");
        b(745L, "happiness survey in search with snow");
        b(746L, "happiness survey in search no snow");
        b(747L, "happiness survey in home");
        b(12602392L, "multi vertical content filtering");
        b(12602636L, "reviews editor v2 enabled");
        b(12602952L, "enable free sample magazines");
        b(12603110L, "disable preregistration hygiene");
        b(12602819L, "enable screenshots activity v2");
        b(12602796L, "log ad id client events");
        b(12602624L, "reviews feedback v2 enabled");
        b(12603108L, "disable dfe toc consistency token");
        b(12603140L, "enable creator avatar cluster v2 for more by author");
        b(12603105L, "use pin recovery url");
        b(12603159L, "use svg resources");
        b(12603097L, "hide empty stars in reviews");
        b(12603067L, "enable rapid auto update");
        b(12603106L, "log package first launch");
        b(12603098L, "searchbox hint per corpus enabled");
        b(12602778L, "youtube card labels no prices");
        b(12602779L, "youtube card labels hd prices");
        b(12602780L, "youtube purchase actions hd prices");
        b(12602795L, "show family parent guide in drawer");
        b(12604148L, "enable request refund from order history");
        b(12603117L, "voucher resolve offer request details");
        b(12602981L, "do not load all screenshots at once");
        b(12603286L, "enable tap to load screenshots");
        b(12603132L, "remove dcb3 flows cancel buttons");
        b(12603428L, "enable basic family features");
        b(12603252L, "enable family sharing features");
        b(12604244L, "enable family sharing for Apps");
        b(12604245L, "enable family sharing for Books");
        b(12604246L, "enable family sharing for Movies");
        b(12603772L, "enable family creation card");
        b(12604079L, "enable family member ask to buy option");
        b(12603401L, "send user context in search suggest");
        b(12604087L, "send user context in search");
        b(12603109L, "disable dfe managed context header");
        b(12603396L, "enable toggle between help and play store");
        b(12603380L, "backfill referrer organic install");
        b(12603394L, "backfill referrer deep link install");
        b(12603791L, "send install referrer timestamp");
        b(12604059L, "capture install referrer from notification");
        b(12603367L, "enable uninstall wizard");
        b(12603513L, "enable API in PlayAfwAppService");
        b(12603385L, "support trimmed dfe streams");
        b(12603301L, "show app size in details summary");
        b(12603329L, "show app size in listing cards");
        b(12603516L, "show app size in overflow menu");
        b(12603517L, "enable bad ad reporting");
        b(12605043L, "enable instant logs flush on ad impressions");
        b(12603647L, "disable ATV search suggestions");
        b(12603707L, "enable ATV X-sell in details page");
        b(12603787L, "display seasonal subscription byline");
        b(12603719L, "Enable link to artist radio on artist pages");
        b(12603788L, "enable secure data tokenization for redirect fop");
        b(12605398L, "enable instrument manager client token for commit purchase");
        b(12604322L, "enable post-purchase dialog after inline purchase flow");
        b(12605436L, "enable inline app install flow for google ads");
        b(12603770L, "enable edu access via PIN");
        b(12603948L, "enable wear support on Phonesky");
        b(12605594L, "enable wear zapp support on Phonesky");
        b(12604572L, "disable Top Charts on home and games tabs on ATV");
        b(12603210L, "enable on-boarding for entertainment");
        b(12604043L, "enable on-boarding for entertainment forcibly over server setting");
        b(12603427L, "enable instant purchase analytics");
        b(12603718L, "enable instant purchase flow");
        b(12605485L, "enable instant purchase counterfactual");
        b(12603886L, "enable instant purchase use converted offer");
        b(12603991L, "enable instant purchase network check");
        b(12604268L, "enable instant purchase allow split tender");
        b(12604266L, "report in-app item purchases to GMP");
        b(12604323L, "log in-app item purchases to GMP");
        b(12604230L, "enable gift purchase via email");
        b(12605131L, "enable monetary gifting");
        b(12604154L, "enable postpone download until Wi-Fi");
        b(12607073L, "enable download now");
        b(12604300L, "enable purchase error library replication");
        b(12603992L, "enable dot for complete account");
        b(12604383L, "enable oauth2 auth for ad clicks");
        b(12604224L, "dummy experiment a");
        b(12604379L, "tubesky recommendation max count 0");
        b(12604380L, "tubesky recommendation max count 1");
        b(12604381L, "tubesky recommendation max count 2");
        b(12604360L, "enable SYSTEM_ALERT_WINDOW policy #1");
        b(12605120L, "enable SYSTEM_ALERT_WINDOW policy #2");
        b(12605124L, "enable SYSTEM_ALERT_WINDOW policy #3");
        b(12605174L, "fife image quality buckets 100%");
        b(12605175L, "fife image quality buckets 150%");
        b(12605176L, "fife image quality buckets 200%");
        b(12605177L, "fife image quality buckets 200% with high quality bucket");
        b(12605178L, "fife image quality buckets 250%");
        b(12605179L, "fife image quality buckets 300%");
        b(12605180L, "fife image quality buckets using network type only");
        b(12604072L, "Enable Herrevad image scaling starting at 0 ms of latency");
        b(12604073L, "Enable Herrevad image scaling starting at 500 ms of latency");
        b(12604074L, "Enable Herrevad image scaling starting at 1000 ms of latency");
        b(12604075L, "Enable Herrevad image scaling starting at 1500 ms of latency");
        b(12604076L, "Enable Herrevad image scaling starting at 2000 ms of latency");
        b(12604164L, "Enable Herrevad image scaling starting at 2500 ms of latency");
        b(12604165L, "Enable Herrevad image scaling starting at 3000 ms of latency");
        b(12604166L, "Enable Herrevad image scaling starting at 3500 ms of latency");
        b(12604167L, "Enable Herrevad image scaling starting at 4000 ms of latency");
        b(12604524L, "check free space on self update");
        b(12605079L, "tubesky recommendation interval 6hr");
        b(12605080L, "tubesky recommendation interval 24hr");
        b(12605081L, "tubesky recommendation interval 48hr");
        b(12605207L, "dependencies: insert fake packages");
        b(12605208L, "dependencies: process on push installs");
        b(12605209L, "dependencies: process on bulk restores");
        b(12605210L, "dependencies: process on user controlled restores");
        b(12605211L, "dependencies: process on auto-update");
        b(12605212L, "dependencies: process on my apps");
        b(12605213L, "dependencies: process on details page installs");
        b(12605214L, "dependencies: installer-time lightweight dependency ordering");
        b(12605261L, "disable clearing device config token on OTA before daily hygiene");
        b(12605458L, "zapp: enable module delivery");
        b(12605423L, "enable subscription details to my account");
        b(12605648L, "disable sending MVNO related device attributes in uploadDeviceConfig");
        b(12605417L, "obb verify raw downloads");
        b(12605447L, "remove cancel subscription buttons in details page");
        b(12605501L, "enable My Account 1.5");
        b(12605655L, "use S2CellId as cache key");
        b(12605418L, "dependencies: special uninstall warning for Google Play Games");
        b(12605523L, "restyle authentication dialog");
        b(12605728L, "cancel search suggest requests on query changes");
        b(12605750L, "require device idle for auto-update");
        b(12605765L, "preload content in daily hygiene");
        b(12605260L, "apk size prediction logging");
        b(12605993L, "show star rating on the details page on ATV");
        b(12606444L, "disable tracking of app install source for GooglePartnerSetup");
        b(12607353L, "search suggest: use the backend associated with recent suggestions");
        b(12607225L, "check license request through dfe");
        b(12607314L, "content sync through dfe");
        b(12607338L, "use DFE instead of AMAS for flag content");
        a(12604225L, "dummy process stable exp a");
        a(12604226L, "dummy process stable exp b");
        a(12604227L, "dummy process stable exp c");
        a(12604228L, "dummy process stable exp d");
        a(12604229L, "dummy process stable exp e");
        a(12606611L, "dummy process stable exp f");
        a(12606612L, "dummy process stable exp g");
        a(12606613L, "dummy process stable exp h");
        a(12606614L, "dummy process stable exp i");
        a(12606615L, "dummy process stable exp j");
        a(12606616L, "dummy process stable exp k");
        a(12606617L, "dummy process stable exp l");
        a(12606618L, "dummy process stable exp m");
        a(12606619L, "dummy process stable exp n");
        a(12606620L, "dummy process stable exp o");
        a(12604101L, "freshwater_disable_hscroll");
        a(12604267L, "h20 alternate density mode");
        a(12603123L, "fife max density dpi 200");
        a(12603125L, "fife max density dpi 225");
        a(12603127L, "fife max density dpi 250");
        a(12603128L, "fife max density dpi 275");
        a(12603129L, "fife max density dpi 300");
        a(12603130L, "fife max density dpi 325");
        a(12603642L, "network use okhttp stack without SPDY");
        a(12602748L, "network use okhttp stack with SPDY");
        a(12604235L, "network use okhttp stack with SPDY and 150 percent timeout");
        a(12604236L, "network use okhttp stack with SPDY and 200 percent timeout");
        a(12603144L, "network timeout multiplier 50 percent");
        a(12603145L, "network timeout multiplier 75 percent");
        a(12603146L, "network timeout multiplier 100 percent");
        a(12603147L, "network timeout multiplier 125 percent");
        a(12603148L, "network timeout multiplier 150 percent");
        a(12603149L, "network timeout multiplier 175 percent");
        a(12603118L, "bitmap disk cache size multiplier 50 percent");
        a(12603119L, "bitmap disk cache size multiplier 75 percent");
        a(12603120L, "bitmap disk cache size multiplier 100 percent");
        a(12603121L, "bitmap disk cache size multiplier 125 percent");
        a(12603122L, "bitmap disk cache size multiplier 150 percent");
        a(12603247L, "main disk cache size multiplier 50 percent");
        a(12603248L, "main disk cache size multiplier 75 percent");
        a(12603249L, "main disk cache size multiplier 100 percent");
        a(12603250L, "main disk cache size multiplier 125 percent");
        a(12603251L, "main disk cache size multiplier 150 percent");
        a(12605742L, "enable crash logging");
        a(12602374L, "enable all rpc logging");
        a(12604366L, "enable dfe request logging");
        a(12603408L, "log cache hits in request log");
        a(12603629L, "disable recyclerview scroll workaround");
        a(12604357L, "use oauth2 auth for DFE requests");
        a(12604382L, "use oauth2 auth for logging requests");
        a(12607368L, "Remove system alert window from the permissions whitelist");
        a(12605729L, "entertainment tab bubble: forcibly show sample for testing");
        a(12606007L, "logging for sticky Wi-Fi (unmetered/metered network changes during download)");
        if (f2476b != f2475a.a()) {
            FinskyLog.e("Mismatch in recognized targets count. Expected: %d, Actual: %d", Integer.valueOf(f2476b), Integer.valueOf(f2475a.a()));
        }
        if (d != c.a()) {
            FinskyLog.e("Mismatch in process stable targets count. Expected: %d, Actual: %d", Integer.valueOf(d), Integer.valueOf(c.a()));
        }
    }

    public static void a(long j, String str) {
        c.b(j, null);
        d++;
        b(j, str);
    }

    public static void b(long j, String str) {
        f2475a.b(j, str);
        f2476b++;
    }

    public d(String str, e... eVarArr) {
        this.g = str;
        Collections.addAll(this.h, eVarArr);
        b(jm.e(bg.S.b(this.g).a()));
        long[] e = jm.e(bg.T.b(this.g).a());
        a(e.length <= 0 ? null : e);
    }

    public final synchronized com.google.android.play.apkg.b a() {
        return this.e;
    }

    public synchronized boolean a(long j) {
        boolean z;
        synchronized (this) {
            if (this.i != null) {
                z = this.i.c(j) >= 0;
                if (z != (this.f.c(j) >= 0)) {
                    FinskyLog.a("Target id: \"%s\" overridden. Enabled: <%b>", Long.valueOf(j), Boolean.valueOf(z));
                }
            } else {
                z = this.f.c(j) >= 0;
            }
        }
        return z;
    }

    public final synchronized boolean b() {
        boolean z = true;
        synchronized (this) {
            if (this.i != null) {
                if (this.i.a() <= 0) {
                    z = false;
                }
            } else if (this.f.a() <= 0) {
                z = false;
            }
        }
        return z;
    }

    public final synchronized boolean c() {
        return !TextUtils.isEmpty(this.k);
    }

    public final synchronized String d() {
        return this.j;
    }

    public final synchronized String e() {
        return this.k;
    }

    public final synchronized void a(pn pnVar) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        o<String> b2 = bg.S.b(this.g);
        String a2 = b2.a();
        long[] jArr = pnVar.f4258a;
        Arrays.sort(jArr);
        String a3 = jm.a(jArr);
        if (!TextUtils.equals(a2, a3)) {
            b2.a(a3);
            long[] c2 = c(jArr);
            android.support.v4.h.f<String> fVar = this.f;
            android.support.v4.h.f<Object> fVar2 = new android.support.v4.h.f<>(c2.length);
            android.support.v4.h.f<Object> fVar3 = new android.support.v4.h.f<>(c2.length);
            for (long j : c2) {
                if (fVar.c(j) < 0) {
                    fVar2.b(j, null);
                }
            }
            android.support.v4.h.f fVar4 = new android.support.v4.h.f(c2.length);
            for (long j2 : c2) {
                fVar4.b(j2, null);
            }
            for (int i3 = 0; i3 < fVar.a(); i3++) {
                long a4 = fVar.a(i3);
                if (fVar4.c(a4) < 0) {
                    fVar3.b(a4, null);
                }
            }
            if (fVar2.a() > 0 || fVar3.a() > 0) {
                Iterator<e> it = this.h.iterator();
                while (it.hasNext()) {
                    it.next().a(fVar2, fVar3);
                }
            }
            long[] jArr2 = new long[c.a()];
            int i4 = 0;
            int i5 = 0;
            while (i4 < c.a()) {
                long a5 = c.a(i4);
                if (a(a5)) {
                    i2 = i5 + 1;
                    jArr2[i5] = a5;
                } else {
                    i2 = i5;
                }
                i4++;
                i5 = i2;
            }
            long[] copyOf = Arrays.copyOf(jArr2, i5);
            this.f.b();
            long[] jArr3 = new long[c2.length + copyOf.length];
            long[] jArr4 = new long[c2.length];
            int i6 = 0;
            int i7 = 0;
            while (i6 < copyOf.length) {
                jArr3[i7] = copyOf[i6];
                this.f.b(copyOf[i6], null);
                i6++;
                i7++;
            }
            if (this.h.size() > 0) {
                int i8 = 0;
                while (true) {
                    if (i8 < copyOf.length) {
                        long j3 = copyOf[i8];
                        int length = c2.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                z2 = false;
                                break;
                            } else {
                                if (c2[i9] == j3) {
                                    z2 = true;
                                    break;
                                }
                                i9++;
                            }
                        }
                        if (z2) {
                            i8++;
                        } else {
                            FinskyLog.a("Process stable target turned off mid-process: %d", Long.valueOf(j3));
                            z = true;
                            break;
                        }
                    } else {
                        int length2 = c2.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length2) {
                                z = false;
                                break;
                            }
                            long j4 = c2[i10];
                            if (c.c(j4) < 0 || this.f.c(j4) >= 0) {
                                i10++;
                            } else {
                                FinskyLog.a("Process stable target turned on mid-process: %d", Long.valueOf(j4));
                                z = true;
                                break;
                            }
                        }
                    }
                }
                if (z) {
                    Iterator<e> it2 = this.h.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                }
            }
            int length3 = c2.length;
            int i11 = 0;
            int i12 = 0;
            int i13 = i7;
            while (i11 < length3) {
                long j5 = c2[i11];
                if (this.f.c(j5) >= 0) {
                    i = i13;
                } else if (f2475a.c(j5) >= 0 && c.c(j5) < 0) {
                    i = i13 + 1;
                    jArr3[i13] = j5;
                    this.f.b(j5, null);
                } else {
                    jArr4[i12] = j5;
                    i12++;
                    i = i13;
                }
                i11++;
                i13 = i;
            }
            a(jArr3, jArr4, i13, i12);
        }
    }

    public void a(long[] jArr) {
        o<String> b2 = bg.T.b(this.g);
        if (jArr == null || jArr.length == 0) {
            b2.c();
            this.i = null;
            return;
        }
        b2.a(jm.a(jArr));
        this.i = new android.support.v4.h.f<>(jArr.length);
        for (long j : jArr) {
            this.i.b(j, null);
        }
    }

    public void b(long[] jArr) {
        int i;
        int i2 = 0;
        long[] c2 = c(jArr);
        this.f.b();
        long[] jArr2 = new long[c2.length];
        long[] jArr3 = new long[c2.length];
        int length = c2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            long j = c2[i3];
            if (f2475a.c(j) >= 0) {
                i = i4 + 1;
                jArr2[i4] = j;
                this.f.b(j, null);
            } else {
                jArr3[i2] = j;
                i2++;
                i = i4;
            }
            i3++;
            i4 = i;
        }
        a(jArr2, jArr3, i4, i2);
    }

    public static long[] c(long[] jArr) {
        long[] e = jm.e(com.google.android.finsky.cpkg.d.dh.b());
        if (e.length != 0) {
            long[] jArr2 = new long[jArr.length + e.length];
            for (int i = 0; i < jArr.length; i++) {
                jArr2[i] = jArr[i];
            }
            for (int i2 = 0; i2 < e.length; i2++) {
                jArr2[jArr.length + i2] = e[i2];
            }
            return jArr2;
        }
        return jArr;
    }

    public void a(long[] jArr, long[] jArr2, int i, int i2) {
        long[] copyOf = Arrays.copyOf(jArr, i);
        long[] copyOf2 = Arrays.copyOf(jArr2, i2);
        this.e = new com.google.android.play.apkg.b();
        if (copyOf.length > 0) {
            this.e.d = copyOf;
        }
        if (copyOf2.length > 0) {
            this.e.e = copyOf2;
        }
        this.j = jm.a(copyOf);
        this.k = jm.a(copyOf2);
    }
}
