import java.util.Scanner;

public class processoSelet {

    int idade;
    char curso, email, nome_completo, mensagem, cargo;

    public processoSelet(){
        //constructor
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Olá, bem vindo ao programa de automatização do processo seletivo.\n");

        System.out.println("Por favor digite seu nome completo: ");
        String nome_completo = obj.nextLine();
        
        System.out.println("Por favor digite seu email: ");
        String email = obj.nextLine();

        System.out.println("Por favor digite o cargo de interesse: ");
        String cargo = obj.nextLine();

        //idade
        System.out.println("Por favor, digite a idade do candidato: ");
        int idade = obj.nextInt();
        if (idade >= 18) {
            System.out.println("Parabéns você passou para a próxima fase!\n");
        }else{
            System.out.println("Desculpe, idade insuficiente! Obrigado por participar do processo seletivo.");
            return;
        }

/*         public static boolean same (String va1, String var2){
            if (curso == "S")
                return true;
            else
                return false;
            
        }
 */

        //curso
        System.out.println("Você possui o curso de qualificação necessário para o trabalho? Se sim digite S, se não, digite N: ");
        String curso = obj.next();

        if (curso.equals ("S")) {
            System.out.println("Parabéns você passou para a próxima fase!\n");
        }else{
            System.out.println("Desculpe, é necessário que o participante possua o curso de qualificação! Obrigado por participar do processo seletivo.");
            return;
        }

        //nota
        System.out.println("Por favor digite a nota do participante: ");
        int nota = obj.nextInt();

        if (nota >= 7) {
            System.out.println("Parabéns você passou para a próxima fase!\n");
        }else{
            System.out.println("Desculpe, nota insuficiente! Obrigado por participar do processo seletivo.");
            return;
        }

        System.out.println("Parabéns você passou por todas as etapas iniciais do processo seletivo e poderá prosseguir para a fase final! \nFique atento ao seu email para futuras informações da etapa final.\n");
        return;
    }

    


    

}