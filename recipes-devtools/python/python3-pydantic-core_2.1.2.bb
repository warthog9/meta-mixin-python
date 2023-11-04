SUMMARY = "Pydantic Core validation logic for pydantic written in rust"
HOMEPAGE = "https://github.com/pydantic/pydantic-core"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab599c188b4a314d2856b3a55030c75c"

SRC_URI[sha256sum] = "d2c790f0d928b672484eac4f5696dd0b78f3d6d148a641ea196eb49c0875e30a"

PYPI_PACKAGE = "pydantic_core"

DEPENDS += "\
    python3-typing-extensions \
"

inherit pypi python_maturin
#inherit pypi cargo

INSANE_SKIP:${PN}:append = "already-stripped"

SRC_URI += " \
    crate://crates.io/ahash/0.8.3 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/enum_dispatch/0.3.11 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/getrandom/0.2.8 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indoc/1.0.9 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/libc/0.2.140 \
    crate://crates.io/libmimalloc-sys/0.1.30 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/mimalloc/0.1.34 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/once_cell/1.17.1 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.7 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/proc-macro2/1.0.60 \
    crate://crates.io/pyo3-build-config/0.19.1 \
    crate://crates.io/pyo3-ffi/0.19.1 \
    crate://crates.io/pyo3-macros-backend/0.19.1 \
    crate://crates.io/pyo3-macros/0.19.1 \
    crate://crates.io/pyo3/0.19.1 \
    crate://crates.io/python3-dll-a/0.2.9 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex/1.7.3 \
    crate://crates.io/rustversion/1.0.12 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/serde/1.0.159 \
    crate://crates.io/serde_json/1.0.95 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/speedate/0.9.0 \
    crate://crates.io/strum/0.25.0 \
    crate://crates.io/strum_macros/0.24.3 \
    crate://crates.io/strum_macros/0.25.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.18 \
    crate://crates.io/target-lexicon/0.12.6 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.8 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unindent/0.1.11 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
"

do_compile:prepend() {
        printf '[target.%s]\n' "x86_64-unknown-linux-gnu" > "${CARGO_HOME}/config"
        printf "linker = '%s'\n\n" "${WORKDIR}/wrapper/build-rust-cc" >> "${CARGO_HOME}/config"
        printf "ar = '%s'\n\n" "${WORKDIR}/wrapper/build-rust-ar" >> "${CARGO_HOME}/config"
        printf '[target.%s]\n' "aarch64-poky-linux-gnu" >> "${CARGO_HOME}/config"
        printf "linker = '%s'\n\n" "${WORKDIR}/wrapper/target-rust-cc" >> "${CARGO_HOME}/config"
        printf "ar = '%s'\n\n" "${WORKDIR}/wrapper/target-rust-ar" >> "${CARGO_HOME}/config"
        printf "[build]\ntarget = '%s'\n\n" "aarch64-unknown-linux-gnu" >> "${CARGO_HOME}/config"

        export PYO3_CROSS_PYTHON_VERSION="3.10"
        export PYO3_CROSS_LIB_DIR="${WORKDIR}/recipe-sysroot/usr/lib/python3.10/"
}
