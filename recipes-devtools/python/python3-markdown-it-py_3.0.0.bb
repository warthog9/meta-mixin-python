SUMMARY = "Python port of markdown-it. Markdown parsing, done right!"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a38a1697260a7ad7bf29f44b362db1fc"

SRC_URI[sha256sum] = "e3f60a94fa066dc52ec76661e37c851cb232d92f9886b15cb560aaada2df8feb"

RDEPENDS:${PN} = "\
    python3-mdurl \
"

inherit pypi python_flit_core
