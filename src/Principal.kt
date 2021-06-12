fun main() {
    val gerente = DigitalHouseManager()

    gerente.registrarProfessorTitular("Victor", "Saccucci", 123, "Física")
    gerente.registrarProfessorTitular("Oto", "Luna", 321, "Hisória")


    gerente.registrarProfessorAdjunto("Maria", "cristina", 5467, 10)
    gerente.registrarProfessorAdjunto("Hammer", "Steves", 6545, 15)

    gerente.registrarCurso("Full Stack", 4343, 3)
    gerente.registrarCurso("Android", 6347, 2)

    gerente.alocarProfessores(4343, 123, 5467)
    gerente.alocarProfessores(6347, 321, 6545)

    gerente.registrarAluno("Zé", "colmeia", 12)
    gerente.registrarAluno("Ká", "Tatau", 123)
    gerente.registrarAluno("Chaves", "Delotcho", 1234)

    //Full Stack

    gerente.matricularAluno(12, 4343)
    gerente.matricularAluno(123, 4343)

    //Android

    gerente.matricularAluno(12, 6347)
    gerente.matricularAluno(123, 6347)
    gerente.matricularAluno(1234, 6347)

    println(gerente)

    println(gerente.buscarCursoAluno(12))

}
