inherit python_hatchling

SUMMARY = "The little ASGI library that shines."
HOMEPAGE = ""
AUTHOR = " <Tom Christie <tom@tomchristie.com>>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=11e8c8dbfd5fa373c703de492140ff7a"

SRC_URI = "https://files.pythonhosted.org/packages/e1/4b/fcd426d9477554d31dacb0c8069828466841b69ad26c8cfab9c5321830ec/starlette-0.31.1.tar.gz"
SRC_URI[md5sum] = "3183f97a8c581ca280d7ffe57a097b63"
SRC_URI[sha256sum] = "a4dc2a3448fb059000868d7eb774dd71229261b6d49b6851e7849bec69c0a011"

S = "${WORKDIR}/starlette-0.31.1"

RDEPENDS_${PN} = " \
	python3-anyio \
	python3-python-multipart \
"
