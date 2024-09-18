public class Store_record {
    
    String item_name;
    int item_price;
    int item_no;
    Store_record(String x,int y ,int z){
        item_name = x;
        item_no = y;
        item_price = z;
    }
    public static void main(String[] args) {
        Store_record a = new Store_record("Chocolate", 1, 100);
        a.display_Store_record();

    }
    public void display_Store_record(){
        System.out.println("******* Records*******");
        System.out.println("item name = "+item_name);
        System.out.println("item no. = "+
        item_no);
        System.out.println("item price = "+item_price);
    }
}
