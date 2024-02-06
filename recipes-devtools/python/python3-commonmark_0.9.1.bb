SUMMARY = "Python parser for the CommonMark Markdown spec"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37e127eb75a030780aefcfc584e78523"

SRC_URI[sha256sum] = "452f9dc859be7f06631ddcb328b6919c67984aca654e5fefb3914d54691aed60"

RDEPENDS:${PN} = "\
"

inherit pypi python_setuptools_build_meta
