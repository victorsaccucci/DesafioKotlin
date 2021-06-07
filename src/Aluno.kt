class Aluno(
    val nome: String,
    val sobrenome: String,
    val codigoDoAluno: Int
) {

    override fun equals(other: Any?): Boolean {
        return (other is Aluno) && this.codigoDoAluno == other.codigoDoAluno
    }

}