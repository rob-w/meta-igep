DESCRIPTION = "Writes a loader binary to a OneNAND/NAND flash memory device"
HOMEPAGE = "http://www.isee.biz"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://writeloader.c;beginline=7;endline=15;md5=224da4fda5ec4ba2cdc0aac70e48544f"

SRCREV="081469f74cd8c0442f0f3b2e655b4d524e648356"

PV = "0.1+git${SRCPV}"
PR = "r0"

SRC_URI = "git://git.isee.biz/pub/scm/writeloader.git;protocol=git "

do_compile() {
	oe_runmake
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/writeloader ${D}${bindir}/writeloader
}

S = "${WORKDIR}/git"

