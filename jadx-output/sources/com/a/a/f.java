package com.a.a;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProxySelector;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    final y f1025a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f1026b;
    ab c;
    com.a.a.a.a.o d;
    private boolean e;

    protected f(y yVar, ab abVar) {
        y yVar2 = new y(yVar);
        if (yVar2.j == null) {
            yVar2.j = ProxySelector.getDefault();
        }
        if (yVar2.k == null) {
            yVar2.k = CookieHandler.getDefault();
        }
        if (yVar2.m == null) {
            yVar2.m = SocketFactory.getDefault();
        }
        if (yVar2.n == null) {
            yVar2.n = yVar.a();
        }
        if (yVar2.o == null) {
            yVar2.o = com.a.a.a.c.b.f987a;
        }
        if (yVar2.p == null) {
            yVar2.p = h.f1029a;
        }
        if (yVar2.q == null) {
            yVar2.q = com.a.a.a.a.a.f888a;
        }
        if (yVar2.r == null) {
            yVar2.r = m.a();
        }
        if (yVar2.f == null) {
            yVar2.f = y.f1053a;
        }
        if (yVar2.g == null) {
            yVar2.g = y.f1054b;
        }
        if (yVar2.s == null) {
            yVar2.s = com.a.a.a.d.f989a;
        }
        this.f1025a = yVar2;
        this.c = abVar;
    }

    public final af a() {
        synchronized (this) {
            if (this.e) {
                throw new IllegalStateException("Already Executed");
            }
            this.e = true;
        }
        try {
            this.f1025a.d.a(this);
            af a2 = new g(this, 0, this.c).a(this.c);
            if (a2 == null) {
                throw new IOException("Canceled");
            }
            return a2;
        } finally {
            this.f1025a.d.b(this);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0773, code lost:
    
        if (r3.k.f1007b.equals("HEAD") == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00b4, code lost:
    
        if ((r2.d() || r2.c() || r2.b() || r2.e()) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04fe A[Catch: IOException -> 0x0078, TryCatch #0 {IOException -> 0x0078, blocks: (B:14:0x0066, B:16:0x006e, B:195:0x0072, B:196:0x0077, B:18:0x00c9, B:20:0x00d7, B:21:0x00e4, B:23:0x00e8, B:25:0x00ff, B:27:0x0107, B:28:0x0111, B:30:0x0117, B:31:0x012c, B:33:0x0134, B:34:0x013b, B:36:0x0149, B:37:0x014e, B:39:0x015d, B:40:0x0166, B:42:0x016a, B:44:0x0174, B:45:0x017c, B:47:0x018c, B:49:0x0190, B:50:0x0195, B:52:0x0199, B:54:0x019d, B:73:0x01a5, B:74:0x01aa, B:56:0x0379, B:58:0x037d, B:60:0x038b, B:62:0x039f, B:64:0x03a8, B:65:0x03b4, B:67:0x0391, B:68:0x039e, B:71:0x03e8, B:75:0x03ff, B:77:0x040d, B:79:0x0413, B:81:0x0417, B:90:0x0426, B:91:0x042d, B:87:0x0434, B:88:0x045b, B:92:0x0463, B:93:0x0475, B:95:0x0479, B:96:0x0487, B:98:0x048b, B:99:0x04af, B:100:0x04b8, B:101:0x01ae, B:103:0x01b6, B:105:0x01bc, B:106:0x01c6, B:108:0x01d0, B:109:0x01da, B:111:0x01e4, B:113:0x01f7, B:115:0x01fb, B:116:0x020a, B:118:0x020f, B:119:0x021c, B:121:0x0234, B:122:0x023d, B:124:0x0242, B:125:0x0250, B:127:0x0257, B:128:0x0261, B:130:0x026f, B:132:0x027b, B:133:0x0288, B:135:0x028c, B:137:0x0293, B:139:0x029e, B:142:0x02ac, B:144:0x02b7, B:148:0x02be, B:150:0x02c5, B:151:0x0334, B:153:0x033e, B:154:0x0345, B:156:0x0349, B:157:0x0350, B:159:0x035a, B:160:0x0370, B:161:0x0364, B:163:0x0368, B:166:0x02d6, B:168:0x02da, B:170:0x02de, B:171:0x02e4, B:174:0x02f6, B:175:0x02f9, B:177:0x02fd, B:179:0x030b, B:181:0x030f, B:182:0x0315, B:184:0x0322, B:186:0x0327, B:189:0x01ec, B:191:0x00f0, B:193:0x00f8, B:197:0x0443, B:199:0x044b, B:201:0x044f, B:204:0x0453, B:205:0x045a, B:206:0x04e2, B:208:0x04e6, B:210:0x04ea, B:211:0x04f1, B:212:0x04f5, B:214:0x04fe, B:216:0x0506, B:217:0x0600, B:218:0x0607, B:220:0x0639, B:222:0x0643, B:224:0x064d, B:226:0x0659, B:228:0x0661, B:230:0x0669, B:231:0x067c, B:232:0x066e, B:234:0x0674, B:235:0x0688, B:237:0x068e, B:238:0x0572, B:240:0x0576, B:241:0x0586, B:243:0x058a, B:245:0x0598, B:246:0x059d, B:248:0x05a5, B:250:0x05b1, B:252:0x05b7, B:253:0x05d5, B:254:0x05dc, B:256:0x05e0, B:258:0x05e4, B:259:0x05e9, B:261:0x05ef, B:262:0x05fa), top: B:13:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0639 A[Catch: IOException -> 0x0078, TryCatch #0 {IOException -> 0x0078, blocks: (B:14:0x0066, B:16:0x006e, B:195:0x0072, B:196:0x0077, B:18:0x00c9, B:20:0x00d7, B:21:0x00e4, B:23:0x00e8, B:25:0x00ff, B:27:0x0107, B:28:0x0111, B:30:0x0117, B:31:0x012c, B:33:0x0134, B:34:0x013b, B:36:0x0149, B:37:0x014e, B:39:0x015d, B:40:0x0166, B:42:0x016a, B:44:0x0174, B:45:0x017c, B:47:0x018c, B:49:0x0190, B:50:0x0195, B:52:0x0199, B:54:0x019d, B:73:0x01a5, B:74:0x01aa, B:56:0x0379, B:58:0x037d, B:60:0x038b, B:62:0x039f, B:64:0x03a8, B:65:0x03b4, B:67:0x0391, B:68:0x039e, B:71:0x03e8, B:75:0x03ff, B:77:0x040d, B:79:0x0413, B:81:0x0417, B:90:0x0426, B:91:0x042d, B:87:0x0434, B:88:0x045b, B:92:0x0463, B:93:0x0475, B:95:0x0479, B:96:0x0487, B:98:0x048b, B:99:0x04af, B:100:0x04b8, B:101:0x01ae, B:103:0x01b6, B:105:0x01bc, B:106:0x01c6, B:108:0x01d0, B:109:0x01da, B:111:0x01e4, B:113:0x01f7, B:115:0x01fb, B:116:0x020a, B:118:0x020f, B:119:0x021c, B:121:0x0234, B:122:0x023d, B:124:0x0242, B:125:0x0250, B:127:0x0257, B:128:0x0261, B:130:0x026f, B:132:0x027b, B:133:0x0288, B:135:0x028c, B:137:0x0293, B:139:0x029e, B:142:0x02ac, B:144:0x02b7, B:148:0x02be, B:150:0x02c5, B:151:0x0334, B:153:0x033e, B:154:0x0345, B:156:0x0349, B:157:0x0350, B:159:0x035a, B:160:0x0370, B:161:0x0364, B:163:0x0368, B:166:0x02d6, B:168:0x02da, B:170:0x02de, B:171:0x02e4, B:174:0x02f6, B:175:0x02f9, B:177:0x02fd, B:179:0x030b, B:181:0x030f, B:182:0x0315, B:184:0x0322, B:186:0x0327, B:189:0x01ec, B:191:0x00f0, B:193:0x00f8, B:197:0x0443, B:199:0x044b, B:201:0x044f, B:204:0x0453, B:205:0x045a, B:206:0x04e2, B:208:0x04e6, B:210:0x04ea, B:211:0x04f1, B:212:0x04f5, B:214:0x04fe, B:216:0x0506, B:217:0x0600, B:218:0x0607, B:220:0x0639, B:222:0x0643, B:224:0x064d, B:226:0x0659, B:228:0x0661, B:230:0x0669, B:231:0x067c, B:232:0x066e, B:234:0x0674, B:235:0x0688, B:237:0x068e, B:238:0x0572, B:240:0x0576, B:241:0x0586, B:243:0x058a, B:245:0x0598, B:246:0x059d, B:248:0x05a5, B:250:0x05b1, B:252:0x05b7, B:253:0x05d5, B:254:0x05dc, B:256:0x05e0, B:258:0x05e4, B:259:0x05e9, B:261:0x05ef, B:262:0x05fa), top: B:13:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0734 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0721 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.a.a.af a(com.a.a.ab r21) {
        /*
            Method dump skipped, instructions count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.f.a(com.a.a.ab):com.a.a.af");
    }
}
