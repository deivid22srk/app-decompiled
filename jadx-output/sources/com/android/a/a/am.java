package com.android.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
final class am extends JSONObject {
    static am a(String str) {
        return new am(new JSONTokener(str));
    }

    static am a() {
        return new am();
    }

    protected am() {
    }

    private am(JSONTokener jSONTokener) {
        super(jSONTokener);
    }

    private am(JSONObject jSONObject, String[] strArr) {
        super(jSONObject, strArr);
    }

    @Override // org.json.JSONObject
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String get(String str) {
        try {
            Object obj = super.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Integer) {
                throw new IllegalArgumentException();
            }
            throw new ClassCastException();
        } catch (JSONException e) {
            return null;
        }
    }

    @Override // org.json.JSONObject
    public final int getInt(String str) {
        try {
            Object obj = super.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            throw new RuntimeException("Something other than an int was returned");
        } catch (JSONException e) {
            return -1;
        }
    }

    final JSONArray b() {
        return super.names();
    }

    final am c(String str) {
        try {
            Object obj = super.get(str);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                ArrayList arrayList = new ArrayList(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                return new am(jSONObject, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            if (obj instanceof Integer) {
                throw new IllegalArgumentException();
            }
            throw new ClassCastException();
        } catch (JSONException e) {
            return null;
        }
    }

    final boolean d(String str) {
        return super.has(str);
    }

    final void a(am amVar) {
        JSONArray names;
        if (amVar != null && (names = amVar.names()) != null) {
            for (int i = 0; i < names.length(); i++) {
                try {
                    String string = names.getString(i);
                    try {
                        if (!super.has(string)) {
                            super.put(string, super.get(string));
                        }
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                } catch (JSONException e2) {
                }
            }
        }
    }

    final void a(String str, JSONObject jSONObject) {
        try {
            super.put(str, jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
