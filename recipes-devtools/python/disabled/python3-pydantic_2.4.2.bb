SUMMARY = "Data validation using Python type hints"
HOMEPAGE = "https://github.com/pydantic/pydantic"
AUTHOR = "Samuel Colvin <s@muelcolvin.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=09280955509d1c4ca14bae02f21d49a6"

SRC_URI[sha256sum] = "94f336138093a5d7f426aac732dcfe7ab4eb4da243c88f891d65deb4a2556ee7"

DEPENDS = "\
    python3-hatch-fancy-pypi-readme \
        "

RDEPENDS_${PN} = " \
	"

inherit pypi python_hatchling

