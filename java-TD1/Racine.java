package oui;

public class Racine
{
	private double precision;
	Racine(double precision) {
		this.precision=precision;
	}
	double racine(double operande)
			throws NegException {
		if(operande < 0)
			throw new NegException();
		else
		{
			double solution, carre, a, b;
			a=0;
			b=operande; solution=(a+b)/2; while(b-a>precision)
			{
				carre=solution*solution;
				if (carre>operande)
					b=solution;
				else
					a=solution;
				solution=(a+b)/2;
			}
			return solution;
		}
	}
	double getPrecision() { return precision; }
	void setPrecision(double precision) { this.precision=precision; }
}