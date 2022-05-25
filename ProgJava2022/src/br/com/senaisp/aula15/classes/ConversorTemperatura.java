package br.com.senaisp.aula15.classes;

public class ConversorTemperatura {
	private int tipotempOri;
	private int tipotempDes;
	private double temperatura;
	public ConversorTemperatura() {
		// TODO Auto-generated constructor stub
		this.tipotempOri= 1; //tipo da temperatura origem
		this.tipotempDes= 1; //tipo de temperatura destino
		this.temperatura = 0; //valor temperatura
	}
	public int getTipotempOri() {
		return tipotempOri;
	}
	public void setTipotempOri(int tipotempOri) throws Exception {
		if (tipotempOri != 1 && tipotempOri != 2 && tipotempOri != 3) {
			throw new Exception("Valor inválido!");
			
		}
		this.tipotempOri = tipotempOri;
	}
	public int getTipotempDes() {
		return tipotempDes;
	}
	/**
	 * Setter do tipo de temperatura destino
	 * valores validos: 1 Celsius, 
	 * @param tipotempDes Indicar valores de 1 a 3 
	 * @throws Exception Se valores inválidos, retorna erro
	 */
	
	
	
	
	public void setTipotempDes(int tipotempDes) throws Exception {
		if (tipotempDes != 1 && tipotempDes != 2 && tipotempDes != 3) {
			throw new Exception("Valor inválido!");
		}
		this.tipotempDes = tipotempDes;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


public double getTemperaturaConvertida() {
	double dblTempConv = this.temperatura;
	if (tipotempOri == 1) { // testando origem celsius
		if (tipotempDes == 2) { // testando destino Fahrenheit
			dblTempConv = temperatura * 9 / 5 + 32;
		} else if (tipotempDes == 3) { // testando destino kelvin
			dblTempConv = dblTempConv + 273;
		}
	} else if (tipotempOri == 2) { // testando origem fahrenheit
		if (tipotempDes == 1) { // testando destino Celsius
			dblTempConv = ( temperatura - 32 ) * 5 / 9;
		} else if (tipotempDes == 3) { // testando destino kelvin
			dblTempConv = ( temperatura - 32 ) * 5 / 9 + 273;
		}
	} else { // Calculand origem Kelvin
		if (tipotempDes == 1) { // testando destino Celsius
			dblTempConv = temperatura - 273;
		} else if (tipotempDes == 2) { // testando destino Fahenheit
			dblTempConv = ( temperatura - 273 ) * 9 / 5 + 32;
		}
	}
	return dblTempConv;	
}
}
