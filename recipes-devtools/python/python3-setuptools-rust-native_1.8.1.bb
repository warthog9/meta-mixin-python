SUMMARY = "Setuptools Rust extension plugin"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust \
Python extensions implemented with PyO3 or rust-cpython.\
\
Compile and distribute Python extensions written in Rust as easily as if they were written in C."
HOMEPAGE = "https://github.com/PyO3/setuptools-rust"
BUGTRACKER = "https://github.com/PyO3/setuptools-rust/issues"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=011cd92e702dd9e6b1a26157b6fd53f5"

SRC_URI[sha256sum] = "94b1dd5d5308b3138d5b933c3a2b55e6d6927d1a22632e509fcea9ddd0f7e486"

inherit cargo pypi python_setuptools_build_meta native

DEPENDS += "python3-setuptools-scm-native python3-wheel-native python3-semantic-version-native"

RDEPENDS:${PN}:class-native += " \
    python3-semantic-version-native \
    python3-setuptools-native \
    python3-setuptools-scm-native \
    python3-toml-native \
    python3-typing-extensions-native \
    python3-wheel-native \
"

BBCLASSEXTEND = "native nativesdk"
