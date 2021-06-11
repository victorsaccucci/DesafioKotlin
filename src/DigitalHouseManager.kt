class DigitalHouseManager {
    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigoDoCurso: Int, qtdMaxima: Int) {
        val curso = Curso(nome, codigoDoCurso, qtdMaxima)
        listaDeCursos.add(curso)
    }

    fun excluirCurso(codigoDoCurso: Int) {
        listaDeCursos.removeAll {
            it.codigoDoCurso == codigoDoCurso
        }
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigo: Int,
        horasDeMonitoria: Int
    ) {

        val professor = ProfessorAdjunto(nome, sobrenome, codigo, horasDeMonitoria)
        listaDeProfessores.add(professor)

    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigo: Int,
        especialidade: String
    ) {
        val professor = ProfessorTitular(nome, sobrenome, codigo, especialidade)
        listaDeProfessores.add(professor)
    }

    fun excluirProfessor(codigo: Int) {
        listaDeProfessores.removeAll {
            it.codigoDoProfessor == codigo
        }
    }

    fun registrarAluno(
        nome: String,
        sobrenome: String,
        codigoAluno: Int
    ) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(aluno)

    }

    fun matricularAluno(
        codigoAluno: Int,
        codigoDoCurso: Int
    )

    fun alocarProfessores(
        codigoDoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    )
}
