
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();
		HardDisk HD=new HardDisk();
		PC pc=new PC();	
		
		cpu.setSpeed(2200);
		HD.setGetAmount(200);
		cpu.setPrice(100);
		cpu.setType("英特");
		HD.setStorage(1000);
		HD.setPrice(200);
		pc.setCpu(cpu);
		cpu.setSpeed(300);
		pc.setHD(HD);
		pc.show();
		System.out.println("cpu的类型:"+cpu.type);
		System.out.println("cpu的价格:"+cpu.price);
		System.out.println("硬盘的价格:"+HD.price);
		System.out.println("硬盘的内存:"+HD.storage);
		
		
	}

}
