# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97ba219b479900241a90026f4d22b403"

SRC_URI = "git://github.com/P-H-C/phc-winner-argon2.git;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "f57e61e19229e23c4445b85494dbf7c07de721cb"

S = "${WORKDIR}/git"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install 'DESTDIR=${D}'

        mv \
            "${D}/usr/lib/x86_64-linux-gnu/"* \
            "${D}/usr/lib/"
        rmdir "${D}/usr/lib/x86_64-linux-gnu"

}

FILES:${PN} = "\
    /usr/bin/argon2 \
    /usr/lib/libargon2.so.1 \
    /usr/lib/libargon2.a \
    /usr/lib/libargon2.so \
    /usr/lib/pkgconfig/libargon2.pc \
"


INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
