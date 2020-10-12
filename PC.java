
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
		System.out.println("CPU的速度:"+cpu.getSpeed());
		System.out.println("硬盘的容量:"+HD.getAmount());
	}
	public static void main(String[] args) {
		PC pc1=new PC();
		pc1.setColor("粉色");
		System.out.println(pc1.getColor());
		
	}
	
	}

	
