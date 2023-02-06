// static: công cụ sử đổi tĩnh
// một bản sao duy nhất của một biến.
// phương thức được tạo và chia sẻ
// lớp sở hữu thành viên tĩnh


package basic;

public class Main {

    public static void main(String[] args) {

        Friend friend1 = new Friend("Khánh");
        Friend friend2 = new Friend("Patrick");
        System.out.println(Friend.numberOfFriend);

        Friend.displayFriend();


        Math.round(a);

    }

}

public class Friend {

    String name;
    static int numberOfFriend;

    Friend(String name) {
        this.name = name;
        numberOfFriend ++;
    }

    static void displayFriend() {
        System.out.println("You have " + numberOfFriend + " friends!");
    }
}