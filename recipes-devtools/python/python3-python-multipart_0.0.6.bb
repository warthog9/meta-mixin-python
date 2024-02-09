SUMMARY = "A streaming multipart parser for Python"
HOMEPAGE = "https://github.com/andrew-d/python-multipart"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3d98f0d58b28321924a89ab60c82410e"

SRC_URI[sha256sum] = "e9925a80bb668529f1b67c7fdb0a5dacdd7cbfc6fb0bff3ea443fe22bdd62132"

PYPI_PACKAGE = "python_multipart"

#PYPI_SRC_URI = "https://files.pythonhosted.org/packages/source/python-multipart/python_multipart-${PV}.tar.gz"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/2d/23/abcfad10c3348cb6358400f8adbc21b523bbc6c954494fd0974428068672/python_multipart-0.0.6.tar.gz"

inherit pypi python_hatchling
