COMPATIBLE_MACHINE = "cuberevo|cuberevo_250hd|cuberevo_2000hd|cuberevo_3000hd|cuberevo_mini|cuberevo_mini2|cuberevo_mini_fta|cuberevo_9500hd"

require ${META-SH4-NAME}/recipes-bsp/linux/linux-sh4.inc

STXNUMBER = "stx7109"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-sh4:"

SRC_URI_append += "\
    file://linux-sh4-${MACHINE}_setup_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-sh4-i2c-st40-pio_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-sh4-cuberevo_rtl8201_stm24_${STM_PATCH_STR}.patch;patch=1 \
    ${@bb.utils.contains_any("MACHINE", "cuberevo_250hd cuberevo_mini_fta", "file://linux-sh4-${MACHINE}_sound_stm24_${STM_PATCH_STR}.patch;patch=1", "", d)} \
"

MACHINE_KERNEL_PR_append = ".2"
