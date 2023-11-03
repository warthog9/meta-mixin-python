SUMMARY = "Build and publish crates with pyo3, rust-cpython and cffi bindings as well as rust binaries as python packages"
HOMEPAGE = "https://github.com/pyo3/maturin"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license-mit;md5=85fd3b67069cff784d98ebfc7d5c0797"

SRC_URI[sha256sum] = "6e35963ab0896afab527f092fd43d6dd97cce1b1e55ea190030d25e2d15b2384"

#inherit pypi python_setuptools_build_meta cargo
inherit pypi cargo python_setuptools_build_meta

DEPENDS += "\
    rust-native \
    python3-setuptools-rust-native \
    python3-semantic-version-native \
"

BBCLASSEXTEND = "native nativesdk"

SRC_URI += " \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aes/0.7.5 \
    crate://crates.io/ahash/0.3.8 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/anyhow/1.0.69 \
    crate://crates.io/async-io/1.12.0 \
    crate://crates.io/async-lock/2.6.0 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.3 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/block-modes/0.8.1 \
    crate://crates.io/block-padding/0.2.1 \
    crate://crates.io/bstr/1.2.0 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/bytesize/1.1.0 \
    crate://crates.io/bzip2-sys/0.1.11+1.0.8 \
    crate://crates.io/bzip2/0.4.4 \
    crate://crates.io/cab/0.4.1 \
    crate://crates.io/camino/1.1.2 \
    crate://crates.io/cargo-config2/0.1.4 \
    crate://crates.io/cargo-options/0.6.0 \
    crate://crates.io/cargo-platform/0.1.2 \
    crate://crates.io/cargo-xwin/0.14.0 \
    crate://crates.io/cargo-zigbuild/0.16.0 \
    crate://crates.io/cargo_metadata/0.15.3 \
    crate://crates.io/cbindgen/0.24.3 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfb/0.7.3 \
    crate://crates.io/cfg-expr/0.14.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/charset/0.1.3 \
    crate://crates.io/chumsky/0.8.0 \
    crate://crates.io/cipher/0.3.0 \
    crate://crates.io/clap/4.0.32 \
    crate://crates.io/clap_complete/4.0.7 \
    crate://crates.io/clap_complete_command/0.4.0 \
    crate://crates.io/clap_complete_fig/4.0.2 \
    crate://crates.io/clap_derive/4.0.21 \
    crate://crates.io/clap_lex/0.3.0 \
    crate://crates.io/cli-table/0.4.7 \
    crate://crates.io/concolor-query/0.1.0 \
    crate://crates.io/concolor/0.0.11 \
    crate://crates.io/concurrent-queue/2.1.0 \
    crate://crates.io/configparser/3.0.2 \
    crate://crates.io/console/0.15.5 \
    crate://crates.io/const-random-macro/0.1.15 \
    crate://crates.io/const-random/0.1.15 \
    crate://crates.io/content_inspector/0.2.4 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cpufeatures/0.2.5 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.6 \
    crate://crates.io/crossbeam-deque/0.8.2 \
    crate://crates.io/crossbeam-epoch/0.9.13 \
    crate://crates.io/crossbeam-utils/0.8.14 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/crypto-mac/0.11.1 \
    crate://crates.io/ctor/0.1.26 \
    crate://crates.io/data-encoding/2.3.3 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/dialoguer/0.10.3 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/digest/0.10.6 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/dunce/1.0.3 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/encoding-index-japanese/1.20141219.5 \
    crate://crates.io/encoding-index-korean/1.20141219.5 \
    crate://crates.io/encoding-index-simpchinese/1.20141219.5 \
    crate://crates.io/encoding-index-singlebyte/1.20141219.5 \
    crate://crates.io/encoding-index-tradchinese/1.20141219.5 \
    crate://crates.io/encoding/0.2.33 \
    crate://crates.io/encoding_index_tests/0.1.4 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/enumflags2/0.6.4 \
    crate://crates.io/enumflags2_derive/0.6.4 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fat-macho/0.4.6 \
    crate://crates.io/filetime/0.2.19 \
    crate://crates.io/flate2/1.0.25 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/fs-err/2.9.0 \
    crate://crates.io/futures-channel/0.3.26 \
    crate://crates.io/futures-core/0.3.26 \
    crate://crates.io/futures-executor/0.3.26 \
    crate://crates.io/futures-io/0.3.26 \
    crate://crates.io/futures-lite/1.12.0 \
    crate://crates.io/futures-macro/0.3.26 \
    crate://crates.io/futures-sink/0.3.26 \
    crate://crates.io/futures-task/0.3.26 \
    crate://crates.io/futures-util/0.3.26 \
    crate://crates.io/futures/0.3.26 \
    crate://crates.io/generic-array/0.14.6 \
    crate://crates.io/getrandom/0.2.8 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/globset/0.4.10 \
    crate://crates.io/goblin/0.6.0 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hkdf/0.11.0 \
    crate://crates.io/hmac/0.11.0 \
    crate://crates.io/home/0.5.4 \
    crate://crates.io/humantime-serde/1.1.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/ignore/0.4.20 \
    crate://crates.io/indexmap/1.9.2 \
    crate://crates.io/indicatif/0.17.3 \
    crate://crates.io/indoc/2.0.0 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.4 \
    crate://crates.io/is-terminal/0.4.2 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.5 \
    crate://crates.io/js-sys/0.3.61 \
    crate://crates.io/keyring/1.2.1 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lddtree/0.3.2 \
    crate://crates.io/libc/0.2.139 \
    crate://crates.io/linux-raw-sys/0.1.4 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/lzxd/0.1.4 \
    crate://crates.io/mailparse/0.13.8 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/minijinja/0.30.4 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/msi/0.5.0 \
    crate://crates.io/multipart/0.18.0 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/nb-connect/1.2.0 \
    crate://crates.io/nix/0.22.3 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/nom8/0.2.0 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/normpath/1.0.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-complex/0.4.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-iter/0.1.43 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num/0.4.0 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/number_prefix/0.4.0 \
    crate://crates.io/once_cell/1.17.0 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openssl-macros/0.1.0 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-src/111.25.0+1.1.1t \
    crate://crates.io/openssl-sys/0.9.80 \
    crate://crates.io/openssl/0.10.45 \
    crate://crates.io/os_pipe/1.1.2 \
    crate://crates.io/os_str_bytes/6.4.1 \
    crate://crates.io/output_vt100/0.1.3 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking/2.0.0 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.6 \
    crate://crates.io/path-slash/0.2.1 \
    crate://crates.io/pep440/0.2.0 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.26 \
    crate://crates.io/plain/0.2.3 \
    crate://crates.io/platform-info/1.0.2 \
    crate://crates.io/polling/2.5.2 \
    crate://crates.io/portable-atomic/0.3.19 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/pretty_assertions/1.3.0 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/1.2.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.20+deprecated \
    crate://crates.io/proc-macro2/1.0.51 \
    crate://crates.io/pyproject-toml/0.3.3 \
    crate://crates.io/python-pkginfo/0.5.5 \
    crate://crates.io/quote/1.0.23 \
    crate://crates.io/quoted_printable/0.4.7 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon-core/1.10.2 \
    crate://crates.io/rayon/1.6.1 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.28 \
    crate://crates.io/regex/1.7.1 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rfc2047-decoder/0.2.1 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.36.7 \
    crate://crates.io/rustls/0.20.8 \
    crate://crates.io/rustversion/1.0.11 \
    crate://crates.io/ryu/1.0.12 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.21 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scroll/0.11.0 \
    crate://crates.io/scroll_derive/0.11.0 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/secret-service/2.0.2 \
    crate://crates.io/security-framework-sys/2.8.0 \
    crate://crates.io/security-framework/2.8.2 \
    crate://crates.io/semver/1.0.16 \
    crate://crates.io/serde/1.0.152 \
    crate://crates.io/serde_derive/1.0.152 \
    crate://crates.io/serde_json/1.0.93 \
    crate://crates.io/serde_repr/0.1.10 \
    crate://crates.io/serde_spanned/0.6.1 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shell-escape/0.1.5 \
    crate://crates.io/shell-words/1.1.0 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/similar/2.2.1 \
    crate://crates.io/slab/0.4.7 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/smawk/0.3.1 \
    crate://crates.io/snapbox-macros/0.3.1 \
    crate://crates.io/snapbox/0.4.4 \
    crate://crates.io/socket2/0.4.7 \
    crate://crates.io/socks/0.3.4 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.107 \
    crate://crates.io/tar/0.4.38 \
    crate://crates.io/target-lexicon/0.12.6 \
    crate://crates.io/tempfile/3.3.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/terminal_size/0.2.3 \
    crate://crates.io/textwrap/0.16.0 \
    crate://crates.io/thiserror-impl/1.0.38 \
    crate://crates.io/thiserror/1.0.38 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.6 \
    crate://crates.io/time/0.3.17 \
    crate://crates.io/tiny-keccak/2.0.2 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml/0.7.2 \
    crate://crates.io/toml_datetime/0.6.1 \
    crate://crates.io/toml_edit/0.19.3 \
    crate://crates.io/tracing-attributes/0.1.23 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-serde/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.16 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/trycmd/0.14.11 \
    crate://crates.io/twox-hash/1.6.3 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.10 \
    crate://crates.io/unicode-ident/1.0.6 \
    crate://crates.io/unicode-linebreak/0.1.4 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/ureq/2.6.2 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/uuid/1.3.0 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/versions/4.1.0 \
    crate://crates.io/wait-timeout/0.2.0 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.84 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.84 \
    crate://crates.io/wasm-bindgen-macro/0.2.84 \
    crate://crates.io/wasm-bindgen-shared/0.2.84 \
    crate://crates.io/wasm-bindgen/0.2.84 \
    crate://crates.io/web-sys/0.3.61 \
    crate://crates.io/webpki-roots/0.22.6 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/wepoll-ffi/0.1.2 \
    crate://crates.io/which/4.4.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.1 \
    crate://crates.io/windows_aarch64_msvc/0.42.1 \
    crate://crates.io/windows_i686_gnu/0.42.1 \
    crate://crates.io/windows_i686_msvc/0.42.1 \
    crate://crates.io/windows_x86_64_gnu/0.42.1 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.1 \
    crate://crates.io/windows_x86_64_msvc/0.42.1 \
    crate://crates.io/xattr/0.2.3 \
    crate://crates.io/xwin/0.2.10 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zbus/1.9.3 \
    crate://crates.io/zbus_macros/1.9.3 \
    crate://crates.io/zeroize/1.5.7 \
    crate://crates.io/zip/0.6.4 \
    crate://crates.io/zvariant/2.10.0 \
    crate://crates.io/zvariant_derive/2.10.0 \
"

