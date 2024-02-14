SUMMARY = "The next generation HTTP client."
HOMEPAGE = ""
AUTHOR = " <Tom Christie <tom@tomchristie.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c624803bdf6fc1c4ce39f5ae11d7bd05"

SRC_URI[md5sum] = "f4c89d0917405c82edc95df52d503003"
SRC_URI[sha256sum] = "47ecda285389cb32bb2691cc6e069e3ab0205956f681c5b2ad2325719751d875"

inherit pypi python_hatchling

DEPENDS:append = " python3-hatch-fancy-pypi-readme-native "

#SRC_URI += " \
#	file://0001-no-fancy-readme.patch \
#"

RDEPENDS_${PN} = " \
	python3-certifi \
	python3-httpcore \
	python3-idna \
	python3-sniffio \
	"

