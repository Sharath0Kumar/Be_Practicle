class Rectangle {
            int len;
            int bre;

    Rectangle(int l, int b){
        this.len = l;
        this.bre = b;
        }
        void area(){
           System.out.println(len * bre); ;
        }

        }

public class rect {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(5, 10);
        r.area();
    }
}
