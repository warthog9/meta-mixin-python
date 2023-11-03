SUMMARY = "Backported and Experimental Type Hints for Python 3.8+"
HOMEPAGE = "https://github.com/python/typing_extensions"
LICENSE = "Python Software Foundation License"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fcf6b249c2641540219a727f35d8d2c2"

PYPI_PACKAGE = "typing_extensions"

SRC_URI[md5sum] = "74bafe841fbd1c27324afdeb099babdf"
SRC_URI[sha256sum] = "df8e4339e9cb77357558cbdbceca33c303714cf861d1eef15e1070055ae8b7ef"

RDEPENDS_${PN} = ""

inherit pypi python_flit_core

BBCLASSEXTEND = "native nativesdk"
