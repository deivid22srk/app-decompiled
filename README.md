# app-decompiled

Engenharia reversa de um APK descontinuado (cópia pessoal, sem funcionamento há tempos), com **renome de pacote** para distribuição independente.

**APK original:** `com.android.vending` 6.2.02.A-all (minAPI 9, nodpi)
**Pacote renomeado:** `com.deivid22srk.store`

## Estrutura

| Caminho | Conteúdo |
|---|---|
| `app.apk` | APK original de referência |
| `rename_package.sh` | Script que renomeia o pacote no decode (smali, manifest, res) |
| `fix_permissions.py` | Dedup de permissões declaradas e provider authorities (evita `INSTALL_FAILED_DUPLICATE_PERMISSION` / `CONFLICTING_PROVIDER` quando o app original já está no device) |
| `jadx-output/sources/` | Código Java legível decompilado do bytecode Dalvik (DEX) via [jadx 1.5.1](https://github.com/skylot/jadx) — 7.476 arquivos |
| `jadx-output/resources/` | Recursos extraídos (XMLs, imagens, assets) |
| `.github/workflows/build.yml` | Workflow de CI que renomeia, reconstrói e assina o APK |

## Como o build funciona

O workflow (GitHub Actions) roda a cada push na `main` e também manualmente via **Run workflow**:

1. **apktool 2.10.0** decodifica o `app.apk` em recursos + smali
2. **rename_package.sh** troca o pacote `com.android.vending` → `com.deivid22srk.store` (referências L-classe e pontilhadas no smali/manifest/res + movimentação dos diretórios de classes)
3. **fix_permissions.py** renomeia permissões declaradas e authorities que colidiriam com a Play Store instalada no device
4. **apktool** reconstrói o APK (`--use-aapt1`, necessário para os recursos legados deste app)
5. **uber-apk-signer 1.3.0** alinha e assina com chave de debug (v1 + v2 + v3)
6. O APK assinado sobe como artifact `app-rebuilt-apk`

Download do APK compilado: aba **Actions** → run desejado → **Artifacts**.

Para usar outro nome de pacote, troque o argumento do script no `build.yml` (passo *Rename package*).

## Nota sobre o jadx

A saída em `jadx-output/` serve para **leitura e análise** do código. Java decompilado por jadx não volta a compilar como está (generics perdidos, accessors sintéticos, referências quebradas). A reconstrução real do APK é feita no nível de smali/recursos via apktool — por isso o workflow usa apktool, não o código Java do jadx.
