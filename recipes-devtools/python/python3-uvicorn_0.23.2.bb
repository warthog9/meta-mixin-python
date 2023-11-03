SUMMARY = "The lightning-fast ASGI server."
HOMEPAGE = "https://www.uvicorn.org/"
AUTHOR = " Tom Christie <tom@tomchristie.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=5c778842f66a649636561c423c0eec2e"

SRC_URI[md5sum] = "bd20bba1da2983599522bf1e4015a583"
SRC_URI[sha256sum] = "4d3cc12d7727ba72b64d12d3cc7743124074c0a69f7b201512fc50c3e3f1569a"

inherit pypi python_hatchling

DEPENDS:append = " python3-hatch-fancy-pypi-readme-native "

RDEPENDS_${PN} = " \
	python3-certifi \
	python3-httpcore \
	python3-idna \
	python3-sniffio \
	"

