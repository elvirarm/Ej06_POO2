class Domicilio (val calle: String, val numero: Int) {

    fun dirCompleta(): String{

        return "Calle: $calle Número: $numero"
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Domicilio) return false
        return this.calle == other.calle && this.numero == other.numero
    }

    override fun hashCode(): Int {
        return calle.hashCode() * 31 + numero.hashCode()
    }

    override fun toString(): String {
        return "Domicilio(calle='$calle', numero=$numero)"
    }
}
