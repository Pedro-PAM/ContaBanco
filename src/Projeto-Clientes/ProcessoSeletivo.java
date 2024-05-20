public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato (1900.0);
        analisarCandidato (2200.0);
        analisarCandidato (2000.0);
    }    
    
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    static void selecaoCandidatos(){
        String [] = candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + Solicitou este valor de salário " + salario Pretendido");
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatos Selecionados++;
            }                        
            candidatosAtual++;
    }
    }
    System.out.println("Processo seletivo");
    static void analisarCandidato (double salario Pretendido) {
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido) {
    System.out.println("LIGAR PARA O CANDIDATO");
    }
    else if (salarioBase==salario Pretendido)
    System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    else {
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
}
}