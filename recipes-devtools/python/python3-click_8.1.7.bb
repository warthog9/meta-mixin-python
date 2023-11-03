SUMMARY = "Composable command line interface toolkit"
HOMEPAGE = "https://palletsprojects.com/p/click/"
AUTHOR = "Pallets Projects"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "7c3b52c56fd30699f453a7dc7b42cecb"
SRC_URI[sha256sum] = "ca9853ad459e787e2192211578cc907e7594e294c7ccc834310722b41b9ca6de"

RDEPENDS_${PN} = ""

inherit pypi python_setuptools_build_meta
