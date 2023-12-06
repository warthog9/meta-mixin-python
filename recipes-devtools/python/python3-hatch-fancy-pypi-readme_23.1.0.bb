SUMMARY = "Your ✨Fancy✨ Project Deserves a ✨Fancy✨ PyPI Readme!"
HOMEPAGE = "https://pypi.org/project/hatch-fancy-pypi-readme/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ba5633c60bd3e243091013aa83b4d807"

inherit pypi python_hatchling

PYPI_PACKAGE = "hatch_fancy_pypi_readme"

SRC_URI[sha256sum] = "b1df44063094af1e8248ceacd47a92c9cf313d6b9823bf66af8a927c3960287d"

DEPENDS += " \
    "

BBCLASSEXTEND = "native nativesdk"
