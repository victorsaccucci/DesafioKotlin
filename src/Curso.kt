class Curso(
    val nome: String,
    val codigoDoCurso: Int
) {

    override fun equals(other: Any?): Boolean {
        return (other is Curso) && this.codigoDoCurso == other.codigoDoCurso

    }
}