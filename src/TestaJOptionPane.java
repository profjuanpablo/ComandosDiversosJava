import javax.swing.JOptionPane;

public class TestaJOptionPane {

	public static void main(String[] args) {
		int premio = 10;
		double salario = 1500.99;
		float pl = 1000.00f;
		
		double valortotal = salario+ pl;
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		JOptionPane.showMessageDialog(null, "Olá " + nome +" Sua idade é:" + idade +
				                      "\nSalário + pl: "+valortotal);
		
	}

}
