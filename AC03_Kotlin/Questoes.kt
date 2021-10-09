/*1. Crie uma classe ENUM contendo 4 notas dos alunos durante o semestre
letivo. Exiba cada uma das propriedades em console. Repare que as notas
devem ser inicializadas como Double.*/

enum class Aluno(val notas: Double) {
	nota1(5.6),
	nota2(7.5),
	nota3(8.5),
    nota4(10.0),
}

fun main() {
	var result1 = Aluno.nota1
    var result2 = Aluno.nota2
    var result3 = Aluno.nota3
    var result4 = Aluno.nota4
	println(result1.notas)
    println(result2.notas)
    println(result3.notas)
    println(result4.notas)
}

/*-------------------------------------------------------------------------------------------------------*/
