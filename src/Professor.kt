abstract class Professor {
    abstract val nome: String
    abstract val sobrenome: String
    abstract val codigoDoProfessor: Int
    var tempoDeCasa: Int = 0

    override fun equals(other: Any?): Boolean {
        return (other is Professor) && this.codigoDoProfessor == other.codigoDoProfessor
    }
}

class ProfessorTitular(
    override val nome: String,
    override val sobrenome: String,
    override val codigoDoProfessor: Int,
    val especialidade: String
) : Professor() {

}

class ProfessorAdjunto(
    override val nome: String,
    override val sobrenome: String,
    override val codigoDoProfessor: Int,
    val hosrasDeMonitoria: Int
) : Professor() {

}


