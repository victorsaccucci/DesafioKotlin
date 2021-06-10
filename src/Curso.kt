class Curso(
    val nome: String,
    val codigoDoCurso: Int
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val qtdMaxima: Int,
    val listaAlunos: MutableList<Aluno> = mutableListOf()
) {

    override fun equals(other: Any?): Boolean {
        return (other is Curso) && this.codigoDoCurso == other.codigoDoCurso

    }
}


