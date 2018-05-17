package exercicio06;

import javax.swing.JOptionPane;

public class Notas {

	String nome;
	int totalpessoas = 0;
	String sexo;
	double nota1, nota2, nota3, nota4;
	int totalavaliacoes = 0;
	int masculino = 0, feminino = 0;
	double m, f;
	double media;
	int p, o, b, s, rec, rep;
	double p1, o1, b1, s1, rec1, rep1;

	// Obter Dados
	public void obterDados() {

		nome = JOptionPane.showInputDialog("Informe o nome.");
		totalpessoas++;
		sexo = JOptionPane.showInputDialog("Informe o sexo.\nM para Masculino.\nF para Feminino.");
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 1� nota."));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 2� nota."));
		nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 3� nota."));
		nota4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 4� nota."));
		totalavaliacoes++;

	}

	// La�o
	public void laco() {

		int continuar = 0;

		do {
			obterDados();
			sexo();
			tirarmedia();
			per1();
			per2();
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");

		} while (continuar == 0);
		
		exibir();		

	}

	// Contabilizar sexo
	public void sexo() {

		if (sexo.equals("M")) {
			masculino++;
		} else if (sexo.equals("F")) {
			feminino++;
		}

	}

	// Criar media
	public void tirarmedia() {

		media = (nota1 + nota2 + nota3 + nota4)/4;

		if (media == 10) {
			p++;
		}
		if ((media >= 9) && (media <= 9.9)) {
			o++;
		}
		if ((media >= 8) && (media <= 8.9)) {
			b++;
		}
		if ((media >= 7) && (media <= 7.9)) {
			s++;
		}
		if ((media >= 5) && (media <= 6.9)) {
			rec++;
		}
		if (media < 5) {
			rep++;
		}

	}

	// Percentual sexo
	public void per1() {

		m = (100 / totalpessoas) * masculino;
		f = (100 / totalpessoas) * feminino;

	}

	// Percentual avalia��es
	public void per2() {
		
		p1 = (100/totalavaliacoes)*p;
		o1 = (100/totalavaliacoes)*o;
		b1 = (100/totalavaliacoes)*b;
		s1 = (100/totalavaliacoes)*s;
		rec1 = (100/totalavaliacoes)*rec;
		rep1 = (100/totalavaliacoes)*rep;
		
	}

	// Exibir Dados
	public void exibir() {
		
		String msg = "Quantidade e percentual de:\n\nHomens: "+masculino+" | "+m+"%\nMulheres: "+feminino+" | "+f+"%";
			   msg+= "\n\nQuantidade e percentual de avalia��es: \n\nParab�ns: "+p+" | "+p1+"%\n";
			   msg+= "\n\nQuantidade e percentual de avalia��es: \n\n�timo: "+o+" | "+o1+"%\n";
			   msg+= "\n\nQuantidade e percentual de avalia��es: \n\nBom: "+b+" | "+b1+"%\n";
			   msg+= "\n\nQuantidade e percentual de avalia��es: \n\nSatisfat�rio: "+s+" | "+s1+"%\n";
			   msg+= "\n\nQuantidade e percentual de avalia��es: \n\nRecupera��o: "+rec+" | "+rec1+"%\n";
			   msg+= "\n\nQuantidade e percentual de avalia��es: \n\nReprovado: "+rep+" | "+rep1+"%";
			   
			   JOptionPane.showMessageDialog(null, msg);
		
	}
	
}
