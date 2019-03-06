COMPATIBLE_MACHINE = "cuberevo|cuberevo_250hd|cuberevo_2000hd|cuberevo_3000hd|cuberevo_mini|cuberevo_mini2|cuberevo_mini_fta|cuberevo_9500hd"
SUMMARY = "SH4 driver modules from TDT/Audioniek"
DESCRIPTION = "SH4 driver modules from TDT/Audioniek"
SECTION = "base"
PRIORITY = "required"
PACKAGE_ARCH = "${MACHINE_ARCH}"
LICENSE = " GPLv2"
LIC_FILES_CHKSUM = "file://${S}/README.md;md5=244c89982fccbe7b4861f60288c744e4"

RDEPENDS_${PN} = "stinit"

PROVIDES = "sh4-driver-modules"
RPROVIDES_${PN} = "sh4-driver-modules"

require ${META-SH4-NAME}/recipes-bsp/drivers/sh4-driver-modules.inc

SRC_URI += " \
    file://modules.conf \
    file://modules-conf.conf \
"
