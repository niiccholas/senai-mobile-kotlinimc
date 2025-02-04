import java.time.LocalDate
import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()

    print("Digite o nome do paciente: ")
    paciente1.nome = leitor.nextLine()
    print("Digite o peso do paciente: ")
    paciente1.peso = leitor.nextInt()
    print("Digite a altura do paciente: ")
    paciente1.altura = leitor.nextFloat()
    print("Digite o telefone do paciente: ")
    paciente1.telefone = "(11) 97777-0009"
    paciente1.dataNascimento = LocalDate.of(2002, 8, 13)
    paciente1.mostrarDados()

    paciente2.nome = "Nicolas Silva"
    paciente2.peso = 75
    paciente2.altura = 1.76f
    paciente2.telefone = "(11) 99999-3355"
    paciente2.dataNascimento = LocalDate.of(2007, 10, 10)
    paciente2.mostrarDados()
}