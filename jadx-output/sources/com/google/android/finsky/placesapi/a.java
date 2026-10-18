package com.google.android.finsky.placesapi;

import android.content.Context;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, d> f3557b = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    Context f3558a;

    public a(Context context) {
        this.f3558a = context;
    }

    static String a(LinkedList<b> linkedList, d dVar) {
        Iterator<b> it = linkedList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f3560b == dVar) {
                it.remove();
                if (it.hasNext() && it.next().f3560b == d.SEPARATOR) {
                    it.remove();
                }
                return next.f3559a;
            }
        }
        return null;
    }

    static LinkedList<b> a(String str) {
        try {
            SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
            c cVar = new c((byte) 0);
            newSAXParser.parse(new InputSource(new StringReader("<?xml version=\"1.0\"?><root>" + str + "</root>")), cVar);
            return cVar.f3561a;
        } catch (IOException e) {
            throw new AdrMicroformatParserException(e);
        } catch (ParserConfigurationException e2) {
            throw new AdrMicroformatParserException(e2);
        } catch (SAXException e3) {
            throw new AdrMicroformatParserException(e3);
        }
    }

    static {
        for (d dVar : d.values()) {
            if (dVar.h != null) {
                f3557b.put(dVar.h, dVar);
            }
        }
    }
}
