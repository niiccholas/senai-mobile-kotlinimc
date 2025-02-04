import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

// classe paciente
// Programador: Celso
// Data: 04/02/2025
class Paciente {

    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Float = 0.0f
    var telefone: String = ""

    fun calcularImc(): Float{
        var imc = peso / altura.pow(2)
        return imc
    }

    fun mostrarDados(){
        println("DADOS DO PACIENTE")
        println("--------------------------")
        println("Nome: $nome")
        println("Idade: ${calcularIdade()}")
        println("Peso: $peso" + "kg")
        println("Altura: $altura")
        println("IMC: ${calcularImc()}")
        println("CLASSIFICAÇÃO: ${classificarImc()}")
        println("--------------------------")
    }

    fun classificarImc(): String{
        val imc = calcularImc()
        var classificacao = ""

        if(imc <= 18.5){
            classificacao = "Abaixo do peso"
        }else if(imc >= 18.6 && imc < 25.0){
            classificacao = "Peso ideal"
        }else{
            classificacao = "Acima do peso"
        }
        return classificacao
    }

    fun calcularIdade(): Int{
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje).years
        return idade
    }
}