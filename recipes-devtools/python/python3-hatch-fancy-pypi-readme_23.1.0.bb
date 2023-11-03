SUMMARY = "Your ✨Fancy✨ Project Deserves a ✨Fancy✨ PyPI Readme!"
HOMEPAGE = "https://github.com/hynek/hatch-fancy-pypi-readme"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ba5633c60bd3e243091013aa83b4d807"

inherit python_hatchling

DEPENDS += " \
	python3-hatchling-native \
	"

SRC_URI += " \
	https://files.pythonhosted.org/packages/85/a6/58d585eba4321bf2e7a4d1ed2af141c99d88c1afa4b751926be160f09325/hatch_fancy_pypi_readme-23.1.0.tar.gz \
	"
SRC_URI[sha256sum] = "b1df44063094af1e8248ceacd47a92c9cf313d6b9823bf66af8a927c3960287d"

S = "${WORKDIR}/hatch_fancy_pypi_readme-${PV}"

do_compile:prepend() {
    export PYTHONPATH=src
}

BBCLASSEXTEND = "native nativesdk"
