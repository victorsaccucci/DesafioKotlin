class DigitalHouseManager {
    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    override fun toString(): String {
        val toString = """
            Alunos = $listaDeAlunos
            Professores = $listaDeProfessores
            Cursos = $listaDeCursos
            Matriculas = $listaDeMatriculas
            """
        return toString
    }

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
    ) {
        val aluno = listaDeAlunos.find {
            it.codigoDoAluno == codigoAluno
        }
        val curso = listaDeCursos.find {
            it.codigoDoCurso == codigoDoCurso
        }
        if (aluno == null || curso == null)
            throw NullPointerException("n??o foi poss??vel encontrar aluno ou curso.")

        if (curso.adicionarAluno(aluno)) {
            val matricula = Matricula(aluno, curso)
            listaDeMatriculas.add(matricula)
            println("Aluno matriculado.")
        } else {
            println("Sem vaga para o curso.")
        }
    }

    fun alocarProfessores(
        codigoDoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {
        val professorTitular = listaDeProfessores.find {
            it.codigoDoProfessor == codigoProfessorTitular
        }

        val professorAdjunto = listaDeProfessores.find {
            it.codigoDoProfessor == codigoProfessorAdjunto
        }

        if (professorAdjunto == null || professorTitular == null)
            throw NullPointerException("Professor n??o encontrado")

        val curso = listaDeCursos.find {
            it.codigoDoCurso == codigoDoCurso
        }

        if (curso == null)
            throw NullPointerException("Esse curso n??o existe")

        curso.adicionaProfessor(professorTitular)
        curso.adicionaProfessor(professorAdjunto)
    }

    fun buscarCursoAluno(codigo: Int): List<Curso> {

        val listaDeMatricula = listaDeMatriculas.filter {
            it.aluno.codigoDoAluno == codigo
        }

        var listaDeCursos = mutableListOf<Curso>()
        listaDeMatricula.forEach {
            listaDeCursos.add(it.curso)
        }

        return listaDeCursos


    }

}
