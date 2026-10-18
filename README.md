# app-decompiled

Engenharia reversa de um APK descontinuado (cópia pessoal, sem funcionamento há tempos).

**APK original:** `com.android.vending` 6.2.02.A-all (minAPI 9, nodpi)

## Estrutura

| Caminho | Conteúdo |
|---|---|
| `app.apk` | APK original de referência |
| `jadx-output/sources/` | Código Java legível decompilado do bytecode Dalvik (DEX) via [jadx 1.5.1](https://github.com/skylot/jadx) — 7.476 arquivos |
| `jadx-output/resources/` | Recursos extraídos (XMLs, imagens, assets) |
| `.github/workflows/build.yml` | Workflow de CI que reconstrói e assina o APK |

## Como o build funciona

O workflow (GitHub Actions) roda a cada push na `main` e também manualmente via **Run workflow**:

1. **apktool 2.10.0** decodifica o `app.apk` em recursos + smali
2. **apktool** reconstrói o APK (`--use-aapt1`, necessário para os recursos legados deste app)
3. **uber-apk-signer 1.3.0** alinha e assina com chave de debug (v1 + v2 + v3)
4. O APK assinado sobe como artifact `app-rebuilt-apk`

Download do APK compilado: aba **Actions** → run desejado → **Artifacts**.

## Nota sobre o jadx

A saída em `jadx-output/` serve para **leitura e análise** do código. Java decompilado por jadx não volta a compilar como está (generics perdidos, accessors sintéticos, referências quebradas). A reconstrução real do APK é feita no nível de smali/recursos via apktool — por isso o workflow usa apktool, não o código Java do jadx.
