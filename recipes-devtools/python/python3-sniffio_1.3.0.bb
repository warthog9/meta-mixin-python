SUMMARY = "Sniff out which async library your code is running under"
HOMEPAGE = "https://github.com/python-trio/sniffio"
AUTHOR = "Nathaniel J. Smith <njs@pobox.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=e62ba5042d5983462ad229f5aec1576c"

SRC_URI[md5sum] = "abb96bcda81817d6c632915c53ac29c8"
SRC_URI[sha256sum] = "e60305c5e5d314f5389259b7f22aaa33d8f7dee49763119234af3755c55b9101"

RDEPENDS_${PN} = ""

inherit pypi setuptools3
