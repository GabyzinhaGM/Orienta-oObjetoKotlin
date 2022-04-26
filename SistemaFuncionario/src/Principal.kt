package sistemafuncionario.funcionario

fun main() {
    val funcionario: Funcionario = Funcionario()
    funcionario.nome = "Gabriela"
    funcionario.sobrenome = "Godoy"
    funcionario.horasTrabalhadas = 8
    funcionario.valorHora = 30.00

    println("Funcionário ${funcionario.nome} ${funcionario.sobrenome},")
    println("Trabalhou ${funcionario.horasTrabalhadas} horas")
    println("Recebeu" + (funcionario.valorHora * funcionario.horasTrabalhadas) + " reais")

}