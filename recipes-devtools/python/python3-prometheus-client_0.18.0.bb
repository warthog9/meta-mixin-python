SUMMARY = "Python client for the Prometheus monitoring system."
HOMEPAGE = "https://github.com/prometheus/client_python"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "35f7a8c22139e2bb7ca5a698e92d38145bc8dc74c1c0bf56f25cca886a764e17"

PYPI_PACKAGE = "prometheus_client"

inherit pypi python_setuptools_build_meta
