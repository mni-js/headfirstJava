class Tiger {
	private int size;
    
    public int getSize() {
        Tiger.hello();
    	return size;
    }
    
    public static void hello() {
    	System.out.println("안녕");
        // System.out.println(size);
    }
}

class Main {
	public static void main(String[] args) {
    	Tiger t = new Tiger();
        System.out.println(t.getSize()); // 0 출력.
        
        Tiger.hello(); // "안녕" 출력. 
    }
}
