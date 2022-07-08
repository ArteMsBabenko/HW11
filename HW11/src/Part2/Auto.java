package Part2;

public class Auto {
	
	 private int HorsePower;
	 private int ProductionYear;
	 private Helm Helm;
	 private Engine Engine;
	 
	 public Auto(int HorsePower, int ProductionYear, Helm Helm, Engine Engine) {
		 this.HorsePower = HorsePower;
		 this.ProductionYear = ProductionYear;
		 this.Helm = Helm;
		 this.Engine = Engine;
	}

	public int getHorsePower() {
		return HorsePower;
	}

	public int getProductionYear() {
		return ProductionYear;
	}

	public Helm getHelm() {
		return Helm;
	}

	public Engine getEngine() {
		return Engine;
	}

	@Override
	public String toString() {
		return "Auto [HorsePower=" + HorsePower + ", ProductionYear=" + ProductionYear + ", HelmDiameter="
				+ Helm.getHelmDiameter() + ", HelmMaterials=" + Helm.getHelmMaterials() + ", NumberOfCylinders="
				+ Engine.getNumberOfCylinders() + "]";
	}
	
	
	 

}
