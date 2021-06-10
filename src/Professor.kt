class Professor (
    val nome: String,
    val sobrenome: String,
    tempoDeCasa: Int,
    val codigoDoProfessor: Int
){
    override fun equals(other: Any?): Boolean {
        return (other is Professor) && this.codigoDoProfessor == other.codigoDoProfessor
    }

}