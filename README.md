# JavaProject
Java作业
# 实验内容
1、用类描述计算机中CPU的速度和硬盘的容量。要求Java应程序有4个类，名字分割是PC、CPU、HardDisk和Test，Test是主类。
2、CPU类要求getSpeed（）返回speed旳值，要求setSpeed（int m）方法将参数m的值赋值给speed：HardDisk类要求；
  HardDisk类要求hetAmount（）返回amount的值，要求setAmount（int m）方法，将参数m的值赋值给amount
  PC类要求setCPU（CPU c）将参数c旳值赋值给cpu。
3、setHardDisk（HardDisk h）方法将参数h旳值赋值给HD，show（）方法能显示cpu的速度和硬盘的容量。
4、类中定义不少于两个构造方法，每个类定义不少于2个属性，且属性的类型应多样化，体会修饰符private的用法。
## 实验目的
1、掌握构造方法、this关键字的使用。
2、了解访问权限修饰符private、protected、public使用。
3、会使用仅能用给定的方法进行赋值并通过加权限来赋值。
## 核心方法
1.方法1
````
public void show(int price,int storage	){
		if(storage<5000&storage>1000){
			System.out.println("内存足够使用");
			
		}else{
			System.out.println("内存不够使用，需要更换");
			
		}if(price<6000&price>3000){
			System.out.println("当前价格适中，建议您购买");	
		}else{
			System.out.println("当前价格昂贵，不建议您购买使用");
		}	
	}
````
2.方法2
```
private CPU cpu;
pc.setCpu(cpu);//此方法调用成功
pc.cpu=cpu;//此方法无法调用，代码中显示错误
```
3.方法3
```
public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
```
## 实验结果
CPU类实现结果：
![alt console](https://user.qzone.qq.com/1936385032/main)
HardDisk类实现结果：
https://user.qzone.qq.com/1936385032/main
PC类实现结果：
https://user.qzone.qq.com/1936385032/main
Test类实现结果：
https://user.qzone.qq.com/1936385032/main
## 实验感想
通过本次实验
