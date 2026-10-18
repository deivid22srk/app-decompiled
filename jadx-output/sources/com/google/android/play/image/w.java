package com.google.android.play.image;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final y f6954a = y.a("=").a();

    /* renamed from: b, reason: collision with root package name */
    private static final y f6955b = y.a("/").a();

    static String a(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null) {
            sb.append(scheme).append(':');
        }
        String encodedAuthority = uri.getEncodedAuthority();
        if (encodedAuthority != null) {
            sb.append("//").append(encodedAuthority);
        }
        String encode = Uri.encode(uri.getPath(), "/=");
        if (encode != null) {
            sb.append(encode);
        }
        String encodedQuery = uri.getEncodedQuery();
        if (!TextUtils.isEmpty(encodedQuery)) {
            sb.append('?').append(encodedQuery);
        }
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            sb.append('#').append(encodedFragment);
        }
        return sb.toString();
    }

    static Uri a(String str, Uri uri) {
        boolean z;
        ArrayList a2 = a(f6955b.a((CharSequence) uri.getPath()));
        int size = a2.size();
        int i = (a2.size() <= 1 || !((String) a2.get(0)).equals("image")) ? size : size - 1;
        if (i < 4 || i > 6) {
            if (i != 1) {
                return uri;
            }
            return uri.buildUpon().path(((String) a(f6954a.a((CharSequence) uri.getPath())).get(0)) + "=" + str).build();
        }
        String path = uri.getPath();
        ArrayList a3 = a(f6955b.a((CharSequence) path));
        if (a3.size() <= 0 || !((String) a3.get(0)).equals("image")) {
            z = false;
        } else {
            a3.remove(0);
            z = true;
        }
        int size2 = a3.size();
        boolean endsWith = path.endsWith("/");
        boolean z2 = !endsWith && size2 == 5;
        boolean z3 = size2 == 4;
        if (z2) {
            a3.add(a3.get(4));
        }
        if (z3) {
            a3.add(str);
        } else {
            a3.set(4, str);
        }
        if (z) {
            a3.add(0, "image");
        }
        if (endsWith) {
            a3.add("");
        }
        return uri.buildUpon().path("/" + TextUtils.join("/", a3)).build();
    }

    static String b(Uri uri) {
        ArrayList a2 = a(f6955b.a((CharSequence) uri.getPath()));
        int size = a2.size();
        int i = (a2.size() <= 1 || !((String) a2.get(0)).equals("image")) ? size : size - 1;
        if (i < 4 || i > 6) {
            if (i != 1) {
                return "";
            }
            ArrayList a3 = a(f6954a.a((CharSequence) uri.getPath()));
            return a3.size() > 1 ? (String) a3.get(1) : "";
        }
        String path = uri.getPath();
        ArrayList a4 = a(f6955b.a((CharSequence) path));
        if (a4.size() > 0 && ((String) a4.get(0)).equals("image")) {
            a4.remove(0);
        }
        int size2 = a4.size();
        boolean z = !path.endsWith("/") && size2 == 5;
        boolean z2 = size2 == 4;
        if (!z && !z2) {
            return (String) a4.get(4);
        }
        return "";
    }

    private static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        Iterator<? extends E> it = iterable.iterator();
        ArrayList<E> arrayList = new ArrayList<>();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
