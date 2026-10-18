package org.keyczar.interfaces;

import com.google.gson.ab;
import com.google.gson.ac;
import com.google.gson.ad;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.keyczar.DefaultKeyType;
import org.keyczar.KeyczarKey;

/* loaded from: classes2.dex */
public interface KeyType {

    public interface Builder {
        KeyczarKey generate(int i);

        KeyczarKey read(String str);
    }

    int defaultSize();

    List<Integer> getAcceptableSizes();

    Builder getBuilder();

    String getName();

    int getOutputSize();

    int getOutputSize(int i);

    boolean isAcceptableSize(int i);

    public class KeyTypeSerializer implements ad<KeyType> {
        @Override // com.google.gson.ad
        public y serialize(KeyType keyType, Type type, ac acVar) {
            return new ab(keyType.getName());
        }
    }

    public class KeyTypeDeserializer implements x<KeyType> {
        private static Map<String, KeyType> typeMap = new HashMap();

        static {
            for (DefaultKeyType defaultKeyType : DefaultKeyType.values()) {
                registerType(defaultKeyType);
            }
        }

        public static void registerType(KeyType keyType) {
            String name = keyType.getName();
            if (typeMap.containsKey(name)) {
                throw new IllegalArgumentException("Attempt to map two key types to the same name " + name);
            }
            typeMap.put(name, keyType);
        }

        @Override // com.google.gson.x
        public KeyType deserialize(y yVar, Type type, w wVar) {
            String b2 = yVar.g().b();
            if (!typeMap.containsKey(b2)) {
                throw new IllegalArgumentException("Cannot deserialize " + b2 + " no such key has been registered.");
            }
            return typeMap.get(b2);
        }
    }
}
