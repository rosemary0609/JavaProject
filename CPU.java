
public class CPU {
	private int speed;
	int price;
	String  type;
	int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void show(String type,int price){
		if(type=="Ӣ��"	){
			System.out.println("��ǰcpu���Ϳ���ʹ��");
			
		}else{
			System.out.println("��ǰcpu���Ͳ�����ʹ�ã������������ʽ");
			
		}
		if(price<6000&price>3000){
			System.out.println("��ǰ�۸����У����鹺��");	
		}else{
			System.out.println("��ǰ�۸�߯�������ŵ���");
		}
	}
	public static void main(String[] args){
		CPU Cpu=new CPU();
		Cpu.setType("Ӣ��");
		//Cpu.show(Cpu.type);
		Cpu.setPrice(4000);
		Cpu.show(Cpu.type, Cpu.price);
	}
		
	}

	
