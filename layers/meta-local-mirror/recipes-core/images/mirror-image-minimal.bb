SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"


# Packages from external layers
IMAGE_INSTALL += "kernel-modules \
    mtd-utils \
    mmc-utils \
    dropbear \
    xauth \
    "

# Packages from local layers
IMAGE_INSTALL += " mechanical-mirror \
    "

