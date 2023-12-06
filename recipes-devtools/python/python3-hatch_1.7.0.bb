SUMMARY = "Modern, extensible Python project management"
HOMEPAGE = "https://hatch.pypa.io/latest/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b2d8ecec3b363659695a29c2d11c8a88"

inherit pypi python_hatchling

DEPENDS += " \
    python3-hatch-vcs \
    "

SRC_URI[sha256sum] = "7afc701fd5b33684a6650e1ecab8957e19685f824240ba7458dcacd66f90fb46"

BBCLASSEXTEND = "native nativesdk"
