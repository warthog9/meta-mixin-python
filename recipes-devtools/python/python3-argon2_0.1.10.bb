SUMMARY = "Bindings for the argon2 password hasher"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../legalcode.txt;md5=65d3616852dbf7b1a6d4b53b00626032"

SRC_URI:append = "\
    file://legalcode.txt \
"

SRC_URI[sha256sum] = "523a3d3b88f3a46244b4976a6ca81994705848538bbe9e41426ea54ccb75eb90"

DEPENDS = "\
    phc-winner-argon2 \
"

RDEPENDS:${PN} = "\
    phc-winner-argon2 \
"

inherit pypi python_setuptools_build_meta
