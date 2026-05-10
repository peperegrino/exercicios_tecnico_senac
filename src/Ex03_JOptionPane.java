import javax.swing.JOptionPane;

public class Ex03_JOptionPane {
    public static void main(String[] args) {
        String[] mensagens = {
                "Mensagem 1: Olá professor",
                "Mensagem 2: Ainda ta testando?",
                "Mensagem 3: Pode confiar, vai exibir as 8",
                "Mensagem 4: Até porque. é cntrl c cntrl v ",
                "Mensagem 5: Continuando...",
                "Mensagem 6: ta acabando",
                "Mensagem 7: Quase",
                "Mensagem 8: Falei pra voce"
        };

        for (int i = 0; i < 8; i++) {
            JOptionPane.showMessageDialog(null, mensagens[i],
                    "Caixa " + (i + 1) + " de 8", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
