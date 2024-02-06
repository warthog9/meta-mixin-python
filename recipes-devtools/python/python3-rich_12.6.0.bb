SUMMARY = "Render rich text, tables, progress bars, syntax highlighting, markdown and more to the terminal"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

SRC_URI[sha256sum] = "ba3a3775974105c221d31141f2c116f4fd65c5ceb0698657a11e9f295ec93fd0"

#    python3-markdown-it-py 
RDEPENDS:${PN} = "\
    python3-commonmark \
"

inherit pypi python_poetry_core
