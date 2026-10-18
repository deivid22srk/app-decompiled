package com.caverock.androidsvg;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

/* loaded from: classes.dex */
public final class cw extends DefaultHandler2 {
    private int d;

    /* renamed from: a, reason: collision with root package name */
    private q f1354a = null;

    /* renamed from: b, reason: collision with root package name */
    private bj f1355b = null;
    private boolean c = false;
    private boolean e = false;
    private dd f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;
    private Set<String> j = null;

    /* JADX WARN: Can't wrap try/catch for region: R(7:(8:8|9|10|11|12|13|14|15)|10|11|12|13|14|15) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.caverock.androidsvg.q a(java.io.InputStream r6) {
        /*
            r5 = this;
            boolean r0 = r6.markSupported()
            if (r0 != 0) goto L8f
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r6)
        Lb:
            r0 = 3
            r1.mark(r0)     // Catch: java.io.IOException -> L49
            int r0 = r1.read()     // Catch: java.io.IOException -> L49
            int r2 = r1.read()     // Catch: java.io.IOException -> L49
            int r2 = r2 << 8
            int r0 = r0 + r2
            r1.reset()     // Catch: java.io.IOException -> L49
            r2 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r2) goto L4a
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L49
            r0.<init>(r1)     // Catch: java.io.IOException -> L49
        L27:
            javax.xml.parsers.SAXParserFactory r1 = javax.xml.parsers.SAXParserFactory.newInstance()
            javax.xml.parsers.SAXParser r1 = r1.newSAXParser()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5e javax.xml.parsers.ParserConfigurationException -> L63 org.xml.sax.SAXException -> L6c
            org.xml.sax.XMLReader r1 = r1.getXMLReader()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5e javax.xml.parsers.ParserConfigurationException -> L63 org.xml.sax.SAXException -> L6c
            r1.setContentHandler(r5)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5e javax.xml.parsers.ParserConfigurationException -> L63 org.xml.sax.SAXException -> L6c
            java.lang.String r2 = "http://xml.org/sax/properties/lexical-handler"
            r1.setProperty(r2, r5)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5e javax.xml.parsers.ParserConfigurationException -> L63 org.xml.sax.SAXException -> L6c
            org.xml.sax.InputSource r2 = new org.xml.sax.InputSource     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5e javax.xml.parsers.ParserConfigurationException -> L63 org.xml.sax.SAXException -> L6c
            r2.<init>(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5e javax.xml.parsers.ParserConfigurationException -> L63 org.xml.sax.SAXException -> L6c
            r1.parse(r2)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L5e javax.xml.parsers.ParserConfigurationException -> L63 org.xml.sax.SAXException -> L6c
            r0.close()     // Catch: java.io.IOException -> L4c
        L46:
            com.caverock.androidsvg.q r0 = r5.f1354a
            return r0
        L49:
            r0 = move-exception
        L4a:
            r0 = r1
            goto L27
        L4c:
            r0 = move-exception
            java.lang.String r0 = "SVGParser"
            java.lang.String r1 = "Exception thrown closing input stream"
            android.util.Log.e(r0, r1)
            goto L46
        L55:
            r1 = move-exception
            com.caverock.androidsvg.SVGParseException r2 = new com.caverock.androidsvg.SVGParseException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "File error"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L5e:
            r1 = move-exception
            r0.close()     // Catch: java.io.IOException -> L86
        L62:
            throw r1
        L63:
            r1 = move-exception
            com.caverock.androidsvg.SVGParseException r2 = new com.caverock.androidsvg.SVGParseException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "XML Parser problem"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L6c:
            r1 = move-exception
            com.caverock.androidsvg.SVGParseException r2 = new com.caverock.androidsvg.SVGParseException     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "SVG parse error: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r1.getMessage()     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L86:
            r0 = move-exception
            java.lang.String r0 = "SVGParser"
            java.lang.String r2 = "Exception thrown closing input stream"
            android.util.Log.e(r0, r2)
            goto L62
        L8f:
            r1 = r6
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.cw.a(java.io.InputStream):com.caverock.androidsvg.q");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.f1354a = new q();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            dd a2 = dd.a(str2);
            switch (cx.f1356a[a2.ordinal()]) {
                case 1:
                    bf bfVar = new bf();
                    bfVar.u = this.f1354a;
                    bfVar.v = this.f1355b;
                    a((bl) bfVar, attributes);
                    b(bfVar, attributes);
                    a((bg) bfVar, attributes);
                    a((br) bfVar, attributes);
                    for (int i = 0; i < attributes.getLength(); i++) {
                        String trim = attributes.getValue(i).trim();
                        switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                            case 1:
                                bfVar.f1313a = c(trim);
                                break;
                            case 2:
                                bfVar.f1314b = c(trim);
                                break;
                            case 3:
                                bfVar.c = c(trim);
                                if (bfVar.c.b()) {
                                    throw new SAXException("Invalid <svg> element. width cannot be negative");
                                }
                                break;
                            case 4:
                                bfVar.d = c(trim);
                                if (bfVar.d.b()) {
                                    throw new SAXException("Invalid <svg> element. height cannot be negative");
                                }
                                break;
                            case 5:
                                bfVar.e = trim;
                                break;
                        }
                    }
                    if (this.f1355b != null) {
                        this.f1355b.a(bfVar);
                    } else {
                        this.f1354a.f1391a = bfVar;
                    }
                    this.f1355b = bfVar;
                    return;
                case 2:
                case 3:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ad adVar = new ad();
                    adVar.u = this.f1354a;
                    adVar.v = this.f1355b;
                    a((bl) adVar, attributes);
                    b(adVar, attributes);
                    a((ae) adVar, attributes);
                    a((bg) adVar, attributes);
                    this.f1355b.a(adVar);
                    this.f1355b = adVar;
                    return;
                case 4:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    y yVar = new y();
                    yVar.u = this.f1354a;
                    yVar.v = this.f1355b;
                    a((bl) yVar, attributes);
                    b(yVar, attributes);
                    a((ae) yVar, attributes);
                    this.f1355b.a(yVar);
                    this.f1355b = yVar;
                    return;
                case 5:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ce ceVar = new ce();
                    ceVar.u = this.f1354a;
                    ceVar.v = this.f1355b;
                    a((bl) ceVar, attributes);
                    b(ceVar, attributes);
                    a((ae) ceVar, attributes);
                    a((bg) ceVar, attributes);
                    a(ceVar, attributes);
                    this.f1355b.a(ceVar);
                    this.f1355b = ceVar;
                    return;
                case 6:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    am amVar = new am();
                    amVar.u = this.f1354a;
                    amVar.v = this.f1355b;
                    a((bl) amVar, attributes);
                    b(amVar, attributes);
                    a((ae) amVar, attributes);
                    a((bg) amVar, attributes);
                    a(amVar, attributes);
                    this.f1355b.a(amVar);
                    return;
                case 7:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    as asVar = new as();
                    asVar.u = this.f1354a;
                    asVar.v = this.f1355b;
                    a((bl) asVar, attributes);
                    b(asVar, attributes);
                    a((ae) asVar, attributes);
                    a((bg) asVar, attributes);
                    a(asVar, attributes);
                    this.f1355b.a(asVar);
                    return;
                case 8:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    u uVar = new u();
                    uVar.u = this.f1354a;
                    uVar.v = this.f1355b;
                    a((bl) uVar, attributes);
                    b(uVar, attributes);
                    a((ae) uVar, attributes);
                    a((bg) uVar, attributes);
                    a(uVar, attributes);
                    this.f1355b.a(uVar);
                    return;
                case 9:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    z zVar = new z();
                    zVar.u = this.f1354a;
                    zVar.v = this.f1355b;
                    a((bl) zVar, attributes);
                    b(zVar, attributes);
                    a((ae) zVar, attributes);
                    a((bg) zVar, attributes);
                    a(zVar, attributes);
                    this.f1355b.a(zVar);
                    return;
                case 10:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ah ahVar = new ah();
                    ahVar.u = this.f1354a;
                    ahVar.v = this.f1355b;
                    a((bl) ahVar, attributes);
                    b(ahVar, attributes);
                    a((ae) ahVar, attributes);
                    a((bg) ahVar, attributes);
                    a(ahVar, attributes);
                    this.f1355b.a(ahVar);
                    return;
                case 11:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    aq aqVar = new aq();
                    aqVar.u = this.f1354a;
                    aqVar.v = this.f1355b;
                    a((bl) aqVar, attributes);
                    b(aqVar, attributes);
                    a((ae) aqVar, attributes);
                    a((bg) aqVar, attributes);
                    a(aqVar, attributes, "polyline");
                    this.f1355b.a(aqVar);
                    return;
                case 12:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ar arVar = new ar();
                    arVar.u = this.f1354a;
                    arVar.v = this.f1355b;
                    a((bl) arVar, attributes);
                    b(arVar, attributes);
                    a((ae) arVar, attributes);
                    a((bg) arVar, attributes);
                    a(arVar, attributes, "polygon");
                    this.f1355b.a(arVar);
                    return;
                case 13:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bw bwVar = new bw();
                    bwVar.u = this.f1354a;
                    bwVar.v = this.f1355b;
                    a((bl) bwVar, attributes);
                    b(bwVar, attributes);
                    a((ae) bwVar, attributes);
                    a((bg) bwVar, attributes);
                    a((ca) bwVar, attributes);
                    this.f1355b.a(bwVar);
                    this.f1355b = bwVar;
                    return;
                case 14:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    if (!(this.f1355b instanceof by)) {
                        throw new SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    bv bvVar = new bv();
                    bvVar.u = this.f1354a;
                    bvVar.v = this.f1355b;
                    a((bl) bvVar, attributes);
                    b(bvVar, attributes);
                    a((bg) bvVar, attributes);
                    a((ca) bvVar, attributes);
                    this.f1355b.a(bvVar);
                    this.f1355b = bvVar;
                    if (bvVar.v instanceof cb) {
                        bvVar.f1317a = (cb) bvVar.v;
                        return;
                    } else {
                        bvVar.f1317a = ((bx) bvVar.v).g();
                        return;
                    }
                case 15:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    if (!(this.f1355b instanceof by)) {
                        throw new SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    bu buVar = new bu();
                    buVar.u = this.f1354a;
                    buVar.v = this.f1355b;
                    a((bl) buVar, attributes);
                    b(buVar, attributes);
                    a((bg) buVar, attributes);
                    a(buVar, attributes);
                    this.f1355b.a(buVar);
                    if (buVar.v instanceof cb) {
                        buVar.f1316b = (cb) buVar.v;
                        return;
                    } else {
                        buVar.f1316b = ((bx) buVar.v).g();
                        return;
                    }
                case 16:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bs bsVar = new bs();
                    bsVar.u = this.f1354a;
                    bsVar.v = this.f1355b;
                    a((bl) bsVar, attributes);
                    b(bsVar, attributes);
                    a((ae) bsVar, attributes);
                    a((bg) bsVar, attributes);
                    this.f1355b.a(bsVar);
                    this.f1355b = bsVar;
                    return;
                case 17:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bt btVar = new bt();
                    btVar.u = this.f1354a;
                    btVar.v = this.f1355b;
                    a((bl) btVar, attributes);
                    b(btVar, attributes);
                    a((bg) btVar, attributes);
                    a((br) btVar, attributes);
                    this.f1355b.a(btVar);
                    this.f1355b = btVar;
                    return;
                case 18:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ai aiVar = new ai();
                    aiVar.u = this.f1354a;
                    aiVar.v = this.f1355b;
                    a((bl) aiVar, attributes);
                    b(aiVar, attributes);
                    a((bg) aiVar, attributes);
                    a((br) aiVar, attributes);
                    a(aiVar, attributes);
                    this.f1355b.a(aiVar);
                    this.f1355b = aiVar;
                    return;
                case 19:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bm bmVar = new bm();
                    bmVar.u = this.f1354a;
                    bmVar.v = this.f1355b;
                    a((bl) bmVar, attributes);
                    b(bmVar, attributes);
                    a((aa) bmVar, attributes);
                    a(bmVar, attributes);
                    this.f1355b.a(bmVar);
                    this.f1355b = bmVar;
                    return;
                case 20:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bq bqVar = new bq();
                    bqVar.u = this.f1354a;
                    bqVar.v = this.f1355b;
                    a((bl) bqVar, attributes);
                    b(bqVar, attributes);
                    a((aa) bqVar, attributes);
                    a(bqVar, attributes);
                    this.f1355b.a(bqVar);
                    this.f1355b = bqVar;
                    return;
                case 21:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    if (!(this.f1355b instanceof aa)) {
                        throw new SAXException("Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements.");
                    }
                    av avVar = new av();
                    avVar.u = this.f1354a;
                    avVar.v = this.f1355b;
                    a((bl) avVar, attributes);
                    b(avVar, attributes);
                    a(avVar, attributes);
                    this.f1355b.a(avVar);
                    this.f1355b = avVar;
                    return;
                case 22:
                case 23:
                    this.e = true;
                    this.f = a2;
                    return;
                case 24:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    v vVar = new v();
                    vVar.u = this.f1354a;
                    vVar.v = this.f1355b;
                    a((bl) vVar, attributes);
                    b(vVar, attributes);
                    a((ae) vVar, attributes);
                    a((bg) vVar, attributes);
                    a(vVar, attributes);
                    this.f1355b.a(vVar);
                    this.f1355b = vVar;
                    return;
                case 25:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bz bzVar = new bz();
                    bzVar.u = this.f1354a;
                    bzVar.v = this.f1355b;
                    a((bl) bzVar, attributes);
                    b(bzVar, attributes);
                    a((bg) bzVar, attributes);
                    a(bzVar, attributes);
                    this.f1355b.a(bzVar);
                    this.f1355b = bzVar;
                    if (bzVar.v instanceof cb) {
                        bzVar.c = (cb) bzVar.v;
                        return;
                    } else {
                        bzVar.c = ((bx) bzVar.v).g();
                        return;
                    }
                case 26:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ap apVar = new ap();
                    apVar.u = this.f1354a;
                    apVar.v = this.f1355b;
                    a((bl) apVar, attributes);
                    b(apVar, attributes);
                    a((bg) apVar, attributes);
                    a((br) apVar, attributes);
                    a(apVar, attributes);
                    this.f1355b.a(apVar);
                    this.f1355b = apVar;
                    return;
                case 27:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    af afVar = new af();
                    afVar.u = this.f1354a;
                    afVar.v = this.f1355b;
                    a((bl) afVar, attributes);
                    b(afVar, attributes);
                    a((ae) afVar, attributes);
                    a((bg) afVar, attributes);
                    a(afVar, attributes);
                    this.f1355b.a(afVar);
                    this.f1355b = afVar;
                    return;
                case 28:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    cf cfVar = new cf();
                    cfVar.u = this.f1354a;
                    cfVar.v = this.f1355b;
                    a((bl) cfVar, attributes);
                    a((bg) cfVar, attributes);
                    a((br) cfVar, attributes);
                    this.f1355b.a(cfVar);
                    this.f1355b = cfVar;
                    return;
                case 29:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    aj ajVar = new aj();
                    ajVar.u = this.f1354a;
                    ajVar.v = this.f1355b;
                    a((bl) ajVar, attributes);
                    b(ajVar, attributes);
                    a((bg) ajVar, attributes);
                    a(ajVar, attributes);
                    this.f1355b.a(ajVar);
                    this.f1355b = ajVar;
                    return;
                case 30:
                    a(attributes);
                    return;
                case 31:
                    if (this.f1355b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    au auVar = new au();
                    auVar.u = this.f1354a;
                    auVar.v = this.f1355b;
                    a(auVar, attributes);
                    b(auVar, attributes);
                    this.f1355b.a(auVar);
                    this.f1355b = auVar;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (!this.c) {
            if (this.e) {
                if (this.g == null) {
                    this.g = new StringBuilder(i2);
                }
                this.g.append(cArr, i, i2);
                return;
            }
            if (this.h) {
                if (this.i == null) {
                    this.i = new StringBuilder(i2);
                }
                this.i.append(cArr, i, i2);
            } else if (this.f1355b instanceof by) {
                bh bhVar = (bh) this.f1355b;
                int size = bhVar.i.size();
                bn bnVar = size == 0 ? null : bhVar.i.get(size - 1);
                if (bnVar instanceof cc) {
                    ((cc) bnVar).f1324a += new String(cArr, i, i2);
                } else {
                    ((bh) this.f1355b).a(new cc(new String(cArr, i, i2)));
                }
            }
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        if (!this.c && this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            switch (cx.f1356a[dd.a(str2).ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 13:
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                    this.f1355b = ((bn) this.f1355b).v;
                    break;
                case 22:
                case 23:
                    this.e = false;
                    if (this.f == dd.title) {
                        this.f1354a.f1392b = this.g.toString();
                    } else if (this.f == dd.desc) {
                        this.f1354a.c = this.g.toString();
                    }
                    this.g.setLength(0);
                    break;
                case 30:
                    if (this.i != null) {
                        this.h = false;
                        String sb = this.i.toString();
                        a aVar = new a(g.screen);
                        q qVar = this.f1354a;
                        e eVar = new e(sb);
                        eVar.d();
                        qVar.e.a(aVar.b(eVar));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    private static void a(ce ceVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 1:
                    ceVar.c = c(trim);
                    break;
                case 2:
                    ceVar.d = c(trim);
                    break;
                case 3:
                    ceVar.e = c(trim);
                    if (ceVar.e.b()) {
                        throw new SAXException("Invalid <use> element. width cannot be negative");
                    }
                    break;
                case 4:
                    ceVar.f = c(trim);
                    if (ceVar.f.b()) {
                        throw new SAXException("Invalid <use> element. height cannot be negative");
                    }
                    break;
                case 6:
                    if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        ceVar.f1328a = trim;
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    private static void a(af afVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 1:
                    afVar.f1271b = c(trim);
                    break;
                case 2:
                    afVar.c = c(trim);
                    break;
                case 3:
                    afVar.d = c(trim);
                    if (afVar.d.b()) {
                        throw new SAXException("Invalid <use> element. width cannot be negative");
                    }
                    break;
                case 4:
                    afVar.e = c(trim);
                    if (afVar.e.b()) {
                        throw new SAXException("Invalid <use> element. height cannot be negative");
                    }
                    break;
                case 6:
                    if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        afVar.f1270a = trim;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    a(afVar, trim);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.caverock.androidsvg.am r18, org.xml.sax.Attributes r19) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.cw.a(com.caverock.androidsvg.am, org.xml.sax.Attributes):void");
    }

    private static void a(as asVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 1:
                    asVar.f1289a = c(trim);
                    break;
                case 2:
                    asVar.f1290b = c(trim);
                    break;
                case 3:
                    asVar.c = c(trim);
                    if (asVar.c.b()) {
                        throw new SAXException("Invalid <rect> element. width cannot be negative");
                    }
                    break;
                case 4:
                    asVar.d = c(trim);
                    if (asVar.d.b()) {
                        throw new SAXException("Invalid <rect> element. height cannot be negative");
                    }
                    break;
                case 10:
                    asVar.f = c(trim);
                    if (asVar.f.b()) {
                        throw new SAXException("Invalid <rect> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    asVar.g = c(trim);
                    if (asVar.g.b()) {
                        throw new SAXException("Invalid <rect> element. ry cannot be negative");
                    }
                    break;
            }
        }
    }

    private static void a(u uVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    uVar.f1398a = c(trim);
                    break;
                case 13:
                    uVar.f1399b = c(trim);
                    break;
                case 14:
                    uVar.c = c(trim);
                    if (uVar.c.b()) {
                        throw new SAXException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    private static void a(z zVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    zVar.c = c(trim);
                    if (zVar.c.b()) {
                        throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    zVar.d = c(trim);
                    if (zVar.d.b()) {
                        throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    zVar.f1404a = c(trim);
                    break;
                case 13:
                    zVar.f1405b = c(trim);
                    break;
            }
        }
    }

    private static void a(ah ahVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    ahVar.f1274a = c(trim);
                    break;
                case 16:
                    ahVar.f1275b = c(trim);
                    break;
                case 17:
                    ahVar.c = c(trim);
                    break;
                case 18:
                    ahVar.d = c(trim);
                    break;
            }
        }
    }

    private static void a(aq aqVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (dc.a(attributes.getLocalName(i)) == dc.points) {
                de deVar = new de(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                deVar.d();
                while (!deVar.c()) {
                    float f = deVar.f();
                    if (Float.isNaN(f)) {
                        throw new SAXException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    deVar.e();
                    float f2 = deVar.f();
                    if (Float.isNaN(f2)) {
                        throw new SAXException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    deVar.e();
                    arrayList.add(Float.valueOf(f));
                    arrayList.add(Float.valueOf(f2));
                }
                aqVar.f1288a = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    aqVar.f1288a[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    private static void a(ca caVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 1:
                    caVar.f1323b = d(trim);
                    break;
                case 2:
                    caVar.c = d(trim);
                    break;
                case 19:
                    caVar.d = d(trim);
                    break;
                case 20:
                    caVar.e = d(trim);
                    break;
            }
        }
    }

    private static void a(bu buVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 6:
                    if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        buVar.f1315a = trim;
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    private static void a(bg bgVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    de deVar = new de(trim);
                    HashSet hashSet = new HashSet();
                    while (!deVar.c()) {
                        String k = deVar.k();
                        if (k.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(k.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        deVar.d();
                    }
                    bgVar.a(hashSet);
                    break;
                case 22:
                    bgVar.a(trim);
                    break;
                case 23:
                    bgVar.b(n(trim));
                    break;
                case 24:
                    bgVar.c(o(trim));
                    break;
                case 25:
                    List<String> i2 = i(trim);
                    bgVar.d(i2 != null ? new HashSet<>(i2) : new HashSet<>(0));
                    break;
            }
        }
    }

    private static void a(ai aiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    aiVar.f1277b = c(trim);
                    break;
                case 27:
                    aiVar.c = c(trim);
                    break;
                case 28:
                    aiVar.d = c(trim);
                    if (aiVar.d.b()) {
                        throw new SAXException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    aiVar.e = c(trim);
                    if (aiVar.e.b()) {
                        throw new SAXException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if ("strokeWidth".equals(trim)) {
                        aiVar.f1276a = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        aiVar.f1276a = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute markerUnits");
                    }
                case 31:
                    if ("auto".equals(trim)) {
                        aiVar.f = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        aiVar.f = Float.valueOf(e(trim));
                        break;
                    }
            }
        }
    }

    private static void a(aa aaVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 6:
                    if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        aaVar.e = trim;
                        break;
                    } else {
                        break;
                    }
                case 32:
                    if ("objectBoundingBox".equals(trim)) {
                        aaVar.f1266b = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        aaVar.f1266b = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute gradientUnits");
                    }
                case 33:
                    aaVar.c = b(trim);
                    break;
                case 34:
                    try {
                        aaVar.d = ab.valueOf(trim);
                        break;
                    } catch (IllegalArgumentException e) {
                        throw new SAXException("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                    }
            }
        }
    }

    private static void a(bm bmVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    bmVar.f = c(trim);
                    break;
                case 16:
                    bmVar.g = c(trim);
                    break;
                case 17:
                    bmVar.h = c(trim);
                    break;
                case 18:
                    bmVar.i = c(trim);
                    break;
            }
        }
    }

    private static void a(bq bqVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    bqVar.f = c(trim);
                    break;
                case 13:
                    bqVar.g = c(trim);
                    break;
                case 14:
                    bqVar.h = c(trim);
                    if (bqVar.h.b()) {
                        throw new SAXException("Invalid <radialGradient> element. r cannot be negative");
                    }
                    break;
                case 35:
                    bqVar.i = c(trim);
                    break;
                case 36:
                    bqVar.j = c(trim);
                    break;
            }
        }
    }

    private static void a(av avVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 37:
                    avVar.f1293a = a(trim);
                    break;
            }
        }
    }

    private static Float a(String str) {
        int i;
        boolean z;
        if (str.length() == 0) {
            throw new SAXException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        if (str.charAt(str.length() - 1) != '%') {
            i = length;
            z = false;
        } else {
            i = length - 1;
            z = true;
        }
        try {
            float a2 = a(str, i);
            if (z) {
                a2 /= 100.0f;
            }
            return Float.valueOf(a2 >= 0.0f ? a2 > 100.0f ? 100.0f : a2 : 0.0f);
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid offset value in <stop>: " + str, e);
        }
    }

    private static void a(v vVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 38:
                    if ("objectBoundingBox".equals(trim)) {
                        vVar.f1400a = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        vVar.f1400a = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute clipPathUnits");
                    }
            }
        }
    }

    private static void a(bz bzVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 6:
                    if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        bzVar.f1319a = trim;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    bzVar.f1320b = c(trim);
                    break;
            }
        }
    }

    private static void a(ap apVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 1:
                    apVar.d = c(trim);
                    break;
                case 2:
                    apVar.e = c(trim);
                    break;
                case 3:
                    apVar.f = c(trim);
                    if (apVar.f.b()) {
                        throw new SAXException("Invalid <pattern> element. width cannot be negative");
                    }
                    break;
                case 4:
                    apVar.g = c(trim);
                    if (apVar.g.b()) {
                        throw new SAXException("Invalid <pattern> element. height cannot be negative");
                    }
                    break;
                case 6:
                    if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        apVar.h = trim;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    if ("objectBoundingBox".equals(trim)) {
                        apVar.f1286a = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        apVar.f1286a = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute patternUnits");
                    }
                case 41:
                    if ("objectBoundingBox".equals(trim)) {
                        apVar.f1287b = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        apVar.f1287b = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute patternContentUnits");
                    }
                case 42:
                    apVar.c = b(trim);
                    break;
            }
        }
    }

    private static void a(aj ajVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 1:
                    ajVar.c = c(trim);
                    break;
                case 2:
                    ajVar.d = c(trim);
                    break;
                case 3:
                    ajVar.e = c(trim);
                    if (ajVar.e.b()) {
                        throw new SAXException("Invalid <mask> element. width cannot be negative");
                    }
                    break;
                case 4:
                    ajVar.f = c(trim);
                    if (ajVar.f.b()) {
                        throw new SAXException("Invalid <mask> element. height cannot be negative");
                    }
                    break;
                case 43:
                    if ("objectBoundingBox".equals(trim)) {
                        ajVar.f1278a = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        ajVar.f1278a = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute maskUnits");
                    }
                case 44:
                    if ("objectBoundingBox".equals(trim)) {
                        ajVar.f1279b = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        ajVar.f1279b = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute maskContentUnits");
                    }
            }
        }
    }

    private static void a(bl blVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                blVar.p = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    blVar.q = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        blVar.q = Boolean.TRUE;
                        return;
                    }
                    throw new SAXException("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    private static void b(bl blVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                    case 45:
                        de deVar = new de(trim.replaceAll("/\\*.*?\\*/", ""));
                        while (true) {
                            String b2 = deVar.b(':');
                            deVar.d();
                            if (deVar.a(':')) {
                                deVar.d();
                                String b3 = deVar.b(';');
                                if (b3 != null) {
                                    deVar.d();
                                    if (deVar.c() || deVar.a(';')) {
                                        if (blVar.s == null) {
                                            blVar.s = new aw();
                                        }
                                        a(blVar.s, b2, b3);
                                        deVar.d();
                                    }
                                }
                            }
                        }
                        break;
                    case 46:
                        e eVar = new e(trim);
                        ArrayList arrayList = null;
                        while (!eVar.c()) {
                            String a2 = eVar.a();
                            if (a2 == null) {
                                throw new SAXException("Invalid value for \"class\" attribute: " + trim);
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(a2);
                            eVar.d();
                        }
                        blVar.t = arrayList;
                        break;
                    default:
                        if (blVar.r == null) {
                            blVar.r = new aw();
                        }
                        a(blVar.r, attributes.getLocalName(i), attributes.getValue(i).trim());
                        break;
                }
            }
        }
    }

    protected static void a(aw awVar, String str, String str2) {
        be beVar;
        Boolean bool;
        bb bbVar;
        bd bdVar;
        bc bcVar;
        ba baVar;
        az azVar;
        t tVar = null;
        if (str2.length() != 0 && !str2.equals("inherit")) {
            switch (cx.f1357b[dc.a(str).ordinal()]) {
                case 47:
                    awVar.f1295b = a(str2, "fill");
                    awVar.f1294a |= 1;
                    return;
                case 48:
                    awVar.c = l(str2);
                    awVar.f1294a |= 2;
                    return;
                case 49:
                    awVar.d = Float.valueOf(f(str2));
                    awVar.f1294a |= 4;
                    return;
                case 50:
                    awVar.e = a(str2, "stroke");
                    awVar.f1294a |= 8;
                    return;
                case 51:
                    awVar.f = Float.valueOf(f(str2));
                    awVar.f1294a |= 16;
                    return;
                case 52:
                    awVar.g = c(str2);
                    awVar.f1294a |= 32;
                    return;
                case 53:
                    if ("butt".equals(str2)) {
                        azVar = az.Butt;
                    } else if ("round".equals(str2)) {
                        azVar = az.Round;
                    } else if ("square".equals(str2)) {
                        azVar = az.Square;
                    } else {
                        throw new SAXException("Invalid stroke-linecap property: " + str2);
                    }
                    awVar.h = azVar;
                    awVar.f1294a |= 64;
                    return;
                case 54:
                    if ("miter".equals(str2)) {
                        baVar = ba.Miter;
                    } else if ("round".equals(str2)) {
                        baVar = ba.Round;
                    } else if ("bevel".equals(str2)) {
                        baVar = ba.Bevel;
                    } else {
                        throw new SAXException("Invalid stroke-linejoin property: " + str2);
                    }
                    awVar.i = baVar;
                    awVar.f1294a |= 128;
                    return;
                case 55:
                    awVar.j = Float.valueOf(e(str2));
                    awVar.f1294a |= 256;
                    return;
                case 56:
                    if ("none".equals(str2)) {
                        awVar.k = null;
                    } else {
                        awVar.k = m(str2);
                    }
                    awVar.f1294a |= 512;
                    return;
                case 57:
                    awVar.l = c(str2);
                    awVar.f1294a |= 1024;
                    return;
                case 58:
                    awVar.m = Float.valueOf(f(str2));
                    awVar.f1294a |= 2048;
                    return;
                case 59:
                    awVar.n = h(str2);
                    awVar.f1294a |= 4096;
                    return;
                case 60:
                    a(awVar, str2);
                    return;
                case 61:
                    awVar.o = i(str2);
                    awVar.f1294a |= 8192;
                    return;
                case 62:
                    awVar.p = j(str2);
                    awVar.f1294a |= 16384;
                    return;
                case 63:
                    Integer a2 = db.a(str2);
                    if (a2 != null) {
                        awVar.q = a2;
                        awVar.f1294a |= 32768;
                        return;
                    }
                    throw new SAXException("Invalid font-weight property: " + str2);
                case 64:
                    ay k = k(str2);
                    if (k != null) {
                        awVar.r = k;
                        awVar.f1294a |= 65536;
                        return;
                    }
                    throw new SAXException("Invalid font-style property: " + str2);
                case 65:
                    if ("none".equals(str2)) {
                        bcVar = bc.None;
                    } else if ("underline".equals(str2)) {
                        bcVar = bc.Underline;
                    } else if ("overline".equals(str2)) {
                        bcVar = bc.Overline;
                    } else if ("line-through".equals(str2)) {
                        bcVar = bc.LineThrough;
                    } else if ("blink".equals(str2)) {
                        bcVar = bc.Blink;
                    } else {
                        throw new SAXException("Invalid text-decoration property: " + str2);
                    }
                    awVar.s = bcVar;
                    awVar.f1294a |= 131072;
                    return;
                case 66:
                    if ("ltr".equals(str2)) {
                        bdVar = bd.LTR;
                    } else if ("rtl".equals(str2)) {
                        bdVar = bd.RTL;
                    } else {
                        throw new SAXException("Invalid direction property: " + str2);
                    }
                    awVar.t = bdVar;
                    awVar.f1294a |= 68719476736L;
                    return;
                case 67:
                    if ("start".equals(str2)) {
                        bbVar = bb.Start;
                    } else if ("middle".equals(str2)) {
                        bbVar = bb.Middle;
                    } else if ("end".equals(str2)) {
                        bbVar = bb.End;
                    } else {
                        throw new SAXException("Invalid text-anchor property: " + str2);
                    }
                    awVar.u = bbVar;
                    awVar.f1294a |= 262144;
                    return;
                case 68:
                    if ("visible".equals(str2) || "auto".equals(str2)) {
                        bool = Boolean.TRUE;
                    } else if ("hidden".equals(str2) || "scroll".equals(str2)) {
                        bool = Boolean.FALSE;
                    } else {
                        throw new SAXException("Invalid toverflow property: " + str2);
                    }
                    awVar.v = bool;
                    awVar.f1294a |= 524288;
                    return;
                case 69:
                    awVar.x = b(str2, str);
                    awVar.y = awVar.x;
                    awVar.z = awVar.x;
                    awVar.f1294a |= 14680064;
                    return;
                case 70:
                    awVar.x = b(str2, str);
                    awVar.f1294a |= 2097152;
                    return;
                case 71:
                    awVar.y = b(str2, str);
                    awVar.f1294a |= 4194304;
                    return;
                case 72:
                    awVar.z = b(str2, str);
                    awVar.f1294a |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) >= 0 || "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf("|" + str2 + '|') == -1) {
                        throw new SAXException("Invalid value for \"display\" attribute: " + str2);
                    }
                    awVar.A = Boolean.valueOf(!str2.equals("none"));
                    awVar.f1294a |= 16777216;
                    return;
                case 74:
                    if (str2.indexOf(124) >= 0 || "|visible|hidden|collapse|".indexOf("|" + str2 + '|') == -1) {
                        throw new SAXException("Invalid value for \"visibility\" attribute: " + str2);
                    }
                    awVar.B = Boolean.valueOf(str2.equals("visible"));
                    awVar.f1294a |= 33554432;
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        awVar.C = x.a();
                    } else {
                        awVar.C = h(str2);
                    }
                    awVar.f1294a |= 67108864;
                    return;
                case 76:
                    awVar.D = Float.valueOf(f(str2));
                    awVar.f1294a |= 134217728;
                    return;
                case 77:
                    if (!"auto".equals(str2)) {
                        if (!str2.toLowerCase(Locale.US).startsWith("rect(")) {
                            throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                        }
                        de deVar = new de(str2.substring(5));
                        deVar.d();
                        ag a3 = a(deVar);
                        deVar.e();
                        ag a4 = a(deVar);
                        deVar.e();
                        ag a5 = a(deVar);
                        deVar.e();
                        ag a6 = a(deVar);
                        deVar.d();
                        if (!deVar.a(')')) {
                            throw new SAXException("Bad rect() clip definition: " + str2);
                        }
                        tVar = new t(a3, a4, a5, a6);
                    }
                    awVar.w = tVar;
                    awVar.f1294a |= 1048576;
                    return;
                case 78:
                    awVar.E = b(str2, str);
                    awVar.f1294a |= 268435456;
                    return;
                case 79:
                    awVar.F = l(str2);
                    awVar.f1294a |= 536870912;
                    return;
                case 80:
                    awVar.G = b(str2, str);
                    awVar.f1294a |= 1073741824;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        awVar.H = x.a();
                    } else {
                        awVar.H = h(str2);
                    }
                    awVar.f1294a |= 2147483648L;
                    return;
                case 82:
                    awVar.I = Float.valueOf(f(str2));
                    awVar.f1294a |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        awVar.J = x.a();
                    } else {
                        awVar.J = h(str2);
                    }
                    awVar.f1294a |= 8589934592L;
                    return;
                case 84:
                    awVar.K = Float.valueOf(f(str2));
                    awVar.f1294a |= 17179869184L;
                    return;
                case 85:
                    if ("none".equals(str2)) {
                        beVar = be.None;
                    } else if ("non-scaling-stroke".equals(str2)) {
                        beVar = be.NonScalingStroke;
                    } else {
                        throw new SAXException("Invalid vector-effect property: " + str2);
                    }
                    awVar.L = beVar;
                    awVar.f1294a |= 34359738368L;
                    return;
                default:
                    return;
            }
        }
    }

    private static void a(br brVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 7:
                    a(brVar, trim);
                    break;
                case 86:
                    de deVar = new de(trim);
                    deVar.d();
                    float f = deVar.f();
                    deVar.e();
                    float f2 = deVar.f();
                    deVar.e();
                    float f3 = deVar.f();
                    deVar.e();
                    float f4 = deVar.f();
                    if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
                        throw new SAXException("Invalid viewBox definition - should have four numbers");
                    }
                    if (f3 < 0.0f) {
                        throw new SAXException("Invalid viewBox. width cannot be negative");
                    }
                    if (f4 >= 0.0f) {
                        brVar.x = new s(f, f2, f3, f4);
                        break;
                    } else {
                        throw new SAXException("Invalid viewBox. height cannot be negative");
                    }
            }
        }
    }

    private static void a(ae aeVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (dc.a(attributes.getLocalName(i)) == dc.transform) {
                aeVar.a(b(attributes.getValue(i)));
            }
        }
    }

    private static Matrix b(String str) {
        Matrix matrix = new Matrix();
        de deVar = new de(str);
        deVar.d();
        while (!deVar.c()) {
            String l = deVar.l();
            if (l == null) {
                throw new SAXException("Bad transform function encountered in transform list: " + str);
            }
            if (l.equals("matrix")) {
                deVar.d();
                float f = deVar.f();
                deVar.e();
                float f2 = deVar.f();
                deVar.e();
                float f3 = deVar.f();
                deVar.e();
                float f4 = deVar.f();
                deVar.e();
                float f5 = deVar.f();
                deVar.e();
                float f6 = deVar.f();
                deVar.d();
                if (Float.isNaN(f6) || !deVar.a(')')) {
                    throw new SAXException("Invalid transform list: " + str);
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{f, f3, f5, f2, f4, f6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (l.equals("translate")) {
                deVar.d();
                float f7 = deVar.f();
                float g = deVar.g();
                deVar.d();
                if (Float.isNaN(f7) || !deVar.a(')')) {
                    throw new SAXException("Invalid transform list: " + str);
                }
                if (Float.isNaN(g)) {
                    matrix.preTranslate(f7, 0.0f);
                } else {
                    matrix.preTranslate(f7, g);
                }
            } else if (l.equals("scale")) {
                deVar.d();
                float f8 = deVar.f();
                float g2 = deVar.g();
                deVar.d();
                if (Float.isNaN(f8) || !deVar.a(')')) {
                    throw new SAXException("Invalid transform list: " + str);
                }
                if (Float.isNaN(g2)) {
                    matrix.preScale(f8, f8);
                } else {
                    matrix.preScale(f8, g2);
                }
            } else if (l.equals("rotate")) {
                deVar.d();
                float f9 = deVar.f();
                float g3 = deVar.g();
                float g4 = deVar.g();
                deVar.d();
                if (Float.isNaN(f9) || !deVar.a(')')) {
                    throw new SAXException("Invalid transform list: " + str);
                }
                if (Float.isNaN(g3)) {
                    matrix.preRotate(f9);
                } else if (!Float.isNaN(g4)) {
                    matrix.preRotate(f9, g3, g4);
                } else {
                    throw new SAXException("Invalid transform list: " + str);
                }
            } else if (l.equals("skewX")) {
                deVar.d();
                float f10 = deVar.f();
                deVar.d();
                if (Float.isNaN(f10) || !deVar.a(')')) {
                    throw new SAXException("Invalid transform list: " + str);
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(f10)), 0.0f);
            } else if (l.equals("skewY")) {
                deVar.d();
                float f11 = deVar.f();
                deVar.d();
                if (Float.isNaN(f11) || !deVar.a(')')) {
                    throw new SAXException("Invalid transform list: " + str);
                }
                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(f11)));
            } else if (l != null) {
                throw new SAXException("Invalid transform list fn: " + l + ")");
            }
            if (deVar.c()) {
                break;
            }
            deVar.e();
        }
        return matrix;
    }

    private static ag c(String str) {
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        cd cdVar = cd.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            cdVar = cd.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                cdVar = cd.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException e) {
                throw new SAXException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new ag(a(str, length), cdVar);
        } catch (NumberFormatException e2) {
            throw new SAXException("Invalid length value: " + str, e2);
        }
    }

    private static List<ag> d(String str) {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        de deVar = new de(str);
        deVar.d();
        while (!deVar.c()) {
            float f = deVar.f();
            if (Float.isNaN(f)) {
                throw new SAXException("Invalid length list value: " + deVar.m());
            }
            cd n = deVar.n();
            if (n == null) {
                n = cd.px;
            }
            arrayList.add(new ag(f, n));
            deVar.e();
        }
        return arrayList;
    }

    private static float e(String str) {
        int length = str.length();
        if (length == 0) {
            throw new SAXException("Invalid float value (empty string)");
        }
        return a(str, length);
    }

    private static float a(String str, int i) {
        float a2 = new m().a(str, 0, i);
        if (!Float.isNaN(a2)) {
            return a2;
        }
        throw new SAXException("Invalid float value: " + str);
    }

    private static float f(String str) {
        float e = e(str);
        if (e < 0.0f) {
            return 0.0f;
        }
        if (e > 1.0f) {
            return 1.0f;
        }
        return e;
    }

    private static void a(bp bpVar, String str) {
        p pVar;
        de deVar = new de(str);
        deVar.d();
        String k = deVar.k();
        if ("defer".equals(k)) {
            deVar.d();
            k = deVar.k();
        }
        o a2 = cy.a(k);
        deVar.d();
        if (deVar.c()) {
            pVar = null;
        } else {
            String k2 = deVar.k();
            if (k2.equals("meet")) {
                pVar = p.Meet;
            } else if (k2.equals("slice")) {
                pVar = p.Slice;
            } else {
                throw new SAXException("Invalid preserveAspectRatio definition: " + str);
            }
        }
        bpVar.w = new n(a2, pVar);
    }

    private static bo a(String str, String str2) {
        if (!str.startsWith("url(")) {
            return g(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            throw new SAXException("Bad " + str2 + " attribute. Unterminated url() reference");
        }
        String trim = str.substring(4, indexOf).trim();
        bo boVar = null;
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            boVar = g(trim2);
        }
        return new al(trim, boVar);
    }

    private static bo g(String str) {
        if (str.equals("none")) {
            return null;
        }
        if (str.equals("currentColor")) {
            return x.a();
        }
        return h(str);
    }

    private static w h(String str) {
        l lVar;
        if (str.charAt(0) == '#') {
            int length = str.length();
            long j = 0;
            if (1 >= length) {
                lVar = null;
            } else {
                int i = 1;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt >= '0' && charAt <= '9') {
                        j = (j * 16) + (charAt - '0');
                    } else if (charAt >= 'A' && charAt <= 'F') {
                        j = (j * 16) + (charAt - 'A') + 10;
                    } else {
                        if (charAt < 'a' || charAt > 'f') {
                            break;
                        }
                        j = (j * 16) + (charAt - 'a') + 10;
                    }
                    if (j > 4294967295L) {
                        lVar = null;
                        break;
                    }
                    i++;
                }
                lVar = i == 1 ? null : new l(j, i);
            }
            if (lVar == null) {
                throw new SAXException("Bad hex colour value: " + str);
            }
            int i2 = lVar.f1381a;
            if (i2 == 7) {
                return new w((int) lVar.c);
            }
            if (i2 != 4) {
                throw new SAXException("Bad hex colour value: " + str);
            }
            int i3 = (int) lVar.c;
            int i4 = i3 & 3840;
            int i5 = i3 & 240;
            int i6 = i3 & 15;
            return new w((i4 << 12) | (i4 << 16) | (i5 << 8) | (i5 << 4) | (i6 << 4) | i6);
        }
        if (str.toLowerCase(Locale.US).startsWith("rgb(")) {
            de deVar = new de(str.substring(4));
            deVar.d();
            float f = deVar.f();
            if (!Float.isNaN(f) && deVar.a('%')) {
                f = (f * 256.0f) / 100.0f;
            }
            float a2 = deVar.a(f);
            if (!Float.isNaN(a2) && deVar.a('%')) {
                a2 = (a2 * 256.0f) / 100.0f;
            }
            float a3 = deVar.a(a2);
            if (!Float.isNaN(a3) && deVar.a('%')) {
                a3 = (a3 * 256.0f) / 100.0f;
            }
            deVar.d();
            if (Float.isNaN(a3) || !deVar.a(')')) {
                throw new SAXException("Bad rgb() colour value: " + str);
            }
            return new w((a(f) << 16) | (a(a2) << 8) | a(a3));
        }
        Integer a4 = cz.a(str.toLowerCase(Locale.US));
        if (a4 == null) {
            throw new SAXException("Invalid colour keyword: " + str);
        }
        return new w(a4.intValue());
    }

    private static int a(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private static void a(aw awVar, String str) {
        String b2;
        String str2 = null;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf("|" + str + '|') == -1) {
            de deVar = new de(str);
            ay ayVar = null;
            Integer num = null;
            while (true) {
                b2 = deVar.b('/');
                deVar.d();
                if (b2 == null) {
                    throw new SAXException("Invalid font style attribute: missing font size and family");
                }
                if (num != null && ayVar != null) {
                    break;
                }
                if (!b2.equals("normal") && (num != null || (num = db.a(b2)) == null)) {
                    if (ayVar != null || (ayVar = k(b2)) == null) {
                        if (str2 != null || !b2.equals("small-caps")) {
                            break;
                        } else {
                            str2 = b2;
                        }
                    }
                }
            }
            ag j = j(b2);
            if (deVar.a('/')) {
                deVar.d();
                String k = deVar.k();
                if (k == null) {
                    throw new SAXException("Invalid font style attribute: missing line-height");
                }
                c(k);
                deVar.d();
            }
            awVar.o = i(deVar.q());
            awVar.p = j;
            awVar.q = Integer.valueOf(num == null ? 400 : num.intValue());
            if (ayVar == null) {
                ayVar = ay.Normal;
            }
            awVar.r = ayVar;
            awVar.f1294a |= 122880;
        }
    }

    private static List<String> i(String str) {
        ArrayList arrayList = null;
        de deVar = new de(str);
        do {
            String p = deVar.p();
            if (p == null) {
                p = deVar.b(',');
            }
            if (p == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(p);
            deVar.e();
        } while (!deVar.c());
        return arrayList;
    }

    private static ag j(String str) {
        ag a2 = da.a(str);
        if (a2 == null) {
            return c(str);
        }
        return a2;
    }

    private static ay k(String str) {
        if ("italic".equals(str)) {
            return ay.Italic;
        }
        if ("normal".equals(str)) {
            return ay.Normal;
        }
        if ("oblique".equals(str)) {
            return ay.Oblique;
        }
        return null;
    }

    private static ax l(String str) {
        if ("nonzero".equals(str)) {
            return ax.NonZero;
        }
        if ("evenodd".equals(str)) {
            return ax.EvenOdd;
        }
        throw new SAXException("Invalid fill-rule property: " + str);
    }

    private static ag[] m(String str) {
        ag i;
        de deVar = new de(str);
        deVar.d();
        if (!deVar.c() && (i = deVar.i()) != null) {
            if (i.b()) {
                throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: " + str);
            }
            float f = i.f1272a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(i);
            while (!deVar.c()) {
                deVar.e();
                ag i2 = deVar.i();
                if (i2 == null) {
                    throw new SAXException("Invalid stroke-dasharray. Non-Length content found: " + str);
                }
                if (i2.b()) {
                    throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: " + str);
                }
                arrayList.add(i2);
                f += i2.f1272a;
            }
            if (f == 0.0f) {
                return null;
            }
            return (ag[]) arrayList.toArray(new ag[arrayList.size()]);
        }
        return null;
    }

    private static ag a(de deVar) {
        return deVar.a("auto") ? new ag(0.0f) : deVar.i();
    }

    private static Set<String> n(String str) {
        de deVar = new de(str);
        HashSet hashSet = new HashSet();
        while (!deVar.c()) {
            String k = deVar.k();
            int indexOf = k.indexOf(45);
            if (indexOf != -1) {
                k = k.substring(0, indexOf);
            }
            hashSet.add(new Locale(k, "", "").getLanguage());
            deVar.d();
        }
        return hashSet;
    }

    private static Set<String> o(String str) {
        de deVar = new de(str);
        HashSet hashSet = new HashSet();
        while (!deVar.c()) {
            hashSet.add(deVar.k());
            deVar.d();
        }
        return hashSet;
    }

    private static String b(String str, String str2) {
        if (str.equals("none")) {
            return null;
        }
        if (!str.startsWith("url(") || !str.endsWith(")")) {
            throw new SAXException("Bad " + str2 + " attribute. Expected \"none\" or \"url()\" format");
        }
        return str.substring(4, str.length() - 1).trim();
    }

    private void a(Attributes attributes) {
        boolean z;
        if (this.f1355b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        int i = 0;
        boolean z2 = true;
        String str = "all";
        while (i < attributes.getLength()) {
            String trim = attributes.getValue(i).trim();
            switch (cx.f1357b[dc.a(attributes.getLocalName(i)).ordinal()]) {
                case 87:
                    z = trim.equals("text/css");
                    break;
                case 88:
                    str = trim;
                    z = z2;
                    break;
                default:
                    z = z2;
                    break;
            }
            i++;
            z2 = z;
        }
        if (z2) {
            g gVar = g.screen;
            e eVar = new e(str);
            eVar.d();
            List<g> a2 = a.a(eVar);
            if (eVar.c()) {
                if (a.a(a2, gVar)) {
                    this.h = true;
                    return;
                }
            } else {
                throw new SAXException("Invalid @media type list");
            }
        }
        this.c = true;
        this.d = 1;
    }
}
