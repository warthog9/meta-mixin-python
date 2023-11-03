SUMMARY = "Backport of PEP 654 (exception groups)"
HOMEPAGE = "https://github.com/agronholm/exceptiongroup"
AUTHOR = "Alex Grönholm <alex.gronholm@nextday.fi>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5caa317463c433575efff1d2fe206d7"

SRC_URI[md5sum] = "300905b0518d0bc235ddcfbf01bd5719"
SRC_URI[sha256sum] = "097acd85d473d75af5bb98e41b61ff7fe35efe6675e4f9370ec6ec5126d160e9"

RDEPENDS_${PN} = ""

inherit pypi python_flit_core
