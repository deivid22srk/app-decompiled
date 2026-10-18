package com.google.android.wallet.common.apkg;

import android.app.Activity;
import android.location.Location;
import android.support.v4.h.r;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.volley.apkg.ae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f7259a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.volley.o f7260b;

    public l(Activity activity, com.android.volley.o oVar) {
        this.f7259a = activity;
        this.f7260b = oVar;
    }

    public static boolean a(int i) {
        return com.google.android.wallet.a.c.f7226a.b().contains(o.a(i));
    }

    @Override // com.google.android.wallet.common.apkg.c
    public final String a() {
        return "GooglePlacesAddressSource";
    }

    @Override // com.google.android.wallet.common.apkg.c
    public final List<d> a(CharSequence charSequence, char c, char[] cArr, int i, String str) {
        int intValue;
        if (charSequence != null) {
            int length = charSequence.length();
            switch (c) {
                case '1':
                    intValue = com.google.android.wallet.a.c.f7227b.b().intValue();
                    break;
                default:
                    intValue = com.google.android.wallet.a.c.c.b().intValue();
                    break;
            }
            if (length >= intValue) {
                if (!(a(i) && a(c) != null)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BasicNameValuePair("input", charSequence.toString()));
                arrayList.add(new BasicNameValuePair("key", "AIzaSyCgACP5TTubzmLhxFL5ONXq6B5l2eH_EXc"));
                arrayList.add(new BasicNameValuePair("types", a(c)));
                Location b2 = b();
                if (b2 != null) {
                    arrayList.add(new BasicNameValuePair("location", new StringBuilder(49).append(b2.getLatitude()).append(",").append(b2.getLongitude()).toString()));
                    arrayList.add(new BasicNameValuePair("radius", "80000"));
                }
                arrayList.add(new BasicNameValuePair("sensor", b2 != null ? "true" : "false"));
                String valueOf = String.valueOf(o.a(i).toLowerCase(Locale.US));
                arrayList.add(new BasicNameValuePair("components", valueOf.length() != 0 ? "country:".concat(valueOf) : new String("country:")));
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new BasicNameValuePair("language", str));
                }
                String format = URLEncodedUtils.format(arrayList, "utf-8");
                String valueOf2 = String.valueOf("https://maps.googleapis.com/maps/api/place/autocomplete/json?");
                String valueOf3 = String.valueOf(format);
                return a(a(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2)), charSequence, c);
            }
        }
        return null;
    }

    @Override // com.google.android.wallet.common.apkg.c
    public final com.google.c.a.b a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("reference", str));
        arrayList.add(new BasicNameValuePair("sensor", b() != null ? "true" : "false"));
        arrayList.add(new BasicNameValuePair("key", "AIzaSyCgACP5TTubzmLhxFL5ONXq6B5l2eH_EXc"));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new BasicNameValuePair("language", str2));
        }
        String format = URLEncodedUtils.format(arrayList, "utf-8");
        String valueOf = String.valueOf("https://maps.googleapis.com/maps/api/place/details/json?");
        String valueOf2 = String.valueOf(format);
        return b(a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)), str2);
    }

    public JSONObject a(String str) {
        try {
            ae a2 = ae.a();
            this.f7260b.a(new com.google.android.wallet.common.c.apkg.d(str, Collections.singletonMap("User-Agent", com.google.android.wallet.common.c.a.f7268a), a2, a2));
            return (JSONObject) a2.get(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.w("GooglePlacesAddressSour", "InterruptedException while retrieving addresses from GooglePlaces", e);
            return null;
        } catch (ExecutionException e2) {
            Log.w("GooglePlacesAddressSour", "ExecutionException while retrieving addresses from GooglePlaces", e2);
            return null;
        } catch (TimeoutException e3) {
            Log.w("GooglePlacesAddressSour", "TimeoutException while retrieving addresses from GooglePlaces", e3);
            return null;
        }
    }

    public static String a(char c) {
        switch (c) {
            case '1':
                return "geocode";
            case 'C':
                return "(cities)";
            case 'S':
                return "(regions)";
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.location.Location b() {
        /*
            r2 = this;
            android.app.Activity r0 = r2.f7259a
            boolean r1 = com.google.android.wallet.common.util.l.a(r0)
            if (r1 == 0) goto L1d
            com.google.android.wallet.common.util.l.a()
            com.google.android.wallet.common.util.l.a()
            java.lang.String r1 = com.google.android.wallet.common.util.a.a(r0)
            boolean r0 = com.google.android.wallet.common.util.l.b(r0, r1)
            if (r0 == 0) goto L1d
            r0 = 1
        L19:
            if (r0 != 0) goto L1f
            r0 = 0
        L1c:
            return r0
        L1d:
            r0 = 0
            goto L19
        L1f:
            android.app.Activity r0 = r2.f7259a
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            java.lang.String r1 = "network"
            android.location.Location r0 = r0.getLastKnownLocation(r1)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.common.apkg.l.b():android.location.Location");
    }

    public static ArrayList<d> a(JSONObject jSONObject, CharSequence charSequence, char c) {
        String str;
        String b2;
        boolean z;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("status");
        if (!"OK".equalsIgnoreCase(optString)) {
            String valueOf = String.valueOf(optString);
            Log.w("GooglePlacesAddressSour", valueOf.length() != 0 ? "Response has invalid status: ".concat(valueOf) : new String("Response has invalid status: "));
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("predictions");
            ArrayList<d> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    CharSequence string = jSONObject2.getString("description");
                    if (string.length() != 0) {
                        String string2 = jSONObject2.getString("reference");
                        if (string2.length() != 0) {
                            switch (c) {
                                case '1':
                                    str = "route";
                                    break;
                                case 'C':
                                    str = "locality";
                                    break;
                                case 'S':
                                    str = "administrative_area_level_1";
                                    break;
                                case 'Z':
                                    str = "locality";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (a(jSONObject2, str) && (b2 = b(jSONObject2)) != null) {
                                switch (c) {
                                    case '1':
                                    case 'C':
                                        z = false;
                                        break;
                                    default:
                                        z = true;
                                        break;
                                }
                                if (!z || b2.toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                                    List<Pair<Integer, Integer>> a2 = a(jSONObject2);
                                    if (!a2.isEmpty()) {
                                        string = p.a(a2, string);
                                    }
                                    arrayList.add(new d(b2, string, "GooglePlacesAddressSource", string2));
                                }
                            }
                        }
                    }
                } catch (JSONException e) {
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            Log.w("GooglePlacesAddressSour", "Response does not contain predictions");
            return null;
        }
    }

    public static List<Pair<Integer, Integer>> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("matched_substrings");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(Pair.create(Integer.valueOf(jSONObject2.getInt("offset")), Integer.valueOf(jSONObject2.getInt("length"))));
            }
        } catch (JSONException e) {
        }
        return arrayList;
    }

    public static String b(JSONObject jSONObject) {
        int i = jSONObject.getJSONArray("matched_substrings").getJSONObject(0).getInt("offset");
        JSONArray jSONArray = jSONObject.getJSONArray("terms");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (i < jSONObject2.getInt("offset") + jSONObject2.getString("value").length()) {
                return jSONObject2.getString("value");
            }
        }
        return null;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("types");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (str.equalsIgnoreCase(jSONArray.getString(i))) {
                    return true;
                }
            }
            return false;
        } catch (JSONException e) {
            return false;
        }
    }

    public static com.google.c.a.b b(JSONObject jSONObject, String str) {
        String str2;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("status");
        if (!"OK".equalsIgnoreCase(optString)) {
            String valueOf = String.valueOf(optString);
            Log.w("GooglePlacesAddressSour", valueOf.length() != 0 ? "Response has invalid status: ".concat(valueOf) : new String("Response has invalid status: "));
            return null;
        }
        try {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("result").getJSONArray("address_components");
                r rVar = new r();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (!a(jSONObject2, "postal_code_prefix")) {
                            if (a(jSONObject2, "administrative_area_level_1") || a(jSONObject2, "country")) {
                                str2 = "short_name";
                            } else {
                                str2 = "long_name";
                            }
                            String string = jSONObject2.getString(str2);
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("types");
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                rVar.put(jSONArray2.getString(i2), string);
                            }
                        }
                    } catch (JSONException e) {
                    }
                }
                com.google.c.a.b bVar = new com.google.c.a.b();
                if (rVar.containsKey("street_number") || rVar.containsKey("route")) {
                    String str3 = (String) rVar.get("street_number");
                    String str4 = (String) rVar.get("route");
                    if (TextUtils.isEmpty(str3)) {
                        bVar.q = new String[]{str4};
                    } else if (TextUtils.isEmpty(str4)) {
                        bVar.q = new String[]{str3};
                    } else {
                        bVar.q = new String[]{new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()).append(str3).append(" ").append(str4).toString()};
                    }
                }
                if (rVar.containsKey("locality")) {
                    bVar.f = (String) rVar.get("locality");
                }
                if (rVar.containsKey("administrative_area_level_1")) {
                    bVar.d = (String) rVar.get("administrative_area_level_1");
                }
                if (rVar.containsKey("postal_code")) {
                    bVar.k = (String) rVar.get("postal_code");
                }
                if (rVar.containsKey("country")) {
                    bVar.f7728a = (String) rVar.get("country");
                }
                if (!TextUtils.isEmpty(str)) {
                    bVar.c = str;
                }
                return bVar;
            } catch (JSONException e2) {
                return null;
            }
        } catch (JSONException e3) {
            return null;
        }
    }
}
