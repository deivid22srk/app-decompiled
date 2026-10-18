package com.google.android.finsky.api;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.VoucherParams;
import com.google.android.finsky.protos.ContentFilters;
import com.google.android.finsky.protos.ay;
import com.google.android.finsky.protos.bg;
import com.google.android.finsky.protos.bo;
import com.google.android.finsky.protos.bp;
import com.google.android.finsky.protos.bq;
import com.google.android.finsky.protos.bv;
import com.google.android.finsky.protos.bw;
import com.google.android.finsky.protos.bz;
import com.google.android.finsky.protos.ca;
import com.google.android.finsky.protos.dk;
import com.google.android.finsky.protos.dl;
import com.google.android.finsky.protos.dm;
import com.google.android.finsky.protos.ep;
import com.google.android.finsky.protos.ey;
import com.google.android.finsky.protos.ez;
import com.google.android.finsky.protos.fa;
import com.google.android.finsky.protos.fq;
import com.google.android.finsky.protos.fu;
import com.google.android.finsky.protos.fv;
import com.google.android.finsky.protos.ga;
import com.google.android.finsky.protos.gb;
import com.google.android.finsky.protos.gk;
import com.google.android.finsky.protos.gm;
import com.google.android.finsky.protos.gy;
import com.google.android.finsky.protos.hb;
import com.google.android.finsky.protos.hj;
import com.google.android.finsky.protos.hk;
import com.google.android.finsky.protos.ib;
import com.google.android.finsky.protos.id;
import com.google.android.finsky.protos.is;
import com.google.android.finsky.protos.it;
import com.google.android.finsky.protos.je;
import com.google.android.finsky.protos.jj;
import com.google.android.finsky.protos.jk;
import com.google.android.finsky.protos.jr;
import com.google.android.finsky.protos.jt;
import com.google.android.finsky.protos.ju;
import com.google.android.finsky.protos.jz;
import com.google.android.finsky.protos.ks;
import com.google.android.finsky.protos.li;
import com.google.android.finsky.protos.lo;
import com.google.android.finsky.protos.ls;
import com.google.android.finsky.protos.lt;
import com.google.android.finsky.protos.ma;
import com.google.android.finsky.protos.me;
import com.google.android.finsky.protos.mf;
import com.google.android.finsky.protos.mi;
import com.google.android.finsky.protos.mj;
import com.google.android.finsky.protos.mk;
import com.google.android.finsky.protos.mm;
import com.google.android.finsky.protos.mn;
import com.google.android.finsky.protos.mo;
import com.google.android.finsky.protos.mz;
import com.google.android.finsky.protos.np;
import com.google.android.finsky.protos.nw;
import com.google.android.finsky.protos.nx;
import com.google.android.finsky.protos.nz;
import com.google.android.finsky.protos.ob;
import com.google.android.finsky.protos.od;
import com.google.android.finsky.protos.og;
import com.google.android.finsky.protos.oj;
import com.google.android.finsky.protos.on;
import com.google.android.finsky.protos.ou;
import com.google.android.finsky.protos.ow;
import com.google.android.finsky.protos.ox;
import com.google.android.finsky.protos.oz;
import com.google.android.finsky.protos.pm;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.protos.qe;
import com.google.android.finsky.protos.qf;
import com.google.android.finsky.protos.qi;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.protos.qp;
import com.google.android.finsky.protos.qq;
import com.google.android.finsky.protos.qr;
import com.google.android.finsky.protos.qs;
import com.google.android.finsky.protos.qw;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f1951a = Uri.parse("https://android.clients.google.com/fdfe/");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f1952b = Uri.parse("toc");
    public static final Uri c = Uri.parse("selfUpdate");
    public static final Uri d = Uri.parse("search");
    public static final Uri e = Uri.parse("searchSuggest");
    public static final Uri f = Uri.parse("debugSettings");
    public static final Uri g = Uri.parse("myAccount");
    public static final Uri h = Uri.parse("mySubscriptions");
    public static final Uri i = Uri.parse("myRewards");
    public static final Uri j = Uri.parse("purchaseHistory");
    public static final Uri k = Uri.parse("addReview");
    public static final Uri l = Uri.parse("deleteReview");
    public static final Uri m = Uri.parse("rateReview");
    public static final Uri n = Uri.parse("purchase");
    public static final Uri o = Uri.parse("preparePurchase");
    public static final Uri p = Uri.parse("commitPurchase");
    public static final Uri q = Uri.parse("instantPurchase");
    public static final Uri r = Uri.parse("ees/preparePurchase");
    public static final Uri s = Uri.parse("ees/commitPurchase");
    public static final Uri t = Uri.parse("revoke");
    public static final Uri u = Uri.parse("prepareUserRefund");
    public static final Uri v = Uri.parse("commitUserRefund");
    public static final Uri w = Uri.parse("updateInstrument");
    public static final Uri x = Uri.parse("familyFop");
    public static final Uri y = Uri.parse("checkInstrument");
    public static final Uri z = Uri.parse("getBackupDeviceChoices");
    public static final Uri A = Uri.parse("getBackupDocumentChoices");
    public static final Uri B = Uri.parse("checkPromoOffer");
    public static final Uri C = Uri.parse("checkIabPromo");
    public static final Uri D = Uri.parse("billingProfile");
    public static final Uri E = Uri.parse("log");
    public static final Uri F = Uri.parse("flagContent");
    public static final Uri G = Uri.parse("plusOne");
    public static final Uri H = Uri.parse("ack");
    public static final Uri I = Uri.parse("acceptTos");
    public static final Uri J = Uri.parse("library");
    public static final Uri K = Uri.parse("bulkDetails");
    public static final Uri L = Uri.parse("resolveLink");
    public static final Uri M = Uri.parse("dcbInitiateAssociation");
    public static final Uri N = Uri.parse("dcbVerifyAssociation");
    public static final Uri O = Uri.parse("replicateLibrary");
    public static final Uri P = Uri.parse("delivery");
    public static final Uri Q = Uri.parse("moduleDelivery");
    public static final Uri R = Uri.parse("modifyLibrary");
    public static final Uri S = Uri.parse("consumePurchase");
    public static final Uri T = Uri.parse("inAppPurchaseHistory");
    public static final Uri U = Uri.parse("uploadDeviceConfig");
    public static final Uri V = Uri.parse("earlyUpdate");
    public static final Uri W = Uri.parse("earlyDelivery");
    public static final Uri X = Uri.parse("preloads");
    public static final Uri Y = Uri.parse("redeemCode");
    public static final Uri Z = Uri.parse("contentFilterSettings");
    public static final Uri aa = Uri.parse("verifyAge");
    public static final Uri ab = Uri.parse("ping");
    public static final Uri ac = Uri.parse("survey");
    public static final Uri ad = Uri.parse("dismissSurvey");
    public static final Uri ae = Uri.parse("userSetting");
    public static final Uri af = Uri.parse("userSettings");
    public static final Uri ag = Uri.parse("documentSharingState");
    public static final Uri ah = Uri.parse("updateFamilySharingSettings");
    public static final Uri ai = Uri.parse("getFamilySharingSettings");
    public static final Uri aj = Uri.parse("setFamilyPurchaseSetting");
    public static final Uri ak = Uri.parse("getFamilyPurchaseSetting");
    public static final Uri al = Uri.parse("monetaryGiftDetails");
    public static final Uri am = Uri.parse("apps/checkLicense");
    public static final Uri an = Uri.parse("apps/contentSync");

    com.android.volley.l<?> a(int i2, String str, String str2, com.android.volley.t<bp> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(int i2, String str, String str2, String str3, mi miVar, com.android.volley.t<mj> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(long j2, int i2, com.android.volley.t<gm> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(long j2, com.android.volley.t<nx> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(com.android.volley.t<jz> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(com.android.volley.t<ContentFilters.ContentFilterSettingsResponse> tVar, com.android.volley.s sVar, boolean z2);

    com.android.volley.l<?> a(Document document, int i2, com.android.volley.t<bg> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(bv bvVar, com.android.volley.t<bw> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(gk gkVar, com.android.volley.t<hb> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(gk gkVar, String str, fq fqVar, String str2, com.android.volley.t<qi> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(hj hjVar, com.android.volley.t<hk> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(is isVar, com.android.volley.t<it> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(jj jjVar, com.android.volley.t<jk> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(ls lsVar, com.android.volley.t<lt> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(qe qeVar, qw qwVar, com.android.volley.t<qf> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(qw qwVar, int i2, com.android.volley.t<id> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, int i2, int i3, boolean z2, com.android.volley.t<oj> tVar, com.android.volley.s sVar, p pVar);

    com.android.volley.l<?> a(String str, int i2, String str2, com.android.volley.t<ey> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, int i2, List<String> list, com.android.volley.t<jt> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, int i2, boolean z2, com.android.volley.t<gy> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, com.android.volley.t<on> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, qm qmVar, com.android.volley.t<ay> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, Boolean bool, com.android.volley.t<com.google.android.finsky.protos.a> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, Integer num, Integer num2, String[] strArr, String str2, String str3, String str4, com.android.volley.t<fv> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, String str2, int i2, com.android.volley.t<nz> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, String str2, com.android.volley.t<ep> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, String str2, com.android.volley.t<np> tVar, com.android.volley.s sVar, p pVar);

    com.android.volley.l<?> a(String str, String str2, String str3, int i2, boolean z2, com.android.volley.t<nz> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, String str2, String str3, com.android.volley.t<dk> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, String str2, boolean z2, com.android.volley.t<ca> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, Map<String, String> map, com.android.volley.t<bo> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, boolean z2, int i2, int i3, int i4, com.android.volley.t<nz> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, boolean z2, com.android.volley.t<li> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, boolean z2, boolean z3, Collection<String> collection, com.android.volley.t<gb> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(String str, byte[] bArr, Integer num, Integer num2, String[] strArr, String str2, String str3, String str4, com.android.volley.t<fv> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(Collection<String> collection, String str, com.android.volley.t<jr> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(List<String> list, int[] iArr, boolean z2, com.android.volley.t<ga> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(List<String> list, int[] iArr, boolean z2, String str, boolean z3, com.android.volley.t<ga> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(boolean z2, String str, com.android.volley.t<pw> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> a(ow[] owVarArr, com.android.volley.t<oz> tVar, com.android.volley.s sVar);

    e a();

    n<?> a(ez ezVar, int i2, com.android.volley.t<fa> tVar, com.android.volley.s sVar);

    n<?> a(mm mmVar, com.android.volley.t<mn> tVar, com.android.volley.s sVar);

    n<?> a(qp qpVar, com.android.volley.t<qq> tVar, com.android.volley.s sVar);

    n<?> a(qr qrVar, com.android.volley.t<qs> tVar, com.android.volley.s sVar);

    n<?> a(String str, int i2, long j2, com.android.volley.t<dl> tVar, com.android.volley.s sVar);

    n<?> a(String str, int i2, String str2, mk mkVar, ma maVar, String str3, int i3, VoucherParams voucherParams, int i4, String str4, Map<String, String> map, com.android.volley.t<mo> tVar, com.android.volley.s sVar);

    n<?> a(String str, Map<String, String> map, ma maVar, mf mfVar, String str2, boolean z2, qw qwVar, com.android.volley.t<me> tVar, com.android.volley.s sVar);

    String a(int i2, String str, int i3, byte[] bArr);

    void a(String str);

    void a(String str, boolean z2, int i2, int i3, int i4);

    Account b();

    com.android.volley.l<?> b(com.android.volley.t<bq> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> b(String str, com.android.volley.t<com.google.android.finsky.protos.b> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> b(String str, qm qmVar, com.android.volley.t<je> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> b(String str, String str2, int i2, com.android.volley.t<ou> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> b(String str, String str2, com.android.volley.t<lo> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> b(String str, Map<String, String> map, com.android.volley.t<dk> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> b(Collection<String> collection, String str, com.android.volley.t<jr> tVar, com.android.volley.s sVar);

    void b(String str);

    com.android.volley.l<?> c(com.android.volley.t<nw> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> c(String str, com.android.volley.t<og> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> c(String str, String str2, com.android.volley.t<ks> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> c(Collection<String> collection, String str, com.android.volley.t<jr> tVar, com.android.volley.s sVar);

    String c();

    com.android.volley.l<?> d(com.android.volley.t<dm> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> d(String str, com.android.volley.t<nz> tVar, com.android.volley.s sVar);

    void d();

    com.android.volley.l<?> e(com.android.volley.t<dk> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> e(String str, com.android.volley.t<ob> tVar, com.android.volley.s sVar);

    void e();

    com.android.volley.l<?> f(com.android.volley.t<ContentFilters.ContentFilterSettingsResponse> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> f(String str, com.android.volley.t<od> tVar, com.android.volley.s sVar);

    void f();

    com.android.volley.l<?> g(com.android.volley.t<pm> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> g(String str, com.android.volley.t<bz> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> h(com.android.volley.t<ox> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> h(String str, com.android.volley.t<fu> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> i(String str, com.android.volley.t<mz> tVar, com.android.volley.s sVar);

    n<?> i(com.android.volley.t<ju> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> j(String str, com.android.volley.t<dk> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> k(String str, com.android.volley.t<ks> tVar, com.android.volley.s sVar);

    com.android.volley.l<?> l(String str, com.android.volley.t<ib> tVar, com.android.volley.s sVar);
}
