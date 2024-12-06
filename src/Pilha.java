import java.util.Stack;

public class Pilha {
    private Stack<Character> pilha;

    public Pilha() {
        this.pilha = new Stack<>();
    }
    public boolean aceita(String cadeia) {
        for (char simbolo : cadeia.toCharArray()) {
            if (simbolo == '0') {
                pilha.push(simbolo);
            } else if (simbolo == '1') {
                if (pilha.isEmpty() || pilha.pop() != '0') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        Pilha ap = new Pilha();
        String[] cadeias = { "0011", "000111", "0101", "", "00001111", "01", "111000" };

        for (String cadeia : cadeias) {
            System.out.println("Cadeia: " + cadeia + " -> " + (ap.aceita(cadeia) ? "Aceita" : "Rejeitada"));
        }
    }
}
