package com.example.component.column


class TypeCharInvl(name: String) : Column(name) {

    override val   type = TypeColumn.CHARINVL.name

    override fun validate(value: String): Boolean {
        val buf = value.replace(" ", "").split(",").toTypedArray()
        if (buf.size == 2 && buf[0].length == 1 && buf[1].length == 1) {
            val a = buf[0][0]
            val b = buf[1][0]
            return a < b
        }
        return false
    }
}
