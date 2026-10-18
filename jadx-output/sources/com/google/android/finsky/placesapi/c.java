package com.google.android.finsky.placesapi;

import java.util.HashMap;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
final class c extends DefaultHandler {

    /* renamed from: a, reason: collision with root package name */
    LinkedList<b> f3561a;

    /* renamed from: b, reason: collision with root package name */
    private d f3562b;
    private StringBuilder c;

    private c() {
        this.f3561a = new LinkedList<>();
        this.f3562b = d.SEPARATOR;
        this.c = new StringBuilder();
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        HashMap hashMap;
        if (this.f3562b != d.SEPARATOR) {
            throw new SAXException("Invalid nested element.");
        }
        String value = attributes.getValue("class");
        if (value != null) {
            hashMap = a.f3557b;
            d dVar = (d) hashMap.get(value);
            if (dVar == null) {
                dVar = d.UNKNOWN;
            }
            a();
            this.f3562b = dVar;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (this.f3562b != d.SEPARATOR) {
            a();
            this.f3562b = d.SEPARATOR;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        a();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.c.append(cArr, i, i2);
    }

    private void a() {
        if (this.c.length() > 0) {
            this.f3561a.add(new b(this.c.toString(), this.f3562b));
            this.c = new StringBuilder();
        }
    }
}
