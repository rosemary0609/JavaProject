
public class PC {
	String color; 
	private CPU cpu;
	HardDisk HD;
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public HardDisk getHD() {
		return HD;
	}
	public void setHD(HardDisk hD) {
		HD = hD;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;			
	}
	public void show(){	
		System.out.println("CPU���ٶ�:"+cpu.getSpeed());
		System.out.println("Ӳ�̵�����:"+HD.getAmount());
	}
	public static void main(String[] args) {
		PC pc1=new PC();
		pc1.setColor("��ɫ");
		System.out.println(pc1.getColor());
		
	}
	
	}

	
