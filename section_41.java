// interface: Giao diện là một mẫu có thể được áp dụng cho một lớp
//            tương tự như kế thừa, chỉ định một lớp có phải làm
//            các lớp có thể được áp dụng hơn một giao diện, tính kế 
//            thừa chỉ có thể được giới hạn từ super


public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();

        rabbit.flee();
    }
}

public class Rabbit implements Prey {
    @override
    public void flee() {
        System.out.println("");
    }
}


public interface Prey {

    void flee();
}




public interface Hawk implements Predator {

}

public interface Predator {

    @override
    public void hurt() {
        System.out.println("");
    }
}



public class Fish implements Predator, Prey{
    @override
    public void hurt() {
        System.out.println("");
    }


    @override
    public void flee() {
        System.out.println("");
    } 
}