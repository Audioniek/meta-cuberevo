require conf/machine/include/oem-sh4.inc
require conf/machine/include/smallflash.inc

PREFERRED_PROVIDER_virtual/kernel = "linux-sh4-cuberevo"

ROOTFS_FILE = "root.img"
KERNEL_FILE = "uImage"

IMAGE_FSTYPES += "tar.gz"

AUDIOELF = "audio_7109.elf"
VIDEOELF = "video_7109.elf"

SOC_FAMILY = "sti7109"

DVB1FIRMWARE = "dvb-fe-cx24116.fw"
DVB2FIRMWARE = "dvb-fe-stv6306.fw"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	stlinux24-sh4-stx7109-fdma-firmware \
	firmware-sh4-stm \
	evremote2 \
        enigma2-plugin-extensions-cuberevovfd \
"

MACHINE_FEATURES += "ci modcuberevo debug4"
