class Animal {
    public int size;

	public void run() {
    	System.out.println("달립니다." + size);
    }
}

interface Pet {
    public int count = 100;
    void bark();
    void eat();
}

class Tiger extends Animal implements Pet {
	@Override // 애너테이션
    public void run() {
    	System.out.println("갑자기 두 발로(?) 달립니다." + size);
    }

    @Override
    public void bark() {
        System.out.println(count);
        System.out.println("짖다.");
    }

    @Override
    public void eat() {
        System.out.println("먹다.");
    }
}

class Bird extends Animal {
	public void fly() {
    	System.out.println("날아올라.");
    }
}

class Main {
	public static void main(String[] args) {
    	Animal a = new Tiger();
        a.run(); // "갑자기 두 발로(?) 달립니다." 출력. 

        Pet p = new Tiger();
        p.bark();
        p.eat();
        p.run();
        System.out.println(p.count);
        
        // Animal b = new Bird();
        // b.fly(); // 에러 발생. 
    }
}
