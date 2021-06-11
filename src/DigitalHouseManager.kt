class DigitalHouseManager {
    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigoDoCurso: Int, qtdMaxima: Int ){
        val curso = Curso(nome, codigoDoCurso, qtdMaxima)
        listaDeCursos.add(curso)
    }

    fun excluirCurso(codigoDoCurso: Int){
        listaDeCursos.removeAll {
            it.codigoDoCurso == codigoDoCurso
        }
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigo: Int,
        horasDeMonitoria: Int){

        val professor = ProfessorAdjunto(nome, sobrenome, codigo, horasDeMonitoria)
        listaDeProfessores.add(professor)

    }

    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigo: Int,
                                  especialidade: String){

    }

    fun excluirProfessor(codigo: Integer)

    fun registrarAluno(nome: String,
                       sobrenome: String,
                       codigoAluno: Int)

    fun matricularAluno(codigoAluno: Int,
                        codigoDoCurso: Int)

    fun alocarProfessores(codigoDoCurso: Int,
                          codigoProfessorTitular: Int,
                          codigoProfessorAdjunto: Int)
}
