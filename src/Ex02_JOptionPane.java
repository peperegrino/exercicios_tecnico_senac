
import javax.swing.JOptionPane;

    public class Ex02_JOptionPane {
        public static void main(String[] args) {
            String nomeCompleto = JOptionPane.showInputDialog("Digite seu nome completo:");
            String cpf = JOptionPane.showInputDialog("Digite seu CPF:");

            String mensagem = "Nome: " + nomeCompleto + "\nCPF: " + cpf;
            JOptionPane.showMessageDialog(null, mensagem, "Dados informados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
