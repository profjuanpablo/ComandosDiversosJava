import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		 String nome = JOptionPane.showInputDialog("Digite o seu nome");
		 double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu nome"));
		 double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu nome"));
		 double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu nome"));
		 
		                //precedência de Cálculo
		 double media = (n1+n2+n3)/3;
		                
		 if(media>=6) {
			JOptionPane.showMessageDialog(null, "Sua média foi: "+media+"\nAluno Aprovado");
			 
		 } else {
			 JOptionPane.showMessageDialog(null, "Sua média foi: "+media+"\nAluno Reprovado");
		 }
		
	}

}
