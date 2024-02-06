SUMMARY = "Low-level CFFI bindings for Argon2"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4642dfcbd13c1cc49e9f99df9de51ba1"

SRC_URI[sha256sum] = "5b3c72b092761e9aa8a8335096c409e9d68d127ae64520848d1d9d47459c4650"

SRC_URI = "\
    file://no-sse2.patch \
"

DEPENDS = "\
    phc-winner-argon2 \
    python3-cffi-native \
    python3-setuptools-scm-native \
"

RDEPENDS:${PN} = "\
    python3-cffi \
"

inherit pypi python_setuptools_build_meta
