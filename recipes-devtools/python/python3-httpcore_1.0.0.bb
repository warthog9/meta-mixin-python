SUMMARY = "A minimal low-level HTTP client."
HOMEPAGE = ""
AUTHOR = " <Tom Christie <tom@tomchristie.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=1c1f23b073da202e1f4f9e426490210c"

SRC_URI[md5sum] = "993e8a2cf2f57f75068d5aed42055576"
SRC_URI[sha256sum] = "b8c3a34536aa434297a5e4c8b7057496823cb9a417f7ee859ec0320e60f06337"

RDEPENDS_${PN} = "\
        python3-certifi \
        python3-h11 \
        "

inherit pypi python_hatchling

DEPENDS:append = " python3-hatch-fancy-pypi-readme-native "
