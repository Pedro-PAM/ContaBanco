public class ReprodutorMusical {
    public void exemploMetodo1() {
        System.out.println("Exemplo do método exemploMetodo1 em ReprodutorMusical");
    }

    public void exemploMetodo2(String exemplo) {
        System.out.println("Exemplo do método exemploMetodo2 em ReprodutorMusical com argumento: " + exemplo);
    }
}

public class AparelhoTelefonico extends ReprodutorMusical {
    @Override
    public void exemploMetodo1() {
        System.out.println("Exemplo do método exemploMetodo1 em AparelhoTelefonico");
    }

    @Override
    public void exemploMetodo2(String exemplo) {
        System.out.println("Exemplo do método exemploMetodo2 em AparelhoTelefonico com argumento: " + exemplo);
    }
}

public class NavegadorInternet extends ReprodutorMusical {
    @Override
    public void exemploMetodo1() {
        System.out.println("Exemplo do método exemploMetodo1 em NavegadorInternet");
    }

    @Override
    public void exemploMetodo2(String exemplo) {
        System.out.println("Exemplo do método exemploMetodo2 em NavegadorInternet com argumento: " + exemplo);
    }
}

public class iPhone extends AparelhoTelefonico {
    // Poderiam ser adicionados métodos específicos para o iPhone, se necessário
}

