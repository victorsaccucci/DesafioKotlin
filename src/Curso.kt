class Curso(
    val nome: String,
    val codigoDoCurso: Int,
    val qtdMaxima: Int,
) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    private var listaAlunos: MutableList<Aluno> = mutableListOf()

    override fun equals(other: Any?): Boolean {
        return (other is Curso) && this.codigoDoCurso == other.codigoDoCurso

    }

    fun adicionarAluno(aluno: Aluno): Boolean {
        if (listaAlunos.size < qtdMaxima) {
            listaAlunos.add(aluno)
            return true
        }
        return false
    }

    fun excluirAluno(aluno: Aluno) {
        listaAlunos.remove(aluno)
    }

    fun adicionaProfessor(professor: Professor) {
        when (professor) {
            is ProfessorAdjunto -> professorAdjunto = professor
            is ProfessorTitular -> professorTitular = professor
        }
    }
}