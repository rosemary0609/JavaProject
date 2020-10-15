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
4.方法4
```
	CPU(){
		
	}
	CPU(int price,int speed,String type){
		this.price=price;
		this.speed=speed;
		this.type=type;
	}
```
## 实验结果
CPU类实现结果：    
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5o9Tbe5.C5NNcqBGSgNW1W2q*I9p4MwhxtqpWqnc.s6sQFGdC*DgWzwluQF3FZy3*qm4LVzvsgOuccPr.8t2HiY!/b&bo=cgOEAAAAAAABB9U!&rf=viewer_4)
HardDisk类实现结果：   
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcQDzNcP1F4dsQSLe3v41vhoAoF*CHMAI83ir7ICqL3y2wlUIwiMylOIyiy6mPzTO1B5Y89IdNr0oMFEkIsoh0g8!/b&bo=jgN2AAAAAAABF8s!&rf=viewer_4)
PC类实现结果：     
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcab5JjgFBJiyUU7dWwQGbvoYdBj9gZrcnEMArMJ.Q4Mt8PXHlPx6CfYL6bF15Jve08rHZVrkRBVbY2C5rQv7QFo!/b&bo=WgOCAAAAAAABF.s!&rf=viewer_4)
Test类实现结果：  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcab5JjgFBJiyUU7dWwQGbvq89OHcVoB04A.E6v.tVxCn3UJNYZRomKOyNyaaD8685mojucqMe0HY6AD3.7q7cXc!/b&bo=cAPCAAAAAAABF4E!&rf=viewer_4)
## 实验感想
通过本次实验我学会了基本的设置多个属性及如何调用使用这个方法，掌握构造方法的使用设置有参和无参。还逐步形成了基本的逻辑思想，了解且掌握了如何将设置的属性设置成私有的，不能让其它类访问此方法及使用。
