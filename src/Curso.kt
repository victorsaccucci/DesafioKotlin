class Curso(
    val nome: String,
    val codigoDoCurso: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val qtdMaxima: Int,
    private var listaAlunos: MutableList<Aluno> = mutableListOf()
) {

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

    fun excluirAluno(aluno: Aluno){
        listaAlunos.remove(aluno)
    }
}