#RUSTFLAGS ??= ""

## the binary we will use
#CARGO = "cargo"

#oe_cargo_build () {
#	export RUSTFLAGS="${RUSTFLAGS}"
#	export RUST_TARGET_PATH="${RUST_TARGET_PATH}"
#	bbnote "cargo = $(which ${CARGO})"
#	bbnote "rustc = $(which ${RUSTC})"
#	bbnote "${CARGO} build ${CARGO_BUILD_FLAGS} $@"
#	"${CARGO}" build ${CARGO_BUILD_FLAGS} \
#            -Z unstable-options \
#            -Z namespaced-features \
#            -Z weak-dep-features \
#            --config "patch.crates-io.anyhow.path='${CARGO_HOME}/bitbake/anyhow-1.0.69'" \
#            "$@"
#}


#do_compile:prepend() {
#        oe_cargo_fix_env
#        oe_cargo_build
#}

#do_configure:append() {
#        echo "" >> ${CARGO_HOME}/config
#        echo "[patch.crates-io]" >> ${CARGO_HOME}/config
#
#        counter=0
#        tIFS="${IFS}"
#        IFS="
#"
#        ppackage=""
#        for x in $( ls "${CARGO_HOME}/bitbake/" )
#        do
#            if [[ "${x}" == wasi-* ]]
#            then
#                package="wasi"
#            else
#                package="${x%-*}"
#                version="${x##*-}"
#            fi
#
#            if [[ "${ppackage}" == "${package}" ]]
#            then
#                let "counter = counter + 1"
#                package="${package}${counter}"
#
#                echo "${package} = { path = '${CARGO_HOME}/bitbake/${x}', package = '${ppackage}' }" >> "${CARGO_HOME}/config"
#            else
#                counter=0
#                ppackage="${package}"
#
#                echo "${package} = { path = '${CARGO_HOME}/bitbake/${x}' }" >> ${CARGO_HOME}/config
#            fi
#        done
#        echo "" >> "${CARGO_HOME}/config"
#
#        for x in $( ls "${CARGO_HOME}/bitbake/" | grep "^encoding" )
#        do
#                sed -i \
#                    -e '/path = "src\/index\//d' \
#                    -e '/path = "..\/tests"/d' \
#                    "${CARGO_HOME}/bitbake/${x}/Cargo.toml"
#        done
#
#        IFS="${tIFS}"
#}
