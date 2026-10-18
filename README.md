# app-decompiled

Engenharia reversa de um APK descontinuado (cópia pessoal, sem funcionamento há tempos), com **renome de pacote** para distribuição independente — agora compilável com **Gradle**.

**APK original:** `com.android.vending` 6.2.02.A-all (minAPI 9, nodpi)
**Pacote renomeado:** `com.deivid22srk.store`

## Estrutura

| Caminho | Conteúdo |
|---|---|
| `app/` | Projeto Android Gradle (AGP 7.4.2, compileSdk 23) |
| `app/src/main/res/` + `assets/` | Recursos originais compilados pelo **aapt2** via Gradle |
| `app/src/main/java/` | Código Java decompilado (jadx 1.5.1) — **mantido para leitura/referência**, excluído da compilação (ver abaixo) |
| `app/libs/app-code-*.jar` | **Bytecode original** (Dalvik -> dex2jar), rebasado para os IDs do build |
| `app/public-ids.txt` | Mapa `tipo/nome = id` de todos os 6.323 recursos do APK original |
| `tools/` | Scripts do pipeline (rename, dedup, rebase, regen de jars) |
| `rename_package.sh` / `fix_permissions.py` | Renome de pacote + dedup de permissões/authorities |
| `.github/workflows/gradle.yml` | CI: `gradle assembleDebug` -> artifact `gradle-debug-apk` |
| `.github/workflows/build.yml` | CI alternativa: rebuild via apktool + assinatura |

## Como o build Gradle funciona (híbrido)

1. **Recursos**: o aapt2 compila `app/src/main/res/` normalmente. `app/public-ids.txt` é passado via `--stable-ids` para manter os **type-ids** estáveis.
2. **Bytecode**: o código executável vem de `app/libs/` — os dexes **originais** do APK, convertidos para jar (dex2jar) e re-dexados pelo D8 no build. O pacote já vem renomeado e sem colisões de permissão (pipeline abaixo).
3. **Rebase de IDs**: o bytecode original tem todos os IDs de recurso (0x7f...) **inlineados** (não existe classe R no dex). O aapt2 não preserva entry-ids (confirmado: `--stable-ids` só afeta type-ids), então `tools/rebase_ids.py` reescreve as constantes `const`, `.array-data` e literais `.field` do smali mapeando `id original -> id do build` por nome do recurso. Resultado: bytecode original + recursos compilados = APK coerente.
4. O Java do jadx fica no repo como fonte de leitura (7.475 arquivos), excluído da compilação via `sourceSets`.

Para regenerar os jars: `tools/make_code_jars.sh` (requer apktool, dex2jar e um `app-debug.apk` prévio).

### Renome de pacote aplicado ao bytecode

- `rename_package.sh`: smali L-form + referências pontilhadas + manifesto + recursos
- `fix_permissions.py`: permissões declaradas e provider authorities viram `com.deivid22srk.store.*` (evita `INSTALL_FAILED_DUPLICATE_PERMISSION` / `CONFLICTING_PROVIDER` com a Play Store real instalada)

## Por que o Java do jadx não é compilado?

A saída do jadx **não recompila como está** (generics perdidos, accessors sintéticos, artefatos semânticos). Este projeto tentou a compilação 100% fonte: ~5.000 erros iniciais foram reduzidos para ~2.400 com correções em onda (scripts em `tools/wave*.py`: classes `static` perdidas, sombras de nomes obfuscados, generics do gms, etc.), mas cada correção desmascara novas cascatas — o custo total para chegar a 100% é inviável, e mesmo compilando o app teria bugs sutis de decompilação. O pipeline híbrido preserva **100% do bytecode original** (comportamento idêntico ao APK original) e mantém as fontes abertas para estudo.

## Build apktool (alternativa)

O workflow `build.yml` mantém o caminho clássico: apktool decodifica o `app.apk`, aplica rename + dedup, reconstrói com `--use-aapt1` (necessário para os recursos legados) e assina com uber-apk-signer (v1+v2+v3). Artifact: `app-rebuilt-apk`.

## Nota sobre o jadx

`jadx-output/` contém a decompilação completa original (7.476 arquivos) para **leitura e análise**.
