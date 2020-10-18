
public class CPU {
	private int speed;
	int price;
	String  type;
	CPU(){
		
	}
	CPU(int price,int speed,String type){
		this.price=price;
		this.speed=speed;
		this.type=type;
	}
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
		if(type=="英特"	){
			System.out.println("当前cpu类型可以使用");
			
		}else{
			System.out.println("当前cpu类型不可以使用，请更换其它方式");
			
		}
		if(price<6000&price>3000){
			System.out.println("当前价格适中，建议购买");	
		}else{
			System.out.println("当前价格忒贵，您悠着点买！");
		}
	}
	public static void main(String[] args){
		CPU Cpu=new CPU();
		Cpu.setType("英特");
		//Cpu.show(Cpu.type);
		Cpu.setPrice(4000);
		Cpu.show(Cpu.type, Cpu.price);
	}
		
	}

	
