package Part2;

public class Helm {
	
	private int HelmDiameter;
	private String HelmMaterials;
	
	public Helm(int HelmDiameter, String HelmMaterials) {
		this.HelmDiameter = HelmDiameter;
		this.HelmMaterials=HelmMaterials;
	}

	public int getHelmDiameter() {
		return HelmDiameter;
	}

	public String getHelmMaterials() {
		return HelmMaterials;
	}

	@Override
	public String toString() {
		return "Helm [HelmDiameter=" + HelmDiameter + ", HelmMaterials=" + HelmMaterials + "]";
	}
	
	

}
