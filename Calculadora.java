    public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao Tipo da operação: "divisao"
     * @param operacao Tipo da operação: "subtracao", "multiplicacao"
     * @param operacao Tipo da operação: "soma"
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "divisao":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida!");
                }
                return (double) a / b;
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
            case "soma":
                return a + b;
            
        }
    }

    // Método principal para testar
    //COMENTÁRIO SOLICITADO NO ITEM 11
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Divisão: " + calc.calcular("divisao", 10, 5));
        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));

        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
    }
}

