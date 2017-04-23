package ar.edu.unlam.progbas2;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	
public Disco (Double radioInterior, Double radioExterior){
	this.radioInterior = radioInterior;
	this.radioExterior = radioExterior;
}
	
public Double calcularPerimetroInterir(){
	Double perimetroInterior;
	perimetroInterior = (Math.PI)*2*radioInterior;
	return perimetroInterior;
}

public Double calcularPerimetroExterior(){
	Double perimetroExterior;
	perimetroExterior = (Math.PI)*2*radioExterior;
	return perimetroExterior;
}

public Double calcularSuperficie(){
	Double superficie;
	superficie = ((Math.PI)*(radioInterior*radioInterior) - (Math.PI)*(radioExterior*radioExterior));
	return superficie;	
}

public Double getRadioInterior() {
	return radioInterior;
}

public void setRadioInterior(Double radioInterior) {
	this.radioInterior = radioInterior;
}

public Double getRadioExterior() {
	return radioExterior;
}

public void setRadioExterior(Double radioExterior) {
	this.radioExterior = radioExterior;
}


}
