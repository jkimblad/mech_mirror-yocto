# Copyright (C) 2020 Jacob Kimblad <jacob.kimblad01@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Mechanical mirror drivers"
HOMEPAGE = "https://github.com/jkimblad/mechanical_mirror"
LICENSE = "CLOSED"

DEPENDS = "opencv"

SRC_URI = "git://github.com/jkimblad/mechanical_mirror;protocol=https;branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

