SUMMARY = "Argon2 for Python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e91e96ef55f45fe9caf7fc3e73672c4b"

SRC_URI[sha256sum] = "879c3e79a2729ce768ebb7d36d4609e3a78a4ca2ec3a9f12286ca057e3d0db08"

DEPENDS = "\
    python3-hatch-fancy-pypi-readme-native \
    python3-hatch-vcs-native \
"

RDEPENDS:${PN} = "\
    python3-argon2-cffi-bindings \
    python3-typing-extensions \
"

PYPI_PACKAGE = "argon2_cffi"

inherit pypi python_hatchling
