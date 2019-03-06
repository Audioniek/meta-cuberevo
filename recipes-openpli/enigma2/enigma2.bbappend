CXXFLAGS_append_sh4 += " -std=c++11 -fPIC -fno-strict-aliasing "

FILESEXTRAPATHS_prepend := "${THISDIR}:"

RPROVIDES_${PN} += "enigma2-plugin-extensions-cuberevovfd"

SRC_URI_append += "\
	${@bb.utils.contains("MACHINE", "cuberevo|cuberevo_250hd|cuberevo_mini_fta|cuberevo|cuberevo_2000hd|cuberevo_3000hd|cuberevo_mini|cuberevo_mini2", "file://enigma2-cuberevo-all.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "cuberevo_250hd", "file://enigma2-cuberevo-cuberevo_250hd.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "cuberevo_mini_fta", "file://enigma2-cuberevo-cuberevo_mini_fta.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "cuberevo_2000hd", "file://enigma2-cuberevo-cuberevo_2000hd.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "cuberevo_3000hd", "file://enigma2-cuberevo-cuberevo_3000hd.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "cuberevo_mini", "file://enigma2-cuberevo-cuberevo_mini.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "cuberevo_mini2", "file://enigma2-cuberevo-cuberevo_mini2.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "cuberevo_9500hd", "file://enigma2-cuberevo-cuberevo_9500hd.patch", "", d)} \
	"

