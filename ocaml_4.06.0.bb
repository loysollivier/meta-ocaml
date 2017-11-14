DESCRIPTION = "OCaml is an implementation of the ML language, based on the Caml Light \
dialect extended with a complete class-based object system and a powerful \
module system in the style of Standard ML."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f72f33f302a53dc329f4d3819fe14f9"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "http://caml.inria.fr/pub/distrib/ocaml-4.06/ocaml-${PV}.tar.gz"
SRC_URI[md5sum] = "66e5439eb63dbb8b8224cba5d1b20947"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/ocaml-${PV}"

DEPENDS = " \
    diffutils \
    libx11 \
"

RDEPENDS_${PN} = " \
    diffutils \
    libx11 \
"

inherit autotools pkgconfig
