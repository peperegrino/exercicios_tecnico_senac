import javax.swing.JOptionPane;

public class Ex04_JOptionPane {
    public static void main(String[] args) {
        String menu = "Escolha uma opcao:\n1 - Cadastrar usuario\n2 - Consultar dados\n3 - Sair";
        String opcaoStr = JOptionPane.showInputDialog(null, menu, "Menu de Opcoes", JOptionPane.QUESTION_MESSAGE);

        if (opcaoStr == null) {
            JOptionPane.showMessageDialog(null, "Encerrando.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int opcao;
        try {
            opcao = Integer.parseInt(opcaoStr.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opcao invalida!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "Voce escolheu: Cadastrar usuario.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, "Voce escolheu: Consultar dados.", "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else if (opcao == 3) {
            JOptionPane.showMessageDialog(null, "Saindo. Ate logo!", "Saida", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Opcao invalida! Digite 1, 2 ou 3.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
