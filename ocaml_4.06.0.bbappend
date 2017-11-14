CONFIGUREOPTS = " \
          --host aarch64-linux \
          --target ${TARGET_SYS} \
          --prefix ${prefix} \
          --bindir ${bindir} \
          --libdir ${libdir} \
          --mandir ${mandir} \
          "


EXTRA_OECONF := ""
DISABLE_STATIC := ""
