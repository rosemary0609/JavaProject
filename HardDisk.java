
public class HardDisk {

	int amount;
	int storage;
	int price;

	public void setGetAmount(int getAmount) {
		this.amount = getAmount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void show(int price,int storage	){
		if(storage<5000&storage>1000){
			System.out.println("�ڴ��㹻ʹ��");
			
		}else{
			System.out.println("�ڴ治��ʹ�ã���Ҫ����");
			
		}if(price<6000&price>3000){
			System.out.println("��ǰ�۸����У�����������");	
		}else{
			System.out.println("��ǰ�۸񰺹󣬲�����������ʹ��");
		}	
	}
	public static void main(String[] args){
		HardDisk hd=new HardDisk();
		hd.setPrice(4000);
		hd.setStorage(3000);
		hd.show(hd.price,hd.storage);
		
	}
	}



